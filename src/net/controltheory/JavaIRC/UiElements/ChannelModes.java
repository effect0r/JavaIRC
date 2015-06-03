package net.controltheory.JavaIRC.UiElements;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

import net.controltheory.JavaIRC.Structures.Channel;
import javax.swing.JPasswordField;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class ChannelModes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPasswordField txtPassword;
	private JCheckBox chckTopic;
	private JCheckBox chckKey;
	private JCheckBox chckExternal;
	private JCheckBox chckLimit;
	private JCheckBox chckInvite;
	private JCheckBox chckPrivate;
	private JCheckBox chckMod;
	private JCheckBox chckSecret;
	private JTextField txtLimit;
	private JComboBox<String> dropTopic;
	private JList<String> listBans;

	public ChannelModes() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setType(Type.UTILITY);
		setAlwaysOnTop(true);
		setMinimumSize(new Dimension(450, 450));
		setTitle("Channel Modes For ");
		setBounds(100, 100, 465, 450);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{447, 0};
		gridBagLayout.rowHeights = new int[]{190, 189, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panelTop = new JPanel();
		GridBagConstraints gbc_panelTop = new GridBagConstraints();
		gbc_panelTop.fill = GridBagConstraints.BOTH;
		gbc_panelTop.insets = new Insets(0, 0, 5, 0);
		gbc_panelTop.gridx = 0;
		gbc_panelTop.gridy = 0;
		getContentPane().add(panelTop, gbc_panelTop);
		GridBagLayout gbl_panelTop = new GridBagLayout();
		gbl_panelTop.columnWidths = new int[] {430};
		gbl_panelTop.rowHeights = new int[] {20, 30, 20, 148};
		gbl_panelTop.columnWeights = new double[]{1.0};
		gbl_panelTop.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0};
		panelTop.setLayout(gbl_panelTop);
		
		JLabel lblNewLabel = new JLabel("Topics:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(5, 5, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panelTop.add(lblNewLabel, gbc_lblNewLabel);
		
		dropTopic = new JComboBox<>();
		dropTopic.setEditable(true);
		GridBagConstraints gbc_dropTopic = new GridBagConstraints();
		gbc_dropTopic.fill = GridBagConstraints.BOTH;
		gbc_dropTopic.insets = new Insets(5, 5, 5, 5);
		gbc_dropTopic.gridx = 0;
		gbc_dropTopic.gridy = 1;
		panelTop.add(dropTopic, gbc_dropTopic);
		
		JLabel lblBansList = new JLabel("Bans List:");
		GridBagConstraints gbc_lblBansList = new GridBagConstraints();
		gbc_lblBansList.fill = GridBagConstraints.VERTICAL;
		gbc_lblBansList.anchor = GridBagConstraints.WEST;
		gbc_lblBansList.insets = new Insets(5, 5, 5, 5);
		gbc_lblBansList.gridx = 0;
		gbc_lblBansList.gridy = 2;
		panelTop.add(lblBansList, gbc_lblBansList);
		
		JScrollPane scrollPaneBans = new JScrollPane();
		scrollPaneBans.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneBans.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPaneBans = new GridBagConstraints();
		gbc_scrollPaneBans.insets = new Insets(5, 5, 5, 5);
		gbc_scrollPaneBans.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneBans.gridx = 0;
		gbc_scrollPaneBans.gridy = 3;
		panelTop.add(scrollPaneBans, gbc_scrollPaneBans);
		
		listBans = new JList<String>();
		scrollPaneBans.setViewportView(listBans);
		
		JPanel panelBottom = new JPanel();
		GridBagConstraints gbc_panelBottom = new GridBagConstraints();
		gbc_panelBottom.gridx = 0;
		gbc_panelBottom.gridy = 1;
		getContentPane().add(panelBottom, gbc_panelBottom);
		GridBagLayout gbl_panelBottom = new GridBagLayout();
		gbl_panelBottom.columnWidths = new int[] {85, 84, 84, 84, 84};
		gbl_panelBottom.rowHeights = new int[] {25, 25, 25, 25, 25, 0};
		gbl_panelBottom.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panelBottom.rowWeights = new double[]{0.0, Double.MIN_VALUE, 0.0, 0.0, 0.0, 0.0};
		panelBottom.setLayout(gbl_panelBottom);
		
		JButton btnBans = new JButton("Bans");
		btnBans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnBans = new GridBagConstraints();
		gbc_btnBans.fill = GridBagConstraints.BOTH;
		gbc_btnBans.insets = new Insets(0, 0, 5, 5);
		gbc_btnBans.gridx = 0;
		gbc_btnBans.gridy = 0;
		panelBottom.add(btnBans, gbc_btnBans);
		
		JButton btnExcepts = new JButton("Excepts");
		btnExcepts.setEnabled(false);
		GridBagConstraints gbc_btnExcepts = new GridBagConstraints();
		gbc_btnExcepts.fill = GridBagConstraints.BOTH;
		gbc_btnExcepts.insets = new Insets(0, 0, 5, 5);
		gbc_btnExcepts.gridx = 1;
		gbc_btnExcepts.gridy = 0;
		panelBottom.add(btnExcepts, gbc_btnExcepts);
		
		JButton btnInvites = new JButton("Invites");
		btnInvites.setEnabled(false);
		GridBagConstraints gbc_btnInvites = new GridBagConstraints();
		gbc_btnInvites.fill = GridBagConstraints.BOTH;
		gbc_btnInvites.insets = new Insets(0, 0, 5, 5);
		gbc_btnInvites.gridx = 2;
		gbc_btnInvites.gridy = 0;
		panelBottom.add(btnInvites, gbc_btnInvites);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setEnabled(false);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnEdit = new GridBagConstraints();
		gbc_btnEdit.fill = GridBagConstraints.BOTH;
		gbc_btnEdit.insets = new Insets(0, 0, 5, 5);
		gbc_btnEdit.gridx = 3;
		gbc_btnEdit.gridy = 0;
		panelBottom.add(btnEdit, gbc_btnEdit);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setEnabled(false);
		GridBagConstraints gbc_btnRemove = new GridBagConstraints();
		gbc_btnRemove.fill = GridBagConstraints.BOTH;
		gbc_btnRemove.insets = new Insets(0, 0, 5, 0);
		gbc_btnRemove.gridx = 4;
		gbc_btnRemove.gridy = 0;
		panelBottom.add(btnRemove, gbc_btnRemove);
		
		chckTopic = new JCheckBox("Only ops set Topic");
		GridBagConstraints gbc_chckTopic = new GridBagConstraints();
		gbc_chckTopic.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckTopic.gridwidth = 2;
		gbc_chckTopic.insets = new Insets(0, 0, 5, 5);
		gbc_chckTopic.gridx = 0;
		gbc_chckTopic.gridy = 2;
		panelBottom.add(chckTopic, gbc_chckTopic);
		
		chckKey = new JCheckBox("Key:");
		GridBagConstraints gbc_chckKey = new GridBagConstraints();
		gbc_chckKey.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckKey.insets = new Insets(0, 0, 5, 5);
		gbc_chckKey.gridx = 2;
		gbc_chckKey.gridy = 2;
		panelBottom.add(chckKey, gbc_chckKey);
		
		txtPassword = new JPasswordField();
		GridBagConstraints gbc_txtPassword = new GridBagConstraints();
		gbc_txtPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPassword.insets = new Insets(0, 0, 5, 5);
		gbc_txtPassword.gridx = 3;
		gbc_txtPassword.gridy = 2;
		panelBottom.add(txtPassword, gbc_txtPassword);
		txtPassword.setColumns(10);
		
		chckExternal = new JCheckBox("No External Messages");
		GridBagConstraints gbc_chckExternal = new GridBagConstraints();
		gbc_chckExternal.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckExternal.gridwidth = 2;
		gbc_chckExternal.insets = new Insets(0, 0, 5, 5);
		gbc_chckExternal.gridx = 0;
		gbc_chckExternal.gridy = 3;
		panelBottom.add(chckExternal, gbc_chckExternal);
		
		chckLimit = new JCheckBox("User Limit:");
		GridBagConstraints gbc_chckLimit = new GridBagConstraints();
		gbc_chckLimit.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckLimit.insets = new Insets(0, 0, 5, 5);
		gbc_chckLimit.gridx = 2;
		gbc_chckLimit.gridy = 3;
		panelBottom.add(chckLimit, gbc_chckLimit);
		
		txtLimit = new JTextField();
		txtLimit.setMinimumSize(new Dimension(30, 20));
		GridBagConstraints gbc_txtLimit = new GridBagConstraints();
		gbc_txtLimit.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLimit.insets = new Insets(0, 0, 5, 5);
		gbc_txtLimit.gridx = 3;
		gbc_txtLimit.gridy = 3;
		panelBottom.add(txtLimit, gbc_txtLimit);
		txtLimit.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//save and send modes to server
			}
		});
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnOk.insets = new Insets(0, 0, 5, 0);
		gbc_btnOk.gridx = 4;
		gbc_btnOk.gridy = 3;
		panelBottom.add(btnOk, gbc_btnOk);
		
		chckInvite = new JCheckBox("Invite Only");
		GridBagConstraints gbc_chckInvite = new GridBagConstraints();
		gbc_chckInvite.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckInvite.gridwidth = 2;
		gbc_chckInvite.insets = new Insets(0, 0, 5, 5);
		gbc_chckInvite.gridx = 0;
		gbc_chckInvite.gridy = 4;
		panelBottom.add(chckInvite, gbc_chckInvite);
		
		chckPrivate = new JCheckBox("Private");
		GridBagConstraints gbc_chckPrivate = new GridBagConstraints();
		gbc_chckPrivate.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckPrivate.gridwidth = 2;
		gbc_chckPrivate.insets = new Insets(0, 0, 5, 5);
		gbc_chckPrivate.gridx = 2;
		gbc_chckPrivate.gridy = 4;
		panelBottom.add(chckPrivate, gbc_chckPrivate);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancel.insets = new Insets(0, 0, 5, 0);
		gbc_btnCancel.gridx = 4;
		gbc_btnCancel.gridy = 4;
		panelBottom.add(btnCancel, gbc_btnCancel);
		
		chckMod = new JCheckBox("Moderated");
		GridBagConstraints gbc_chckMod = new GridBagConstraints();
		gbc_chckMod.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckMod.gridwidth = 2;
		gbc_chckMod.insets = new Insets(0, 0, 0, 5);
		gbc_chckMod.gridx = 0;
		gbc_chckMod.gridy = 5;
		panelBottom.add(chckMod, gbc_chckMod);
		
		chckSecret = new JCheckBox("Secret");
		GridBagConstraints gbc_chckSecret = new GridBagConstraints();
		gbc_chckSecret.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckSecret.gridwidth = 2;
		gbc_chckSecret.insets = new Insets(0, 0, 0, 5);
		gbc_chckSecret.gridx = 2;
		gbc_chckSecret.gridy = 5;
		panelBottom.add(chckSecret, gbc_chckSecret);
		
		JButton btnHelp = new JButton("Help");
		GridBagConstraints gbc_btnHelp = new GridBagConstraints();
		gbc_btnHelp.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnHelp.gridx = 4;
		gbc_btnHelp.gridy = 5;
		panelBottom.add(btnHelp, gbc_btnHelp);
		
		
	}

	public void values(Channel ch) {
		// TODO Auto-generated method stub
		setTitle("Channel modes for " + ch.getName());
		txtPassword.setText(ch.getKey_pass());
		chckTopic.setSelected(ch.isOps_topic_only());
		chckKey.setSelected(ch.isKey());
		chckExternal.setSelected(ch.isExternal_messages());
		chckLimit.setSelected(ch.isLimit());
		chckInvite.setSelected(ch.isInvite_only());
		chckPrivate.setSelected(ch.isPrivate_chan());
		chckMod.setSelected(ch.isModerated());
		chckSecret.setSelected(ch.isSecret());
		txtLimit.setText(String.valueOf(ch.getLimit_amount()));
		dropTopic.addItem(ch.getTopic());
		
	}
}
