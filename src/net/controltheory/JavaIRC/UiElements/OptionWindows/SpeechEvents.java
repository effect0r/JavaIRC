package net.controltheory.JavaIRC.UiElements.OptionWindows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import java.awt.Dialog.ModalExclusionType;

public class SpeechEvents extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public SpeechEvents() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Speech Events");
		setBounds(100, 100, 315, 274);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Speak channel:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridheight = 2;
			gbc_panel.insets = new Insets(0, 0, 5, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 0;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxMessage = new JCheckBox("Message");
				GridBagConstraints gbc_chckbxMessage = new GridBagConstraints();
				gbc_chckbxMessage.anchor = GridBagConstraints.WEST;
				gbc_chckbxMessage.insets = new Insets(0, 0, 5, 5);
				gbc_chckbxMessage.gridx = 0;
				gbc_chckbxMessage.gridy = 0;
				panel.add(chckbxMessage, gbc_chckbxMessage);
			}
			{
				JCheckBox chckbxMode = new JCheckBox("Mode");
				GridBagConstraints gbc_chckbxMode = new GridBagConstraints();
				gbc_chckbxMode.insets = new Insets(0, 0, 5, 0);
				gbc_chckbxMode.anchor = GridBagConstraints.WEST;
				gbc_chckbxMode.gridx = 1;
				gbc_chckbxMode.gridy = 0;
				panel.add(chckbxMode, gbc_chckbxMode);
			}
			{
				JCheckBox chckbxNotice = new JCheckBox("Notice");
				GridBagConstraints gbc_chckbxNotice = new GridBagConstraints();
				gbc_chckbxNotice.anchor = GridBagConstraints.WEST;
				gbc_chckbxNotice.insets = new Insets(0, 0, 5, 5);
				gbc_chckbxNotice.gridx = 0;
				gbc_chckbxNotice.gridy = 1;
				panel.add(chckbxNotice, gbc_chckbxNotice);
			}
			{
				JCheckBox chckbxTopic = new JCheckBox("Topic");
				GridBagConstraints gbc_chckbxTopic = new GridBagConstraints();
				gbc_chckbxTopic.anchor = GridBagConstraints.WEST;
				gbc_chckbxTopic.insets = new Insets(0, 0, 5, 0);
				gbc_chckbxTopic.gridx = 1;
				gbc_chckbxTopic.gridy = 1;
				panel.add(chckbxTopic, gbc_chckbxTopic);
			}
			{
				JCheckBox chckbxCtcp = new JCheckBox("Ctcp");
				GridBagConstraints gbc_chckbxCtcp = new GridBagConstraints();
				gbc_chckbxCtcp.anchor = GridBagConstraints.WEST;
				gbc_chckbxCtcp.insets = new Insets(0, 0, 5, 5);
				gbc_chckbxCtcp.gridx = 0;
				gbc_chckbxCtcp.gridy = 2;
				panel.add(chckbxCtcp, gbc_chckbxCtcp);
			}
			{
				JCheckBox chckbxNick = new JCheckBox("Nick");
				GridBagConstraints gbc_chckbxNick = new GridBagConstraints();
				gbc_chckbxNick.anchor = GridBagConstraints.WEST;
				gbc_chckbxNick.insets = new Insets(0, 0, 5, 0);
				gbc_chckbxNick.gridx = 1;
				gbc_chckbxNick.gridy = 2;
				panel.add(chckbxNick, gbc_chckbxNick);
			}
			{
				JCheckBox chckbxJoinpart = new JCheckBox("Join/Part");
				GridBagConstraints gbc_chckbxJoinpart = new GridBagConstraints();
				gbc_chckbxJoinpart.anchor = GridBagConstraints.WEST;
				gbc_chckbxJoinpart.insets = new Insets(0, 0, 5, 5);
				gbc_chckbxJoinpart.gridx = 0;
				gbc_chckbxJoinpart.gridy = 3;
				panel.add(chckbxJoinpart, gbc_chckbxJoinpart);
			}
			{
				JCheckBox chckbxQuit = new JCheckBox("Quit");
				GridBagConstraints gbc_chckbxQuit = new GridBagConstraints();
				gbc_chckbxQuit.anchor = GridBagConstraints.WEST;
				gbc_chckbxQuit.insets = new Insets(0, 0, 5, 0);
				gbc_chckbxQuit.gridx = 1;
				gbc_chckbxQuit.gridy = 3;
				panel.add(chckbxQuit, gbc_chckbxQuit);
			}
			{
				JCheckBox chckbxKick = new JCheckBox("Kick");
				GridBagConstraints gbc_chckbxKick = new GridBagConstraints();
				gbc_chckbxKick.anchor = GridBagConstraints.WEST;
				gbc_chckbxKick.insets = new Insets(0, 0, 0, 5);
				gbc_chckbxKick.gridx = 0;
				gbc_chckbxKick.gridy = 4;
				panel.add(chckbxKick, gbc_chckbxKick);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Speak other:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridheight = 2;
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 1;
			gbc_panel.gridy = 0;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxConnect = new JCheckBox("Connect");
				GridBagConstraints gbc_chckbxConnect = new GridBagConstraints();
				gbc_chckbxConnect.anchor = GridBagConstraints.WEST;
				gbc_chckbxConnect.insets = new Insets(0, 0, 5, 5);
				gbc_chckbxConnect.gridx = 0;
				gbc_chckbxConnect.gridy = 0;
				panel.add(chckbxConnect, gbc_chckbxConnect);
			}
			{
				JCheckBox chckbxInvite = new JCheckBox("Invite");
				GridBagConstraints gbc_chckbxInvite = new GridBagConstraints();
				gbc_chckbxInvite.anchor = GridBagConstraints.WEST;
				gbc_chckbxInvite.insets = new Insets(0, 0, 5, 0);
				gbc_chckbxInvite.gridx = 1;
				gbc_chckbxInvite.gridy = 0;
				panel.add(chckbxInvite, gbc_chckbxInvite);
			}
			{
				JCheckBox chckbxNotice_1 = new JCheckBox("Notice");
				GridBagConstraints gbc_chckbxNotice_1 = new GridBagConstraints();
				gbc_chckbxNotice_1.anchor = GridBagConstraints.WEST;
				gbc_chckbxNotice_1.insets = new Insets(0, 0, 5, 5);
				gbc_chckbxNotice_1.gridx = 0;
				gbc_chckbxNotice_1.gridy = 1;
				panel.add(chckbxNotice_1, gbc_chckbxNotice_1);
			}
			{
				JCheckBox chckbxAway = new JCheckBox("Away");
				GridBagConstraints gbc_chckbxAway = new GridBagConstraints();
				gbc_chckbxAway.anchor = GridBagConstraints.WEST;
				gbc_chckbxAway.insets = new Insets(0, 0, 5, 0);
				gbc_chckbxAway.gridx = 1;
				gbc_chckbxAway.gridy = 1;
				panel.add(chckbxAway, gbc_chckbxAway);
			}
			{
				JCheckBox chckbxNotify = new JCheckBox("Notify");
				GridBagConstraints gbc_chckbxNotify = new GridBagConstraints();
				gbc_chckbxNotify.anchor = GridBagConstraints.WEST;
				gbc_chckbxNotify.insets = new Insets(0, 0, 5, 5);
				gbc_chckbxNotify.gridx = 0;
				gbc_chckbxNotify.gridy = 2;
				panel.add(chckbxNotify, gbc_chckbxNotify);
			}
			{
				JCheckBox chckbxList = new JCheckBox("List");
				GridBagConstraints gbc_chckbxList = new GridBagConstraints();
				gbc_chckbxList.anchor = GridBagConstraints.WEST;
				gbc_chckbxList.insets = new Insets(0, 0, 5, 0);
				gbc_chckbxList.gridx = 1;
				gbc_chckbxList.gridy = 2;
				panel.add(chckbxList, gbc_chckbxList);
			}
			{
				JCheckBox chckbxSendget = new JCheckBox("Send/Get");
				GridBagConstraints gbc_chckbxSendget = new GridBagConstraints();
				gbc_chckbxSendget.anchor = GridBagConstraints.WEST;
				gbc_chckbxSendget.insets = new Insets(0, 0, 5, 5);
				gbc_chckbxSendget.gridx = 0;
				gbc_chckbxSendget.gridy = 3;
				panel.add(chckbxSendget, gbc_chckbxSendget);
			}
			{
				JCheckBox chckbxChat = new JCheckBox("Chat");
				GridBagConstraints gbc_chckbxChat = new GridBagConstraints();
				gbc_chckbxChat.anchor = GridBagConstraints.WEST;
				gbc_chckbxChat.insets = new Insets(0, 0, 0, 5);
				gbc_chckbxChat.gridx = 0;
				gbc_chckbxChat.gridy = 4;
				panel.add(chckbxChat, gbc_chckbxChat);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Speak private:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 0, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 2;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxMessage_1 = new JCheckBox("Message");
				GridBagConstraints gbc_chckbxMessage_1 = new GridBagConstraints();
				gbc_chckbxMessage_1.anchor = GridBagConstraints.WEST;
				gbc_chckbxMessage_1.insets = new Insets(0, 0, 5, 5);
				gbc_chckbxMessage_1.gridx = 0;
				gbc_chckbxMessage_1.gridy = 0;
				panel.add(chckbxMessage_1, gbc_chckbxMessage_1);
			}
			{
				JCheckBox chckbxCtcp_1 = new JCheckBox("Ctcp");
				GridBagConstraints gbc_chckbxCtcp_1 = new GridBagConstraints();
				gbc_chckbxCtcp_1.anchor = GridBagConstraints.WEST;
				gbc_chckbxCtcp_1.insets = new Insets(0, 0, 5, 0);
				gbc_chckbxCtcp_1.gridx = 1;
				gbc_chckbxCtcp_1.gridy = 0;
				panel.add(chckbxCtcp_1, gbc_chckbxCtcp_1);
			}
			{
				JCheckBox chckbxNotice_2 = new JCheckBox("Notice");
				GridBagConstraints gbc_chckbxNotice_2 = new GridBagConstraints();
				gbc_chckbxNotice_2.anchor = GridBagConstraints.WEST;
				gbc_chckbxNotice_2.insets = new Insets(0, 0, 0, 5);
				gbc_chckbxNotice_2.gridx = 0;
				gbc_chckbxNotice_2.gridy = 1;
				panel.add(chckbxNotice_2, gbc_chckbxNotice_2);
			}
			{
				JCheckBox chckbxNick_1 = new JCheckBox("Nick");
				GridBagConstraints gbc_chckbxNick_1 = new GridBagConstraints();
				gbc_chckbxNick_1.anchor = GridBagConstraints.WEST;
				gbc_chckbxNick_1.gridx = 1;
				gbc_chckbxNick_1.gridy = 1;
				panel.add(chckbxNick_1, gbc_chckbxNick_1);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
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
