package net.controltheory.JavaIRC.UiElements;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.plaf.IconUIResource;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeSelectionModel;

import java.awt.Component;
import java.awt.ComponentOrientation;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;
import javax.swing.JCheckBox;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;

import net.controltheory.JavaIRC.Structures.OptionsSaver;
import net.controltheory.JavaIRC.Structures.Server;
import net.controltheory.JavaIRC.UiElements.OptionWindows.AddServer;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Confirm;
import net.controltheory.JavaIRC.UiElements.OptionWindows.DCCAddFolder;
import net.controltheory.JavaIRC.UiElements.OptionWindows.DDE;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Events;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Keys;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Lexicon;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Lock;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Marker;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Names;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Perform;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Ports;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Retry;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Speech;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Styles;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Tips;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Tray;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Trusted;
import net.controltheory.JavaIRC.UiElements.OptionWindows.Windows;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OptionsFrame extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JPanel contentPane;
	static  ArrayList<JPanel> panelList = new ArrayList<>();
	private JTextField connectOptionsTxtDefaultport;
	private JTextField connectIdentdTxtUserID;
	private JTextField connectIdentdTxtSystem;
	private JTextField connectIdentdTxtPort;
	private JTextField connectProxyTxtConnectProxyHostname;
	private JTextField connectProxyTxtConnectproxyuserid;
	private JPasswordField connectProxyPwdPwpassword;
	private JTextField connectProxyTxtConnectproxyport;
	private JTextField connectLocalTxtTxtlocalhostname;
	private JTextField connectLocalTxtTxtlocalipaddress;
	private final ButtonGroup connectLocalGroup = new ButtonGroup();
	private JPanel panelConnect;
	private JPanel panelConnectServers;
	private JPanel panelConnectOptions;
	private JPanel panelConnectIdentd;
	private JPanel panelConnectProxy;
	private JPanel panelConnectLocal;
	private JButton btnOk;
	private JButton btnCancel;
	private JButton btnHelp;
	private JTextField ircMessagesTxtTimestampformat;
	private JTextField ircMessagesPanelTextField;
	private JTextField ircMessagesTxtCtcpfingerreply;
	private JTextField ircMessagesTxtQuitmessage;
	private JTextField soundsPanelonEventPlaySoundTxtNumbeeps;
	private JTextField soundsPanelOnEventPlaySoundTxtNumdelay;
	private JTextField ircLoggingTxtLogfilesize;
	private JTextField ircLoggingTxtTimestampformat;
	private JTextField ircFloodTxtFloodCheckBytes;
	private JTextField ircFloodTxtLinesInBuffer;
	private JTextField ircFloodTxtLinesPerPerson;
	private JTextField ircFloodTxtTimeToIgnorePerson;
	private JTextField mouseTxtCommandStatus;
	private JTextField mouseTxtCommandQuery;
	private JTextField mouseTxtCommandChannel;
	private JTextField mouseTxtCommandNickList;
	private JTextField mouseTxtCommandNotifyList;
	private JTextField mouseTxtCommandMessage;
	private final ButtonGroup mouseDropGroup = new ButtonGroup();
	private final ButtonGroup dccOnSendGroup = new ButtonGroup();
	private final ButtonGroup dccOnChatGroup = new ButtonGroup();
	private JTextField dccOptionsPanelTimeOutTxtDialogTimeOut;
	private JTextField dccOptionsPanelTimeOutTxtTransferTimeOut;
	private JTextField dccOptionsPanelTimeOutTxtFileServerTimeOut;
	private JTextField dccOptionsTxtMaxSends;
	private JTable dccFoldersScrollPaneTable;
	private JTextField dccIgnoreTxtTypetoadd;
	private JTextField dccFserveTxtMaxfileservers;
	private JTextField dccFserveTxtMaxgetsperuser;
	private JTextField dccFserveTxtMaxCps;
	private JTextField dccServerTxtListenPort;
	private JTextField DisplayOptionsTxtTitlebarText;
	private JTextField otherTxtPrefix;
	private JTextField otherTxtBuffersize;
	private JTextField otherTxtSeperator;
	

	@SuppressWarnings({ "rawtypes", "serial", "unchecked" })
	public OptionsFrame() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setType(Type.UTILITY);
		
		setTitle("JavaIRC Options");
		Icon empty = new TreeIcon();
        UIManager.put("Tree.closedIcon", empty);
        UIManager.put("Tree.openIcon", empty);
        UIManager.put("Tree.collapsedIcon", new IconUIResource(new NodeIcon('+')));
        UIManager.put("Tree.expandedIcon",  new IconUIResource(new NodeIcon('-')));
        UIManager.put("Tree.leafIcon", empty);
        
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 425, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Color[] colors={Color.white,Color.red,Color.blue,Color.green};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 30, 117, 271);
		contentPane.add(scrollPane);
		
		JTree treeCategory = new JTree();
		treeCategory.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent arg0) {
			}
		});
		scrollPane.setViewportView(treeCategory);
		treeCategory.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		treeCategory.addTreeSelectionListener(new SelectionListener());
		treeCategory.setModel(createTreeModel());
		
		
		
		treeCategory.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		treeCategory.setAlignmentY(Component.TOP_ALIGNMENT);
		treeCategory.setAlignmentX(Component.LEFT_ALIGNMENT);
		treeCategory.setShowsRootHandles(true);
		treeCategory.setRootVisible(false);
		treeCategory.setSelectionRow(0);
		
		btnOk = new JButton("OK");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				saveAllTheThings();
			}
		});
		btnOk.setBounds(146, 312, 75, 23);
		contentPane.add(btnOk);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				dispose();
			}
		});
		btnCancel.setBounds(226, 312, 75, 23);
		contentPane.add(btnCancel);
		
		btnHelp = new JButton("Help");
		btnHelp.setBounds(305, 312, 75, 23);
		contentPane.add(btnHelp);
		
		JLabel lblCategory = new JLabel("Category:");
		lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategory.setBounds(10, 11, 59, 14);
		contentPane.add(lblCategory);
		
		
		panelConnect = new JPanel();
		panelConnect.setName("connect");
		panelConnect.setBounds(135, 30, 280, 270);
		panelConnect.setEnabled(true);
		contentPane.add(panelConnect);
		panelConnect.setLayout(null);
		
		JLabel lblAlternative = new JLabel("Alternative:");
		lblAlternative.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAlternative.setBounds(32, 47, 57, 14);
		panelConnect.add(lblAlternative);
		
		JLabel lblNickname = new JLabel("Nickname:");
		lblNickname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNickname.setBounds(32, 22, 57, 14);
		panelConnect.add(lblNickname);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(32, 84, 57, 14);
		panelConnect.add(lblName);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(32, 110, 57, 14);
		panelConnect.add(lblEmail);
		
		JLabel lblServer = new JLabel("Server:");
		lblServer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblServer.setBounds(32, 145, 57, 14);
		panelConnect.add(lblServer);
		
		JTextField connectLabelServerName = new JTextField("irc.globalgamers.net");
		connectLabelServerName.setName("c");
		connectLabelServerName.setMinimumSize(new Dimension(6, 23));
		connectLabelServerName.setPreferredSize(new Dimension(104, 23));
		connectLabelServerName.setBounds(96, 141, 174, 23);
		panelConnect.add(connectLabelServerName);
		
		JCheckBox connectChckbxNewWindow = new JCheckBox("New window");
		connectChckbxNewWindow.setName("c");
		connectChckbxNewWindow.setHorizontalAlignment(SwingConstants.LEFT);
		connectChckbxNewWindow.setMnemonic('w');
		connectChckbxNewWindow.setBounds(96, 170, 129, 29);
		panelConnect.add(connectChckbxNewWindow);
		
		JButton connectBtnConnect = new JButton("Connect");
		connectBtnConnect.addMouseListener(new MouseAdapter() {	
			@Override
			public void mousePressed(MouseEvent e) {
				MainWindow.connection("effect0r`java", "irc.globalgamers.net", "JavaIRC", "JavaIRC", 6667);
				dispose();
			}
		});
		connectBtnConnect.setMnemonic('C');
		connectBtnConnect.setMnemonic(KeyEvent.VK_C);
		connectBtnConnect.setBounds(96, 200, 120, 23);
		panelConnect.add(connectBtnConnect);
		
		JTextField connectTxtNick = new JTextField();
		connectTxtNick.setName("c");
		connectTxtNick.setText("nick");
		connectTxtNick.setBounds(96, 19, 120, 20);
		panelConnect.add(connectTxtNick);
		connectTxtNick.setColumns(10);
		
		JTextField connectTxtAltnick = new JTextField();
		connectTxtAltnick.setName("c");
		connectTxtAltnick.setText("altNick");
		connectTxtAltnick.setBounds(96, 44, 120, 20);
		panelConnect.add(connectTxtAltnick);
		connectTxtAltnick.setColumns(10);
		
		JTextField connectTxtRealname = new JTextField();
		connectTxtRealname.setName("c");
		connectTxtRealname.setText("realName");
		connectTxtRealname.setBounds(96, 81, 120, 20);
		panelConnect.add(connectTxtRealname);
		connectTxtRealname.setColumns(10);
		
		JTextField connectTxtTxtemail = new JTextField();
		connectTxtTxtemail.setName("c");
		connectTxtTxtemail.setText("txtEmail");
		connectTxtTxtemail.setBounds(96, 107, 120, 20);
		panelConnect.add(connectTxtTxtemail);
		connectTxtTxtemail.setColumns(10);
		
		panelConnectOptions = new JPanel();
		panelConnectOptions.setVisible(false);
		
		panelConnectServers = new JPanel();
		panelConnectServers.setEnabled(false);
		panelConnectServers.setVisible(false);
		panelConnectServers.setName("connectservers");
		panelConnectServers.setBounds(135, 30, 280, 270);
		contentPane.add(panelConnectServers);
		panelConnectServers.setLayout(null);
		
		JScrollPane connectServersScrollServers = new JScrollPane();
		connectServersScrollServers.setName("c");
		connectServersScrollServers.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		connectServersScrollServers.setBounds(10, 29, 172, 219);
		panelConnectServers.add(connectServersScrollServers);
		
		JTree connectServersListServers = new JTree();
		connectServersListServers.setRootVisible(false);
		connectServersListServers.setName("a");
		connectServersListServers.setModel(createServerTreeModel());
		connectServersScrollServers.setViewportView(connectServersListServers);
		
		JButton connectServersBtnAdd = new JButton("Add");
		connectServersBtnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				AddServer as = new AddServer();
				as.setVisible(true);
			}
		});
		connectServersBtnAdd.setBounds(192, 57, 75, 23);
		panelConnectServers.add(connectServersBtnAdd);
		
		JButton connectServersBtnEdit = new JButton("Edit");
		connectServersBtnEdit.setEnabled(false);
		connectServersBtnEdit.setBounds(192, 85, 75, 23);
		panelConnectServers.add(connectServersBtnEdit);
		
		JButton connectServersBtnDelete = new JButton("Delete");
		connectServersBtnDelete.setBounds(192, 113, 75, 23);
		panelConnectServers.add(connectServersBtnDelete);
		
		JButton connectServersBtnSort = new JButton("Sort");
		connectServersBtnSort.setBounds(192, 141, 75, 23);
		panelConnectServers.add(connectServersBtnSort);
		
		JButton connectServersBtnSelect = new JButton("Select");
		connectServersBtnSelect.setBounds(192, 190, 75, 23);
		panelConnectServers.add(connectServersBtnSelect);
		panelConnectOptions.setEnabled(false);
		panelConnectOptions.setName("connectoptions");
		panelConnectOptions.setBounds(135, 30, 280, 270);
		contentPane.add(panelConnectOptions);
		panelConnectOptions.setLayout(null);
		
		JCheckBox connectOptionsConnectOptionsChckbxConnectOnStartup = new JCheckBox("Connect on startup");
		connectOptionsConnectOptionsChckbxConnectOnStartup.setName("c");
		connectOptionsConnectOptionsChckbxConnectOnStartup.setBounds(6, 34, 151, 23);
		panelConnectOptions.add(connectOptionsConnectOptionsChckbxConnectOnStartup);
		
		JCheckBox connectOptionsChckbxReconnectOnDisconnect = new JCheckBox("Reconnect on disconnect");
		connectOptionsChckbxReconnectOnDisconnect.setName("c");
		connectOptionsChckbxReconnectOnDisconnect.setBounds(6, 60, 151, 23);
		panelConnectOptions.add(connectOptionsChckbxReconnectOnDisconnect);
		
		JCheckBox connectOptionsChckbxShowConnectOn = new JCheckBox("Show connect on startup");
		connectOptionsChckbxShowConnectOn.setName("c");
		connectOptionsChckbxShowConnectOn.setBounds(6, 86, 151, 23);
		panelConnectOptions.add(connectOptionsChckbxShowConnectOn);
		
		JCheckBox connectOptionsChckbxMoveToTop = new JCheckBox("Move to top on connect");
		connectOptionsChckbxMoveToTop.setName("c");
		connectOptionsChckbxMoveToTop.setBounds(6, 114, 151, 23);
		panelConnectOptions.add(connectOptionsChckbxMoveToTop);
		
		JCheckBox connectOptionsChckbxCheckConnectionTime = new JCheckBox("Check connection time out");
		connectOptionsChckbxCheckConnectionTime.setName("c");
		connectOptionsChckbxCheckConnectionTime.setBounds(6, 140, 151, 23);
		panelConnectOptions.add(connectOptionsChckbxCheckConnectionTime);
		
		JCheckBox connectOptionsChckbxPreserveNicknames = new JCheckBox("Preserve nicknames");
		connectOptionsChckbxPreserveNicknames.setName("c");
		connectOptionsChckbxPreserveNicknames.setBounds(6, 166, 151, 23);
		panelConnectOptions.add(connectOptionsChckbxPreserveNicknames);
		
		JCheckBox connectOptionsChckbxUseInvisibleMode = new JCheckBox("Use invisible mode");
		connectOptionsChckbxUseInvisibleMode.setName("c");
		connectOptionsChckbxUseInvisibleMode.setBounds(6, 192, 151, 23);
		panelConnectOptions.add(connectOptionsChckbxUseInvisibleMode);
		
		JButton connectOptionsBtnPerform = new JButton("Perform...");
		connectOptionsBtnPerform.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Perform p = new Perform();
				p.setVisible(true);
			}
		});
		connectOptionsBtnPerform.setBounds(183, 34, 83, 23);
		panelConnectOptions.add(connectOptionsBtnPerform);
		
		JButton connectOptionsBtnRetry = new JButton("Retry...");
		connectOptionsBtnRetry.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Retry r = new Retry();
				r.setVisible(true);
			}
		});
		connectOptionsBtnRetry.setBounds(182, 60, 83, 23);
		panelConnectOptions.add(connectOptionsBtnRetry);
		
		JButton connectOptionsBtnSsl = new JButton("SSL...");
		connectOptionsBtnSsl.setBounds(182, 86, 83, 23);
		panelConnectOptions.add(connectOptionsBtnSsl);
		
		JButton connectOptionsBtnPorts = new JButton("Ports...");
		connectOptionsBtnPorts.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Ports p = new Ports();
				p.setVisible(true);
			}
		});
		connectOptionsBtnPorts.setBounds(182, 114, 83, 23);
		panelConnectOptions.add(connectOptionsBtnPorts);
		
		JLabel lblDefaultPort = new JLabel("Default Port:");
		lblDefaultPort.setBounds(28, 230, 62, 14);
		panelConnectOptions.add(lblDefaultPort);
		
		connectOptionsTxtDefaultport = new JTextField();
		connectOptionsTxtDefaultport.setName("c");
		connectOptionsTxtDefaultport.setText("DefaultPort");
		connectOptionsTxtDefaultport.setBounds(100, 227, 86, 20);
		panelConnectOptions.add(connectOptionsTxtDefaultport);
		connectOptionsTxtDefaultport.setColumns(10);
		
		panelConnectIdentd = new JPanel();
		panelConnectIdentd.setVisible(false);
		panelConnectIdentd.setEnabled(false);
		panelConnectIdentd.setName("connectidentd");
		panelConnectIdentd.setBounds(135, 30, 280, 270);
		contentPane.add(panelConnectIdentd);
		panelConnectIdentd.setLayout(null);
		
		JCheckBox connectIdentdChckbxEnabledIdentdServer = new JCheckBox("Enabled Identd server");
		connectIdentdChckbxEnabledIdentdServer.setName("c");
		connectIdentdChckbxEnabledIdentdServer.setBounds(58, 28, 165, 23);
		panelConnectIdentd.add(connectIdentdChckbxEnabledIdentdServer);
		
		JLabel lblUserId = new JLabel("User ID:");
		lblUserId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserId.setBounds(58, 69, 40, 14);
		panelConnectIdentd.add(lblUserId);
		
		JLabel lblSystem = new JLabel("System:");
		lblSystem.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSystem.setBounds(58, 94, 40, 14);
		panelConnectIdentd.add(lblSystem);
		
		JLabel lblPort = new JLabel("Port:");
		lblPort.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPort.setBounds(58, 119, 40, 14);
		panelConnectIdentd.add(lblPort);
		
		JCheckBox connectIdentdChckbxShowIdentdRequests = new JCheckBox("Show Identd requests");
		connectIdentdChckbxShowIdentdRequests.setName("c");
		connectIdentdChckbxShowIdentdRequests.setBounds(58, 140, 165, 23);
		panelConnectIdentd.add(connectIdentdChckbxShowIdentdRequests);
		
		JCheckBox connectIdentdChckbxEnableOnlyWhen = new JCheckBox("Enable only when connecting");
		connectIdentdChckbxEnableOnlyWhen.setName("c");
		connectIdentdChckbxEnableOnlyWhen.setBounds(58, 166, 165, 23);
		panelConnectIdentd.add(connectIdentdChckbxEnableOnlyWhen);
		
		JCheckBox connectIdentdChckbxUseIdFrom = new JCheckBox("Use ID from email address");
		connectIdentdChckbxUseIdFrom.setName("c");
		connectIdentdChckbxUseIdFrom.setBounds(58, 192, 165, 23);
		panelConnectIdentd.add(connectIdentdChckbxUseIdFrom);
		
		connectIdentdTxtUserID = new JTextField();
		connectIdentdTxtUserID.setName("c");
		connectIdentdTxtUserID.setBounds(108, 66, 115, 20);
		panelConnectIdentd.add(connectIdentdTxtUserID);
		connectIdentdTxtUserID.setColumns(10);
		
		connectIdentdTxtSystem = new JTextField();
		connectIdentdTxtSystem.setName("c");
		connectIdentdTxtSystem.setText("System");
		connectIdentdTxtSystem.setBounds(108, 91, 115, 20);
		panelConnectIdentd.add(connectIdentdTxtSystem);
		connectIdentdTxtSystem.setColumns(10);
		
		connectIdentdTxtPort = new JTextField();
		connectIdentdTxtPort.setName("c");
		connectIdentdTxtPort.setText("port");
		connectIdentdTxtPort.setBounds(108, 116, 55, 20);
		panelConnectIdentd.add(connectIdentdTxtPort);
		connectIdentdTxtPort.setColumns(10);
		
		panelConnectProxy = new JPanel();
		panelConnectProxy.setEnabled(false);
		panelConnectProxy.setVisible(false);
		panelConnectProxy.setName("connectproxy");
		panelConnectProxy.setBounds(135, 30, 280, 270);
		contentPane.add(panelConnectProxy);
		panelConnectProxy.setLayout(null);
		
		JLabel lblConnection = new JLabel("Connection:");
		lblConnection.setBounds(40, 26, 58, 14);
		panelConnectProxy.add(lblConnection);
		
		JComboBox<String> connectProxyComboBoxConnection = new JComboBox<String>();
		connectProxyComboBoxConnection.setName("c");
		connectProxyComboBoxConnection.setModel(new DefaultComboBoxModel(new String[] {"None", "Server", "DCC", "Both"}));
		connectProxyComboBoxConnection.setBounds(40, 43, 80, 20);
		panelConnectProxy.add(connectProxyComboBoxConnection);
		
		JLabel lblProtocol = new JLabel("Protocol:");
		lblProtocol.setBounds(160, 26, 46, 14);
		panelConnectProxy.add(lblProtocol);
		
		JComboBox<String> connectProxyComboBoxProtocol = new JComboBox<String>();
		connectProxyComboBoxProtocol.setName("c");
		connectProxyComboBoxProtocol.setModel(new DefaultComboBoxModel(new String[] {"Socks4", "Socks5", "Proxy"}));
		connectProxyComboBoxProtocol.setBounds(160, 43, 80, 20);
		panelConnectProxy.add(connectProxyComboBoxProtocol);
		
		JLabel lblHostname = new JLabel("Hostname:");
		lblHostname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHostname.setBounds(46, 84, 52, 14);
		panelConnectProxy.add(lblHostname);
		
		JLabel lblUserId_1 = new JLabel("User ID:");
		lblUserId_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserId_1.setBounds(46, 109, 52, 14);
		panelConnectProxy.add(lblUserId_1);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(46, 134, 52, 14);
		panelConnectProxy.add(lblPassword);
		
		JLabel lblPort_1 = new JLabel("Port:");
		lblPort_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPort_1.setBounds(46, 159, 52, 14);
		panelConnectProxy.add(lblPort_1);
		
		connectProxyTxtConnectProxyHostname = new JTextField();
		connectProxyTxtConnectProxyHostname.setName("c");
		connectProxyTxtConnectProxyHostname.setBounds(101, 81, 139, 20);
		panelConnectProxy.add(connectProxyTxtConnectProxyHostname);
		connectProxyTxtConnectProxyHostname.setColumns(10);
		
		connectProxyTxtConnectproxyuserid = new JTextField();
		connectProxyTxtConnectproxyuserid.setName("c");
		connectProxyTxtConnectproxyuserid.setText("ConnectProxyUserID");
		connectProxyTxtConnectproxyuserid.setBounds(101, 106, 139, 20);
		panelConnectProxy.add(connectProxyTxtConnectproxyuserid);
		connectProxyTxtConnectproxyuserid.setColumns(10);
		
		connectProxyPwdPwpassword = new JPasswordField();
		connectProxyPwdPwpassword.setName("c");
		connectProxyPwdPwpassword.setText("pwPassword");
		connectProxyPwdPwpassword.setBounds(101, 131, 139, 20);
		panelConnectProxy.add(connectProxyPwdPwpassword);
		
		connectProxyTxtConnectproxyport = new JTextField();
		connectProxyTxtConnectproxyport.setName("c");
		connectProxyTxtConnectproxyport.setText("ConnectProxyPort");
		connectProxyTxtConnectproxyport.setBounds(101, 156, 50, 20);
		panelConnectProxy.add(connectProxyTxtConnectproxyport);
		connectProxyTxtConnectproxyport.setColumns(10);
		
		JLabel lblExceptionMasks = new JLabel("Exception masks:");
		lblExceptionMasks.setBounds(40, 184, 83, 14);
		panelConnectProxy.add(lblExceptionMasks);
		
		JScrollPane connectProxyScrollException = new JScrollPane();
		connectProxyScrollException.setName("c");
		connectProxyScrollException.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		connectProxyScrollException.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		connectProxyScrollException.setBounds(40, 198, 200, 62);
		panelConnectProxy.add(connectProxyScrollException);
		
		JTextArea connectProxyTxtrExceptionmasks = new JTextArea();
		connectProxyTxtrExceptionmasks.setName("c");
		connectProxyScrollException.setViewportView(connectProxyTxtrExceptionmasks);
		
		panelConnectLocal = new JPanel();
		panelConnectLocal.setVisible(false);
		panelConnectLocal.setEnabled(false);
		panelConnectLocal.setName("connectlocal");
		panelConnectLocal.setBounds(135, 30, 280, 270);
		contentPane.add(panelConnectLocal);
		panelConnectLocal.setLayout(null);
		
		JPanel panelConnectLocalAlwaysGet = new JPanel();
		panelConnectLocalAlwaysGet.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "On connect, always get:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelConnectLocalAlwaysGet.setName("c");
		panelConnectLocalAlwaysGet.setBounds(40, 40, 194, 38);
		panelConnectLocal.add(panelConnectLocalAlwaysGet);
		panelConnectLocalAlwaysGet.setLayout(new BorderLayout(0, 0));
		
		JCheckBox connectLocalChckbxHostName = new JCheckBox("Host name");
		connectLocalChckbxHostName.setName("c");
		panelConnectLocalAlwaysGet.add(connectLocalChckbxHostName, BorderLayout.WEST);
		
		JCheckBox connectLocalChckbxIpAddress = new JCheckBox("IP Address");
		connectLocalChckbxIpAddress.setName("c");
		panelConnectLocalAlwaysGet.add(connectLocalChckbxIpAddress, BorderLayout.CENTER);
		
		JPanel pannelConnectLocalLookup = new JPanel();
		pannelConnectLocalLookup.setName("c");
		pannelConnectLocalLookup.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pannelConnectLocalLookup.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Lookup method:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pannelConnectLocalLookup.setBounds(40, 89, 194, 38);
		panelConnectLocal.add(pannelConnectLocalLookup);
		pannelConnectLocalLookup.setLayout(new BorderLayout(25, 0));
		
		JRadioButton connectLocalRdbtnNormal = new JRadioButton("Normal");
		connectLocalRdbtnNormal.setName("c");
		connectLocalGroup.add(connectLocalRdbtnNormal);
		pannelConnectLocalLookup.add(connectLocalRdbtnNormal, BorderLayout.WEST);
		
		JRadioButton connectLocalRdbtnServer = new JRadioButton("Server");
		connectLocalRdbtnServer.setName("c");
		connectLocalGroup.add(connectLocalRdbtnServer);
		connectLocalRdbtnServer.setAlignmentX(Component.CENTER_ALIGNMENT);
		pannelConnectLocalLookup.add(connectLocalRdbtnServer, BorderLayout.CENTER);
		
		JLabel lblHostName = new JLabel("Host Name:");
		lblHostName.setBounds(40, 138, 194, 14);
		panelConnectLocal.add(lblHostName);
		
		JLabel lblIpAddress = new JLabel("IP address:");
		lblIpAddress.setBounds(40, 189, 194, 14);
		panelConnectLocal.add(lblIpAddress);
		
		connectLocalTxtTxtlocalhostname = new JTextField();
		connectLocalTxtTxtlocalhostname.setName("c");
		connectLocalTxtTxtlocalhostname.setText("txtLocalHostName");
		connectLocalTxtTxtlocalhostname.setBounds(40, 152, 194, 20);
		panelConnectLocal.add(connectLocalTxtTxtlocalhostname);
		connectLocalTxtTxtlocalhostname.setColumns(10);
		
		connectLocalTxtTxtlocalipaddress = new JTextField();
		connectLocalTxtTxtlocalipaddress.setName("c");
		connectLocalTxtTxtlocalipaddress.setText("txtLocalIPAddress");
		connectLocalTxtTxtlocalipaddress.setBounds(40, 203, 194, 20);
		panelConnectLocal.add(connectLocalTxtTxtlocalipaddress);
		connectLocalTxtTxtlocalipaddress.setColumns(10);
		
		JPanel panelIrc = new JPanel();
		panelIrc.setVisible(false);
		panelIrc.setEnabled(false);
		panelIrc.setBounds(135, 30, 280, 270);
		contentPane.add(panelIrc);
		panelIrc.setName("irc");
		panelIrc.setLayout(null);
		
		JCheckBox ircChckbxPrefixOwnMessages = new JCheckBox("Prefix own messages");
		ircChckbxPrefixOwnMessages.setName("i");
		ircChckbxPrefixOwnMessages.setBounds(6, 17, 157, 15);
		panelIrc.add(ircChckbxPrefixOwnMessages);
		
		JCheckBox ircChckbxShowModePrefix = new JCheckBox("Show mode prefix");
		ircChckbxShowModePrefix.setName("i");
		ircChckbxShowModePrefix.setBounds(6, 35, 157, 15);
		panelIrc.add(ircChckbxShowModePrefix);
		
		JCheckBox ircChckbxMinimizeQueryWindow = new JCheckBox("Minimize query window");
		ircChckbxMinimizeQueryWindow.setName("i");
		ircChckbxMinimizeQueryWindow.setBounds(6, 60, 157, 15);
		panelIrc.add(ircChckbxMinimizeQueryWindow);
		
		JCheckBox ircChckbxUserQueryFor = new JCheckBox("User query for notify nicks");
		ircChckbxUserQueryFor.setName("i");
		ircChckbxUserQueryFor.setBounds(6, 78, 157, 15);
		panelIrc.add(ircChckbxUserQueryFor);
		
		JCheckBox ircChckbxWhoisOnQuery = new JCheckBox("Whois on query");
		ircChckbxWhoisOnQuery.setName("i");
		ircChckbxWhoisOnQuery.setBounds(6, 96, 157, 15);
		panelIrc.add(ircChckbxWhoisOnQuery);
		
		JCheckBox ircChckbxUserSingleMessage = new JCheckBox("Use single message window");
		ircChckbxUserSingleMessage.setName("i");
		ircChckbxUserSingleMessage.setBounds(6, 121, 157, 15);
		panelIrc.add(ircChckbxUserSingleMessage);
		
		JCheckBox ircChckbxCopyMessagesTo = new JCheckBox("Copy messages to query");
		ircChckbxCopyMessagesTo.setName("i");
		ircChckbxCopyMessagesTo.setBounds(6, 139, 157, 15);
		panelIrc.add(ircChckbxCopyMessagesTo);
		
		JCheckBox ircChckbxAutojoinChannelOn = new JCheckBox("Auto-join channel on invite");
		ircChckbxAutojoinChannelOn.setName("i");
		ircChckbxAutojoinChannelOn.setBounds(6, 164, 157, 15);
		panelIrc.add(ircChckbxAutojoinChannelOn);
		
		JCheckBox ircChckbxRejoinChannelWhen = new JCheckBox("Rejoin channel when kicked");
		ircChckbxRejoinChannelWhen.setName("i");
		ircChckbxRejoinChannelWhen.setBounds(6, 182, 157, 15);
		panelIrc.add(ircChckbxRejoinChannelWhen);
		
		JCheckBox ircChckbxRejoinChannelsOn = new JCheckBox("Rejoin channels on connect");
		ircChckbxRejoinChannelsOn.setName("i");
		ircChckbxRejoinChannelsOn.setBounds(6, 196, 157, 23);
		panelIrc.add(ircChckbxRejoinChannelsOn);
		
		JCheckBox ircChckbxKeepChannelsOpen = new JCheckBox("Keep channels open");
		ircChckbxKeepChannelsOpen.setName("i");
		ircChckbxKeepChannelsOpen.setBounds(6, 218, 157, 15);
		panelIrc.add(ircChckbxKeepChannelsOpen);
		
		JCheckBox ircChckbxHideChannelKey = new JCheckBox("Hide channel key");
		ircChckbxHideChannelKey.setName("i");
		ircChckbxHideChannelKey.setBounds(6, 235, 157, 15);
		panelIrc.add(ircChckbxHideChannelKey);
		
		JPanel ircPanelShowInActive = new JPanel();
		ircPanelShowInActive.setName("i");
		FlowLayout fl_ircPanelShowInActive = (FlowLayout) ircPanelShowInActive.getLayout();
		fl_ircPanelShowInActive.setVgap(-5);
		fl_ircPanelShowInActive.setHgap(0);
		fl_ircPanelShowInActive.setAlignment(FlowLayout.LEFT);
		ircPanelShowInActive.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Show in active:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ircPanelShowInActive.setBounds(169, 13, 93, 128);
		panelIrc.add(ircPanelShowInActive);
		
		JCheckBox chckbxAway = new JCheckBox("Away");
		chckbxAway.setName("i");
		ircPanelShowInActive.add(chckbxAway);
		
		JCheckBox chckbxCtcps = new JCheckBox("Ctcps");
		chckbxCtcps.setName("i");
		ircPanelShowInActive.add(chckbxCtcps);
		
		JCheckBox chckbxInvites = new JCheckBox("invites");
		chckbxInvites.setName("i");
		ircPanelShowInActive.add(chckbxInvites);
		
		JCheckBox chckbxNotices = new JCheckBox("Notices");
		chckbxNotices.setName("i");
		ircPanelShowInActive.add(chckbxNotices);
		
		JCheckBox chckbxQueries = new JCheckBox("Queries");
		chckbxQueries.setName("i");
		ircPanelShowInActive.add(chckbxQueries);
		
		JCheckBox chckbxWhois = new JCheckBox("Whois");
		chckbxWhois.setName("i");
		ircPanelShowInActive.add(chckbxWhois);
		
		JButton ircBtnEvents = new JButton("Events...");
		ircBtnEvents.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Events events = new Events();
				events.setVisible(true);
			}
		});
		ircBtnEvents.setName("i");
		ircBtnEvents.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ircBtnEvents.setBounds(179, 160, 77, 23);
		panelIrc.add(ircBtnEvents);
		
		JPanel panelIrcOptions = new JPanel();
		panelIrcOptions.setEnabled(false);
		panelIrcOptions.setVisible(false);
		panelIrcOptions.setName("ircoptions");
		panelIrcOptions.setBounds(135, 30, 280, 270);
		contentPane.add(panelIrcOptions);
		panelIrcOptions.setLayout(null);
		
		JPanel ircOptionsPanelShow = new JPanel();
		ircOptionsPanelShow.setName("i");
		FlowLayout fl_ircOptionsPanelShow = (FlowLayout) ircOptionsPanelShow.getLayout();
		fl_ircOptionsPanelShow.setHgap(0);
		fl_ircOptionsPanelShow.setAlignment(FlowLayout.LEFT);
		fl_ircOptionsPanelShow.setVgap(-5);
		ircOptionsPanelShow.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Show:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ircOptionsPanelShow.setBounds(27, 22, 150, 75);
		panelIrcOptions.add(ircOptionsPanelShow);
		
		JCheckBox ircOptionsChckbxShortJoinsAndParts = new JCheckBox("Short joins and parts");
		ircOptionsChckbxShortJoinsAndParts.setName("i");
		ircOptionsPanelShow.add(ircOptionsChckbxShortJoinsAndParts);
		
		JCheckBox ircOptionsChckbxUserAddresses = new JCheckBox("User addresses");
		ircOptionsChckbxUserAddresses.setName("i");
		ircOptionsPanelShow.add(ircOptionsChckbxUserAddresses);
		
		JCheckBox ircOptionsChckbxNicksOnJoin = new JCheckBox("Nicks on join");
		ircOptionsChckbxNicksOnJoin.setName("i");
		ircOptionsPanelShow.add(ircOptionsChckbxNicksOnJoin);
		
		JPanel ircOptionsPanelFlashOnMessage = new JPanel();
		ircOptionsPanelFlashOnMessage.setName("i");
		ircOptionsPanelFlashOnMessage.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Flash on message:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ircOptionsPanelFlashOnMessage.setBounds(27, 108, 190, 40);
		panelIrcOptions.add(ircOptionsPanelFlashOnMessage);
		ircOptionsPanelFlashOnMessage.setLayout(new BoxLayout(ircOptionsPanelFlashOnMessage, BoxLayout.X_AXIS));
		
		JCheckBox ircOptionsChckbxChannel = new JCheckBox("Channel");
		ircOptionsChckbxChannel.setName("i");
		ircOptionsPanelFlashOnMessage.add(ircOptionsChckbxChannel);
		
		JCheckBox ircOptionsChckbxQuery = new JCheckBox("Query");
		ircOptionsChckbxQuery.setName("i");
		ircOptionsPanelFlashOnMessage.add(ircOptionsChckbxQuery);
		
		JCheckBox ircOptionsChckbxChat = new JCheckBox("Chat");
		ircOptionsChckbxChat.setName("i");
		ircOptionsChckbxChat.setHorizontalAlignment(SwingConstants.LEFT);
		ircOptionsPanelFlashOnMessage.add(ircOptionsChckbxChat);
		
		JPanel ircOptionsPanelOther = new JPanel();
		ircOptionsPanelOther.setName("i");
		ircOptionsPanelOther.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Other:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		FlowLayout flowLayout = (FlowLayout) ircOptionsPanelOther.getLayout();
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(-5);
		ircOptionsPanelOther.setBounds(27, 166, 150, 75);
		panelIrcOptions.add(ircOptionsPanelOther);
		
		JCheckBox ircOptionsChckbxSkipMotdOn = new JCheckBox("Skip MOTD on connect");
		ircOptionsChckbxSkipMotdOn.setName("i");
		ircOptionsPanelOther.add(ircOptionsChckbxSkipMotdOn);
		
		JCheckBox ircOptionsChckbxHidePingPong = new JCheckBox("Hide ping? pong! event");
		ircOptionsChckbxHidePingPong.setName("i");
		ircOptionsPanelOther.add(ircOptionsChckbxHidePingPong);
		
		JCheckBox ircOptionsChckbxCancelAwayOn = new JCheckBox("Cancel away on activity");
		ircOptionsChckbxCancelAwayOn.setName("i");
		ircOptionsPanelOther.add(ircOptionsChckbxCancelAwayOn);
		
		JPanel panelIrcMessages = new JPanel();
		panelIrcMessages.setVisible(false);
		panelIrcMessages.setEnabled(false);
		panelIrcMessages.setName("ircmessages");
		panelIrcMessages.setBounds(135, 30, 280, 270);
		contentPane.add(panelIrcMessages);
		panelIrcMessages.setLayout(null);
		
		JCheckBox ircMessagesChckbxTimestampEvents = new JCheckBox("Timestamp Events:");
		ircMessagesChckbxTimestampEvents.setName("i");
		ircMessagesChckbxTimestampEvents.setBounds(21, 26, 117, 23);
		panelIrcMessages.add(ircMessagesChckbxTimestampEvents);
		
		ircMessagesTxtTimestampformat = new JTextField();
		ircMessagesTxtTimestampformat.setName("i");
		ircMessagesTxtTimestampformat.setText("timeStampFormat");
		ircMessagesTxtTimestampformat.setBounds(141, 27, 128, 20);
		panelIrcMessages.add(ircMessagesTxtTimestampformat);
		ircMessagesTxtTimestampformat.setColumns(10);
		
		JPanel ircMessagesPanel = new JPanel();
		ircMessagesPanel.setName("i");
		ircMessagesPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Strip codes from incoming messages:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ircMessagesPanel.setBounds(15, 56, 257, 39);
		panelIrcMessages.add(ircMessagesPanel);
		ircMessagesPanel.setLayout(new BoxLayout(ircMessagesPanel, BoxLayout.X_AXIS));
		
		JCheckBox ircMessagesPanelChckbxColor = new JCheckBox("Color");
		ircMessagesPanelChckbxColor.setName("i");
		ircMessagesPanel.add(ircMessagesPanelChckbxColor);
		
		JCheckBox ircMessagesPanelChckbxOther = new JCheckBox("Other");
		ircMessagesPanelChckbxOther.setName("i");
		ircMessagesPanel.add(ircMessagesPanelChckbxOther);
		
		JCheckBox ircMessagesPanelChckbxIfMoreThan = new JCheckBox("If more than:");
		ircMessagesPanelChckbxIfMoreThan.setName("i");
		ircMessagesPanel.add(ircMessagesPanelChckbxIfMoreThan);
		
		ircMessagesPanelTextField = new JTextField();
		ircMessagesPanelTextField.setName("i");
		ircMessagesPanelTextField.setText("50");
		ircMessagesPanel.add(ircMessagesPanelTextField);
		ircMessagesPanelTextField.setColumns(10);
		
		ircMessagesTxtCtcpfingerreply = new JTextField();
		ircMessagesTxtCtcpfingerreply.setName("i");
		ircMessagesTxtCtcpfingerreply.setText("ctcpFingerReply");
		ircMessagesTxtCtcpfingerreply.setBounds(98, 106, 171, 20);
		panelIrcMessages.add(ircMessagesTxtCtcpfingerreply);
		ircMessagesTxtCtcpfingerreply.setColumns(10);
		
		JLabel lblCtcpFingerReply = new JLabel("Ctcp finger reply:");
		lblCtcpFingerReply.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCtcpFingerReply.setBounds(10, 109, 85, 14);
		panelIrcMessages.add(lblCtcpFingerReply);
		
		JLabel lblQuitMessage = new JLabel("Quit message:");
		lblQuitMessage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuitMessage.setBounds(10, 134, 85, 14);
		panelIrcMessages.add(lblQuitMessage);
		
		ircMessagesTxtQuitmessage = new JTextField();
		ircMessagesTxtQuitmessage.setName("i");
		ircMessagesTxtQuitmessage.setText("quitMessage");
		ircMessagesTxtQuitmessage.setBounds(98, 131, 171, 20);
		panelIrcMessages.add(ircMessagesTxtQuitmessage);
		ircMessagesTxtQuitmessage.setColumns(10);
		
		JCheckBox ircMessagesChckbxSplitLongChannelquery = new JCheckBox("Split long channel/query messages");
		ircMessagesChckbxSplitLongChannelquery.setName("i");
		ircMessagesChckbxSplitLongChannelquery.setBounds(21, 173, 191, 23);
		panelIrcMessages.add(ircMessagesChckbxSplitLongChannelquery);
		
		JCheckBox ircMessagesChckbxUtfEncodedecodeMessages = new JCheckBox("UTF-8 encode/decode messages");
		ircMessagesChckbxUtfEncodedecodeMessages.setName("i");
		ircMessagesChckbxUtfEncodedecodeMessages.setBounds(21, 199, 181, 23);
		panelIrcMessages.add(ircMessagesChckbxUtfEncodedecodeMessages);
		
		JPanel panelIrcCatcher = new JPanel();
		panelIrcCatcher.setVisible(false);
		panelIrcCatcher.setEnabled(false);
		panelIrcCatcher.setName("irccatcher");
		panelIrcCatcher.setBounds(135, 30, 280, 270);
		contentPane.add(panelIrcCatcher);
		panelIrcCatcher.setLayout(null);
		
		JLabel lblEnableCatchingFor = new JLabel("Enable catching for:");
		lblEnableCatchingFor.setBounds(10, 38, 102, 14);
		panelIrcCatcher.add(lblEnableCatchingFor);
		
		JCheckBox ircCatcherChckbxUrls = new JCheckBox("URLs");
		ircCatcherChckbxUrls.setName("i");
		ircCatcherChckbxUrls.setBounds(6, 60, 49, 23);
		panelIrcCatcher.add(ircCatcherChckbxUrls);
		
		JCheckBox ircCatcherChckbxEmails = new JCheckBox("Emails");
		ircCatcherChckbxEmails.setName("i");
		ircCatcherChckbxEmails.setBounds(57, 59, 55, 23);
		panelIrcCatcher.add(ircCatcherChckbxEmails);
		
		JPanel ircCatcherPanelBrowser = new JPanel();
		ircCatcherPanelBrowser.setName("i");
		FlowLayout fl_ircCatcherPanelBrowser = (FlowLayout) ircCatcherPanelBrowser.getLayout();
		fl_ircCatcherPanelBrowser.setHgap(0);
		fl_ircCatcherPanelBrowser.setAlignment(FlowLayout.LEFT);
		fl_ircCatcherPanelBrowser.setVgap(-2);
		ircCatcherPanelBrowser.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Web browser:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ircCatcherPanelBrowser.setBounds(130, 22, 140, 65);
		panelIrcCatcher.add(ircCatcherPanelBrowser);
		
		JCheckBox ircCatcherChckbxOpenANew = new JCheckBox("Open a new window");
		ircCatcherChckbxOpenANew.setName("i");
		ircCatcherPanelBrowser.add(ircCatcherChckbxOpenANew);
		
		JCheckBox ircCatcherChckbxActivateTheWindow = new JCheckBox("Activate the window");
		ircCatcherChckbxActivateTheWindow.setName("i");
		ircCatcherPanelBrowser.add(ircCatcherChckbxActivateTheWindow);
		
		JPanel ircCatcherPanelLinks = new JPanel();
		ircCatcherPanelLinks.setName("i");
		FlowLayout fl_ircCatcherPanelLinks = (FlowLayout) ircCatcherPanelLinks.getLayout();
		fl_ircCatcherPanelLinks.setAlignment(FlowLayout.LEFT);
		fl_ircCatcherPanelLinks.setVgap(-2);
		fl_ircCatcherPanelLinks.setHgap(0);
		ircCatcherPanelLinks.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Chat links:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ircCatcherPanelLinks.setBounds(0, 95, 120, 65);
		panelIrcCatcher.add(ircCatcherPanelLinks);
		
		JCheckBox ircCatcherChckbxEnableSupport = new JCheckBox("Enable support");
		ircCatcherChckbxEnableSupport.setName("i");
		ircCatcherPanelLinks.add(ircCatcherChckbxEnableSupport);
		
		JCheckBox ircCatcherChckbxConfirmRequests = new JCheckBox("Confirm requests");
		ircCatcherChckbxConfirmRequests.setName("i");
		ircCatcherPanelLinks.add(ircCatcherChckbxConfirmRequests);
		
		JPanel ircCatcherPanelMarkedItems = new JPanel();
		ircCatcherPanelMarkedItems.setName("i");
		FlowLayout fl_ircCatcherPanelMarkedItems = (FlowLayout) ircCatcherPanelMarkedItems.getLayout();
		fl_ircCatcherPanelMarkedItems.setAlignment(FlowLayout.LEFT);
		fl_ircCatcherPanelMarkedItems.setVgap(-2);
		fl_ircCatcherPanelMarkedItems.setHgap(0);
		ircCatcherPanelMarkedItems.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Marked items:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ircCatcherPanelMarkedItems.setBounds(130, 95, 140, 65);
		panelIrcCatcher.add(ircCatcherPanelMarkedItems);
		
		JCheckBox ircCatcherChckbxPlaceItems = new JCheckBox("Place ? items at top");
		ircCatcherChckbxPlaceItems.setName("i");
		ircCatcherPanelMarkedItems.add(ircCatcherChckbxPlaceItems);
		
		JCheckBox ircCatcherChckbxDeleteItems = new JCheckBox("Delete ? items on exit");
		ircCatcherChckbxDeleteItems.setName("i");
		ircCatcherPanelMarkedItems.add(ircCatcherChckbxDeleteItems);
		
		JPanel ircCatcherPanelOnSend = new JPanel();
		ircCatcherPanelOnSend.setName("i");
		FlowLayout fl_ircCatcherPanelOnSend = (FlowLayout) ircCatcherPanelOnSend.getLayout();
		fl_ircCatcherPanelOnSend.setVgap(-2);
		fl_ircCatcherPanelOnSend.setHgap(0);
		ircCatcherPanelOnSend.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "On Send:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ircCatcherPanelOnSend.setBounds(130, 170, 140, 41);
		panelIrcCatcher.add(ircCatcherPanelOnSend);
		
		JCheckBox ircCatcherChckbxSendDescription = new JCheckBox("Send description");
		ircCatcherChckbxSendDescription.setName("i");
		ircCatcherPanelOnSend.add(ircCatcherChckbxSendDescription);
		
		JCheckBox ircCatcherChckbxShowWarningWhen = new JCheckBox("<html>Show warning when opening a URL</html>");
		ircCatcherChckbxShowWarningWhen.setName("i");
		ircCatcherChckbxShowWarningWhen.setVerticalAlignment(SwingConstants.TOP);
		ircCatcherChckbxShowWarningWhen.setBounds(6, 185, 110, 51);
		panelIrcCatcher.add(ircCatcherChckbxShowWarningWhen);
		
		JPanel panelIrcLogging = new JPanel();
		panelIrcLogging.setEnabled(false);
		panelIrcLogging.setVisible(false);
		panelIrcLogging.setName("irclogging");
		panelIrcLogging.setBounds(135, 30, 280, 270);
		contentPane.add(panelIrcLogging);
		panelIrcLogging.setLayout(null);
		
		JLabel lblAutomaticallyLog = new JLabel("Automatically log:");
		lblAutomaticallyLog.setBounds(26, 21, 85, 14);
		panelIrcLogging.add(lblAutomaticallyLog);
		
		JLabel lblReloadLogs = new JLabel("Reload logs:");
		lblReloadLogs.setBounds(155, 21, 85, 14);
		panelIrcLogging.add(lblReloadLogs);
		
		JLabel lblKb = new JLabel("kb");
		lblKb.setBounds(99, 111, 16, 14);
		panelIrcLogging.add(lblKb);
		
		JLabel lblLogsAndBuffer = new JLabel("Logs and buffer saves folder:");
		lblLogsAndBuffer.setBounds(26, 218, 142, 14);
		panelIrcLogging.add(lblLogsAndBuffer);
		
		JButton ircLoggingBtnSaveFolder = new JButton("C:\\Path\\to\\folder");
		ircLoggingBtnSaveFolder.setBounds(26, 236, 226, 23);
		panelIrcLogging.add(ircLoggingBtnSaveFolder);
		
		ircLoggingTxtLogfilesize = new JTextField();
		ircLoggingTxtLogfilesize.setName("i");
		ircLoggingTxtLogfilesize.setText("logFileSize");
		ircLoggingTxtLogfilesize.setBounds(46, 108, 48, 20);
		panelIrcLogging.add(ircLoggingTxtLogfilesize);
		ircLoggingTxtLogfilesize.setColumns(10);
		
		ircLoggingTxtTimestampformat = new JTextField();
		ircLoggingTxtTimestampformat.setName("i");
		ircLoggingTxtTimestampformat.setText("timestampFormat");
		ircLoggingTxtTimestampformat.setBounds(46, 153, 77, 20);
		panelIrcLogging.add(ircLoggingTxtTimestampformat);
		ircLoggingTxtTimestampformat.setColumns(10);
		
		JComboBox<String> ircLoggingComboBoxLogType = new JComboBox<String>();
		ircLoggingComboBoxLogType.setName("i");
		ircLoggingComboBoxLogType.setModel(new DefaultComboBoxModel(new String[] {"None", "Channels", "Chat", "Both"}));
		ircLoggingComboBoxLogType.setBounds(26, 38, 97, 20);
		panelIrcLogging.add(ircLoggingComboBoxLogType);
		
		JComboBox<String> ircLoggingComboBoxReloadLogType = new JComboBox<String>();
		ircLoggingComboBoxReloadLogType.setName("i");
		ircLoggingComboBoxReloadLogType.setModel(new DefaultComboBoxModel(new String[] {"None", "Channels", "Chat", "Both"}));
		ircLoggingComboBoxReloadLogType.setBounds(143, 38, 109, 20);
		panelIrcLogging.add(ircLoggingComboBoxReloadLogType);
		
		JComboBox<String> ircLoggingComboBoxFileNamesDateFormat = new JComboBox<String>();
		ircLoggingComboBoxFileNamesDateFormat.setName("i");
		ircLoggingComboBoxFileNamesDateFormat.setModel(new DefaultComboBoxModel(new String[] {"Day", "Week", "Month"}));
		ircLoggingComboBoxFileNamesDateFormat.setBounds(166, 153, 85, 20);
		panelIrcLogging.add(ircLoggingComboBoxFileNamesDateFormat);
		
		JCheckBox ircLoggingChckbxLockLogFiles = new JCheckBox("Lock log files");
		ircLoggingChckbxLockLogFiles.setName("i");
		ircLoggingChckbxLockLogFiles.setHorizontalTextPosition(SwingConstants.RIGHT);
		ircLoggingChckbxLockLogFiles.setHorizontalAlignment(SwingConstants.LEFT);
		ircLoggingChckbxLockLogFiles.setBounds(26, 65, 97, 23);
		panelIrcLogging.add(ircLoggingChckbxLockLogFiles);
		
		JCheckBox ircLoggingChckbxTrimLogFiles = new JCheckBox("Trim log files to:");
		ircLoggingChckbxTrimLogFiles.setName("i");
		ircLoggingChckbxTrimLogFiles.setHorizontalAlignment(SwingConstants.LEFT);
		ircLoggingChckbxTrimLogFiles.setBounds(26, 85, 101, 23);
		panelIrcLogging.add(ircLoggingChckbxTrimLogFiles);
		
		JCheckBox ircLoggingChckbxStripCodes = new JCheckBox("Strip codes");
		ircLoggingChckbxStripCodes.setName("i");
		ircLoggingChckbxStripCodes.setHorizontalAlignment(SwingConstants.LEFT);
		ircLoggingChckbxStripCodes.setBounds(26, 175, 97, 23);
		panelIrcLogging.add(ircLoggingChckbxStripCodes);
		
		JCheckBox ircLoggingChckbxTimestampLogs = new JCheckBox("Timestamp logs:");
		ircLoggingChckbxTimestampLogs.setName("i");
		ircLoggingChckbxTimestampLogs.setHorizontalAlignment(SwingConstants.LEFT);
		ircLoggingChckbxTimestampLogs.setBounds(26, 130, 103, 23);
		panelIrcLogging.add(ircLoggingChckbxTimestampLogs);
		
		JCheckBox ircLoggingChckbxLineColors = new JCheckBox("Line colors");
		ircLoggingChckbxLineColors.setName("i");
		ircLoggingChckbxLineColors.setBounds(143, 65, 97, 23);
		panelIrcLogging.add(ircLoggingChckbxLineColors);
		
		JCheckBox ircLoggingChckbxIncludeNetwork = new JCheckBox("Include network");
		ircLoggingChckbxIncludeNetwork.setName("i");
		ircLoggingChckbxIncludeNetwork.setBounds(143, 85, 103, 23);
		panelIrcLogging.add(ircLoggingChckbxIncludeNetwork);
		
		JCheckBox ircLoggingChckbxMakeFolder = new JCheckBox("Make folder");
		ircLoggingChckbxMakeFolder.setName("i");
		ircLoggingChckbxMakeFolder.setBounds(167, 107, 85, 23);
		panelIrcLogging.add(ircLoggingChckbxMakeFolder);
		
		JCheckBox ircLoggingChckbxDateFilenames = new JCheckBox("Date filenames:");
		ircLoggingChckbxDateFilenames.setName("i");
		ircLoggingChckbxDateFilenames.setBounds(143, 130, 101, 23);
		panelIrcLogging.add(ircLoggingChckbxDateFilenames);
		
		JCheckBox ircLoggingChckbxExceptStatus = new JCheckBox("Except status");
		ircLoggingChckbxExceptStatus.setName("i");
		ircLoggingChckbxExceptStatus.setBounds(164, 175, 99, 23);
		panelIrcLogging.add(ircLoggingChckbxExceptStatus);
		
		JPanel panelIrcFlood = new JPanel();
		panelIrcFlood.setVisible(false);
		panelIrcFlood.setEnabled(false);
		panelIrcFlood.setName("ircflood");
		panelIrcFlood.setBounds(135, 30, 280, 270);
		contentPane.add(panelIrcFlood);
		panelIrcFlood.setLayout(null);
		
		JCheckBox ircFloodChckbxEnableFloodProtection = new JCheckBox("Enable flood protection");
		ircFloodChckbxEnableFloodProtection.setName("i");
		ircFloodChckbxEnableFloodProtection.setBounds(35, 7, 209, 23);
		panelIrcFlood.add(ircFloodChckbxEnableFloodProtection);
		
		JCheckBox ircFloodChckbxShowStatusUpdates = new JCheckBox("Show status updates in active window");
		ircFloodChckbxShowStatusUpdates.setName("i");
		ircFloodChckbxShowStatusUpdates.setBounds(35, 28, 209, 23);
		panelIrcFlood.add(ircFloodChckbxShowStatusUpdates);
		
		JPanel ircFloodPanelSettings = new JPanel();
		ircFloodPanelSettings.setName("i");
		ircFloodPanelSettings.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Settings:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ircFloodPanelSettings.setBounds(25, 50, 230, 130);
		panelIrcFlood.add(ircFloodPanelSettings);
		GridBagLayout gbl_ircFloodPanelSettings = new GridBagLayout();
		gbl_ircFloodPanelSettings.columnWidths = new int[]{186, 41, 39, 0};
		gbl_ircFloodPanelSettings.rowHeights = new int[]{28, 28, 28, 28, 0};
		gbl_ircFloodPanelSettings.columnWeights = new double[]{10.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_ircFloodPanelSettings.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		ircFloodPanelSettings.setLayout(gbl_ircFloodPanelSettings);
		
		JLabel lblTriggerFloodCheck = new JLabel("Trigger flood check after:");
		lblTriggerFloodCheck.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblTriggerFloodCheck = new GridBagConstraints();
		gbc_lblTriggerFloodCheck.fill = GridBagConstraints.BOTH;
		gbc_lblTriggerFloodCheck.insets = new Insets(0, 0, 5, 5);
		gbc_lblTriggerFloodCheck.gridx = 0;
		gbc_lblTriggerFloodCheck.gridy = 0;
		ircFloodPanelSettings.add(lblTriggerFloodCheck, gbc_lblTriggerFloodCheck);
		
		ircFloodTxtFloodCheckBytes = new JTextField();
		ircFloodTxtFloodCheckBytes.setName("i");
		ircFloodTxtFloodCheckBytes.setText("floodCheckBytes");
		GridBagConstraints gbc_ircFloodTxtFloodCheckBytes = new GridBagConstraints();
		gbc_ircFloodTxtFloodCheckBytes.fill = GridBagConstraints.BOTH;
		gbc_ircFloodTxtFloodCheckBytes.insets = new Insets(0, 0, 5, 5);
		gbc_ircFloodTxtFloodCheckBytes.gridx = 1;
		gbc_ircFloodTxtFloodCheckBytes.gridy = 0;
		ircFloodPanelSettings.add(ircFloodTxtFloodCheckBytes, gbc_ircFloodTxtFloodCheckBytes);
		ircFloodTxtFloodCheckBytes.setColumns(10);
		
		JLabel lblBytes = new JLabel("Bytes");
		GridBagConstraints gbc_lblBytes = new GridBagConstraints();
		gbc_lblBytes.fill = GridBagConstraints.BOTH;
		gbc_lblBytes.insets = new Insets(0, 0, 5, 0);
		gbc_lblBytes.gridx = 2;
		gbc_lblBytes.gridy = 0;
		ircFloodPanelSettings.add(lblBytes, gbc_lblBytes);
		
		JLabel lblMaxLinesIn = new JLabel("Max. lines in buffer:");
		lblMaxLinesIn.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblMaxLinesIn = new GridBagConstraints();
		gbc_lblMaxLinesIn.fill = GridBagConstraints.BOTH;
		gbc_lblMaxLinesIn.insets = new Insets(0, 0, 5, 5);
		gbc_lblMaxLinesIn.gridx = 0;
		gbc_lblMaxLinesIn.gridy = 1;
		ircFloodPanelSettings.add(lblMaxLinesIn, gbc_lblMaxLinesIn);
		
		ircFloodTxtLinesInBuffer = new JTextField();
		ircFloodTxtLinesInBuffer.setName("i");
		ircFloodTxtLinesInBuffer.setText("linesInBuffer");
		GridBagConstraints gbc_ircFloodTxtLinesInBuffer = new GridBagConstraints();
		gbc_ircFloodTxtLinesInBuffer.fill = GridBagConstraints.BOTH;
		gbc_ircFloodTxtLinesInBuffer.insets = new Insets(0, 0, 5, 5);
		gbc_ircFloodTxtLinesInBuffer.gridx = 1;
		gbc_ircFloodTxtLinesInBuffer.gridy = 1;
		ircFloodPanelSettings.add(ircFloodTxtLinesInBuffer, gbc_ircFloodTxtLinesInBuffer);
		ircFloodTxtLinesInBuffer.setColumns(10);
		
		JLabel lblLines = new JLabel("Lines");
		GridBagConstraints gbc_lblLines = new GridBagConstraints();
		gbc_lblLines.fill = GridBagConstraints.BOTH;
		gbc_lblLines.insets = new Insets(0, 0, 5, 0);
		gbc_lblLines.gridx = 2;
		gbc_lblLines.gridy = 1;
		ircFloodPanelSettings.add(lblLines, gbc_lblLines);
		
		JLabel lblMaxLinesPer = new JLabel("Max. lines per person:");
		lblMaxLinesPer.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblMaxLinesPer = new GridBagConstraints();
		gbc_lblMaxLinesPer.fill = GridBagConstraints.BOTH;
		gbc_lblMaxLinesPer.insets = new Insets(0, 0, 5, 5);
		gbc_lblMaxLinesPer.gridx = 0;
		gbc_lblMaxLinesPer.gridy = 2;
		ircFloodPanelSettings.add(lblMaxLinesPer, gbc_lblMaxLinesPer);
		
		ircFloodTxtLinesPerPerson = new JTextField();
		ircFloodTxtLinesPerPerson.setName("i");
		ircFloodTxtLinesPerPerson.setText("linesPerPerson");
		GridBagConstraints gbc_ircFloodTxtLinesPerPerson = new GridBagConstraints();
		gbc_ircFloodTxtLinesPerPerson.fill = GridBagConstraints.BOTH;
		gbc_ircFloodTxtLinesPerPerson.insets = new Insets(0, 0, 5, 5);
		gbc_ircFloodTxtLinesPerPerson.gridx = 1;
		gbc_ircFloodTxtLinesPerPerson.gridy = 2;
		ircFloodPanelSettings.add(ircFloodTxtLinesPerPerson, gbc_ircFloodTxtLinesPerPerson);
		ircFloodTxtLinesPerPerson.setColumns(10);
		
		JLabel lblLines_1 = new JLabel("Lines");
		GridBagConstraints gbc_lblLines_1 = new GridBagConstraints();
		gbc_lblLines_1.fill = GridBagConstraints.BOTH;
		gbc_lblLines_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblLines_1.gridx = 2;
		gbc_lblLines_1.gridy = 2;
		ircFloodPanelSettings.add(lblLines_1, gbc_lblLines_1);
		
		JLabel lblIgnorePersonFor = new JLabel("Ignore person for:");
		lblIgnorePersonFor.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblIgnorePersonFor = new GridBagConstraints();
		gbc_lblIgnorePersonFor.fill = GridBagConstraints.BOTH;
		gbc_lblIgnorePersonFor.insets = new Insets(0, 0, 0, 5);
		gbc_lblIgnorePersonFor.gridx = 0;
		gbc_lblIgnorePersonFor.gridy = 3;
		ircFloodPanelSettings.add(lblIgnorePersonFor, gbc_lblIgnorePersonFor);
		
		ircFloodTxtTimeToIgnorePerson = new JTextField();
		ircFloodTxtTimeToIgnorePerson.setName("i");
		ircFloodTxtTimeToIgnorePerson.setText("timeToIgnorePerson");
		GridBagConstraints gbc_ircFloodTxtTimeToIgnorePerson = new GridBagConstraints();
		gbc_ircFloodTxtTimeToIgnorePerson.fill = GridBagConstraints.BOTH;
		gbc_ircFloodTxtTimeToIgnorePerson.insets = new Insets(0, 0, 0, 5);
		gbc_ircFloodTxtTimeToIgnorePerson.gridx = 1;
		gbc_ircFloodTxtTimeToIgnorePerson.gridy = 3;
		ircFloodPanelSettings.add(ircFloodTxtTimeToIgnorePerson, gbc_ircFloodTxtTimeToIgnorePerson);
		ircFloodTxtTimeToIgnorePerson.setColumns(10);
		
		JLabel lblSecs = new JLabel("Secs");
		GridBagConstraints gbc_lblSecs = new GridBagConstraints();
		gbc_lblSecs.fill = GridBagConstraints.BOTH;
		gbc_lblSecs.gridx = 2;
		gbc_lblSecs.gridy = 3;
		ircFloodPanelSettings.add(lblSecs, gbc_lblSecs);
		
		JPanel ircFloodPanelLimit = new JPanel();
		ircFloodPanelLimit.setName("i");
		FlowLayout fl_ircFloodPanelLimit = (FlowLayout) ircFloodPanelLimit.getLayout();
		fl_ircFloodPanelLimit.setVgap(-5);
		fl_ircFloodPanelLimit.setAlignment(FlowLayout.LEFT);
		fl_ircFloodPanelLimit.setHgap(0);
		ircFloodPanelLimit.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Limit:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ircFloodPanelLimit.setBounds(25, 182, 113, 77);
		panelIrcFlood.add(ircFloodPanelLimit);
		
		JCheckBox ircFloodChckbxCtcpReplies = new JCheckBox("Ctcp replies");
		ircFloodChckbxCtcpReplies.setName("i");
		ircFloodPanelLimit.add(ircFloodChckbxCtcpReplies);
		
		JCheckBox ircFloodChckbxWhoisRequests = new JCheckBox("Whois requests");
		ircFloodPanelLimit.add(ircFloodChckbxWhoisRequests);
		
		JCheckBox ircFloodChckbxQueryWindows = new JCheckBox("Query windows");
		ircFloodPanelLimit.add(ircFloodChckbxQueryWindows);
		
		JPanel ircFloodPanelQueue = new JPanel();
		ircFloodPanelQueue.setName("i");
		FlowLayout fl_ircFloodPanelQueue = (FlowLayout) ircFloodPanelQueue.getLayout();
		fl_ircFloodPanelQueue.setVgap(-5);
		fl_ircFloodPanelQueue.setHgap(0);
		fl_ircFloodPanelQueue.setAlignment(FlowLayout.LEFT);
		ircFloodPanelQueue.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Queue:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ircFloodPanelQueue.setBounds(142, 182, 113, 60);
		panelIrcFlood.add(ircFloodPanelQueue);
		
		JCheckBox ircFloodChckbxOpCommands = new JCheckBox("Op commands");
		ircFloodChckbxOpCommands.setName("i");
		ircFloodPanelQueue.add(ircFloodChckbxOpCommands);
		
		JCheckBox ircFloodChckbxOwnMessages = new JCheckBox("Own messages");
		ircFloodChckbxOwnMessages.setName("i");
		ircFloodPanelQueue.add(ircFloodChckbxOwnMessages);
		
		JPanel panelSounds = new JPanel();
		panelSounds.setEnabled(false);
		panelSounds.setVisible(false);
		panelSounds.setName("sounds");
		panelSounds.setBounds(135, 30, 280, 270);
		contentPane.add(panelSounds);
		panelSounds.setLayout(null);
		
		JCheckBox soundsChckbxEnableSounds = new JCheckBox("Enable sounds");
		soundsChckbxEnableSounds.setName("s");
		soundsChckbxEnableSounds.setBounds(21, 21, 97, 23);
		panelSounds.add(soundsChckbxEnableSounds);
		
		JPanel soundsPanelEnable = new JPanel();
		soundsPanelEnable.setName("s");
		soundsPanelEnable.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "On Event, play sound:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		soundsPanelEnable.setBounds(15, 57, 240, 70);
		panelSounds.add(soundsPanelEnable);
		GridBagLayout gbl_soundsPanelEnable = new GridBagLayout();
		gbl_soundsPanelEnable.columnWidths = new int[] {190, 37, 0};
		gbl_soundsPanelEnable.rowHeights = new int[] {23, 23, 0};
		gbl_soundsPanelEnable.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_soundsPanelEnable.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		soundsPanelEnable.setLayout(gbl_soundsPanelEnable);
		
		JComboBox<?> comboBoxEventName = new JComboBox<Object>();
		comboBoxEventName.setName("s");
		GridBagConstraints gbc_comboBoxEventName = new GridBagConstraints();
		gbc_comboBoxEventName.anchor = GridBagConstraints.WEST;
		gbc_comboBoxEventName.fill = GridBagConstraints.VERTICAL;
		gbc_comboBoxEventName.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxEventName.gridx = 0;
		gbc_comboBoxEventName.gridy = 0;
		soundsPanelEnable.add(comboBoxEventName, gbc_comboBoxEventName);
		comboBoxEventName.setModel(new DefaultComboBoxModel(new String[] {"Connect", "Disconnect", "Join", "Part", "Invite", "Kick", "Query", "Notice", "DCC Sent", "DCC Chat", "DCC Success", "DCC Fail", "Flash"}));
		
		JButton btnChooseSound = new JButton("No Sound");
		GridBagConstraints gbc_btnChooseSound = new GridBagConstraints();
		gbc_btnChooseSound.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnChooseSound.gridx = 0;
		gbc_btnChooseSound.gridy = 1;
		soundsPanelEnable.add(btnChooseSound, gbc_btnChooseSound);
		
		JButton btnPlaySound = new JButton("Play");
		GridBagConstraints gbc_btnPlaySound = new GridBagConstraints();
		gbc_btnPlaySound.anchor = GridBagConstraints.WEST;
		gbc_btnPlaySound.gridx = 1;
		gbc_btnPlaySound.gridy = 1;
		soundsPanelEnable.add(btnPlaySound, gbc_btnPlaySound);
		
		JPanel soundsPanelOnEventPlaySound = new JPanel();
		soundsPanelOnEventPlaySound.setName("s");
		soundsPanelOnEventPlaySound.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Event beep:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		soundsPanelOnEventPlaySound.setBounds(173, 151, 82, 70);
		panelSounds.add(soundsPanelOnEventPlaySound);
		soundsPanelOnEventPlaySound.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblBeeps = new JLabel("Beeps:");
		soundsPanelOnEventPlaySound.add(lblBeeps);
		
		soundsPanelonEventPlaySoundTxtNumbeeps = new JTextField();
		soundsPanelonEventPlaySoundTxtNumbeeps.setName("s");
		soundsPanelonEventPlaySoundTxtNumbeeps.setText("numBeeps");
		soundsPanelOnEventPlaySound.add(soundsPanelonEventPlaySoundTxtNumbeeps);
		soundsPanelonEventPlaySoundTxtNumbeeps.setColumns(10);
		
		JLabel lblDelay = new JLabel("Delay:");
		soundsPanelOnEventPlaySound.add(lblDelay);
		
		soundsPanelOnEventPlaySoundTxtNumdelay = new JTextField();
		soundsPanelOnEventPlaySoundTxtNumdelay.setName("s");
		soundsPanelOnEventPlaySoundTxtNumdelay.setText("numDelay");
		soundsPanelOnEventPlaySound.add(soundsPanelOnEventPlaySoundTxtNumdelay);
		soundsPanelOnEventPlaySoundTxtNumdelay.setColumns(10);
		
		JPanel soundsPanelBeep = new JPanel();
		soundsPanelBeep.setName("s");
		soundsPanelBeep.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Beep on message:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		soundsPanelBeep.setBounds(15, 151, 155, 70);
		panelSounds.add(soundsPanelBeep);
		soundsPanelBeep.setLayout(new GridLayout(0, 2, 0, 0));
		
		JCheckBox soundsPanelBeepChckbxChannel = new JCheckBox("Channel");
		soundsPanelBeepChckbxChannel.setName("s");
		soundsPanelBeep.add(soundsPanelBeepChckbxChannel);
		
		JCheckBox soundsPanelBeepChckbxQuery = new JCheckBox("Query");
		soundsPanelBeepChckbxQuery.setName("s");
		soundsPanelBeep.add(soundsPanelBeepChckbxQuery);
		
		JCheckBox soundsPanelBeepChckbxChat = new JCheckBox("Chat");
		soundsPanelBeepChckbxChat.setName("s");
		soundsPanelBeep.add(soundsPanelBeepChckbxChat);
		
		JCheckBox soundsPanelBeepChckbxBuffer = new JCheckBox("Buffer");
		soundsPanelBeepChckbxBuffer.setName("s");
		soundsPanelBeep.add(soundsPanelBeepChckbxBuffer);
		
		JCheckBox soundsBeepChckbxUseInternalBeep = new JCheckBox("Use internal beep");
		soundsBeepChckbxUseInternalBeep.setName("s");
		soundsBeepChckbxUseInternalBeep.setBounds(21, 226, 119, 23);
		panelSounds.add(soundsBeepChckbxUseInternalBeep);
		
		JPanel panelSoundsRequests = new JPanel();
		panelSoundsRequests.setVisible(false);
		panelSoundsRequests.setEnabled(false);
		panelSoundsRequests.setName("soundsrequests");
		panelSoundsRequests.setBounds(135, 30, 280, 270);
		contentPane.add(panelSoundsRequests);
		panelSoundsRequests.setLayout(null);
		
		JPanel soundsRequestsPanel = new JPanel();
		soundsRequestsPanel.setName("s");
		FlowLayout fl_soundsRequestsPanel = (FlowLayout) soundsRequestsPanel.getLayout();
		fl_soundsRequestsPanel.setHgap(0);
		fl_soundsRequestsPanel.setVgap(1);
		fl_soundsRequestsPanel.setAlignment(FlowLayout.LEFT);
		soundsRequestsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "On sound reqeust:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		soundsRequestsPanel.setBounds(26, 52, 226, 70);
		panelSoundsRequests.add(soundsRequestsPanel);
		
		JCheckBox soundsRequestsPanelChckbxIgnoreIfSoundPlaying = new JCheckBox("Ignore if a sound is currently playing");
		soundsRequestsPanelChckbxIgnoreIfSoundPlaying.setName("s");
		soundsRequestsPanel.add(soundsRequestsPanelChckbxIgnoreIfSoundPlaying);
		
		JCheckBox soundsRequestsPanelChckbxWarnIfSoundDoesNotExist = new JCheckBox("Warn if sound doesn't exist");
		soundsRequestsPanelChckbxWarnIfSoundDoesNotExist.setName("s");
		soundsRequestsPanel.add(soundsRequestsPanelChckbxWarnIfSoundDoesNotExist);
		
		JLabel lblSoundFolders = new JLabel("Sound folders:");
		lblSoundFolders.setBounds(35, 183, 194, 14);
		panelSoundsRequests.add(lblSoundFolders);
		
		JCheckBox soundsRequestsChckbxAcceptSoundRequests = new JCheckBox("Accept sound requests");
		soundsRequestsChckbxAcceptSoundRequests.setName("s");
		soundsRequestsChckbxAcceptSoundRequests.setBounds(31, 23, 218, 23);
		panelSoundsRequests.add(soundsRequestsChckbxAcceptSoundRequests);
		
		JCheckBox soundsRequestsChckbxLisenFornick = new JCheckBox("Lisen for '!nick file' get requests");
		soundsRequestsChckbxLisenFornick.setName("s");
		soundsRequestsChckbxLisenFornick.setBounds(31, 129, 218, 23);
		panelSoundsRequests.add(soundsRequestsChckbxLisenFornick);
		
		JCheckBox soundsRequestsChckbxSendnickFile = new JCheckBox("Send '!nick file' as private message");
		soundsRequestsChckbxSendnickFile.setName("s");
		soundsRequestsChckbxSendnickFile.setBounds(31, 153, 218, 23);
		panelSoundsRequests.add(soundsRequestsChckbxSendnickFile);
		
		JComboBox<?> soundsRequestsComboBoxSoundFileType = new JComboBox<Object>();
		soundsRequestsComboBoxSoundFileType.setName("s");
		soundsRequestsComboBoxSoundFileType.setModel(new DefaultComboBoxModel(new String[] {"Wave (*.wav)", "Midi (*.mid)", "Mp3 (*.mp3)", "Wma (*.wma)", "Ogg (*.ogg)"}));
		soundsRequestsComboBoxSoundFileType.setBounds(32, 196, 94, 20);
		panelSoundsRequests.add(soundsRequestsComboBoxSoundFileType);
		
		JButton soundsRequestsBtnPathToSoundsFolder = new JButton("c:\\path\\to\\sounds\\folder");
		soundsRequestsBtnPathToSoundsFolder.setName("s");
		soundsRequestsBtnPathToSoundsFolder.setBounds(31, 219, 218, 23);
		panelSoundsRequests.add(soundsRequestsBtnPathToSoundsFolder);
		
		JPanel panelSoundsSpeech = new JPanel();
		panelSoundsSpeech.setVisible(false);
		panelSoundsSpeech.setEnabled(false);
		panelSoundsSpeech.setName("soundsspeech");
		panelSoundsSpeech.setBounds(135, 30, 280, 270);
		contentPane.add(panelSoundsSpeech);
		GridBagLayout gbl_panelSoundsSpeech = new GridBagLayout();
		gbl_panelSoundsSpeech.columnWidths = new int[]{0, 0};
		gbl_panelSoundsSpeech.rowHeights = new int[]{0, 6, 19, 37, 0, 0, 0, 0};
		gbl_panelSoundsSpeech.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelSoundsSpeech.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelSoundsSpeech.setLayout(gbl_panelSoundsSpeech);
		
		JCheckBox SoundSpeechChckbxEnableSpeech = new JCheckBox("Enable speech");
		SoundSpeechChckbxEnableSpeech.setName("s");
		GridBagConstraints gbc_SoundSpeechChckbxEnableSpeech = new GridBagConstraints();
		gbc_SoundSpeechChckbxEnableSpeech.insets = new Insets(0, 0, 5, 0);
		gbc_SoundSpeechChckbxEnableSpeech.gridx = 0;
		gbc_SoundSpeechChckbxEnableSpeech.gridy = 3;
		panelSoundsSpeech.add(SoundSpeechChckbxEnableSpeech, gbc_SoundSpeechChckbxEnableSpeech);
		
		JButton SoundSpeechBtnOptions = new JButton("Options");
		SoundSpeechBtnOptions.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Speech sp = new Speech();
				sp.setVisible(true);
			}
		});
		SoundSpeechBtnOptions.setPreferredSize(new Dimension(75, 23));
		SoundSpeechBtnOptions.setMinimumSize(new Dimension(75, 23));
		SoundSpeechBtnOptions.setMaximumSize(new Dimension(75, 23));
		GridBagConstraints gbc_SoundSpeechBtnOptions = new GridBagConstraints();
		gbc_SoundSpeechBtnOptions.insets = new Insets(0, 0, 5, 0);
		gbc_SoundSpeechBtnOptions.gridx = 0;
		gbc_SoundSpeechBtnOptions.gridy = 4;
		panelSoundsSpeech.add(SoundSpeechBtnOptions, gbc_SoundSpeechBtnOptions);
		
		JButton SoundSpeechBtnEvents = new JButton("Events");
		SoundSpeechBtnEvents.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Events events = new Events();
				events.setVisible(true);
			}
		});
		SoundSpeechBtnEvents.setMinimumSize(new Dimension(75, 23));
		SoundSpeechBtnEvents.setMaximumSize(new Dimension(75, 23));
		SoundSpeechBtnEvents.setPreferredSize(new Dimension(75, 23));
		GridBagConstraints gbc_SoundSpeechBtnEvents = new GridBagConstraints();
		gbc_SoundSpeechBtnEvents.insets = new Insets(0, 0, 5, 0);
		gbc_SoundSpeechBtnEvents.gridx = 0;
		gbc_SoundSpeechBtnEvents.gridy = 5;
		panelSoundsSpeech.add(SoundSpeechBtnEvents, gbc_SoundSpeechBtnEvents);
		
		JButton SoundSpeechBtnLexicon = new JButton("Lexicon");
		SoundSpeechBtnLexicon.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Lexicon le = new Lexicon();
				le.setVisible(true);
			}
		});
		SoundSpeechBtnLexicon.setMinimumSize(new Dimension(75, 23));
		SoundSpeechBtnLexicon.setMaximumSize(new Dimension(75, 23));
		SoundSpeechBtnLexicon.setPreferredSize(new Dimension(75, 23));
		GridBagConstraints gbc_SoundSpeechBtnLexicon = new GridBagConstraints();
		gbc_SoundSpeechBtnLexicon.gridx = 0;
		gbc_SoundSpeechBtnLexicon.gridy = 6;
		panelSoundsSpeech.add(SoundSpeechBtnLexicon, gbc_SoundSpeechBtnLexicon);
		
		JPanel panelMouse = new JPanel();
		panelMouse.setVisible(false);
		panelMouse.setEnabled(false);
		panelMouse.setName("mouse");
		panelMouse.setBounds(135, 30, 280, 270);
		contentPane.add(panelMouse);
		panelMouse.setLayout(null);
		
		JLabel lblcommandToPerform = new JLabel("<html>Command to perform when double-clicking in one of the following windows:");
		lblcommandToPerform.setBounds(15, 11, 249, 28);
		panelMouse.add(lblcommandToPerform);
		
		JLabel lblcommandToPerform_1 = new JLabel("<html>Command to perform when double-clicking on a nickname in one of the following windows:</html>");
		lblcommandToPerform_1.setBounds(15, 122, 249, 28);
		panelMouse.add(lblcommandToPerform_1);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStatus.setBounds(15, 50, 52, 14);
		panelMouse.add(lblStatus);
		
		JLabel lblQuery = new JLabel("Query:");
		lblQuery.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuery.setBounds(15, 75, 52, 14);
		panelMouse.add(lblQuery);
		
		JLabel lblChannel = new JLabel("Channel:");
		lblChannel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChannel.setBounds(15, 99, 52, 14);
		panelMouse.add(lblChannel);
		
		JLabel lblNickList = new JLabel("Nick List:");
		lblNickList.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNickList.setBounds(15, 161, 52, 14);
		panelMouse.add(lblNickList);
		
		JLabel lblNotifyList = new JLabel("Notify List:");
		lblNotifyList.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNotifyList.setBounds(15, 186, 52, 14);
		panelMouse.add(lblNotifyList);
		
		JLabel lblMessage = new JLabel("Message:");
		lblMessage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMessage.setBounds(15, 211, 52, 14);
		panelMouse.add(lblMessage);
		
		mouseTxtCommandStatus = new JTextField();
		mouseTxtCommandStatus.setName("m");
		mouseTxtCommandStatus.setText("commandstatus");
		mouseTxtCommandStatus.setBounds(70, 48, 180, 20);
		panelMouse.add(mouseTxtCommandStatus);
		mouseTxtCommandStatus.setColumns(10);
		
		mouseTxtCommandQuery = new JTextField();
		mouseTxtCommandQuery.setName("m");
		mouseTxtCommandQuery.setText("commandQuery");
		mouseTxtCommandQuery.setBounds(70, 72, 180, 20);
		panelMouse.add(mouseTxtCommandQuery);
		mouseTxtCommandQuery.setColumns(10);
		
		mouseTxtCommandChannel = new JTextField();
		mouseTxtCommandChannel.setName("m");
		mouseTxtCommandChannel.setText("commandChannel");
		mouseTxtCommandChannel.setBounds(70, 96, 180, 20);
		panelMouse.add(mouseTxtCommandChannel);
		mouseTxtCommandChannel.setColumns(10);
		
		mouseTxtCommandNickList = new JTextField();
		mouseTxtCommandNickList.setName("m");
		mouseTxtCommandNickList.setText("commandNickList");
		mouseTxtCommandNickList.setBounds(70, 158, 180, 20);
		panelMouse.add(mouseTxtCommandNickList);
		mouseTxtCommandNickList.setColumns(10);
		
		mouseTxtCommandNotifyList = new JTextField();
		mouseTxtCommandNotifyList.setName("m");
		mouseTxtCommandNotifyList.setText("commandNotifyList");
		mouseTxtCommandNotifyList.setBounds(70, 183, 180, 20);
		panelMouse.add(mouseTxtCommandNotifyList);
		mouseTxtCommandNotifyList.setColumns(10);
		
		mouseTxtCommandMessage = new JTextField();
		mouseTxtCommandMessage.setName("m");
		mouseTxtCommandMessage.setText("commandMessage");
		mouseTxtCommandMessage.setBounds(70, 208, 180, 20);
		panelMouse.add(mouseTxtCommandMessage);
		mouseTxtCommandMessage.setColumns(10);
		
		JPanel panelMouseDrop = new JPanel();
		panelMouseDrop.setVisible(false);
		panelMouseDrop.setEnabled(false);
		panelMouseDrop.setName("mousedrop");
		panelMouseDrop.setBounds(135, 30, 280, 270);
		contentPane.add(panelMouseDrop);
		panelMouseDrop.setLayout(null);
		
		JLabel lblcommandToPerform_2 = new JLabel("<html>Command to perform when a file is dragged and dropped onto a window in JavaIRC.");
		lblcommandToPerform_2.setBounds(10, 11, 260, 28);
		panelMouseDrop.add(lblcommandToPerform_2);
		
		JLabel lblFileDroppedWith = new JLabel("File dropped with:");
		lblFileDroppedWith.setBounds(10, 50, 86, 14);
		panelMouseDrop.add(lblFileDroppedWith);
		
		JRadioButton mouseDropRdbtnNoKey = new JRadioButton("No key");
		mouseDropRdbtnNoKey.setName("m");
		mouseDropGroup.add(mouseDropRdbtnNoKey);
		mouseDropRdbtnNoKey.setBounds(98, 46, 59, 23);
		panelMouseDrop.add(mouseDropRdbtnNoKey);
		
		JRadioButton mouseDropRdbtnShiftKey = new JRadioButton("Shift key");
		mouseDropRdbtnShiftKey.setName("m");
		mouseDropGroup.add(mouseDropRdbtnShiftKey);
		mouseDropRdbtnShiftKey.setBounds(159, 46, 67, 23);
		panelMouseDrop.add(mouseDropRdbtnShiftKey);
		
		JTextArea mouseDropTxtrCommandslist = new JTextArea();
		mouseDropTxtrCommandslist.setName("m");
		mouseDropTxtrCommandslist.setText("commandsList");
		mouseDropTxtrCommandslist.setBounds(10, 75, 247, 160);
		panelMouseDrop.add(mouseDropTxtrCommandslist);
		
		JPanel panelDcc = new JPanel();
		panelDcc.setVisible(false);
		panelDcc.setEnabled(false);
		panelDcc.setName("dcc");
		panelDcc.setBounds(135, 30, 280, 270);
		contentPane.add(panelDcc);
		panelDcc.setLayout(null);
		
		JPanel dccPanelOnSend = new JPanel();
		dccPanelOnSend.setName("dcc");
		dccPanelOnSend.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "On Send request:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		dccPanelOnSend.setBounds(39, 11, 201, 145);
		panelDcc.add(dccPanelOnSend);
		GridBagLayout gbl_dccPanelOnSend = new GridBagLayout();
		gbl_dccPanelOnSend.columnWidths = new int[]{0, 0, 0};
		gbl_dccPanelOnSend.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_dccPanelOnSend.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_dccPanelOnSend.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		dccPanelOnSend.setLayout(gbl_dccPanelOnSend);
		
		JRadioButton dccPanelOnSendRdbtnShowGetDialog = new JRadioButton("Show get dialog");
		dccPanelOnSendRdbtnShowGetDialog.setName("dcc");
		dccOnSendGroup.add(dccPanelOnSendRdbtnShowGetDialog);
		GridBagConstraints gbc_dccPanelOnSendRdbtnShowGetDialog = new GridBagConstraints();
		gbc_dccPanelOnSendRdbtnShowGetDialog.anchor = GridBagConstraints.WEST;
		gbc_dccPanelOnSendRdbtnShowGetDialog.insets = new Insets(0, 0, 5, 5);
		gbc_dccPanelOnSendRdbtnShowGetDialog.gridx = 0;
		gbc_dccPanelOnSendRdbtnShowGetDialog.gridy = 0;
		dccPanelOnSend.add(dccPanelOnSendRdbtnShowGetDialog, gbc_dccPanelOnSendRdbtnShowGetDialog);
		
		JRadioButton dccPanelOnSendRdbtnAutoGetFile = new JRadioButton("Auto-get file and");
		dccPanelOnSendRdbtnAutoGetFile.setName("dcc");
		dccOnSendGroup.add(dccPanelOnSendRdbtnAutoGetFile);
		GridBagConstraints gbc_dccPanelOnSendRdbtnAutoGetFile = new GridBagConstraints();
		gbc_dccPanelOnSendRdbtnAutoGetFile.anchor = GridBagConstraints.WEST;
		gbc_dccPanelOnSendRdbtnAutoGetFile.insets = new Insets(0, 0, 5, 5);
		gbc_dccPanelOnSendRdbtnAutoGetFile.gridx = 0;
		gbc_dccPanelOnSendRdbtnAutoGetFile.gridy = 1;
		dccPanelOnSend.add(dccPanelOnSendRdbtnAutoGetFile, gbc_dccPanelOnSendRdbtnAutoGetFile);
		
		JCheckBox dccPanelOnSendChckbxMinimize = new JCheckBox("minimize");
		dccPanelOnSendChckbxMinimize.setName("dcc");
		GridBagConstraints gbc_dccPanelOnSendChckbxMinimize = new GridBagConstraints();
		gbc_dccPanelOnSendChckbxMinimize.anchor = GridBagConstraints.WEST;
		gbc_dccPanelOnSendChckbxMinimize.insets = new Insets(0, 0, 5, 0);
		gbc_dccPanelOnSendChckbxMinimize.gridx = 1;
		gbc_dccPanelOnSendChckbxMinimize.gridy = 1;
		dccPanelOnSend.add(dccPanelOnSendChckbxMinimize, gbc_dccPanelOnSendChckbxMinimize);
		
		JLabel lblIfFileExists = new JLabel("If file exists:");
		GridBagConstraints gbc_lblIfFileExists = new GridBagConstraints();
		gbc_lblIfFileExists.insets = new Insets(0, 0, 5, 5);
		gbc_lblIfFileExists.gridx = 0;
		gbc_lblIfFileExists.gridy = 2;
		dccPanelOnSend.add(lblIfFileExists, gbc_lblIfFileExists);
		
		JComboBox<?> dccPanelOnSendRComboBoxDecision = new JComboBox<Object>();
		dccPanelOnSendRComboBoxDecision.setName("dcc");
		dccPanelOnSendRComboBoxDecision.setMinimumSize(new Dimension(88, 20));
		dccPanelOnSendRComboBoxDecision.setMaximumSize(new Dimension(88, 20));
		dccPanelOnSendRComboBoxDecision.setPreferredSize(new Dimension(88, 20));
		dccPanelOnSendRComboBoxDecision.setModel(new DefaultComboBoxModel(new String[] {"Ask", "Resume", "Overwrite", "Cancel"}));
		GridBagConstraints gbc_dccPanelOnSendRComboBoxDecision = new GridBagConstraints();
		gbc_dccPanelOnSendRComboBoxDecision.anchor = GridBagConstraints.EAST;
		gbc_dccPanelOnSendRComboBoxDecision.insets = new Insets(0, 0, 5, 5);
		gbc_dccPanelOnSendRComboBoxDecision.gridx = 0;
		gbc_dccPanelOnSendRComboBoxDecision.gridy = 3;
		dccPanelOnSend.add(dccPanelOnSendRComboBoxDecision, gbc_dccPanelOnSendRComboBoxDecision);
		
		JButton dccPanelOnSendBtnTrusted = new JButton("Trusted");
		dccPanelOnSendBtnTrusted.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Trusted tr = new Trusted();
				tr.setVisible(true);
			}
		});
		GridBagConstraints gbc_dccPanelOnSendBtnTrusted = new GridBagConstraints();
		gbc_dccPanelOnSendBtnTrusted.insets = new Insets(0, 0, 5, 0);
		gbc_dccPanelOnSendBtnTrusted.gridx = 1;
		gbc_dccPanelOnSendBtnTrusted.gridy = 3;
		dccPanelOnSend.add(dccPanelOnSendBtnTrusted, gbc_dccPanelOnSendBtnTrusted);
		
		JRadioButton dccPanelOnSendRdbtnIgnoreAll = new JRadioButton("Ignore all");
		dccPanelOnSendRdbtnIgnoreAll.setName("dcc");
		dccOnSendGroup.add(dccPanelOnSendRdbtnIgnoreAll);
		GridBagConstraints gbc_dccPanelOnSendRdbtnIgnoreAll = new GridBagConstraints();
		gbc_dccPanelOnSendRdbtnIgnoreAll.anchor = GridBagConstraints.WEST;
		gbc_dccPanelOnSendRdbtnIgnoreAll.insets = new Insets(0, 0, 0, 5);
		gbc_dccPanelOnSendRdbtnIgnoreAll.gridx = 0;
		gbc_dccPanelOnSendRdbtnIgnoreAll.gridy = 4;
		dccPanelOnSend.add(dccPanelOnSendRdbtnIgnoreAll, gbc_dccPanelOnSendRdbtnIgnoreAll);
		
		JPanel dccPanelOnChat = new JPanel();
		dccPanelOnChat.setName("dcc");
		dccPanelOnChat.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "On Chat request:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		dccPanelOnChat.setBounds(39, 165, 201, 100);
		panelDcc.add(dccPanelOnChat);
		GridBagLayout gbl_dccPanelOnChat = new GridBagLayout();
		gbl_dccPanelOnChat.columnWidths = new int[]{120, 0, 0};
		gbl_dccPanelOnChat.rowHeights = new int[]{0, 0, 0, 0};
		gbl_dccPanelOnChat.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_dccPanelOnChat.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		dccPanelOnChat.setLayout(gbl_dccPanelOnChat);
		
		JRadioButton dccPanelOnChatRdbtnShowChatDialog = new JRadioButton("Show chat dialog");
		dccPanelOnChatRdbtnShowChatDialog.setName("dcc");
		dccOnChatGroup.add(dccPanelOnChatRdbtnShowChatDialog);
		GridBagConstraints gbc_dccPanelOnChatRdbtnShowChatDialog = new GridBagConstraints();
		gbc_dccPanelOnChatRdbtnShowChatDialog.anchor = GridBagConstraints.WEST;
		gbc_dccPanelOnChatRdbtnShowChatDialog.insets = new Insets(0, 0, 5, 5);
		gbc_dccPanelOnChatRdbtnShowChatDialog.gridx = 0;
		gbc_dccPanelOnChatRdbtnShowChatDialog.gridy = 0;
		dccPanelOnChat.add(dccPanelOnChatRdbtnShowChatDialog, gbc_dccPanelOnChatRdbtnShowChatDialog);
		
		JRadioButton dccPanelOnChatRdbtnAutoacceptAnd = new JRadioButton("Auto-accept and");
		dccPanelOnChatRdbtnAutoacceptAnd.setName("dcc");
		dccOnChatGroup.add(dccPanelOnChatRdbtnAutoacceptAnd);
		GridBagConstraints gbc_dccPanelOnChatRdbtnAutoacceptAnd = new GridBagConstraints();
		gbc_dccPanelOnChatRdbtnAutoacceptAnd.anchor = GridBagConstraints.WEST;
		gbc_dccPanelOnChatRdbtnAutoacceptAnd.insets = new Insets(0, 0, 5, 5);
		gbc_dccPanelOnChatRdbtnAutoacceptAnd.gridx = 0;
		gbc_dccPanelOnChatRdbtnAutoacceptAnd.gridy = 1;
		dccPanelOnChat.add(dccPanelOnChatRdbtnAutoacceptAnd, gbc_dccPanelOnChatRdbtnAutoacceptAnd);
		
		JCheckBox dccPanelOnChatChckbxMinimize_1 = new JCheckBox("minimize");
		dccPanelOnChatChckbxMinimize_1.setName("dcc");
		GridBagConstraints gbc_dccPanelOnChatChckbxMinimize_1 = new GridBagConstraints();
		gbc_dccPanelOnChatChckbxMinimize_1.anchor = GridBagConstraints.WEST;
		gbc_dccPanelOnChatChckbxMinimize_1.insets = new Insets(0, 0, 5, 0);
		gbc_dccPanelOnChatChckbxMinimize_1.gridx = 1;
		gbc_dccPanelOnChatChckbxMinimize_1.gridy = 1;
		dccPanelOnChat.add(dccPanelOnChatChckbxMinimize_1, gbc_dccPanelOnChatChckbxMinimize_1);
		
		JRadioButton dccPanelOnChatRdbtnIgnoreAll_1 = new JRadioButton("Ignore all");
		dccPanelOnChatRdbtnIgnoreAll_1.setName("dcc");
		dccOnChatGroup.add(dccPanelOnChatRdbtnIgnoreAll_1);
		GridBagConstraints gbc_dccPanelOnChatRdbtnIgnoreAll_1 = new GridBagConstraints();
		gbc_dccPanelOnChatRdbtnIgnoreAll_1.insets = new Insets(0, 0, 0, 5);
		gbc_dccPanelOnChatRdbtnIgnoreAll_1.anchor = GridBagConstraints.WEST;
		gbc_dccPanelOnChatRdbtnIgnoreAll_1.gridx = 0;
		gbc_dccPanelOnChatRdbtnIgnoreAll_1.gridy = 2;
		dccPanelOnChat.add(dccPanelOnChatRdbtnIgnoreAll_1, gbc_dccPanelOnChatRdbtnIgnoreAll_1);
		
		JPanel panelDccOptions = new JPanel();
		panelDccOptions.setVisible(false);
		panelDccOptions.setEnabled(false);
		panelDccOptions.setName("dccoptions");
		panelDccOptions.setBounds(135, 30, 280, 270);
		contentPane.add(panelDccOptions);
		panelDccOptions.setLayout(null);
		
		JPanel dccOptionsPanelCompletion = new JPanel();
		dccOptionsPanelCompletion.setName("dcc");
		dccOptionsPanelCompletion.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "On completion:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		dccOptionsPanelCompletion.setBounds(10, 10, 250, 75);
		panelDccOptions.add(dccOptionsPanelCompletion);
		GridBagLayout gbl_dccOptionsPanelCompletion = new GridBagLayout();
		gbl_dccOptionsPanelCompletion.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_dccOptionsPanelCompletion.rowHeights = new int[]{0, 0, 0};
		gbl_dccOptionsPanelCompletion.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_dccOptionsPanelCompletion.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		dccOptionsPanelCompletion.setLayout(gbl_dccOptionsPanelCompletion);
		
		JLabel lblNofityWithBeep = new JLabel("Nofity with beep:");
		GridBagConstraints gbc_lblNofityWithBeep = new GridBagConstraints();
		gbc_lblNofityWithBeep.anchor = GridBagConstraints.EAST;
		gbc_lblNofityWithBeep.insets = new Insets(0, 0, 5, 5);
		gbc_lblNofityWithBeep.gridx = 0;
		gbc_lblNofityWithBeep.gridy = 0;
		dccOptionsPanelCompletion.add(lblNofityWithBeep, gbc_lblNofityWithBeep);
		
		JCheckBox dccOptionsPanelCompletionChckbxSendBeep = new JCheckBox("Send");
		dccOptionsPanelCompletionChckbxSendBeep.setName("dcc");
		GridBagConstraints gbc_dccOptionsPanelCompletionChckbxSendBeep = new GridBagConstraints();
		gbc_dccOptionsPanelCompletionChckbxSendBeep.insets = new Insets(0, 0, 5, 5);
		gbc_dccOptionsPanelCompletionChckbxSendBeep.gridx = 1;
		gbc_dccOptionsPanelCompletionChckbxSendBeep.gridy = 0;
		dccOptionsPanelCompletion.add(dccOptionsPanelCompletionChckbxSendBeep, gbc_dccOptionsPanelCompletionChckbxSendBeep);
		
		JCheckBox dccOptionsPanelCompletionChckbxGetBeep = new JCheckBox("Get");
		dccOptionsPanelCompletionChckbxGetBeep.setName("dcc");
		GridBagConstraints gbc_dccOptionsPanelCompletionChckbxGetBeep = new GridBagConstraints();
		gbc_dccOptionsPanelCompletionChckbxGetBeep.insets = new Insets(0, 0, 5, 5);
		gbc_dccOptionsPanelCompletionChckbxGetBeep.gridx = 2;
		gbc_dccOptionsPanelCompletionChckbxGetBeep.gridy = 0;
		dccOptionsPanelCompletion.add(dccOptionsPanelCompletionChckbxGetBeep, gbc_dccOptionsPanelCompletionChckbxGetBeep);
		
		JCheckBox dccOptionsPanelCompletionChckbxChatBeep = new JCheckBox("Chat");
		dccOptionsPanelCompletionChckbxChatBeep.setName("dcc");
		GridBagConstraints gbc_dccOptionsPanelCompletionChckbxChatBeep = new GridBagConstraints();
		gbc_dccOptionsPanelCompletionChckbxChatBeep.insets = new Insets(0, 0, 5, 0);
		gbc_dccOptionsPanelCompletionChckbxChatBeep.gridx = 3;
		gbc_dccOptionsPanelCompletionChckbxChatBeep.gridy = 0;
		dccOptionsPanelCompletion.add(dccOptionsPanelCompletionChckbxChatBeep, gbc_dccOptionsPanelCompletionChckbxChatBeep);
		
		JLabel lblCloseWindow = new JLabel("Close window:");
		GridBagConstraints gbc_lblCloseWindow = new GridBagConstraints();
		gbc_lblCloseWindow.insets = new Insets(0, 0, 0, 5);
		gbc_lblCloseWindow.anchor = GridBagConstraints.EAST;
		gbc_lblCloseWindow.gridx = 0;
		gbc_lblCloseWindow.gridy = 1;
		dccOptionsPanelCompletion.add(lblCloseWindow, gbc_lblCloseWindow);
		
		JCheckBox dccOptionsPanelCompletionChckbxSendClose = new JCheckBox("Send");
		dccOptionsPanelCompletionChckbxSendClose.setName("dcc");
		GridBagConstraints gbc_dccOptionsPanelCompletionChckbxSendClose = new GridBagConstraints();
		gbc_dccOptionsPanelCompletionChckbxSendClose.insets = new Insets(0, 0, 0, 5);
		gbc_dccOptionsPanelCompletionChckbxSendClose.gridx = 1;
		gbc_dccOptionsPanelCompletionChckbxSendClose.gridy = 1;
		dccOptionsPanelCompletion.add(dccOptionsPanelCompletionChckbxSendClose, gbc_dccOptionsPanelCompletionChckbxSendClose);
		
		JCheckBox dccOptionsPanelCompletionChckbxGetClose = new JCheckBox("Get");
		dccOptionsPanelCompletionChckbxGetClose.setName("dcc");
		GridBagConstraints gbc_dccOptionsPanelCompletionChckbxGetClose = new GridBagConstraints();
		gbc_dccOptionsPanelCompletionChckbxGetClose.insets = new Insets(0, 0, 0, 5);
		gbc_dccOptionsPanelCompletionChckbxGetClose.gridx = 2;
		gbc_dccOptionsPanelCompletionChckbxGetClose.gridy = 1;
		dccOptionsPanelCompletion.add(dccOptionsPanelCompletionChckbxGetClose, gbc_dccOptionsPanelCompletionChckbxGetClose);
		
		JCheckBox dccOptionsPanelCompletionChckbxChatClose = new JCheckBox("Chat");
		dccOptionsPanelCompletionChckbxChatClose.setName("dcc");
		GridBagConstraints gbc_dccOptionsPanelCompletionChckbxChatClose = new GridBagConstraints();
		gbc_dccOptionsPanelCompletionChckbxChatClose.gridx = 3;
		gbc_dccOptionsPanelCompletionChckbxChatClose.gridy = 1;
		dccOptionsPanelCompletion.add(dccOptionsPanelCompletionChckbxChatClose, gbc_dccOptionsPanelCompletionChckbxChatClose);
		
		JPanel dccOptionsPanelTimeOut = new JPanel();
		dccOptionsPanelTimeOut.setName("dcc");
		dccOptionsPanelTimeOut.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Time-out in seconds:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		dccOptionsPanelTimeOut.setBounds(10, 96, 138, 100);
		panelDccOptions.add(dccOptionsPanelTimeOut);
		GridBagLayout gbl_dccOptionsPanelTimeOut = new GridBagLayout();
		gbl_dccOptionsPanelTimeOut.columnWidths = new int[]{0, 0, 0};
		gbl_dccOptionsPanelTimeOut.rowHeights = new int[]{0, 0, 0, 0};
		gbl_dccOptionsPanelTimeOut.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_dccOptionsPanelTimeOut.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		dccOptionsPanelTimeOut.setLayout(gbl_dccOptionsPanelTimeOut);
		
		JLabel lblGetchatDialog = new JLabel("Get/Chat Dialog:");
		GridBagConstraints gbc_lblGetchatDialog = new GridBagConstraints();
		gbc_lblGetchatDialog.anchor = GridBagConstraints.EAST;
		gbc_lblGetchatDialog.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetchatDialog.gridx = 0;
		gbc_lblGetchatDialog.gridy = 0;
		dccOptionsPanelTimeOut.add(lblGetchatDialog, gbc_lblGetchatDialog);
		
		dccOptionsPanelTimeOutTxtDialogTimeOut = new JTextField();
		dccOptionsPanelTimeOutTxtDialogTimeOut.setName("dcc");
		dccOptionsPanelTimeOutTxtDialogTimeOut.setText("abc");
		GridBagConstraints gbc_dccOptionsPanelTimeOutTxtDialogTimeOut = new GridBagConstraints();
		gbc_dccOptionsPanelTimeOutTxtDialogTimeOut.insets = new Insets(0, 0, 5, 0);
		gbc_dccOptionsPanelTimeOutTxtDialogTimeOut.fill = GridBagConstraints.HORIZONTAL;
		gbc_dccOptionsPanelTimeOutTxtDialogTimeOut.gridx = 1;
		gbc_dccOptionsPanelTimeOutTxtDialogTimeOut.gridy = 0;
		dccOptionsPanelTimeOut.add(dccOptionsPanelTimeOutTxtDialogTimeOut, gbc_dccOptionsPanelTimeOutTxtDialogTimeOut);
		dccOptionsPanelTimeOutTxtDialogTimeOut.setColumns(10);
		
		JLabel lblSendgetTransfer = new JLabel("Send/Get Transfer:");
		GridBagConstraints gbc_lblSendgetTransfer = new GridBagConstraints();
		gbc_lblSendgetTransfer.anchor = GridBagConstraints.EAST;
		gbc_lblSendgetTransfer.insets = new Insets(0, 0, 5, 5);
		gbc_lblSendgetTransfer.gridx = 0;
		gbc_lblSendgetTransfer.gridy = 1;
		dccOptionsPanelTimeOut.add(lblSendgetTransfer, gbc_lblSendgetTransfer);
		
		dccOptionsPanelTimeOutTxtTransferTimeOut = new JTextField();
		dccOptionsPanelTimeOutTxtTransferTimeOut.setName("dcc");
		dccOptionsPanelTimeOutTxtTransferTimeOut.setText("abc");
		GridBagConstraints gbc_dccOptionsPanelTimeOutTxtTransferTimeOut = new GridBagConstraints();
		gbc_dccOptionsPanelTimeOutTxtTransferTimeOut.insets = new Insets(0, 0, 5, 0);
		gbc_dccOptionsPanelTimeOutTxtTransferTimeOut.fill = GridBagConstraints.HORIZONTAL;
		gbc_dccOptionsPanelTimeOutTxtTransferTimeOut.gridx = 1;
		gbc_dccOptionsPanelTimeOutTxtTransferTimeOut.gridy = 1;
		dccOptionsPanelTimeOut.add(dccOptionsPanelTimeOutTxtTransferTimeOut, gbc_dccOptionsPanelTimeOutTxtTransferTimeOut);
		dccOptionsPanelTimeOutTxtTransferTimeOut.setColumns(10);
		
		JLabel lblFileServer = new JLabel("File Server:");
		GridBagConstraints gbc_lblFileServer = new GridBagConstraints();
		gbc_lblFileServer.anchor = GridBagConstraints.EAST;
		gbc_lblFileServer.insets = new Insets(0, 0, 0, 5);
		gbc_lblFileServer.gridx = 0;
		gbc_lblFileServer.gridy = 2;
		dccOptionsPanelTimeOut.add(lblFileServer, gbc_lblFileServer);
		
		dccOptionsPanelTimeOutTxtFileServerTimeOut = new JTextField();
		dccOptionsPanelTimeOutTxtFileServerTimeOut.setName("dcc");
		dccOptionsPanelTimeOutTxtFileServerTimeOut.setText("abc");
		GridBagConstraints gbc_dccOptionsPanelTimeOutTxtFileServerTimeOut = new GridBagConstraints();
		gbc_dccOptionsPanelTimeOutTxtFileServerTimeOut.fill = GridBagConstraints.HORIZONTAL;
		gbc_dccOptionsPanelTimeOutTxtFileServerTimeOut.gridx = 1;
		gbc_dccOptionsPanelTimeOutTxtFileServerTimeOut.gridy = 2;
		dccOptionsPanelTimeOut.add(dccOptionsPanelTimeOutTxtFileServerTimeOut, gbc_dccOptionsPanelTimeOutTxtFileServerTimeOut);
		dccOptionsPanelTimeOutTxtFileServerTimeOut.setColumns(10);
		
		JLabel lblMaxSends = new JLabel("Max Sends:");
		lblMaxSends.setBounds(53, 218, 56, 14);
		panelDccOptions.add(lblMaxSends);
		
		dccOptionsTxtMaxSends = new JTextField();
		dccOptionsTxtMaxSends.setName("dcc");
		dccOptionsTxtMaxSends.setText("abc");
		dccOptionsTxtMaxSends.setBounds(112, 215, 30, 20);
		panelDccOptions.add(dccOptionsTxtMaxSends);
		dccOptionsTxtMaxSends.setColumns(10);
		
		JCheckBox dccOptionsChckbxShowWarning = new JCheckBox("Show Warning");
		dccOptionsChckbxShowWarning.setName("dcc");
		dccOptionsChckbxShowWarning.setBounds(163, 112, 97, 23);
		panelDccOptions.add(dccOptionsChckbxShowWarning);
		
		JCheckBox dccOptionsChckbxPassiveDccs = new JCheckBox("Passive DCCs");
		dccOptionsChckbxPassiveDccs.setName("dcc");
		dccOptionsChckbxPassiveDccs.setBounds(163, 138, 97, 23);
		panelDccOptions.add(dccOptionsChckbxPassiveDccs);
		
		JPanel panelDccIgnore = new JPanel();
		panelDccIgnore.setVisible(false);
		panelDccIgnore.setEnabled(false);
		panelDccIgnore.setName("dccignore");
		panelDccIgnore.setBounds(135, 30, 280, 270);
		contentPane.add(panelDccIgnore);
		GridBagLayout gbl_panelDccIgnore = new GridBagLayout();
		gbl_panelDccIgnore.columnWidths = new int[]{52, 103, 73, 0};
		gbl_panelDccIgnore.rowHeights = new int[]{0, 35, 0, 0, 118, 0, 0, 0};
		gbl_panelDccIgnore.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelDccIgnore.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelDccIgnore.setLayout(gbl_panelDccIgnore);
		
		JLabel lblMethod = new JLabel("Method:");
		GridBagConstraints gbc_lblMethod = new GridBagConstraints();
		gbc_lblMethod.anchor = GridBagConstraints.WEST;
		gbc_lblMethod.insets = new Insets(0, 0, 5, 5);
		gbc_lblMethod.gridx = 1;
		gbc_lblMethod.gridy = 0;
		panelDccIgnore.add(lblMethod, gbc_lblMethod);
		
		JComboBox<String> dccIgnoreComboBoxMethod = new JComboBox<String>();
		dccIgnoreComboBoxMethod.setName("dcc");
		dccIgnoreComboBoxMethod.setModel(new DefaultComboBoxModel(new String[] {"Disabled", "Accept Only", "Ignore Only"}));
		GridBagConstraints gbc_dccIgnoreComboBoxMethod = new GridBagConstraints();
		gbc_dccIgnoreComboBoxMethod.anchor = GridBagConstraints.NORTH;
		gbc_dccIgnoreComboBoxMethod.fill = GridBagConstraints.HORIZONTAL;
		gbc_dccIgnoreComboBoxMethod.insets = new Insets(0, 0, 5, 5);
		gbc_dccIgnoreComboBoxMethod.gridx = 1;
		gbc_dccIgnoreComboBoxMethod.gridy = 1;
		panelDccIgnore.add(dccIgnoreComboBoxMethod, gbc_dccIgnoreComboBoxMethod);
		
		JLabel lblFileType = new JLabel("File type:");
		GridBagConstraints gbc_lblFileType = new GridBagConstraints();
		gbc_lblFileType.insets = new Insets(0, 0, 5, 5);
		gbc_lblFileType.anchor = GridBagConstraints.WEST;
		gbc_lblFileType.gridx = 1;
		gbc_lblFileType.gridy = 2;
		panelDccIgnore.add(lblFileType, gbc_lblFileType);
		
		dccIgnoreTxtTypetoadd = new JTextField();
		dccIgnoreTxtTypetoadd.setName("dcc");
		dccIgnoreTxtTypetoadd.setText("typeToAdd");
		GridBagConstraints gbc_dccIgnoreTxtTypetoadd = new GridBagConstraints();
		gbc_dccIgnoreTxtTypetoadd.fill = GridBagConstraints.HORIZONTAL;
		gbc_dccIgnoreTxtTypetoadd.insets = new Insets(0, 0, 5, 5);
		gbc_dccIgnoreTxtTypetoadd.gridx = 1;
		gbc_dccIgnoreTxtTypetoadd.gridy = 3;
		panelDccIgnore.add(dccIgnoreTxtTypetoadd, gbc_dccIgnoreTxtTypetoadd);
		dccIgnoreTxtTypetoadd.setColumns(10);
		
		JButton dccIgnoreBtnAdd = new JButton("Add");
		GridBagConstraints gbc_dccIgnoreBtnAdd = new GridBagConstraints();
		gbc_dccIgnoreBtnAdd.insets = new Insets(0, 0, 5, 0);
		gbc_dccIgnoreBtnAdd.fill = GridBagConstraints.HORIZONTAL;
		gbc_dccIgnoreBtnAdd.gridx = 2;
		gbc_dccIgnoreBtnAdd.gridy = 3;
		panelDccIgnore.add(dccIgnoreBtnAdd, gbc_dccIgnoreBtnAdd);
		
		JList<String> dccIgnoreFileIgnoreList = new JList<String>();
		dccIgnoreFileIgnoreList.setName("dcc");
		dccIgnoreFileIgnoreList.setModel(new AbstractListModel() {
			String[] values = new String[] {"*.mp3"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		GridBagConstraints gbc_dccIgnoreFileIgnoreList = new GridBagConstraints();
		gbc_dccIgnoreFileIgnoreList.insets = new Insets(0, 0, 5, 5);
		gbc_dccIgnoreFileIgnoreList.fill = GridBagConstraints.BOTH;
		gbc_dccIgnoreFileIgnoreList.gridx = 1;
		gbc_dccIgnoreFileIgnoreList.gridy = 4;
		panelDccIgnore.add(dccIgnoreFileIgnoreList, gbc_dccIgnoreFileIgnoreList);
		
		JButton dccIgnoreBtnDelete = new JButton("Delete");
		GridBagConstraints gbc_dccIgnoreBtnDelete = new GridBagConstraints();
		gbc_dccIgnoreBtnDelete.fill = GridBagConstraints.HORIZONTAL;
		gbc_dccIgnoreBtnDelete.anchor = GridBagConstraints.NORTH;
		gbc_dccIgnoreBtnDelete.insets = new Insets(0, 0, 5, 0);
		gbc_dccIgnoreBtnDelete.gridx = 2;
		gbc_dccIgnoreBtnDelete.gridy = 4;
		panelDccIgnore.add(dccIgnoreBtnDelete, gbc_dccIgnoreBtnDelete);
		
		JCheckBox dccIgnoreChckbxTurnIgnoreBack = new JCheckBox("Turn ignore back on in:");
		dccIgnoreChckbxTurnIgnoreBack.setName("dcc");
		GridBagConstraints gbc_dccIgnoreChckbxTurnIgnoreBack = new GridBagConstraints();
		gbc_dccIgnoreChckbxTurnIgnoreBack.gridwidth = 2;
		gbc_dccIgnoreChckbxTurnIgnoreBack.anchor = GridBagConstraints.WEST;
		gbc_dccIgnoreChckbxTurnIgnoreBack.insets = new Insets(0, 0, 5, 0);
		gbc_dccIgnoreChckbxTurnIgnoreBack.gridx = 1;
		gbc_dccIgnoreChckbxTurnIgnoreBack.gridy = 5;
		panelDccIgnore.add(dccIgnoreChckbxTurnIgnoreBack, gbc_dccIgnoreChckbxTurnIgnoreBack);
		
		JComboBox<String> dccIgnoreComboBoxBanList = new JComboBox<String>();
		dccIgnoreComboBoxBanList.setName("dcc");
		dccIgnoreComboBoxBanList.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "30", "40", "50", "60"}));
		GridBagConstraints gbc_dccIgnoreComboBoxBanList = new GridBagConstraints();
		gbc_dccIgnoreComboBoxBanList.anchor = GridBagConstraints.EAST;
		gbc_dccIgnoreComboBoxBanList.insets = new Insets(0, 0, 0, 5);
		gbc_dccIgnoreComboBoxBanList.gridx = 1;
		gbc_dccIgnoreComboBoxBanList.gridy = 6;
		panelDccIgnore.add(dccIgnoreComboBoxBanList, gbc_dccIgnoreComboBoxBanList);
		
		JLabel lblMins = new JLabel("mins");
		GridBagConstraints gbc_lblMins = new GridBagConstraints();
		gbc_lblMins.anchor = GridBagConstraints.WEST;
		gbc_lblMins.gridx = 2;
		gbc_lblMins.gridy = 6;
		panelDccIgnore.add(lblMins, gbc_lblMins);
		
		JPanel panelDccFserve = new JPanel();
		panelDccFserve.setVisible(false);
		panelDccFserve.setEnabled(false);
		panelDccFserve.setName("dccfserve");
		panelDccFserve.setBounds(135, 30, 280, 270);
		contentPane.add(panelDccFserve);
		GridBagLayout gbl_panelDccFserve = new GridBagLayout();
		gbl_panelDccFserve.columnWidths = new int[]{0, 0, 0};
		gbl_panelDccFserve.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelDccFserve.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panelDccFserve.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelDccFserve.setLayout(gbl_panelDccFserve);
		
		JLabel lblMaxFileServers = new JLabel("Max File Servers");
		GridBagConstraints gbc_lblMaxFileServers = new GridBagConstraints();
		gbc_lblMaxFileServers.anchor = GridBagConstraints.WEST;
		gbc_lblMaxFileServers.insets = new Insets(0, 0, 5, 5);
		gbc_lblMaxFileServers.gridx = 0;
		gbc_lblMaxFileServers.gridy = 0;
		panelDccFserve.add(lblMaxFileServers, gbc_lblMaxFileServers);
		
		dccFserveTxtMaxfileservers = new JTextField();
		dccFserveTxtMaxfileservers.setName("dcc");
		dccFserveTxtMaxfileservers.setText("99");
		GridBagConstraints gbc_dccFserveTxtMaxfileservers = new GridBagConstraints();
		gbc_dccFserveTxtMaxfileservers.anchor = GridBagConstraints.WEST;
		gbc_dccFserveTxtMaxfileservers.insets = new Insets(0, 0, 5, 0);
		gbc_dccFserveTxtMaxfileservers.gridx = 1;
		gbc_dccFserveTxtMaxfileservers.gridy = 0;
		panelDccFserve.add(dccFserveTxtMaxfileservers, gbc_dccFserveTxtMaxfileservers);
		dccFserveTxtMaxfileservers.setColumns(10);
		
		JLabel lblMaxGetsPer = new JLabel("Max Gets per user:");
		GridBagConstraints gbc_lblMaxGetsPer = new GridBagConstraints();
		gbc_lblMaxGetsPer.anchor = GridBagConstraints.WEST;
		gbc_lblMaxGetsPer.insets = new Insets(0, 0, 5, 5);
		gbc_lblMaxGetsPer.gridx = 0;
		gbc_lblMaxGetsPer.gridy = 1;
		panelDccFserve.add(lblMaxGetsPer, gbc_lblMaxGetsPer);
		
		dccFserveTxtMaxgetsperuser = new JTextField();
		dccFserveTxtMaxgetsperuser.setName("dcc");
		dccFserveTxtMaxgetsperuser.setText("5");
		GridBagConstraints gbc_dccFserveTxtMaxgetsperuser = new GridBagConstraints();
		gbc_dccFserveTxtMaxgetsperuser.anchor = GridBagConstraints.WEST;
		gbc_dccFserveTxtMaxgetsperuser.insets = new Insets(0, 0, 5, 0);
		gbc_dccFserveTxtMaxgetsperuser.gridx = 1;
		gbc_dccFserveTxtMaxgetsperuser.gridy = 1;
		panelDccFserve.add(dccFserveTxtMaxgetsperuser, gbc_dccFserveTxtMaxgetsperuser);
		dccFserveTxtMaxgetsperuser.setColumns(10);
		
		JLabel lblTotalMaxCps = new JLabel("Total Max Cps:");
		GridBagConstraints gbc_lblTotalMaxCps = new GridBagConstraints();
		gbc_lblTotalMaxCps.anchor = GridBagConstraints.WEST;
		gbc_lblTotalMaxCps.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalMaxCps.gridx = 0;
		gbc_lblTotalMaxCps.gridy = 2;
		panelDccFserve.add(lblTotalMaxCps, gbc_lblTotalMaxCps);
		
		dccFserveTxtMaxCps = new JTextField();
		dccFserveTxtMaxCps.setName("dcc");
		dccFserveTxtMaxCps.setText("99999");
		GridBagConstraints gbc_dccFserveTxtMaxCps = new GridBagConstraints();
		gbc_dccFserveTxtMaxCps.anchor = GridBagConstraints.WEST;
		gbc_dccFserveTxtMaxCps.insets = new Insets(0, 0, 5, 0);
		gbc_dccFserveTxtMaxCps.gridx = 1;
		gbc_dccFserveTxtMaxCps.gridy = 2;
		panelDccFserve.add(dccFserveTxtMaxCps, gbc_dccFserveTxtMaxCps);
		dccFserveTxtMaxCps.setColumns(10);
		
		JLabel lblRootFolder = new JLabel("Root folder:");
		GridBagConstraints gbc_lblRootFolder = new GridBagConstraints();
		gbc_lblRootFolder.anchor = GridBagConstraints.WEST;
		gbc_lblRootFolder.gridwidth = 2;
		gbc_lblRootFolder.insets = new Insets(0, 0, 5, 5);
		gbc_lblRootFolder.gridx = 0;
		gbc_lblRootFolder.gridy = 4;
		panelDccFserve.add(lblRootFolder, gbc_lblRootFolder);
		
		JButton dccFserveBtnCpathtofolder = new JButton("c:\\path\\to\\folder");
		GridBagConstraints gbc_dccFserveBtnCpathtofolder = new GridBagConstraints();
		gbc_dccFserveBtnCpathtofolder.fill = GridBagConstraints.HORIZONTAL;
		gbc_dccFserveBtnCpathtofolder.gridwidth = 2;
		gbc_dccFserveBtnCpathtofolder.insets = new Insets(0, 0, 5, 5);
		gbc_dccFserveBtnCpathtofolder.gridx = 0;
		gbc_dccFserveBtnCpathtofolder.gridy = 5;
		panelDccFserve.add(dccFserveBtnCpathtofolder, gbc_dccFserveBtnCpathtofolder);
		
		JLabel lblWelcomTextFile = new JLabel("Welcome text file:");
		GridBagConstraints gbc_lblWelcomTextFile = new GridBagConstraints();
		gbc_lblWelcomTextFile.gridwidth = 2;
		gbc_lblWelcomTextFile.anchor = GridBagConstraints.WEST;
		gbc_lblWelcomTextFile.insets = new Insets(0, 0, 5, 5);
		gbc_lblWelcomTextFile.gridx = 0;
		gbc_lblWelcomTextFile.gridy = 6;
		panelDccFserve.add(lblWelcomTextFile, gbc_lblWelcomTextFile);
		
		JButton dccFserveBtnCpathtofile = new JButton("c:\\path\\to\\file");
		dccFserveBtnCpathtofile.setName("dcc");
		GridBagConstraints gbc_dccFserveBtnCpathtofile = new GridBagConstraints();
		gbc_dccFserveBtnCpathtofile.fill = GridBagConstraints.HORIZONTAL;
		gbc_dccFserveBtnCpathtofile.gridwidth = 2;
		gbc_dccFserveBtnCpathtofile.insets = new Insets(0, 0, 5, 5);
		gbc_dccFserveBtnCpathtofile.gridx = 0;
		gbc_dccFserveBtnCpathtofile.gridy = 7;
		panelDccFserve.add(dccFserveBtnCpathtofile, gbc_dccFserveBtnCpathtofile);
		
		JCheckBox dccFserveChckbxShowFileServer = new JCheckBox("Show file server warning");
		dccFserveChckbxShowFileServer.setName("dcc");
		GridBagConstraints gbc_dccFserveChckbxShowFileServer = new GridBagConstraints();
		gbc_dccFserveChckbxShowFileServer.anchor = GridBagConstraints.WEST;
		gbc_dccFserveChckbxShowFileServer.gridwidth = 2;
		gbc_dccFserveChckbxShowFileServer.insets = new Insets(0, 0, 0, 5);
		gbc_dccFserveChckbxShowFileServer.gridx = 0;
		gbc_dccFserveChckbxShowFileServer.gridy = 8;
		panelDccFserve.add(dccFserveChckbxShowFileServer, gbc_dccFserveChckbxShowFileServer);
		
		JPanel panelDccServer = new JPanel();
		panelDccServer.setVisible(false);
		panelDccServer.setEnabled(false);
		panelDccServer.setName("dccserver");
		panelDccServer.setBounds(135, 30, 280, 270);
		contentPane.add(panelDccServer);
		GridBagLayout gbl_panelDccServer = new GridBagLayout();
		gbl_panelDccServer.columnWidths = new int[]{53, 85, 85, 0, 0};
		gbl_panelDccServer.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelDccServer.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelDccServer.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelDccServer.setLayout(gbl_panelDccServer);
		
		JCheckBox dccServerChckbxEnableDccServer = new JCheckBox();
		dccServerChckbxEnableDccServer.setName("dcc");
		dccServerChckbxEnableDccServer.setText("Enable DCC Server");
		GridBagConstraints gbc_dccServerChckbxEnableDccServer = new GridBagConstraints();
		gbc_dccServerChckbxEnableDccServer.anchor = GridBagConstraints.WEST;
		gbc_dccServerChckbxEnableDccServer.gridwidth = 3;
		gbc_dccServerChckbxEnableDccServer.insets = new Insets(0, 0, 5, 0);
		gbc_dccServerChckbxEnableDccServer.gridx = 1;
		gbc_dccServerChckbxEnableDccServer.gridy = 2;
		panelDccServer.add(dccServerChckbxEnableDccServer, gbc_dccServerChckbxEnableDccServer);
		
		JLabel lblListenOnPort = new JLabel("Listen on Port:");
		GridBagConstraints gbc_lblListenOnPort = new GridBagConstraints();
		gbc_lblListenOnPort.insets = new Insets(0, 0, 5, 5);
		gbc_lblListenOnPort.gridx = 1;
		gbc_lblListenOnPort.gridy = 3;
		panelDccServer.add(lblListenOnPort, gbc_lblListenOnPort);
		
		dccServerTxtListenPort = new JTextField();
		dccServerTxtListenPort.setName("dcc");
		dccServerTxtListenPort.setText("Listen Port");
		GridBagConstraints gbc_dccServerTxtListenPort = new GridBagConstraints();
		gbc_dccServerTxtListenPort.insets = new Insets(0, 0, 5, 0);
		gbc_dccServerTxtListenPort.fill = GridBagConstraints.HORIZONTAL;
		gbc_dccServerTxtListenPort.gridx = 2;
		gbc_dccServerTxtListenPort.gridy = 3;
		panelDccServer.add(dccServerTxtListenPort, gbc_dccServerTxtListenPort);
		dccServerTxtListenPort.setColumns(10);
		
		JPanel dccServerPanelListen = new JPanel();
		dccServerPanelListen.setName("dcc");
		dccServerPanelListen.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Listen for:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_dccServerPanelListen = new GridBagConstraints();
		gbc_dccServerPanelListen.anchor = GridBagConstraints.WEST;
		gbc_dccServerPanelListen.gridwidth = 3;
		gbc_dccServerPanelListen.insets = new Insets(0, 0, 5, 0);
		gbc_dccServerPanelListen.fill = GridBagConstraints.VERTICAL;
		gbc_dccServerPanelListen.gridx = 1;
		gbc_dccServerPanelListen.gridy = 5;
		panelDccServer.add(dccServerPanelListen, gbc_dccServerPanelListen);
		dccServerPanelListen.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JCheckBox dccServerPanelListenChckbxSend = new JCheckBox("Send");
		dccServerPanelListenChckbxSend.setName("dcc");
		dccServerPanelListen.add(dccServerPanelListenChckbxSend);
		
		JCheckBox dccServerPanelListenChckbxChat = new JCheckBox("Chat");
		dccServerPanelListenChckbxChat.setName("dcc");
		dccServerPanelListen.add(dccServerPanelListenChckbxChat);
		
		JCheckBox dccServerPanelListenChckbxFserve = new JCheckBox("Fserve");
		dccServerPanelListenChckbxFserve.setName("dcc");
		dccServerPanelListen.add(dccServerPanelListenChckbxFserve);
		
		JCheckBox dccServerChckbxPerformDnsLookup = new JCheckBox("Perform DNS lookup");
		dccServerChckbxPerformDnsLookup.setName("dcc");
		GridBagConstraints gbc_dccServerChckbxPerformDnsLookup = new GridBagConstraints();
		gbc_dccServerChckbxPerformDnsLookup.anchor = GridBagConstraints.WEST;
		gbc_dccServerChckbxPerformDnsLookup.gridwidth = 2;
		gbc_dccServerChckbxPerformDnsLookup.insets = new Insets(0, 0, 0, 5);
		gbc_dccServerChckbxPerformDnsLookup.gridx = 1;
		gbc_dccServerChckbxPerformDnsLookup.gridy = 6;
		panelDccServer.add(dccServerChckbxPerformDnsLookup, gbc_dccServerChckbxPerformDnsLookup);
		
		JPanel panelDccFolders = new JPanel();
		panelDccFolders.setVisible(false);
		panelDccFolders.setEnabled(false);
		panelDccFolders.setName("dccfolders");
		panelDccFolders.setBounds(135, 30, 280, 270);
		contentPane.add(panelDccFolders);
		panelDccFolders.setLayout(null);
		
		JLabel lblDccGetFolders = new JLabel("DCC Get folders:");
		lblDccGetFolders.setBounds(10, 11, 81, 14);
		panelDccFolders.add(lblDccGetFolders);
		
		JScrollPane dccFoldersScrollPane = new JScrollPane();
		dccFoldersScrollPane.setName("dcc");
		dccFoldersScrollPane.setBounds(10, 36, 183, 190);
		panelDccFolders.add(dccFoldersScrollPane);
		
		dccFoldersScrollPaneTable = new JTable();
		dccFoldersScrollPaneTable.setName("dcc");
		dccFoldersScrollPaneTable.setFillsViewportHeight(true);
		dccFoldersScrollPaneTable.setShowVerticalLines(false);
		dccFoldersScrollPaneTable.setShowHorizontalLines(false);
		dccFoldersScrollPaneTable.setShowGrid(false);
		dccFoldersScrollPaneTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Type", "Folder"
			}
		));
		dccFoldersScrollPaneTable.getColumnModel().getColumn(0).setMaxWidth(75);
		dccFoldersScrollPane.setViewportView(dccFoldersScrollPaneTable);
		
		JButton dccFoldersBtnAdd = new JButton("Add");
		dccFoldersBtnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				DCCAddFolder dccadd = new DCCAddFolder();
				dccadd.setVisible(true);
			}
		});
		dccFoldersBtnAdd.setBounds(195, 52, 75, 23);
		panelDccFolders.add(dccFoldersBtnAdd);
		
		JButton dccFoldersBtnEdit = new JButton("Edit");
		dccFoldersBtnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//TODO: Add this functionality
			}
		});
		dccFoldersBtnEdit.setBounds(195, 80, 75, 23);
		panelDccFolders.add(dccFoldersBtnEdit);
		
		JButton dccFoldersBtnDelete = new JButton("Delete");
		dccFoldersBtnDelete.setBounds(195, 108, 75, 23);
		panelDccFolders.add(dccFoldersBtnDelete);
		
		JButton dccFoldersBtnUp = new JButton("Up");
		dccFoldersBtnUp.setBounds(195, 170, 75, 23);
		panelDccFolders.add(dccFoldersBtnUp);
		
		JButton dccFoldersBtnDown = new JButton("Down");
		dccFoldersBtnDown.setBounds(195, 196, 75, 23);
		panelDccFolders.add(dccFoldersBtnDown);
		
		JPanel panelDisplay = new JPanel();
		panelDisplay.setVisible(false);
		panelDisplay.setEnabled(false);
		panelDisplay.setName("display");
		panelDisplay.setBounds(135, 30, 280, 270);
		contentPane.add(panelDisplay);
		GridBagLayout gbl_panelDisplay = new GridBagLayout();
		gbl_panelDisplay.columnWidths = new int[]{84, 84, 84, 0};
		gbl_panelDisplay.rowHeights = new int[]{0, 25, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelDisplay.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelDisplay.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelDisplay.setLayout(gbl_panelDisplay);
		
		JCheckBox displayChckbxMultilineToolbar = new JCheckBox("Multi-line toolbar");
		displayChckbxMultilineToolbar.setName("display");
		GridBagConstraints gbc_displayChckbxMultilineToolbar = new GridBagConstraints();
		gbc_displayChckbxMultilineToolbar.gridwidth = 2;
		gbc_displayChckbxMultilineToolbar.anchor = GridBagConstraints.WEST;
		gbc_displayChckbxMultilineToolbar.insets = new Insets(0, 0, 5, 5);
		gbc_displayChckbxMultilineToolbar.gridx = 0;
		gbc_displayChckbxMultilineToolbar.gridy = 0;
		panelDisplay.add(displayChckbxMultilineToolbar, gbc_displayChckbxMultilineToolbar);
		
		JCheckBox displayChckbxalwaysHighlightOn = new JCheckBox("Always highlight on message");
		displayChckbxalwaysHighlightOn.setName("display");
		GridBagConstraints gbc_displayChckbxalwaysHighlightOn = new GridBagConstraints();
		gbc_displayChckbxalwaysHighlightOn.anchor = GridBagConstraints.WEST;
		gbc_displayChckbxalwaysHighlightOn.gridwidth = 2;
		gbc_displayChckbxalwaysHighlightOn.insets = new Insets(0, 0, 5, 5);
		gbc_displayChckbxalwaysHighlightOn.gridx = 0;
		gbc_displayChckbxalwaysHighlightOn.gridy = 1;
		panelDisplay.add(displayChckbxalwaysHighlightOn, gbc_displayChckbxalwaysHighlightOn);
		
		JLabel lblButtons = new JLabel("Buttons:");
		GridBagConstraints gbc_lblButtons = new GridBagConstraints();
		gbc_lblButtons.anchor = GridBagConstraints.WEST;
		gbc_lblButtons.insets = new Insets(0, 0, 5, 0);
		gbc_lblButtons.gridx = 2;
		gbc_lblButtons.gridy = 1;
		panelDisplay.add(lblButtons, gbc_lblButtons);
		
		JCheckBox displayChckbxBlinkIcons = new JCheckBox("Blink icons");
		displayChckbxBlinkIcons.setName("display");
		GridBagConstraints gbc_displayChckbxBlinkIcons = new GridBagConstraints();
		gbc_displayChckbxBlinkIcons.gridwidth = 2;
		gbc_displayChckbxBlinkIcons.anchor = GridBagConstraints.WEST;
		gbc_displayChckbxBlinkIcons.insets = new Insets(0, 0, 5, 5);
		gbc_displayChckbxBlinkIcons.gridx = 0;
		gbc_displayChckbxBlinkIcons.gridy = 2;
		panelDisplay.add(displayChckbxBlinkIcons, gbc_displayChckbxBlinkIcons);
		
		JComboBox<String> displayComboBoxButtonSize = new JComboBox<String>();
		displayComboBoxButtonSize.setName("display");
		displayComboBoxButtonSize.setModel(new DefaultComboBoxModel(new String[] {"Small", "Medium", "Large"}));
		GridBagConstraints gbc_displayComboBoxButtonSize = new GridBagConstraints();
		gbc_displayComboBoxButtonSize.anchor = GridBagConstraints.WEST;
		gbc_displayComboBoxButtonSize.insets = new Insets(0, 0, 5, 0);
		gbc_displayComboBoxButtonSize.gridx = 2;
		gbc_displayComboBoxButtonSize.gridy = 2;
		panelDisplay.add(displayComboBoxButtonSize, gbc_displayComboBoxButtonSize);
		
		JCheckBox displayChckbxFillSwitchbar = new JCheckBox("Fill switchbar");
		displayChckbxFillSwitchbar.setName("display");
		GridBagConstraints gbc_displayChckbxFillSwitchbar = new GridBagConstraints();
		gbc_displayChckbxFillSwitchbar.gridwidth = 2;
		gbc_displayChckbxFillSwitchbar.anchor = GridBagConstraints.WEST;
		gbc_displayChckbxFillSwitchbar.insets = new Insets(0, 0, 5, 5);
		gbc_displayChckbxFillSwitchbar.gridx = 0;
		gbc_displayChckbxFillSwitchbar.gridy = 3;
		panelDisplay.add(displayChckbxFillSwitchbar, gbc_displayChckbxFillSwitchbar);
		
		JLabel lblLines_2 = new JLabel("Lines:");
		GridBagConstraints gbc_lblLines_2 = new GridBagConstraints();
		gbc_lblLines_2.anchor = GridBagConstraints.WEST;
		gbc_lblLines_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblLines_2.gridx = 2;
		gbc_lblLines_2.gridy = 3;
		panelDisplay.add(lblLines_2, gbc_lblLines_2);
		
		JCheckBox displayChckbxIncludeDccs = new JCheckBox("Include DCCs");
		displayChckbxIncludeDccs.setName("display");
		GridBagConstraints gbc_displayChckbxIncludeDccs = new GridBagConstraints();
		gbc_displayChckbxIncludeDccs.gridwidth = 2;
		gbc_displayChckbxIncludeDccs.anchor = GridBagConstraints.WEST;
		gbc_displayChckbxIncludeDccs.insets = new Insets(0, 0, 5, 5);
		gbc_displayChckbxIncludeDccs.gridx = 0;
		gbc_displayChckbxIncludeDccs.gridy = 4;
		panelDisplay.add(displayChckbxIncludeDccs, gbc_displayChckbxIncludeDccs);
		
		JComboBox<String> displayComboBoxNumLines = new JComboBox<String>();
		displayComboBoxNumLines.setName("display");
		displayComboBoxNumLines.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		GridBagConstraints gbc_displayComboBoxNumLines = new GridBagConstraints();
		gbc_displayComboBoxNumLines.fill = GridBagConstraints.HORIZONTAL;
		gbc_displayComboBoxNumLines.insets = new Insets(0, 0, 5, 0);
		gbc_displayComboBoxNumLines.gridx = 2;
		gbc_displayComboBoxNumLines.gridy = 4;
		panelDisplay.add(displayComboBoxNumLines, gbc_displayComboBoxNumLines);
		
		JCheckBox displayChckbxIncludeDesktopWindows = new JCheckBox("Include desktop windows");
		displayChckbxIncludeDesktopWindows.setName("display");
		GridBagConstraints gbc_displayChckbxIncludeDesktopWindows = new GridBagConstraints();
		gbc_displayChckbxIncludeDesktopWindows.gridwidth = 2;
		gbc_displayChckbxIncludeDesktopWindows.anchor = GridBagConstraints.WEST;
		gbc_displayChckbxIncludeDesktopWindows.insets = new Insets(0, 0, 5, 5);
		gbc_displayChckbxIncludeDesktopWindows.gridx = 0;
		gbc_displayChckbxIncludeDesktopWindows.gridy = 5;
		panelDisplay.add(displayChckbxIncludeDesktopWindows, gbc_displayChckbxIncludeDesktopWindows);
		
		JCheckBox displayChckbxSortButtons = new JCheckBox("Sort buttons");
		displayChckbxSortButtons.setName("display");
		GridBagConstraints gbc_displayChckbxSortButtons = new GridBagConstraints();
		gbc_displayChckbxSortButtons.gridwidth = 2;
		gbc_displayChckbxSortButtons.insets = new Insets(0, 0, 5, 5);
		gbc_displayChckbxSortButtons.anchor = GridBagConstraints.WEST;
		gbc_displayChckbxSortButtons.gridx = 0;
		gbc_displayChckbxSortButtons.gridy = 6;
		panelDisplay.add(displayChckbxSortButtons, gbc_displayChckbxSortButtons);
		
		JLabel lblEvent = new JLabel("Event:");
		GridBagConstraints gbc_lblEvent = new GridBagConstraints();
		gbc_lblEvent.anchor = GridBagConstraints.WEST;
		gbc_lblEvent.insets = new Insets(0, 0, 5, 5);
		gbc_lblEvent.gridx = 0;
		gbc_lblEvent.gridy = 7;
		panelDisplay.add(lblEvent, gbc_lblEvent);
		
		JLabel lblMessage_1 = new JLabel("Message:");
		GridBagConstraints gbc_lblMessage_1 = new GridBagConstraints();
		gbc_lblMessage_1.anchor = GridBagConstraints.WEST;
		gbc_lblMessage_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMessage_1.gridx = 1;
		gbc_lblMessage_1.gridy = 7;
		panelDisplay.add(lblMessage_1, gbc_lblMessage_1);
		
		JLabel lblHighlight = new JLabel("Highlight:");
		GridBagConstraints gbc_lblHighlight = new GridBagConstraints();
		gbc_lblHighlight.insets = new Insets(0, 0, 5, 0);
		gbc_lblHighlight.anchor = GridBagConstraints.WEST;
		gbc_lblHighlight.gridx = 2;
		gbc_lblHighlight.gridy = 7;
		panelDisplay.add(lblHighlight, gbc_lblHighlight);
		
				
				JComboBox<Color> displayComboBoxEventColor = new JComboBox(colors);
				displayComboBoxEventColor.setName("display");
				displayComboBoxEventColor.setRenderer(new MyCellRenderer());
				GridBagConstraints gbc_displayComboBoxEventColor = new GridBagConstraints();
				gbc_displayComboBoxEventColor.insets = new Insets(0, 0, 0, 5);
				gbc_displayComboBoxEventColor.fill = GridBagConstraints.HORIZONTAL;
				gbc_displayComboBoxEventColor.gridx = 0;
				gbc_displayComboBoxEventColor.gridy = 8;
				panelDisplay.add(displayComboBoxEventColor, gbc_displayComboBoxEventColor);
				
				JComboBox<Color> displayComboBoxMessageColor = new JComboBox(colors);
				displayComboBoxMessageColor.setName("display");
				displayComboBoxMessageColor.setRenderer(new MyCellRenderer());
				GridBagConstraints gbc_displayComboBoxMessageColor = new GridBagConstraints();
				gbc_displayComboBoxMessageColor.insets = new Insets(0, 0, 0, 5);
				gbc_displayComboBoxMessageColor.fill = GridBagConstraints.HORIZONTAL;
				gbc_displayComboBoxMessageColor.gridx = 1;
				gbc_displayComboBoxMessageColor.gridy = 8;
				panelDisplay.add(displayComboBoxMessageColor, gbc_displayComboBoxMessageColor);
				
				JComboBox<Color> displayComboBoxHighlightColor = new JComboBox(colors);
				displayComboBoxHighlightColor.setName("display");
				displayComboBoxHighlightColor.setRenderer(new MyCellRenderer());
				GridBagConstraints gbc_displayComboBoxHighlightColor = new GridBagConstraints();
				gbc_displayComboBoxHighlightColor.fill = GridBagConstraints.HORIZONTAL;
				gbc_displayComboBoxHighlightColor.gridx = 2;
				gbc_displayComboBoxHighlightColor.gridy = 8;
				panelDisplay.add(displayComboBoxHighlightColor, gbc_displayComboBoxHighlightColor);
				
				JPanel panelDisplayOptions = new JPanel();
				panelDisplayOptions.setVisible(false);
				panelDisplayOptions.setEnabled(false);
				panelDisplayOptions.setName("displayoptions");
				panelDisplayOptions.setBounds(135, 30, 280, 270);
				contentPane.add(panelDisplayOptions);
				GridBagLayout gbl_panelDisplayOptions = new GridBagLayout();
				gbl_panelDisplayOptions.columnWidths = new int[]{0, 101, 40, 0, 0};
				gbl_panelDisplayOptions.rowHeights = new int[]{0, 0, 0, 0, 0, 15, 0, 0, 0, 0};
				gbl_panelDisplayOptions.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_panelDisplayOptions.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				panelDisplayOptions.setLayout(gbl_panelDisplayOptions);
				
				JLabel lblJavaircTitlebar = new JLabel("JavaIRC titlebar:");
				GridBagConstraints gbc_lblJavaircTitlebar = new GridBagConstraints();
				gbc_lblJavaircTitlebar.anchor = GridBagConstraints.WEST;
				gbc_lblJavaircTitlebar.insets = new Insets(0, 0, 5, 5);
				gbc_lblJavaircTitlebar.gridx = 1;
				gbc_lblJavaircTitlebar.gridy = 1;
				panelDisplayOptions.add(lblJavaircTitlebar, gbc_lblJavaircTitlebar);
				
				DisplayOptionsTxtTitlebarText = new JTextField();
				DisplayOptionsTxtTitlebarText.setName("display");
				DisplayOptionsTxtTitlebarText.setText("titlebar text");
				GridBagConstraints gbc_DisplayOptionsTxtTitlebarText = new GridBagConstraints();
				gbc_DisplayOptionsTxtTitlebarText.insets = new Insets(0, 0, 5, 5);
				gbc_DisplayOptionsTxtTitlebarText.fill = GridBagConstraints.HORIZONTAL;
				gbc_DisplayOptionsTxtTitlebarText.gridx = 1;
				gbc_DisplayOptionsTxtTitlebarText.gridy = 2;
				panelDisplayOptions.add(DisplayOptionsTxtTitlebarText, gbc_DisplayOptionsTxtTitlebarText);
				DisplayOptionsTxtTitlebarText.setColumns(10);
				
				JButton DisplayOptionsBtnMarker = new JButton("Marker...");
				DisplayOptionsBtnMarker.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Marker mark = new Marker();
						mark.setVisible(true);
					}
				});
				GridBagConstraints gbc_DisplayOptionsBtnMarker = new GridBagConstraints();
				gbc_DisplayOptionsBtnMarker.fill = GridBagConstraints.HORIZONTAL;
				gbc_DisplayOptionsBtnMarker.insets = new Insets(0, 0, 5, 0);
				gbc_DisplayOptionsBtnMarker.gridx = 3;
				gbc_DisplayOptionsBtnMarker.gridy = 2;
				panelDisplayOptions.add(DisplayOptionsBtnMarker, gbc_DisplayOptionsBtnMarker);
				
				JLabel lblLineSpacing = new JLabel("Line spacing:");
				GridBagConstraints gbc_lblLineSpacing = new GridBagConstraints();
				gbc_lblLineSpacing.anchor = GridBagConstraints.WEST;
				gbc_lblLineSpacing.insets = new Insets(0, 0, 5, 5);
				gbc_lblLineSpacing.gridx = 1;
				gbc_lblLineSpacing.gridy = 3;
				panelDisplayOptions.add(lblLineSpacing, gbc_lblLineSpacing);
				
				JButton DisplayOptionsBtnNames = new JButton("Names...");
				DisplayOptionsBtnNames.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Names names = new Names();
						names.setVisible(true);
					}
				});
				GridBagConstraints gbc_DisplayOptionsBtnNames = new GridBagConstraints();
				gbc_DisplayOptionsBtnNames.fill = GridBagConstraints.HORIZONTAL;
				gbc_DisplayOptionsBtnNames.insets = new Insets(0, 0, 5, 0);
				gbc_DisplayOptionsBtnNames.gridx = 3;
				gbc_DisplayOptionsBtnNames.gridy = 3;
				panelDisplayOptions.add(DisplayOptionsBtnNames, gbc_DisplayOptionsBtnNames);
				
				JComboBox<String> DisplayOptionsComboBoxSpacing = new JComboBox<String>();
				DisplayOptionsComboBoxSpacing.setName("display");
				DisplayOptionsComboBoxSpacing.setModel(new DefaultComboBoxModel<String>(new String[] {"Single", "Double", "Paragraph"}));
				GridBagConstraints gbc_DisplayOptionsComboBoxSpacing = new GridBagConstraints();
				gbc_DisplayOptionsComboBoxSpacing.insets = new Insets(0, 0, 5, 5);
				gbc_DisplayOptionsComboBoxSpacing.fill = GridBagConstraints.HORIZONTAL;
				gbc_DisplayOptionsComboBoxSpacing.gridx = 1;
				gbc_DisplayOptionsComboBoxSpacing.gridy = 4;
				panelDisplayOptions.add(DisplayOptionsComboBoxSpacing, gbc_DisplayOptionsComboBoxSpacing);
				
				JButton DisplayOptionsBtnStyles = new JButton("Styles...");
				DisplayOptionsBtnStyles.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Styles styles = new Styles();
						styles.setVisible(true);
					}
				});
				GridBagConstraints gbc_DisplayOptionsBtnStyles = new GridBagConstraints();
				gbc_DisplayOptionsBtnStyles.fill = GridBagConstraints.HORIZONTAL;
				gbc_DisplayOptionsBtnStyles.insets = new Insets(0, 0, 5, 0);
				gbc_DisplayOptionsBtnStyles.gridx = 3;
				gbc_DisplayOptionsBtnStyles.gridy = 4;
				panelDisplayOptions.add(DisplayOptionsBtnStyles, gbc_DisplayOptionsBtnStyles);
				
				JLabel lblEditboxLines = new JLabel("Editbox Lines");
				GridBagConstraints gbc_lblEditboxLines = new GridBagConstraints();
				gbc_lblEditboxLines.anchor = GridBagConstraints.WEST;
				gbc_lblEditboxLines.insets = new Insets(0, 0, 5, 5);
				gbc_lblEditboxLines.gridx = 1;
				gbc_lblEditboxLines.gridy = 5;
				panelDisplayOptions.add(lblEditboxLines, gbc_lblEditboxLines);
				
				JButton DisplayOptionsBtnTips = new JButton("Tips...");
				DisplayOptionsBtnTips.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Tips tips = new Tips();
						tips.setVisible(true);
					}
				});
				GridBagConstraints gbc_DisplayOptionsBtnTips = new GridBagConstraints();
				gbc_DisplayOptionsBtnTips.fill = GridBagConstraints.HORIZONTAL;
				gbc_DisplayOptionsBtnTips.insets = new Insets(0, 0, 5, 0);
				gbc_DisplayOptionsBtnTips.gridx = 3;
				gbc_DisplayOptionsBtnTips.gridy = 5;
				panelDisplayOptions.add(DisplayOptionsBtnTips, gbc_DisplayOptionsBtnTips);
				
				JComboBox<String> DisplayOptionsComboBoxEditboxLines = new JComboBox<String>();
				DisplayOptionsComboBoxEditboxLines.setName("display");
				DisplayOptionsComboBoxEditboxLines.setModel(new DefaultComboBoxModel<String>(new String[] {"Single", "Multiple", "Automatic"}));
				GridBagConstraints gbc_DisplayOptionsComboBoxEditboxLines = new GridBagConstraints();
				gbc_DisplayOptionsComboBoxEditboxLines.insets = new Insets(0, 0, 5, 5);
				gbc_DisplayOptionsComboBoxEditboxLines.fill = GridBagConstraints.HORIZONTAL;
				gbc_DisplayOptionsComboBoxEditboxLines.gridx = 1;
				gbc_DisplayOptionsComboBoxEditboxLines.gridy = 6;
				panelDisplayOptions.add(DisplayOptionsComboBoxEditboxLines, gbc_DisplayOptionsComboBoxEditboxLines);
				
				JButton DisplayOptionsBtnTray = new JButton("Tray...");
				DisplayOptionsBtnTray.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Tray tray = new Tray();
						tray.setVisible(true);
					}
				});
				GridBagConstraints gbc_DisplayOptionsBtnTray = new GridBagConstraints();
				gbc_DisplayOptionsBtnTray.fill = GridBagConstraints.HORIZONTAL;
				gbc_DisplayOptionsBtnTray.insets = new Insets(0, 0, 5, 0);
				gbc_DisplayOptionsBtnTray.gridx = 3;
				gbc_DisplayOptionsBtnTray.gridy = 6;
				panelDisplayOptions.add(DisplayOptionsBtnTray, gbc_DisplayOptionsBtnTray);
				
				JButton DisplayOptionsBtnWindows = new JButton("Windows...");
				DisplayOptionsBtnWindows.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Windows windows = new Windows();
						windows.setVisible(true);
					}
				});
				GridBagConstraints gbc_DisplayOptionsBtnWindows = new GridBagConstraints();
				gbc_DisplayOptionsBtnWindows.insets = new Insets(0, 0, 5, 0);
				gbc_DisplayOptionsBtnWindows.fill = GridBagConstraints.HORIZONTAL;
				gbc_DisplayOptionsBtnWindows.gridx = 3;
				gbc_DisplayOptionsBtnWindows.gridy = 7;
				panelDisplayOptions.add(DisplayOptionsBtnWindows, gbc_DisplayOptionsBtnWindows);
				
				JPanel panelOther = new JPanel();
				panelOther.setVisible(false);
				panelOther.setEnabled(false);
				panelOther.setName("other");
				panelOther.setBounds(135, 30, 280, 270);
				contentPane.add(panelOther);
				GridBagLayout gbl_panelOther = new GridBagLayout();
				gbl_panelOther.columnWidths = new int[]{0, 0, 79, 41, 0};
				gbl_panelOther.rowHeights = new int[]{0, 0, 0, 0, 15, 0, 0, 0, 0};
				gbl_panelOther.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_panelOther.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				panelOther.setLayout(gbl_panelOther);
				
				JLabel lblCommandPrefix = new JLabel("Command prefix:");
				GridBagConstraints gbc_lblCommandPrefix = new GridBagConstraints();
				gbc_lblCommandPrefix.anchor = GridBagConstraints.EAST;
				gbc_lblCommandPrefix.insets = new Insets(0, 0, 5, 5);
				gbc_lblCommandPrefix.gridx = 1;
				gbc_lblCommandPrefix.gridy = 1;
				panelOther.add(lblCommandPrefix, gbc_lblCommandPrefix);
				
				otherTxtPrefix = new JTextField();
				otherTxtPrefix.setName("o");
				otherTxtPrefix.setText("prefix");
				GridBagConstraints gbc_otherTxtPrefix = new GridBagConstraints();
				gbc_otherTxtPrefix.anchor = GridBagConstraints.WEST;
				gbc_otherTxtPrefix.insets = new Insets(0, 0, 5, 5);
				gbc_otherTxtPrefix.gridx = 2;
				gbc_otherTxtPrefix.gridy = 1;
				panelOther.add(otherTxtPrefix, gbc_otherTxtPrefix);
				otherTxtPrefix.setColumns(10);
				
				JLabel lblWindowBuffer = new JLabel("Window buffer:");
				GridBagConstraints gbc_lblWindowBuffer = new GridBagConstraints();
				gbc_lblWindowBuffer.anchor = GridBagConstraints.EAST;
				gbc_lblWindowBuffer.insets = new Insets(0, 0, 5, 5);
				gbc_lblWindowBuffer.gridx = 1;
				gbc_lblWindowBuffer.gridy = 2;
				panelOther.add(lblWindowBuffer, gbc_lblWindowBuffer);
				
				otherTxtBuffersize = new JTextField();
				otherTxtBuffersize.setName("o");
				otherTxtBuffersize.setText("bufferSize");
				GridBagConstraints gbc_otherTxtBuffersize = new GridBagConstraints();
				gbc_otherTxtBuffersize.insets = new Insets(0, 0, 5, 5);
				gbc_otherTxtBuffersize.fill = GridBagConstraints.HORIZONTAL;
				gbc_otherTxtBuffersize.gridx = 2;
				gbc_otherTxtBuffersize.gridy = 2;
				panelOther.add(otherTxtBuffersize, gbc_otherTxtBuffersize);
				otherTxtBuffersize.setColumns(10);
				
				JLabel lblLines_3 = new JLabel("lines");
				GridBagConstraints gbc_lblLines_3 = new GridBagConstraints();
				gbc_lblLines_3.anchor = GridBagConstraints.WEST;
				gbc_lblLines_3.insets = new Insets(0, 0, 5, 0);
				gbc_lblLines_3.gridx = 3;
				gbc_lblLines_3.gridy = 2;
				panelOther.add(lblLines_3, gbc_lblLines_3);
				
				JLabel lblLineSeperator = new JLabel("Line seperator:");
				GridBagConstraints gbc_lblLineSeperator = new GridBagConstraints();
				gbc_lblLineSeperator.anchor = GridBagConstraints.EAST;
				gbc_lblLineSeperator.insets = new Insets(0, 0, 5, 5);
				gbc_lblLineSeperator.gridx = 1;
				gbc_lblLineSeperator.gridy = 3;
				panelOther.add(lblLineSeperator, gbc_lblLineSeperator);
				
				otherTxtSeperator = new JTextField();
				otherTxtSeperator.setName("o");
				otherTxtSeperator.setText("seperator");
				GridBagConstraints gbc_otherTxtSeperator = new GridBagConstraints();
				gbc_otherTxtSeperator.insets = new Insets(0, 0, 5, 5);
				gbc_otherTxtSeperator.fill = GridBagConstraints.HORIZONTAL;
				gbc_otherTxtSeperator.gridx = 2;
				gbc_otherTxtSeperator.gridy = 3;
				panelOther.add(otherTxtSeperator, gbc_otherTxtSeperator);
				otherTxtSeperator.setColumns(10);
				
				JButton otherBtnConfirm = new JButton("Confirm...");
				otherBtnConfirm.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Confirm confirm = new Confirm();
						confirm.setVisible(true);
					}
				});
				GridBagConstraints gbc_otherBtnConfirm = new GridBagConstraints();
				gbc_otherBtnConfirm.insets = new Insets(0, 0, 5, 5);
				gbc_otherBtnConfirm.gridx = 2;
				gbc_otherBtnConfirm.gridy = 5;
				panelOther.add(otherBtnConfirm, gbc_otherBtnConfirm);
				
				JButton otherBtnKeys = new JButton("Keys...");
				otherBtnKeys.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Keys keys = new Keys();
						keys.setVisible(true);
					}
				});
				GridBagConstraints gbc_otherBtnKeys = new GridBagConstraints();
				gbc_otherBtnKeys.fill = GridBagConstraints.HORIZONTAL;
				gbc_otherBtnKeys.insets = new Insets(0, 0, 5, 5);
				gbc_otherBtnKeys.gridx = 2;
				gbc_otherBtnKeys.gridy = 6;
				panelOther.add(otherBtnKeys, gbc_otherBtnKeys);
				
				JButton otherBtnDde = new JButton("DDE...");
				otherBtnDde.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						DDE dde = new DDE();
						dde.setVisible(true);
					}
				});
				GridBagConstraints gbc_otherBtnDde = new GridBagConstraints();
				gbc_otherBtnDde.fill = GridBagConstraints.HORIZONTAL;
				gbc_otherBtnDde.insets = new Insets(0, 0, 0, 5);
				gbc_otherBtnDde.gridx = 2;
				gbc_otherBtnDde.gridy = 7;
				panelOther.add(otherBtnDde, gbc_otherBtnDde);
				
				JPanel panelOtherLock = new JPanel();
				panelOtherLock.setVisible(false);
				panelOtherLock.setEnabled(false);
				panelOtherLock.setName("otherlock");
				panelOtherLock.setBounds(135, 30, 280, 270);
				contentPane.add(panelOtherLock);
				panelOtherLock.setLayout(null);
				
				JPanel otherLockPanelPassword = new JPanel();
				otherLockPanelPassword.setName("o");
				FlowLayout fl_otherLockPanelPassword = (FlowLayout) otherLockPanelPassword.getLayout();
				fl_otherLockPanelPassword.setVgap(0);
				fl_otherLockPanelPassword.setHgap(0);
				fl_otherLockPanelPassword.setAlignment(FlowLayout.LEFT);
				otherLockPanelPassword.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Ask for password:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				otherLockPanelPassword.setBounds(10, 11, 113, 45);
				panelOtherLock.add(otherLockPanelPassword);
				
				JCheckBox otherLockPanelPasswordChckbxOnStartup = new JCheckBox("On Startup");
				otherLockPanelPasswordChckbxOnStartup.setName("o");
				otherLockPanelPasswordChckbxOnStartup.setHorizontalAlignment(SwingConstants.LEFT);
				otherLockPanelPassword.add(otherLockPanelPasswordChckbxOnStartup);
				
				JPanel OtherLockPanelDisable = new JPanel();
				OtherLockPanelDisable.setName("o");
				OtherLockPanelDisable.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Disable:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				OtherLockPanelDisable.setBounds(10, 56, 113, 101);
				panelOtherLock.add(OtherLockPanelDisable);
				GridBagLayout gbl_OtherLockPanelDisable = new GridBagLayout();
				gbl_OtherLockPanelDisable.columnWidths = new int[]{0, 0, 0};
				gbl_OtherLockPanelDisable.rowHeights = new int[]{0, 0, 0, 0};
				gbl_OtherLockPanelDisable.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
				gbl_OtherLockPanelDisable.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
				OtherLockPanelDisable.setLayout(gbl_OtherLockPanelDisable);
				
				JCheckBox otherLockPanelDisableChckbxSend = new JCheckBox("Send");
				otherLockPanelDisableChckbxSend.setName("o");
				GridBagConstraints gbc_otherLockPanelDisableChckbxSend = new GridBagConstraints();
				gbc_otherLockPanelDisableChckbxSend.anchor = GridBagConstraints.WEST;
				gbc_otherLockPanelDisableChckbxSend.insets = new Insets(0, 0, 5, 5);
				gbc_otherLockPanelDisableChckbxSend.gridx = 0;
				gbc_otherLockPanelDisableChckbxSend.gridy = 0;
				OtherLockPanelDisable.add(otherLockPanelDisableChckbxSend, gbc_otherLockPanelDisableChckbxSend);
				
				JCheckBox otherLockPanelDisableChckbxGet = new JCheckBox("Get");
				otherLockPanelDisableChckbxGet.setName("o");
				GridBagConstraints gbc_otherLockPanelDisableChckbxGet = new GridBagConstraints();
				gbc_otherLockPanelDisableChckbxGet.anchor = GridBagConstraints.WEST;
				gbc_otherLockPanelDisableChckbxGet.insets = new Insets(0, 0, 5, 0);
				gbc_otherLockPanelDisableChckbxGet.gridx = 1;
				gbc_otherLockPanelDisableChckbxGet.gridy = 0;
				OtherLockPanelDisable.add(otherLockPanelDisableChckbxGet, gbc_otherLockPanelDisableChckbxGet);
				
				JCheckBox otherLockPanelDisableChckbxChatQuery = new JCheckBox("Chat/Query");
				otherLockPanelDisableChckbxChatQuery.setName("o");
				GridBagConstraints gbc_otherLockPanelDisableChckbxChatQuery = new GridBagConstraints();
				gbc_otherLockPanelDisableChckbxChatQuery.anchor = GridBagConstraints.WEST;
				gbc_otherLockPanelDisableChckbxChatQuery.insets = new Insets(0, 0, 5, 0);
				gbc_otherLockPanelDisableChckbxChatQuery.gridwidth = 2;
				gbc_otherLockPanelDisableChckbxChatQuery.gridx = 0;
				gbc_otherLockPanelDisableChckbxChatQuery.gridy = 1;
				OtherLockPanelDisable.add(otherLockPanelDisableChckbxChatQuery, gbc_otherLockPanelDisableChckbxChatQuery);
				
				JCheckBox otherLockPanelDisableChckbxFserve = new JCheckBox("Fserve");
				otherLockPanelDisableChckbxFserve.setName("o");
				GridBagConstraints gbc_otherLockPanelDisableChckbxFserve = new GridBagConstraints();
				gbc_otherLockPanelDisableChckbxFserve.anchor = GridBagConstraints.WEST;
				gbc_otherLockPanelDisableChckbxFserve.gridwidth = 2;
				gbc_otherLockPanelDisableChckbxFserve.insets = new Insets(0, 0, 0, 5);
				gbc_otherLockPanelDisableChckbxFserve.gridx = 0;
				gbc_otherLockPanelDisableChckbxFserve.gridy = 2;
				OtherLockPanelDisable.add(otherLockPanelDisableChckbxFserve, gbc_otherLockPanelDisableChckbxFserve);
				
				JCheckBox otherLockChckbxhideTrayMenu = new JCheckBox("<html>Hide tray menu window list when locked</html>");
				otherLockChckbxhideTrayMenu.setName("o");
				otherLockChckbxhideTrayMenu.setVerticalAlignment(SwingConstants.TOP);
				otherLockChckbxhideTrayMenu.setBounds(16, 165, 113, 51);
				panelOtherLock.add(otherLockChckbxhideTrayMenu);
				
				JCheckBox otherLockChckbxhideTipsWhen = new JCheckBox("<html>Hide tips when locked</html>");
				otherLockChckbxhideTipsWhen.setName("o");
				otherLockChckbxhideTipsWhen.setVerticalAlignment(SwingConstants.TOP);
				otherLockChckbxhideTipsWhen.setBounds(16, 215, 113, 37);
				panelOtherLock.add(otherLockChckbxhideTipsWhen);
				
				JCheckBox otherLockChckbxLimitChannelsTo = new JCheckBox("Limit channels to:");
				otherLockChckbxLimitChannelsTo.setName("o");
				otherLockChckbxLimitChannelsTo.setBounds(146, 30, 109, 23);
				panelOtherLock.add(otherLockChckbxLimitChannelsTo);
				
				JComboBox<?> otherLockComboBoxChannelLimit = new JComboBox<Object>();
				otherLockComboBoxChannelLimit.setName("o");
				otherLockComboBoxChannelLimit.setEditable(true);
				otherLockComboBoxChannelLimit.setBounds(146, 53, 109, 20);
				panelOtherLock.add(otherLockComboBoxChannelLimit);
				
				JButton otherLockBtnAdd = new JButton("Add");
				otherLockBtnAdd.setBounds(162, 79, 75, 23);
				panelOtherLock.add(otherLockBtnAdd);
				
				JLabel lblDisableCommands = new JLabel("Disable commands:");
				lblDisableCommands.setHorizontalAlignment(SwingConstants.CENTER);
				lblDisableCommands.setBounds(146, 110, 109, 14);
				panelOtherLock.add(lblDisableCommands);
				
				JCheckBox otherLockChckbxCom = new JCheckBox("Com");
				otherLockChckbxCom.setName("o");
				otherLockChckbxCom.setBounds(158, 131, 97, 23);
				panelOtherLock.add(otherLockChckbxCom);
				
				JCheckBox otherLockChckbxDecode = new JCheckBox("Decode");
				otherLockChckbxDecode.setName("o");
				otherLockChckbxDecode.setBounds(158, 157, 97, 23);
				panelOtherLock.add(otherLockChckbxDecode);
				
				JCheckBox otherLockChckbxDll = new JCheckBox("Dll");
				otherLockChckbxDll.setName("o");
				otherLockChckbxDll.setBounds(158, 183, 97, 23);
				panelOtherLock.add(otherLockChckbxDll);
				
				JCheckBox otherLockChckbxRun = new JCheckBox("Run");
				otherLockChckbxRun.setName("o");
				otherLockChckbxRun.setBounds(158, 209, 97, 23);
				panelOtherLock.add(otherLockChckbxRun);
				
				JButton otherLockBtnLock = new JButton("Lock");
				otherLockBtnLock.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Lock lock = new Lock();
						lock.setVisible(true);
					}
				});
				otherLockBtnLock.setBounds(162, 239, 75, 23);
				panelOtherLock.add(otherLockBtnLock);
		
		addPanelsToList();
		
	}
	private TreeModel createServerTreeModel() {
		return new DefaultTreeModel(
			new DefaultMutableTreeNode("servers") {
				private static final long serialVersionUID = 1L; {
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode(new DefaultMutableTreeNode("GlobalGamers"));
						node_1.add(new DefaultMutableTreeNode("GlobalGamers: random"));
						this.add(node_1);
						
				};
			});
	}
	private TreeModel createTreeModel() {
	    return new DefaultTreeModel(
			new DefaultMutableTreeNode("Options") {					
				private static final long serialVersionUID = 6571630922345831042L; {
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("Connect");
						node_1.add(new DefaultMutableTreeNode("Servers"));
						node_1.add(new DefaultMutableTreeNode("Options"));
						node_1.add(new DefaultMutableTreeNode("Identd"));
						node_1.add(new DefaultMutableTreeNode("Proxy"));
						node_1.add(new DefaultMutableTreeNode("Local"));
						this.add(node_1);
					node_1 = new DefaultMutableTreeNode("Irc");
						node_1.add(new DefaultMutableTreeNode("Options"));
						node_1.add(new DefaultMutableTreeNode("Messages"));
						node_1.add(new DefaultMutableTreeNode("Catcher"));
						node_1.add(new DefaultMutableTreeNode("Logging"));
						node_1.add(new DefaultMutableTreeNode("Flood"));
						this.add(node_1);
					node_1 = new DefaultMutableTreeNode("Sounds");
						node_1.add(new DefaultMutableTreeNode("Requests"));
						node_1.add(new DefaultMutableTreeNode("Speech"));
						this.add(node_1);
					node_1 = new DefaultMutableTreeNode("Mouse");
						node_1.add(new DefaultMutableTreeNode("Drop"));
						this.add(node_1);
					node_1 = new DefaultMutableTreeNode("DCC");
						node_1.add(new DefaultMutableTreeNode("Options"));
						node_1.add(new DefaultMutableTreeNode("Folders"));
						node_1.add(new DefaultMutableTreeNode("Ignore"));
						node_1.add(new DefaultMutableTreeNode("Fserve"));
						node_1.add(new DefaultMutableTreeNode("Server"));
						this.add(node_1);
					node_1 = new DefaultMutableTreeNode("Display");
						node_1.add(new DefaultMutableTreeNode("Options"));
						this.add(node_1);
					node_1 = new DefaultMutableTreeNode("Other");
						node_1.add(new DefaultMutableTreeNode("Lock"));
						this.add(node_1);
				};
			});		
	}
	protected void saveAllTheThings() {
		OptionsSaver os = new OptionsSaver(this);
		
	}
	private void addPanelsToList() {
		for(Component c : contentPane.getComponents()) {
			if (c.getName() != null && !c.getName().equals("")) {
				panelList.add((JPanel) c);
			}
		}
		
	}
	public static JPanel getPanelByName(String name) {
		for(Component c : contentPane.getComponents()) {
			String cmpName = c.getName();
			if (cmpName!=null){
				if (c.getName().toLowerCase().indexOf(name.toLowerCase())>=0) {
					return (JPanel) c;
				}
			}
		}
		return null;
		
	}
	public static void addServer() {
		
		
	}
}
class TreeIcon implements Icon {

    private static int SIZE = 0;

    public TreeIcon() {
    }

    public int getIconWidth() {
        return SIZE;
    }

    public int getIconHeight() {
        return SIZE;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        //System.out.println(c.getWidth() + " " + c.getHeight() + " " + x + " " + y);
    }
}

class SelectionListener implements TreeSelectionListener {
	  public void valueChanged(TreeSelectionEvent se) {
		  JTree tree = (JTree) se.getSource();
		  DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
		  DefaultMutableTreeNode parentOfSelectedNode=(DefaultMutableTreeNode) selectedNode.getParent();
		  String nodeName = "";
		  if (selectedNode.isLeaf()) {
			   nodeName = parentOfSelectedNode.toString() + selectedNode.toString();			  
		  }else {
			  nodeName = selectedNode.toString();
		  }
		  //System.out.println("Selected Node Name: " + nodeName);	    
		  enableWindow(nodeName);
	  }

	private void enableWindow(String selectedNodeName) {
		// TODO Auto-generated method stub
		for (JPanel jp : OptionsFrame.panelList) {
			if (jp.getName().toLowerCase().equals(selectedNodeName.toLowerCase())) {
				jp.setEnabled(true);
				jp.setVisible(true);
				for(Component c : jp.getComponents()){
					c.setVisible(true);
					c.setEnabled(true);
				}
			}else {
				//not the panel we're looking for. Move along.
				jp.setEnabled(false);
				jp.setVisible(false);
			}
		}
	}
}
class MyCellRenderer extends JButton implements ListCellRenderer<Object> {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyCellRenderer() {  
        setOpaque(true);
        

    }
    boolean b=false;
   @Override
   public void setBackground(Color bg) {
        if(!b)
        {
            return;
        }

       super.setBackground(bg);
       super.setForeground(bg);
       
   }
    public Component getListCellRendererComponent(  
        JList<?> list,  
        Object value,  
        int index,  

        boolean isSelected,  
        boolean cellHasFocus)  
    {  

        b=true;
        setText(" ");           
        setBackground((Color)value); 
        setForeground((Color)value);
        setOpaque(true);
        b=false;
        return this;  
    }  
}
class NodeIcon implements Icon {

    private static final int SIZE = 9;

    private char type;

    public NodeIcon(char type) {
        this.type = type;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(UIManager.getColor("Tree.background"));
        g.fillRect(x, y, SIZE - 1, SIZE - 1);

        g.setColor(UIManager.getColor("Tree.hash").darker());
        g.drawRect(x, y, SIZE - 1, SIZE - 1);

        g.setColor(UIManager.getColor("Tree.foreground"));
        g.drawLine(x + 2, y + SIZE / 2, x + SIZE - 3, y + SIZE / 2);
        if (type == '+') {
            g.drawLine(x + SIZE / 2, y + 2, x + SIZE / 2, y + SIZE - 3);
        }
    }

    public int getIconWidth() {
        return SIZE;
    }

    public int getIconHeight() {
        return SIZE;
    }
}