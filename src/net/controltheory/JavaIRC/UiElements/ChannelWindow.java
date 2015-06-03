package net.controltheory.JavaIRC.UiElements;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JTextPane;
import javax.swing.JList;

import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JScrollPane;

import net.controltheory.JavaIRC.Structures.Channel;
import net.controltheory.JavaIRC.Structures.SortedNoDupeSet;
import net.controltheory.JavaIRC.Structures.User;
import net.controltheory.JavaIRC.internet.NetworkConnection;

import java.awt.Cursor;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;

import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.ScrollPaneConstants;

public class ChannelWindow extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SimpleDateFormat stf = new SimpleDateFormat("hh:mm:ssa");
	private Channel channel;
	private JTextField inputTextField;
	private InternalFrameUI ui;
	private JTextPane chatPane;
	private SortedNoDupeSet userList;
	private JScrollPane chatScrollPane;
	private JPanel inputPane;
	private JMenuItem mntmWhois;
	private JMenuItem mntmInfo;
	private JMenuItem mntmQuery;
	private JMenuItem mntmIgnore;
	private JMenuItem mntmDeignore;
	private JMenuItem mntmOp;
	private JMenuItem mntmDeop;
	private JMenuItem mntmVoice;
	private JMenuItem mntmDevoice;
	private ChannelModes cm;
	private Border border;
	private JList<User> userListPane;

	public ChannelWindow(String name) {
		cm = new ChannelModes();
		userList = new SortedNoDupeSet();
		setFrameIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\ChannelIcon.png"));
		setPreferredSize(new Dimension(300, 300));
		setName(name);
		setAutoscrolls(true);
		setVisible(true);
		setVerifyInputWhenFocusTarget(false);
		setDoubleBuffered(true);
		setFocusTraversalPolicyProvider(true);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setTitle(name);
		setClosable(true);
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel mainPanel = new JPanel();
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout(0, 0));

		JSplitPane chatUserSplitPane = new JSplitPane();
		chatUserSplitPane.setAlignmentY(Component.CENTER_ALIGNMENT);
		chatUserSplitPane.setAlignmentX(Component.CENTER_ALIGNMENT);
		chatUserSplitPane.setAutoscrolls(true);
		chatUserSplitPane.setContinuousLayout(true);
		chatUserSplitPane.setResizeWeight(0.8);
		mainPanel.add(chatUserSplitPane, BorderLayout.CENTER);

		chatScrollPane = new JScrollPane();
		chatScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		chatScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		chatScrollPane.setPreferredSize(new Dimension(350, 350));

		chatPane = new JTextPane();
		chatPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2 && !e.isConsumed()) {
					e.consume();
					cm.values(channel);
					cm.setVisible(true);
				}
			}
		});
		chatPane.setEditable(false);
		chatPane.setDocument(new DefaultStyledDocument());
		chatScrollPane.setViewportView(chatPane);

		inputPane = new JPanel();
		getContentPane().add(inputPane, BorderLayout.SOUTH);
		GridBagLayout gbl_inputPane_1 = new GridBagLayout();
		gbl_inputPane_1.columnWidths = new int[] { 493, 0 };
		gbl_inputPane_1.rowHeights = new int[] { 20, 0 };
		gbl_inputPane_1.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_inputPane_1.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		inputPane.setLayout(gbl_inputPane_1);

		inputTextField = new JTextField();
		inputTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String msg = inputTextField.getText();
					if (msg == null || msg == "") {
						return;
					} else {
						if (msg.startsWith("/")) {
							// handle slash commands
							if (msg.substring(1).toLowerCase().startsWith("join")) {
								NetworkConnection.joinChannel(msg.split(" ")[1]);
								((JTextField) e.getSource()).setText("");
							} else if (msg.substring(1).toLowerCase().startsWith("mode")) {
								// /mode #scriptij +o name
								String[] tokens = msg.split(" ");
								NetworkConnection.sendCommand("MODE " + tokens[1] + " " + tokens[2] + " " + tokens[3] + "\r\n");
							}
						} else {
							// normal text. send it and put it in window.
							NetworkConnection.sendCommand("PRIVMSG " + channel.getName() + " :" + msg + "\r\n");
							int docLength = chatPane.getDocument().getLength();
							SimpleAttributeSet attributes = new SimpleAttributeSet();
							attributes = new SimpleAttributeSet();
							attributes.addAttribute(StyleConstants.CharacterConstants.Bold, Boolean.TRUE);
							attributes.addAttribute(StyleConstants.CharacterConstants.Italic, Boolean.FALSE);
							attributes.addAttribute(StyleConstants.CharacterConstants.Foreground, Color.BLACK);
							try {
								chatPane.getDocument().insertString(docLength, "[" + stf.format(new Date()) + "]<" + NetworkConnection.getName() + ">" + msg + "\r\n", attributes);

							} catch (BadLocationException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							chatPane.setCaretPosition(chatPane.getDocument().getLength());
							((JTextField) e.getSource()).setText("");
						}

					}
				}
			}
		});
		GridBagConstraints gbc_inputTextField = new GridBagConstraints();
		gbc_inputTextField.fill = GridBagConstraints.BOTH;
		gbc_inputTextField.gridx = 0;
		gbc_inputTextField.gridy = 0;
		inputPane.add(inputTextField, gbc_inputTextField);
		inputTextField.setColumns(10);

		ui = this.getUI();

		this.getBorder();

		JScrollPane userListScrollPane = new JScrollPane();
		userListScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		chatUserSplitPane.setRightComponent(userListScrollPane);
		chatUserSplitPane.setLeftComponent(chatScrollPane);

		userListPane = new JList<>(userList);
		userListPane.setLayoutOrientation(JList.VERTICAL);
		userListScrollPane.setViewportView(userListPane);

		chatUserSplitPane.setLeftComponent(chatScrollPane);
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(userListPane, popupMenu);

		mntmWhois = new JMenuItem("Whois");
		mntmWhois.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent me) {
				String nick = userList.getElementAt(userListPane.getSelectedIndex()).getNick();
				NetworkConnection.sendCommand("WHOIS " + nick + "\r\n");
			}
		});
		popupMenu.add(mntmWhois);

		mntmInfo = new JMenuItem("Info");
		popupMenu.add(mntmInfo);

		mntmQuery = new JMenuItem("Query");
		popupMenu.add(mntmQuery);

		JSeparator separator = new JSeparator();
		popupMenu.add(separator);

		mntmIgnore = new JMenuItem("Ignore");
		popupMenu.add(mntmIgnore);

		mntmDeignore = new JMenuItem("Deignore");
		popupMenu.add(mntmDeignore);

		mntmOp = new JMenuItem("Op");
		popupMenu.add(mntmOp);

		mntmDeop = new JMenuItem("Deop");
		popupMenu.add(mntmDeop);

		mntmVoice = new JMenuItem("Voice");
		popupMenu.add(mntmVoice);

		mntmDevoice = new JMenuItem("Devoice");
		popupMenu.add(mntmDevoice);
		this.channel = new Channel(name);
		// pack();

		ui = this.getUI();

		border = this.getBorder();
		// pack();
	}

	public void appendToWindow(String msg) {
		int docLength = chatPane.getDocument().getLength();
		SimpleAttributeSet attributes = new SimpleAttributeSet();
		attributes = new SimpleAttributeSet();
		attributes.addAttribute(StyleConstants.CharacterConstants.Bold, Boolean.FALSE);
		attributes.addAttribute(StyleConstants.CharacterConstants.Italic, Boolean.FALSE);
		attributes.addAttribute(StyleConstants.CharacterConstants.Foreground, Color.BLACK);
		try {
			chatPane.getDocument().insertString(docLength, "[" + stf.format(new Date()) + "]" + msg + "\r\n", attributes);

		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chatPane.setCaretPosition(chatPane.getDocument().getLength());

	}

	public void removeUser(String channel, String address) {
		String nick;
		nick = address.split(":")[1].split("!")[0];
		User u = new User(nick, address, false, false, false);
		userList.remove(u);
	}

	public void addUser(String channel, String address) {
		// :effect0r`java!effect0r`j@effect0r.user.globalgamers.net JOIN
		// #scriptij
		String nick;
		nick = address.split(":")[1].split("!")[0];
		User u = new User(nick, address, false, false, false);
		userList.add(u);
	}

	public void populateUserList(ArrayList<User> userList2) {
		for (User u : userList2) {
			userList.add(u);
		}
	}

	public void enable_title_bar() {
		putClientProperty("JInternalFrame.isPalette", Boolean.FALSE);
		this.setUI(ui);
		this.setBorder(border);
	}

	public void remove_title_bar() {
		putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
		((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		this.setBorder(null);
	}

	public Channel getChannel() {
		return this.channel;
	}

	public void updateUserList(String address, String newNick) {
		if (userList != null) {
			User toUpdate = userList.remove(new User(address.split("!")[0].substring(1), address, false, false, false));
			toUpdate.setNick(newNick.substring(1));
			String addy = ":" + newNick + address.split("!")[1];
			toUpdate.setAddress(addy);
			userList.add(toUpdate);
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JList<User> list = (JList<User>) e.getSource();
				if (SwingUtilities.isRightMouseButton(e)) {
					int row = list.locationToIndex(e.getPoint());
					list.setSelectedIndex(row);
				}
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	public void minusUserListModes(char ch, String name) {
		User[] tmpArr = userList.toArr();
		User userToUpdate = null;
		for (User u : tmpArr) {
			if (u == null) {
				break;
			}
			if (u.getNick().equals(name)) {
				userToUpdate = u;
			}
		}
		if (userToUpdate != null) {
			switch (ch) {
			case 'o':
				userToUpdate.setOp(false);
				userToUpdate.isVoice();
				userToUpdate.isHalfOp();
				break;
			case 'v':
				userToUpdate.isOp();
				userToUpdate.setVoice(false);
				userToUpdate.isHalfOp();
				break;
			case 'h':
				userToUpdate.isOp();
				userToUpdate.isVoice();
				userToUpdate.setHOp(false);
				break;
			default:
				break;
			}
		}
		userList.update();
	}

	public void plusUserListModes(char ch, String name) {
		User[] tmpArr = userList.toArr();
		User userToUpdate = null;
		for (User u : tmpArr) {
			if (u == null) {
				break;
			}
			if (u.getNick().equals(name)) {
				userToUpdate = u;
			}
		}
		if (userToUpdate != null) {
			switch (ch) {
			case 'o':
				userToUpdate.setOp(true);
				userToUpdate.isVoice();
				userToUpdate.isHalfOp();
				break;
			case 'v':
				userToUpdate.isOp();
				userToUpdate.setVoice(true);
				userToUpdate.isHalfOp();
				break;
			case 'h':
				userToUpdate.isOp();
				userToUpdate.isVoice();
				userToUpdate.setHOp(true);
				break;
			default:
				break;
			}

		}
		userList.update();
	}
}