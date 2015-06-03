package net.controltheory.JavaIRC.UiElements;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.ButtonModel;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.UIManager;

import java.awt.GridBagConstraints;

import javax.swing.JButton;

import java.awt.Insets;
import java.beans.PropertyVetoException;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.awt.ComponentOrientation;

import javax.swing.JSeparator;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBoxMenuItem;

import net.controltheory.JavaIRC.Structures.Channel;
import net.controltheory.JavaIRC.Structures.GlobalUser;
import net.controltheory.JavaIRC.Structures.User;
import net.controltheory.JavaIRC.UiElements.ToolbarWindows.ChannelsList;
import net.controltheory.JavaIRC.UiElements.ToolbarWindows.JircFavorites;
import net.controltheory.JavaIRC.UiElements.ToolbarWindows.ScriptsEditor;
import net.controltheory.JavaIRC.internet.NetworkConnection;

import javax.swing.ButtonGroup;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
public class MainWindow {

	private static JFrame frmJavairc;
	private static SystemWindow SystemWindow;
	private static JToggleButton SystemButton;
	private static JMenu mnFile;
	private static JMenuBar menuBar;
	private static JMenuItem mntmNewWindow;
	private final static ButtonGroup channelButtonGroup = new ButtonGroup();
	private static JDesktopPane mainChannelAreaChatUsers;
	private static JToolBar channelListToolBar;
	private static HashMap<JToggleButton, ChannelWindow> windowList;
	private static boolean isMaximized = false;
	// TODO: this stuff
	private static ArrayList<GlobalUser> globalUserList;

	public static NetworkConnection networkConnection;
	private static int totalChannels;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					MainWindow.frmJavairc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainWindow() {
		initialize();
	}

	private void initialize() {
		windowList = new HashMap<>();
		Dimension btnSize = new Dimension(25, 32);
		globalUserList = new ArrayList<>();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frmJavairc = new JFrame();
		frmJavairc.setTitle("JavaIRC");
		frmJavairc.setBounds(100, 100, 800, 600);
		frmJavairc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavairc.getContentPane().setLayout(new BorderLayout(0, 0));

		menuBar = new JMenuBar();
		menuBar.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		frmJavairc.getContentPane().add(menuBar, BorderLayout.NORTH);
		createMenu();

		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(null);
		mainPanel.setBackground(Color.GRAY);
		frmJavairc.getContentPane().add(mainPanel);
		mainPanel.setLayout(new BorderLayout(0, 0));

		JToolBar buttonsToolBar = new JToolBar();
		mainPanel.add(buttonsToolBar, BorderLayout.NORTH);
		buttonsToolBar.setRollover(true);

		JButton btnConnection = new JButton("");
		btnConnection.setHorizontalTextPosition(SwingConstants.CENTER);
		btnConnection.setMaximumSize(new Dimension(24, 20));
		btnConnection.setMinimumSize(new Dimension(24, 20));
		btnConnection.setPreferredSize(new Dimension(24, 20));
		btnConnection.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (networkConnection == null) {
					// no connection. Create one.
					connection("effect0r`java", "irc.globalgamers.net", "JavaIRC", "JavaIRC", 6667);
					((JButton) e.getSource()).setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\Disconnect.png"));
				} else if (networkConnection.isConnected()) {
					// we're connected. update the icon.
					((JButton) e.getSource()).setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\Connect.png"));
					NetworkConnection.sendCommand("QUIT :testing stuff\r\n");
					closeAllWindows();
				} else {
					// we're disconnected. connect and update icon
					connection("effect0r`java", "irc.globalgamers.net", "JavaIRC", "JavaIRC", 6667);
					((JButton) e.getSource()).setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\Disconnect.png"));

				}

			}
		});
		buttonsToolBar.add(btnConnection);
		btnConnection.setFocusable(false);
		btnConnection.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnConnection.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\Connect.png"));
		buttonsToolBar.addSeparator();

		JButton btnOptions = new JButton("");
		btnOptions.setToolTipText("Options");
		btnOptions.setPreferredSize(new Dimension(24, 20));
		btnOptions.setMinimumSize(new Dimension(24, 20));
		btnOptions.setHorizontalTextPosition(SwingConstants.CENTER);
		btnOptions.setMaximumSize(new Dimension(24, 20));
		buttonsToolBar.add(btnOptions);
		btnOptions.setFocusable(false);
		btnOptions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				OptionsFrame of = new OptionsFrame();
				of.setVisible(true);
			}
		});
		btnOptions.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\Options.png"));
		buttonsToolBar.addSeparator();

		JButton btnFavorites = new JButton("");
		btnFavorites.setToolTipText("Favorites");
		btnFavorites.setPreferredSize(new Dimension(24, 20));
		btnFavorites.setMinimumSize(new Dimension(24, 20));
		btnFavorites.setHorizontalTextPosition(SwingConstants.CENTER);
		btnFavorites.setMaximumSize(new Dimension(24, 20));
		btnFavorites.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				JircFavorites favs = new JircFavorites();
				favs.setVisible(true);
			}
		});
		buttonsToolBar.add(btnFavorites);
		btnFavorites.setFocusable(false);
		btnFavorites.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\Favorites.png"));

		JButton btnChannelsList = new JButton("");
		btnChannelsList.setToolTipText("Channels List");
		btnChannelsList.setMinimumSize(new Dimension(24, 20));
		btnChannelsList.setHorizontalTextPosition(SwingConstants.CENTER);
		btnChannelsList.setMaximumSize(new Dimension(24, 20));
		btnChannelsList.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ChannelsList clist = new ChannelsList();
				clist.setEnabled(true);
			}
		});
		buttonsToolBar.add(btnChannelsList);
		btnChannelsList.setFocusable(false);
		btnChannelsList.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\ChannelsList.png"));
		btnChannelsList.setPreferredSize(new Dimension(24, 20));
		buttonsToolBar.addSeparator();

		JButton btnScriptsEditor = new JButton("");
		btnScriptsEditor.setToolTipText("Scripts Editor");
		btnScriptsEditor.setHorizontalTextPosition(SwingConstants.CENTER);
		btnScriptsEditor.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ScriptsEditor se = new ScriptsEditor();
				se.setVisible(true);
			}
		});
		buttonsToolBar.add(btnScriptsEditor);
		btnScriptsEditor.setFocusable(false);
		btnScriptsEditor.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\ScriptsEditor.png"));
		btnScriptsEditor.setMinimumSize(new Dimension(24, 20));
		btnScriptsEditor.setMaximumSize(new Dimension(24, 20));
		btnScriptsEditor.setPreferredSize(new Dimension(24, 20));
		buttonsToolBar.addSeparator();

		JButton btnAddressBook = new JButton("");
		btnAddressBook.setToolTipText("Address Book");
		btnAddressBook.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonsToolBar.add(btnAddressBook);
		btnAddressBook.setFocusable(false);
		btnAddressBook.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\AddressBook.png"));
		btnAddressBook.setMinimumSize(new Dimension(24, 20));
		btnAddressBook.setMaximumSize(new Dimension(24, 20));
		btnAddressBook.setPreferredSize(new Dimension(24, 20));

		JButton btnOnlineTimer = new JButton("");
		btnOnlineTimer.setToolTipText("Online Timer");
		btnOnlineTimer.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonsToolBar.add(btnOnlineTimer);
		btnOnlineTimer.setFocusable(false);
		btnOnlineTimer.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\OnlineTimer.png"));
		btnOnlineTimer.setMinimumSize(new Dimension(24, 20));
		btnOnlineTimer.setMaximumSize(new Dimension(24, 20));
		btnOnlineTimer.setPreferredSize(new Dimension(24, 20));

		JButton btnColors = new JButton("");
		btnColors.setToolTipText("Colors");
		btnColors.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonsToolBar.add(btnColors);
		btnColors.setFocusable(false);
		btnColors.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\Colors.png"));
		btnColors.setMinimumSize(new Dimension(24, 20));
		btnColors.setMaximumSize(new Dimension(24, 20));
		btnColors.setPreferredSize(new Dimension(24, 20));
		buttonsToolBar.addSeparator();

		JButton btnDccSend = new JButton("");
		btnDccSend.setToolTipText("Send File");
		btnDccSend.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonsToolBar.add(btnDccSend);
		btnDccSend.setFocusable(false);
		btnDccSend.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\Send.png"));
		btnDccSend.setMinimumSize(new Dimension(24, 20));
		btnDccSend.setMaximumSize(new Dimension(24, 20));
		btnDccSend.setPreferredSize(new Dimension(24, 20));

		JButton btnDccChat = new JButton("");
		btnDccChat.setToolTipText("Chat");
		btnDccChat.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonsToolBar.add(btnDccChat);
		btnDccChat.setFocusable(false);
		btnDccChat.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\Chat.png"));
		btnDccChat.setMinimumSize(new Dimension(24, 20));
		btnDccChat.setMaximumSize(new Dimension(24, 20));
		btnDccChat.setPreferredSize(new Dimension(24, 20));

		JButton btnDccOptions = new JButton("");
		btnDccOptions.setToolTipText("DCC Options");
		btnDccOptions.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonsToolBar.add(btnDccOptions);
		btnDccOptions.setFocusable(false);
		btnDccOptions.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\DCCOptions.png"));
		btnDccOptions.setMinimumSize(new Dimension(24, 20));
		btnDccOptions.setMaximumSize(new Dimension(24, 20));
		btnDccOptions.setPreferredSize(new Dimension(24, 20));
		buttonsToolBar.addSeparator();

		JButton btnReceivedFiles = new JButton("");
		btnReceivedFiles.setToolTipText("Recieved Files");
		btnReceivedFiles.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonsToolBar.add(btnReceivedFiles);
		btnReceivedFiles.setFocusable(false);
		btnReceivedFiles.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\RecievedFiles.png"));
		btnReceivedFiles.setMinimumSize(new Dimension(24, 20));
		btnReceivedFiles.setMaximumSize(new Dimension(24, 20));
		btnReceivedFiles.setPreferredSize(new Dimension(24, 20));

		JButton btnLogFiles = new JButton("");
		btnLogFiles.setToolTipText("Log Files");
		btnLogFiles.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonsToolBar.add(btnLogFiles);
		btnLogFiles.setFocusable(false);
		btnLogFiles.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\LogFiles.png"));
		btnLogFiles.setMinimumSize(new Dimension(24, 20));
		btnLogFiles.setMaximumSize(new Dimension(24, 20));
		btnLogFiles.setPreferredSize(new Dimension(24, 20));
		buttonsToolBar.addSeparator();

		JButton btnNotifyList = new JButton("");
		btnNotifyList.setToolTipText("Notify List");
		btnNotifyList.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonsToolBar.add(btnNotifyList);
		btnNotifyList.setFocusable(false);
		btnNotifyList.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\NotifyList.png"));
		btnNotifyList.setMinimumSize(new Dimension(24, 20));
		btnNotifyList.setMaximumSize(new Dimension(24, 20));
		btnNotifyList.setPreferredSize(new Dimension(24, 20));

		JButton btnUrlsList = new JButton("");
		btnUrlsList.setToolTipText("Urls List");
		btnUrlsList.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonsToolBar.add(btnUrlsList);
		btnUrlsList.setFocusable(false);
		btnUrlsList.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\URLsList.png"));
		btnUrlsList.setMinimumSize(new Dimension(24, 20));
		btnUrlsList.setMaximumSize(new Dimension(24, 20));
		btnUrlsList.setPreferredSize(new Dimension(24, 20));
		buttonsToolBar.addSeparator();

		JButton btnTileHorizontal = new JButton("");
		btnTileHorizontal.setToolTipText("Tile Horizontal");
		btnTileHorizontal.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTileHorizontal.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int dtpHeight = mainChannelAreaChatUsers.getHeight();
				int dtpWidth = mainChannelAreaChatUsers.getWidth();
				JInternalFrame[] ifs = mainChannelAreaChatUsers.getAllFrames();
				int splitLine = dtpHeight / 2;

				int heightPerFrame = 0;
				if (ifs.length % 2 == 0) {
					heightPerFrame = dtpWidth / (ifs.length / 2);
				} else {
					heightPerFrame = (int) (dtpWidth / Math.ceil(((ifs.length + 1) / 2)));
				}

				int control = 0;
				for (int i = 0; i < ifs.length; i += 2) {
					ifs[i].setBounds(control * heightPerFrame, 0, heightPerFrame, splitLine);
					if (i + 1 < ifs.length)
						ifs[i + 1].setBounds(control * heightPerFrame, splitLine, heightPerFrame, splitLine);
					control++;
				}
			}
		});
		buttonsToolBar.add(btnTileHorizontal);
		btnTileHorizontal.setFocusable(false);
		btnTileHorizontal.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\TileHorizontal.png"));
		btnTileHorizontal.setMinimumSize(new Dimension(24, 20));
		btnTileHorizontal.setMaximumSize(new Dimension(24, 20));
		btnTileHorizontal.setPreferredSize(new Dimension(24, 20));

		JButton btnTileVertical = new JButton("");
		btnTileVertical.setToolTipText("Tile Vertical");
		btnTileVertical.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTileVertical.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int dtpHeight = mainChannelAreaChatUsers.getHeight();
				int dtpWidth = mainChannelAreaChatUsers.getWidth();
				JInternalFrame[] ifs = mainChannelAreaChatUsers.getAllFrames();
				int splitLine = dtpWidth / 2;

				int heightPerFrame = 0;
				if (ifs.length % 2 == 0) {
					heightPerFrame = dtpHeight / (ifs.length / 2);
				} else {
					heightPerFrame = (int) (dtpHeight / Math.ceil(((ifs.length + 1) / 2)));
				}

				int control = 0;
				for (int i = 0; i < ifs.length; i += 2) {
					ifs[i].setBounds(0, control * heightPerFrame, splitLine, heightPerFrame);
					if (i + 1 < ifs.length)
						ifs[i + 1].setBounds(splitLine + 1, control * heightPerFrame, splitLine, heightPerFrame);
					control++;
				}
			}
		});
		buttonsToolBar.add(btnTileVertical);
		btnTileVertical.setFocusable(false);
		btnTileVertical.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\TileVerticle.png"));
		btnTileVertical.setMinimumSize(new Dimension(24, 20));
		btnTileVertical.setMaximumSize(new Dimension(24, 20));
		btnTileVertical.setPreferredSize(new Dimension(24, 20));

		JButton btnCascade = new JButton("");
		btnCascade.setToolTipText("Cascade");
		btnCascade.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCascade.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				JInternalFrame[] ifs = mainChannelAreaChatUsers.getAllFrames();
				for (int i = 0; i < ifs.length; i++) {
					ifs[i].setBounds(i * 20, i * 20, 400, 250);
					try {
						ifs[i].setSelected(true);
					} catch (PropertyVetoException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		buttonsToolBar.add(btnCascade);
		btnCascade.setFocusable(false);
		btnCascade.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\CascadeWindows.png"));
		btnCascade.setMinimumSize(new Dimension(24, 20));
		btnCascade.setMaximumSize(new Dimension(24, 20));
		btnCascade.setPreferredSize(new Dimension(24, 20));
		buttonsToolBar.addSeparator();

		JButton btnAbout = new JButton("");
		btnAbout.setToolTipText("About");
		btnAbout.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonsToolBar.add(btnAbout);
		btnAbout.setFocusable(false);
		btnAbout.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\About.png"));
		btnAbout.setMinimumSize(new Dimension(24, 20));
		btnAbout.setMaximumSize(new Dimension(24, 20));
		btnAbout.setPreferredSize(new Dimension(24, 20));

		channelListToolBar = new JToolBar();
		channelListToolBar.setRollover(true);
		channelListToolBar.setOrientation(SwingConstants.VERTICAL);
		mainPanel.add(channelListToolBar, BorderLayout.WEST);

		mainChannelAreaChatUsers = new JDesktopPane();
		mainChannelAreaChatUsers.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		mainChannelAreaChatUsers.setBackground(Color.GRAY);
		mainPanel.add(mainChannelAreaChatUsers);
		SystemWindow = new SystemWindow();
		SystemButton = new JToggleButton("System");
		SystemButton.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\ChannelIcon.png"));
		SystemButton.setHorizontalAlignment(SwingConstants.LEFT);
		SystemButton.setName("System");

		SystemButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent me) {
				ChannelWindow w = windowList.get(me.getSource());
				try {
					w.setSelected(true);
				} catch (PropertyVetoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		SystemButton.setMinimumSize(new Dimension(87, 23));
		SystemButton.setMaximumSize(new Dimension(87, 23));
		SystemButton.setPreferredSize(new Dimension(87, 23));
		channelButtonGroup.add(SystemButton);
		channelListToolBar.add(SystemButton);
		mainChannelAreaChatUsers.add(SystemWindow);

		// pack();
	}

	protected void closeAllWindows() {
		channelListToolBar.removeAll();
		for(ChannelWindow cw:windowList.values()) {
			cw.dispose();
		}
		createChannelWindow("System");
	}

	protected static void maximizeChild(ChannelWindow child) {
		System.out.println(child.getName());

	}

	public static void createChannelWindow(String string) {
		totalChannels++;
		JToggleButton tglBtn = new JToggleButton(string);
		tglBtn.setIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\ChannelIcon.png"));
		tglBtn.setHorizontalAlignment(SwingConstants.LEFT);
		tglBtn.setName(string);

		tglBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent me) {
				ChannelWindow w = windowList.get(me.getSource());
				try {
					w.setSelected(true);
				} catch (PropertyVetoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		tglBtn.setMinimumSize(new Dimension(87, 23));
		tglBtn.setMaximumSize(new Dimension(87, 23));
		tglBtn.setPreferredSize(new Dimension(87, 23));
		channelButtonGroup.add(tglBtn);
		channelListToolBar.add(tglBtn);
		tglBtn.setSelected(true);
		ChannelWindow chanWindow = new ChannelWindow(string);
		chanWindow.setBounds(100, 100, 500, 300);

		windowList.put(tglBtn, chanWindow);
		mainChannelAreaChatUsers.add(chanWindow);
		addListener(chanWindow);

		// channelButtonGroup.

	}

	private static void addListener(ChannelWindow window) {
		window.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent pe) {
				// System.out.println(pe.getPropertyName());
				JInternalFrame currentFrame = ((JInternalFrame) pe.getSource());

				if (pe.getPropertyName().equals("closed")) {
					for (Component c : channelListToolBar.getComponents()) {
						if (((JToggleButton) c).getText().equals(currentFrame.getName())) {
							channelListToolBar.remove(c);
							NetworkConnection.sendCommand("PART :" + c.getName());
							windowList.remove(c);
							currentFrame.dispose();
							frmJavairc.repaint();
							frmJavairc.revalidate();
						}
					}
				}
				if (pe.getPropertyName().equals("selected")) {

				}
				if (pe.getPropertyName().toLowerCase().equals("maximum") && currentFrame.isMaximum()) {
					frmJavairc.setTitle(frmJavairc.getTitle() + ":-" + currentFrame.getTitle());
					String name = currentFrame.getName();
					currentFrame.setTitle("");
					menuBar.add(Box.createHorizontalGlue());

					Dimension dim = new Dimension(17, 17);

					JButton closeButton = new JButton();
					closeButton.setIcon(new ImageIcon(MainWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
					closeButton.setName(name);
					JButton sizeButton = new JButton();
					sizeButton.setIcon(new ImageIcon(MainWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/minimize.gif")));
					sizeButton.setName(name);
					sizeButton.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseReleased(MouseEvent me) {
							try {
								// System.out.println( ((Component)
								// me.getSource()).getName());
								windowList.get((getButtonFromChannel(((Component) me.getSource()).getName()))).setMaximum(false);

							} catch (PropertyVetoException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					});

					JButton minimizeButton = new JButton();
					minimizeButton.setIcon(new ImageIcon(MainWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/iconify.gif")));
					minimizeButton.setName(name);
					closeButton.setPreferredSize(dim);
					sizeButton.setPreferredSize(dim);
					minimizeButton.setPreferredSize(dim);
					menuBar.add(minimizeButton);
					menuBar.add(sizeButton);
					menuBar.add(closeButton);
					currentFrame.setIconifiable(false);
					currentFrame.setMaximizable(false);
					currentFrame.setResizable(false);
					currentFrame.setClosable(false);
					((ChannelWindow) currentFrame).remove_title_bar();
					frmJavairc.repaint();
					frmJavairc.revalidate();
					isMaximized = true;

				} else if (pe.getPropertyName().toLowerCase().equals("maximum") && !currentFrame.isMaximum()) {
					currentFrame.setTitle(frmJavairc.getTitle().split(":-")[1]);
					frmJavairc.setTitle("JavaIRC");
					currentFrame.setIconifiable(true);
					currentFrame.setMaximizable(true);
					currentFrame.setResizable(true);
					currentFrame.setClosable(true);
					menuBar.removeAll();
					createMenu();
					((ChannelWindow) currentFrame).enable_title_bar();
					isMaximized = false;
					frmJavairc.repaint();
					frmJavairc.revalidate();
				}
			}
		});

	}

	private static Component createMenu() {

		mnFile = new JMenu("File");
		menuBar.add(mnFile);

		mntmNewWindow = new JMenuItem("New Window");
		mnFile.add(mntmNewWindow);

		JMenuItem mntmSelectServer = new JMenuItem("Select Server...");
		mntmSelectServer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.ALT_MASK));
		mnFile.add(mntmSelectServer);

		JSeparator separator = new JSeparator();
		mnFile.add(separator);

		JMenuItem mntmConnect = new JMenuItem("Connect");
		mnFile.add(mntmConnect);

		JMenuItem mntmDisconnect = new JMenuItem("Disconnect");
		mnFile.add(mntmDisconnect);

		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);

		JMenu mnFileHistory = new JMenu("History");
		mnFile.add(mnFileHistory);

		JSeparator separator_2 = new JSeparator();
		mnFile.add(separator_2);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);

		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);

		JCheckBoxMenuItem chckbxmntmMenubar = new JCheckBoxMenuItem("Menubar");
		mnView.add(chckbxmntmMenubar);

		JCheckBoxMenuItem chckbxmntmToolbar = new JCheckBoxMenuItem("Toolbar");
		mnView.add(chckbxmntmToolbar);

		JCheckBoxMenuItem chckbxmntmSwitchbar = new JCheckBoxMenuItem("Switchbar");
		mnView.add(chckbxmntmSwitchbar);

		JCheckBoxMenuItem chckbxmntmTreebar = new JCheckBoxMenuItem("Treebar");
		mnView.add(chckbxmntmTreebar);

		JSeparator separator1 = new JSeparator();
		mnView.add(separator1);

		JMenu mnViewFavorites = new JMenu("Favorites");
		mnView.add(mnViewFavorites);

		JMenu mnMode = new JMenu("Mode");
		mnView.add(mnMode);

		JSeparator separator_11 = new JSeparator();
		mnView.add(separator_11);

		JMenuItem mntmNotifyList = new JMenuItem("Notify List");
		mntmNotifyList.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.ALT_MASK));
		mnView.add(mntmNotifyList);

		JMenuItem mntmUrlsList = new JMenuItem("Urls List");
		mntmUrlsList.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.ALT_MASK));
		mnView.add(mntmUrlsList);

		JSeparator separator_3 = new JSeparator();
		mnView.add(separator_3);

		JMenuItem mntmColors = new JMenuItem("Colors...");
		mntmColors.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.ALT_MASK));
		mnView.add(mntmColors);

		JMenuItem mntmFont = new JMenuItem("Font...");
		mnView.add(mntmFont);

		JSeparator separator_21 = new JSeparator();
		mnView.add(separator_21);

		JMenuItem mntmFullscreen = new JMenuItem("Fullscreen");
		mntmFullscreen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0));
		mnView.add(mntmFullscreen);

		JMenu mnFavorites = new JMenu("Favorites");
		menuBar.add(mnFavorites);

		JMenuItem mntmAddToFavorites = new JMenuItem("Add to Favorites...");
		mnFavorites.add(mntmAddToFavorites);

		JMenuItem mntmOrganizeFavorites = new JMenuItem("Organize Favorites...");
		mnFavorites.add(mntmOrganizeFavorites);

		JSeparator separator_4 = new JSeparator();
		mnFavorites.add(separator_4);

		JMenu mnFavoritesHistory = new JMenu("History");
		mnFavorites.add(mnFavoritesHistory);

		JSeparator separator_5 = new JSeparator();
		mnFavorites.add(separator_5);

		JMenuItem mntmscriptij = new JMenuItem("#scriptij");
		mnFavorites.add(mntmscriptij);

		JMenu mnTools = new JMenu("Tools");
		menuBar.add(mnTools);

		JMenu mnCommands = new JMenu("Commands");
		menuBar.add(mnCommands);

		JMenu mnWindow = new JMenu("Window");
		menuBar.add(mnWindow);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		return menuBar;
	}

	public static void connection(String name, String server, String ident, String email_prefix, int port) {
		MainWindow.networkConnection = new NetworkConnection(server, port, name, "#Scriptij", email_prefix);
		MainWindow.networkConnection.connect();
	}

	public static void writeToConsole(String message, String channel) {
		JToggleButton tb = getButtonFromChannel(channel);
		if (!tb.getName().equals("System")) {
			windowList.get(getButtonFromChannel(channel)).appendToWindow(message);
		}else {
			SystemWindow.appendToWindow(message);
		}
	}

	public static void parseMode(String info) {
		// :effect0r!acid@effect0r.user.globalgamers.net MODE #scriptij +o
		// :effect0r`java!effect0r`j@348097D7.32892C5C.48EF1270.IP MODE
		// effect0r`java +x

		String[] tokens = info.split(" ");
		// [0] => person doing the moding
		// :effect0r!acid@effect0r.user.globalgamers.net
		// [1] => command MODE
		// [2] => channel #scriptij
		// [3] => mode type [+/-][ban, kick, op, voice, halfop, etc] +o
		// [4] => person being moded. effect0r
		if (tokens[1].equals("MODE") && !tokens[3].equals("+x")) {
			ChannelWindow chanWindow = windowList.get(getButtonFromChannel(tokens[2]));
			writeToConsole(chanWindow.getName(), info);
			Channel chan = chanWindow.getChannel();
			ArrayList<String> modeRecipients = new ArrayList<>();
			if (tokens.length > 3) {
				for (int i = 4; i < tokens.length; i++) {
					modeRecipients.add(tokens[i]);
				}
			}
			boolean type = false; // false = remove, true = add
			for (char ch : tokens[3].toCharArray()) {
				if (ch == '+') {
					// setting modes here
					type = true;
				} else if (ch == '-') {
					// removing here
					type = false;
				}
				if (ch == 'o' || ch == 'v' || ch == 'b') {
					// user recipients
					if (type) {
						chanWindow.plusUserListModes(ch, modeRecipients.remove(0));
					} else {
						chanWindow.minusUserListModes(ch, modeRecipients.remove(0));
					}
				} else if (ch == 's' || ch == 'm' || ch == 't' || ch == 'i' || ch == 'n' || ch == 'p') {
					// channel modes. Not key or limit.
					if (ch == 'p') {
						chan.setPrivate_chan(type);
					} else if (ch == 'm') {
						chan.setModerated(type);
					} else if (ch == 't') {
						chan.setOps_topic_only(type);
					} else if (ch == 'i') {
						chan.setInvite_only(type);
					} else if (ch == 'n') {
						chan.setExternal_messages(type);
					} else if (ch == 's') {
						chan.setSecret(type);
					}
				} else {
					// channel modes limit, password
					if (ch == 'k') {
						// since key is always second, get(1) is used
						chan.setKey(type);
						if (type) {
							chan.setKey_pass(modeRecipients.remove(0));
						} else {
							chan.setKey_pass("");
						}
					} else if (ch == 'l') {
						chan.setLimit(type);
						if (type) {
							chan.setLimit_amount(Integer.parseInt(modeRecipients.remove(0)));
						} else {
							chan.setLimit_amount(0);
						}
					}
				}
			}
		} else if (tokens[1].equals("324")) {
			// :effect0r!acid@effect0r.user.globalgamers.net 324 effect0r`java
			// #effect0r +tnz
			// [0] => :effect0r!acid@effect0r.user.globalgamers.net
			// [1] => 324
			// [2] => person receiving this command
			// [3] => channel
			// [4] => modes
			// [5]..=> limit password
			ChannelWindow chanWindow = windowList.get(getButtonFromChannel(tokens[3]));
			writeToConsole(chanWindow.getName(), info);
			Channel chan = chanWindow.getChannel();
			ArrayList<String> modeRecipients = new ArrayList<>();
			if (tokens.length > 4) {
				for (int i = 5; i < tokens.length; i++) {
					modeRecipients.add(tokens[i]);
				}
			}
			boolean type = false; // false = remove, true = add
			for (char ch : tokens[4].toCharArray()) {
				if (ch == '+') {
					// setting modes here
					type = true;
				} else if (ch == '-') {
					// removing here
					type = false;
				}
				if (ch == 'o' || ch == 'v' || ch == 'b') {
					// user recipients
					if (type) {
						chanWindow.plusUserListModes(ch, modeRecipients.remove(0));
					} else {
						chanWindow.minusUserListModes(ch, modeRecipients.remove(0));
					}
				} else if (ch == 's' || ch == 'm' || ch == 't' || ch == 'i' || ch == 'n' || ch == 'p') {
					// channel modes. Not key or limit.
					if (ch == 'p') {
						chan.setPrivate_chan(type);
					} else if (ch == 'm') {
						chan.setModerated(type);
					} else if (ch == 't') {
						chan.setOps_topic_only(type);
					} else if (ch == 'i') {
						chan.setInvite_only(type);
					} else if (ch == 'n') {
						chan.setExternal_messages(type);
					} else if (ch == 's') {
						chan.setSecret(type);
					}
				} else {
					// channel modes limit, password
					if (ch == 'k') {
						// since key is always second, get(1) is used
						chan.setKey(type);
						chan.setKey_pass(modeRecipients.remove(0));
					} else if (ch == 'l') {
						chan.setLimit(type);
						chan.setLimit_amount(Integer.parseInt(modeRecipients.remove(0)));
					}
				}
			}
		}
	}

	public static void updateChannel(String command) {
		// TODO Auto-generated method stub
		// :paintball.tx.us.globalgamers.net 324 effect0r #scriptij +stnz
		String[] tokens = command.split(" ");
		/*
		 * [0] = :paintball.tx.us.globalgamers.net [1] = 324 [2] = effect0r [3]
		 * = #scriptij [4] = +stnz
		 */

		for (JToggleButton jtb : windowList.keySet()) {
			if (jtb.getName().equals(tokens[3])) {
				Channel ch = windowList.get(jtb).getChannel();
				String[] modes = tokens[4].split(" ");
				if (modes.length > 1) {
					// l, k, or both, set
				} else {
					boolean type = false;// false = remove, true = add
					for (char c : modes[0].toCharArray()) {
						if (c == '+') {
							type = true;
						} else if (c == '-') {
							type = false;
						}
						if (c == 'p') {
							ch.setPrivate_chan(type);
						} else if (c == 'm') {
							ch.setModerated(type);
						} else if (c == 't') {
							ch.setOps_topic_only(type);
						} else if (c == 'i') {
							ch.setInvite_only(type);
						} else if (c == 'n') {
							ch.setExternal_messages(type);
						} else if (c == 's') {
							ch.setSecret(type);
						}
					}
				}

			}
		}
	}

	public static void populateUserList(ArrayList<User> userList, String channel) {
		windowList.get(getButtonFromChannel(channel)).populateUserList(userList);
		frmJavairc.repaint();
		frmJavairc.revalidate();
	}

	private static JToggleButton getButtonFromChannel(String chan) {
		JToggleButton update = SystemButton;
		for (JToggleButton b : windowList.keySet()) {
			if (b.getName() != null && b.getName().equals(chan)) {
				update = b;
			}
		}
		return update;
	}

	public static void updateUsers(String address, String command, String channel) {
		ChannelWindow update = windowList.get(getButtonFromChannel(channel));
		if (command.toLowerCase().equals("part")) {
			update.removeUser(channel, address);
		} else {
			update.addUser(channel, address);
		}
	}

	public static void topic(String channel, String topic) {
		// TODO Auto-generated method stub
		ChannelWindow cw = windowList.get(getButtonFromChannel(channel));
		cw.getChannel().setTopic(topic);
		cw.setTitle(cw.getTitle() + " " + topic);

	}

	public static JToggleButton getSelectedButton() {
		for (Enumeration<AbstractButton> buttons = channelButtonGroup.getElements(); buttons.hasMoreElements();) {
			AbstractButton button = buttons.nextElement();

			if (button.isSelected()) {
				return (JToggleButton) button;
			}
		}
		return null;
	}

	public static void updateAllNicks(String line) {
		// go through each open channel and update the oldnick to newnick.
		String[] tokens = line.split(" ");
		String address = tokens[0];
		String newNick = tokens[2];
		for (ChannelWindow cw : windowList.values()) {
			cw.updateUserList(address, newNick);
		}

	}
	
}
