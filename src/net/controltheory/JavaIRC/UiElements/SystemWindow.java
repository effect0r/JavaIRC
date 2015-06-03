package net.controltheory.JavaIRC.UiElements;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import net.controltheory.JavaIRC.internet.NetworkConnection;

public class SystemWindow extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name = "System";
	private JTextPane chatPane;
	private JTextField inputTextField;
	private Border border;
	private static SimpleDateFormat stf = new SimpleDateFormat("hh:mm:ssa");

	public SystemWindow() {
		setFrameIcon(new ImageIcon("C:\\Users\\Cory\\Workspace\\IRC\\resources\\ServerDisconnected.png"));
		setPreferredSize(new Dimension(300, 300));
		setName(name);
		setAutoscrolls(true);
		setVisible(true);
		setVerifyInputWhenFocusTarget(false);
		setDoubleBuffered(true);
		setFocusTraversalPolicyProvider(true);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setTitle("Status");
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		chatPane = new JTextPane();
		chatPane.setDocument(new DefaultStyledDocument());
		chatPane.setEditable(false);
		scrollPane.setViewportView(chatPane);

		inputTextField = new JTextField();
		getContentPane().add(inputTextField, BorderLayout.SOUTH);
		inputTextField.setColumns(10);
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
								// uh, no mode channel from system window
							}
						} else {
							// uh, not sending to channel?
						}

					}
				}
			}
		});
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

}
