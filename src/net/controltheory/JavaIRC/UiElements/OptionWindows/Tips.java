package net.controltheory.JavaIRC.UiElements.OptionWindows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dimension;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.SwingConstants;
import java.awt.Component;

public class Tips extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public Tips() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Tips");
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 315, 346);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{309};
		gridBagLayout.rowHeights = new int[]{285, 33, 0};
		gridBagLayout.columnWeights = new double[]{1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_contentPanel = new GridBagConstraints();
		gbc_contentPanel.fill = GridBagConstraints.BOTH;
		gbc_contentPanel.insets = new Insets(0, 0, 5, 0);
		gbc_contentPanel.gridx = 0;
		gbc_contentPanel.gridy = 0;
		getContentPane().add(contentPanel, gbc_contentPanel);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{150, 150, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JCheckBox chckbxEnableTips = new JCheckBox("Enable tips");
			GridBagConstraints gbc_chckbxEnableTips = new GridBagConstraints();
			gbc_chckbxEnableTips.fill = GridBagConstraints.BOTH;
			gbc_chckbxEnableTips.gridwidth = 2;
			gbc_chckbxEnableTips.insets = new Insets(0, 0, 5, 0);
			gbc_chckbxEnableTips.gridx = 0;
			gbc_chckbxEnableTips.gridy = 0;
			contentPanel.add(chckbxEnableTips, gbc_chckbxEnableTips);
		}
		{
			JPanel panelChannelTips = new JPanel();
			panelChannelTips.setBorder(new TitledBorder(null, "Channel tips:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panelChannelTips = new GridBagConstraints();
			gbc_panelChannelTips.gridheight = 3;
			gbc_panelChannelTips.fill = GridBagConstraints.BOTH;
			gbc_panelChannelTips.gridx = 0;
			gbc_panelChannelTips.gridy = 1;
			contentPanel.add(panelChannelTips, gbc_panelChannelTips);
			GridBagLayout gbl_panelChannelTips = new GridBagLayout();
			gbl_panelChannelTips.columnWidths = new int[]{0, 0};
			gbl_panelChannelTips.rowHeights = new int[]{0, 0};
			gbl_panelChannelTips.columnWeights = new double[]{1.0, 1.0};
			gbl_panelChannelTips.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0};
			panelChannelTips.setLayout(gbl_panelChannelTips);
			{
				JCheckBox chckbxMessage = new JCheckBox("Message");
				GridBagConstraints gbc_chckbxMessage = new GridBagConstraints();
				gbc_chckbxMessage.fill = GridBagConstraints.BOTH;
				gbc_chckbxMessage.gridx = 0;
				gbc_chckbxMessage.gridy = 0;
				panelChannelTips.add(chckbxMessage, gbc_chckbxMessage);
			}
			{
				JCheckBox chckbxMode = new JCheckBox("Mode");
				GridBagConstraints gbc_chckbxMode = new GridBagConstraints();
				gbc_chckbxMode.fill = GridBagConstraints.BOTH;
				gbc_chckbxMode.gridx = 1;
				gbc_chckbxMode.gridy = 0;
				panelChannelTips.add(chckbxMode, gbc_chckbxMode);
			}
			{
				JCheckBox chckbxNotice = new JCheckBox("Notice");
				GridBagConstraints gbc_chckbxNotice = new GridBagConstraints();
				gbc_chckbxNotice.fill = GridBagConstraints.BOTH;
				gbc_chckbxNotice.gridx = 0;
				gbc_chckbxNotice.gridy = 1;
				panelChannelTips.add(chckbxNotice, gbc_chckbxNotice);
			}
			{
				JCheckBox chckbxTopic = new JCheckBox("Topic");
				GridBagConstraints gbc_chckbxTopic = new GridBagConstraints();
				gbc_chckbxTopic.fill = GridBagConstraints.BOTH;
				gbc_chckbxTopic.gridx = 1;
				gbc_chckbxTopic.gridy = 1;
				panelChannelTips.add(chckbxTopic, gbc_chckbxTopic);
			}
			{
				JCheckBox chckbxCtcp = new JCheckBox("Ctcp");
				GridBagConstraints gbc_chckbxCtcp = new GridBagConstraints();
				gbc_chckbxCtcp.fill = GridBagConstraints.BOTH;
				gbc_chckbxCtcp.gridx = 0;
				gbc_chckbxCtcp.gridy = 2;
				panelChannelTips.add(chckbxCtcp, gbc_chckbxCtcp);
			}
			{
				JCheckBox chckbxNick = new JCheckBox("Nick");
				GridBagConstraints gbc_chckbxNick = new GridBagConstraints();
				gbc_chckbxNick.fill = GridBagConstraints.BOTH;
				gbc_chckbxNick.gridx = 1;
				gbc_chckbxNick.gridy = 2;
				panelChannelTips.add(chckbxNick, gbc_chckbxNick);
			}
			{
				JCheckBox chckbxJoinpart = new JCheckBox("Join/Part");
				GridBagConstraints gbc_chckbxJoinpart = new GridBagConstraints();
				gbc_chckbxJoinpart.fill = GridBagConstraints.BOTH;
				gbc_chckbxJoinpart.gridx = 0;
				gbc_chckbxJoinpart.gridy = 3;
				panelChannelTips.add(chckbxJoinpart, gbc_chckbxJoinpart);
			}
			{
				JCheckBox chckbxQuit = new JCheckBox("Quit");
				GridBagConstraints gbc_chckbxQuit = new GridBagConstraints();
				gbc_chckbxQuit.fill = GridBagConstraints.BOTH;
				gbc_chckbxQuit.gridx = 1;
				gbc_chckbxQuit.gridy = 3;
				panelChannelTips.add(chckbxQuit, gbc_chckbxQuit);
			}
			{
				JCheckBox chckbxKick = new JCheckBox("Kick");
				GridBagConstraints gbc_chckbxKick = new GridBagConstraints();
				gbc_chckbxKick.fill = GridBagConstraints.BOTH;
				gbc_chckbxKick.gridx = 0;
				gbc_chckbxKick.gridy = 4;
				panelChannelTips.add(chckbxKick, gbc_chckbxKick);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Other tips:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridheight = 3;
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 1;
			gbc_panel.gridy = 1;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 1.0};
			gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxConnect = new JCheckBox("Connect");
				GridBagConstraints gbc_chckbxConnect = new GridBagConstraints();
				gbc_chckbxConnect.fill = GridBagConstraints.BOTH;
				gbc_chckbxConnect.gridx = 0;
				gbc_chckbxConnect.gridy = 0;
				panel.add(chckbxConnect, gbc_chckbxConnect);
			}
			{
				JCheckBox chckbxInvite = new JCheckBox("Invite");
				GridBagConstraints gbc_chckbxInvite = new GridBagConstraints();
				gbc_chckbxInvite.fill = GridBagConstraints.BOTH;
				gbc_chckbxInvite.gridx = 1;
				gbc_chckbxInvite.gridy = 0;
				panel.add(chckbxInvite, gbc_chckbxInvite);
			}
			{
				JCheckBox chckbxNotice_1 = new JCheckBox("Notice");
				GridBagConstraints gbc_chckbxNotice_1 = new GridBagConstraints();
				gbc_chckbxNotice_1.fill = GridBagConstraints.BOTH;
				gbc_chckbxNotice_1.gridx = 0;
				gbc_chckbxNotice_1.gridy = 1;
				panel.add(chckbxNotice_1, gbc_chckbxNotice_1);
			}
			{
				JCheckBox chckbxAway = new JCheckBox("Away");
				GridBagConstraints gbc_chckbxAway = new GridBagConstraints();
				gbc_chckbxAway.fill = GridBagConstraints.BOTH;
				gbc_chckbxAway.gridx = 1;
				gbc_chckbxAway.gridy = 1;
				panel.add(chckbxAway, gbc_chckbxAway);
			}
			{
				JCheckBox chckbxNotify = new JCheckBox("Notify");
				GridBagConstraints gbc_chckbxNotify = new GridBagConstraints();
				gbc_chckbxNotify.fill = GridBagConstraints.BOTH;
				gbc_chckbxNotify.gridx = 0;
				gbc_chckbxNotify.gridy = 2;
				panel.add(chckbxNotify, gbc_chckbxNotify);
			}
			{
				JCheckBox chckbxList = new JCheckBox("List");
				GridBagConstraints gbc_chckbxList = new GridBagConstraints();
				gbc_chckbxList.fill = GridBagConstraints.BOTH;
				gbc_chckbxList.gridx = 1;
				gbc_chckbxList.gridy = 2;
				panel.add(chckbxList, gbc_chckbxList);
			}
			{
				JCheckBox chckbxSendget = new JCheckBox("Send/Get");
				GridBagConstraints gbc_chckbxSendget = new GridBagConstraints();
				gbc_chckbxSendget.fill = GridBagConstraints.BOTH;
				gbc_chckbxSendget.gridx = 0;
				gbc_chckbxSendget.gridy = 3;
				panel.add(chckbxSendget, gbc_chckbxSendget);
			}
			{
				JCheckBox chckbxChat = new JCheckBox("Chat");
				GridBagConstraints gbc_chckbxChat = new GridBagConstraints();
				gbc_chckbxChat.fill = GridBagConstraints.BOTH;
				gbc_chckbxChat.gridx = 0;
				gbc_chckbxChat.gridy = 4;
				panel.add(chckbxChat, gbc_chckbxChat);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Private tips:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridheight = 2;
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 4;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0};
			gbl_panel.rowHeights = new int[]{0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 1.0};
			gbl_panel.rowWeights = new double[]{1.0, 1.0};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxMessage_1 = new JCheckBox("Message");
				GridBagConstraints gbc_chckbxMessage_1 = new GridBagConstraints();
				gbc_chckbxMessage_1.fill = GridBagConstraints.BOTH;
				gbc_chckbxMessage_1.gridx = 0;
				gbc_chckbxMessage_1.gridy = 0;
				panel.add(chckbxMessage_1, gbc_chckbxMessage_1);
			}
			{
				JCheckBox chckbxCtcp_1 = new JCheckBox("Ctcp");
				GridBagConstraints gbc_chckbxCtcp_1 = new GridBagConstraints();
				gbc_chckbxCtcp_1.fill = GridBagConstraints.BOTH;
				gbc_chckbxCtcp_1.gridx = 1;
				gbc_chckbxCtcp_1.gridy = 0;
				panel.add(chckbxCtcp_1, gbc_chckbxCtcp_1);
			}
			{
				JCheckBox txtpnNotice = new JCheckBox();
				txtpnNotice.setAlignmentX(Component.CENTER_ALIGNMENT);
				txtpnNotice.setText("Notice");
				GridBagConstraints gbc_txtpnNotice = new GridBagConstraints();
				gbc_txtpnNotice.fill = GridBagConstraints.BOTH;
				gbc_txtpnNotice.gridx = 0;
				gbc_txtpnNotice.gridy = 1;
				panel.add(txtpnNotice, gbc_txtpnNotice);
			}
			{
				JCheckBox chckbxNick_1 = new JCheckBox("Nick");
				GridBagConstraints gbc_chckbxNick_1 = new GridBagConstraints();
				gbc_chckbxNick_1.fill = GridBagConstraints.BOTH;
				gbc_chckbxNick_1.gridx = 1;
				gbc_chckbxNick_1.gridy = 1;
				panel.add(chckbxNick_1, gbc_chckbxNick_1);
			}
		}
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridheight = 2;
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 1;
			gbc_panel.gridy = 4;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0};
			gbl_panel.rowWeights = new double[]{1.0, 1.0};
			panel.setLayout(gbl_panel);
			{
				JLabel lblQueue = new JLabel("Queue:");
				lblQueue.setHorizontalAlignment(SwingConstants.RIGHT);
				GridBagConstraints gbc_lblQueue = new GridBagConstraints();
				gbc_lblQueue.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblQueue.insets = new Insets(14, 0, 0, 5);
				gbc_lblQueue.gridx = 0;
				gbc_lblQueue.gridy = 0;
				panel.add(lblQueue, gbc_lblQueue);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setEditable(true);
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.insets = new Insets(14, 0, 0, 5);
				gbc_comboBox.gridx = 1;
				gbc_comboBox.gridy = 0;
				panel.add(comboBox, gbc_comboBox);
			}
			{
				JLabel lblTips = new JLabel("tips");
				GridBagConstraints gbc_lblTips = new GridBagConstraints();
				gbc_lblTips.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblTips.insets= new Insets(14, 0, 0, 0);
				gbc_lblTips.gridx = 2;
				gbc_lblTips.gridy = 0;
				panel.add(lblTips, gbc_lblTips);
			}
			{
				JLabel lblShowFor = new JLabel("Show for:");
				lblShowFor.setHorizontalAlignment(SwingConstants.RIGHT);
				GridBagConstraints gbc_lblShowFor = new GridBagConstraints();
				gbc_lblShowFor.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblShowFor.insets = new Insets(0, 0, 7, 5);
				gbc_lblShowFor.gridx = 0;
				gbc_lblShowFor.gridy = 1;
				panel.add(lblShowFor, gbc_lblShowFor);
			}
			{
				JComboBox comboBox = new JComboBox();
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.insets = new Insets(0, 0, 7, 5);
				gbc_comboBox.gridx = 1;
				gbc_comboBox.gridy = 1;
				panel.add(comboBox, gbc_comboBox);
			}
			{
				JLabel lblSecs = new JLabel("secs");
				GridBagConstraints gbc_lblSecs = new GridBagConstraints();
				gbc_lblSecs.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblSecs.gridx = 2;
				gbc_lblSecs.gridy = 1;
				panel.add(lblSecs, gbc_lblSecs);
			}
		}
		{
			JCheckBox chckbxHideTipsWhen = new JCheckBox("Hide tips when full screen application is active");
			GridBagConstraints gbc_chckbxHideTipsWhen = new GridBagConstraints();
			gbc_chckbxHideTipsWhen.fill = GridBagConstraints.BOTH;
			gbc_chckbxHideTipsWhen.gridwidth = 2;
			gbc_chckbxHideTipsWhen.gridx = 0;
			gbc_chckbxHideTipsWhen.gridy = 6;
			contentPanel.add(chckbxHideTipsWhen, gbc_chckbxHideTipsWhen);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			GridBagConstraints gbc_buttonPane = new GridBagConstraints();
			gbc_buttonPane.anchor = GridBagConstraints.NORTH;
			gbc_buttonPane.fill = GridBagConstraints.HORIZONTAL;
			gbc_buttonPane.gridx = 0;
			gbc_buttonPane.gridy = 1;
			getContentPane().add(buttonPane, gbc_buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.setPreferredSize(new Dimension(75, 23));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setPreferredSize(new Dimension(75, 23));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
