package net.controltheory.JavaIRC.UiElements.OptionWindows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Windows extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	public Windows() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Windows");
		setBounds(100, 100, 296, 321);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblOpenTheFollowing = new JLabel("Open the following windows on the desktop:");
			GridBagConstraints gbc_lblOpenTheFollowing = new GridBagConstraints();
			gbc_lblOpenTheFollowing.insets = new Insets(0, 0, 5, 0);
			gbc_lblOpenTheFollowing.anchor = GridBagConstraints.WEST;
			gbc_lblOpenTheFollowing.gridwidth = 4;
			gbc_lblOpenTheFollowing.gridx = 0;
			gbc_lblOpenTheFollowing.gridy = 0;
			contentPanel.add(lblOpenTheFollowing, gbc_lblOpenTheFollowing);
		}
		{
			JCheckBox chckbxStatus = new JCheckBox("Status");
			GridBagConstraints gbc_chckbxStatus = new GridBagConstraints();
			gbc_chckbxStatus.anchor = GridBagConstraints.WEST;
			gbc_chckbxStatus.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxStatus.gridx = 0;
			gbc_chckbxStatus.gridy = 1;
			contentPanel.add(chckbxStatus, gbc_chckbxStatus);
		}
		{
			JCheckBox chckbxSendget = new JCheckBox("Send/Get");
			GridBagConstraints gbc_chckbxSendget = new GridBagConstraints();
			gbc_chckbxSendget.anchor = GridBagConstraints.WEST;
			gbc_chckbxSendget.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxSendget.gridx = 1;
			gbc_chckbxSendget.gridy = 1;
			contentPanel.add(chckbxSendget, gbc_chckbxSendget);
		}
		{
			JCheckBox chckbxLinksList = new JCheckBox("Links List");
			GridBagConstraints gbc_chckbxLinksList = new GridBagConstraints();
			gbc_chckbxLinksList.anchor = GridBagConstraints.WEST;
			gbc_chckbxLinksList.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxLinksList.gridx = 2;
			gbc_chckbxLinksList.gridy = 1;
			contentPanel.add(chckbxLinksList, gbc_chckbxLinksList);
		}
		{
			JCheckBox chckbxQuery = new JCheckBox("Query");
			GridBagConstraints gbc_chckbxQuery = new GridBagConstraints();
			gbc_chckbxQuery.anchor = GridBagConstraints.WEST;
			gbc_chckbxQuery.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxQuery.gridx = 0;
			gbc_chckbxQuery.gridy = 2;
			contentPanel.add(chckbxQuery, gbc_chckbxQuery);
		}
		{
			JCheckBox chckbxChat = new JCheckBox("Chat");
			GridBagConstraints gbc_chckbxChat = new GridBagConstraints();
			gbc_chckbxChat.anchor = GridBagConstraints.WEST;
			gbc_chckbxChat.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxChat.gridx = 1;
			gbc_chckbxChat.gridy = 2;
			contentPanel.add(chckbxChat, gbc_chckbxChat);
		}
		{
			JCheckBox chckbxChannelsList = new JCheckBox("Channels List");
			GridBagConstraints gbc_chckbxChannelsList = new GridBagConstraints();
			gbc_chckbxChannelsList.anchor = GridBagConstraints.WEST;
			gbc_chckbxChannelsList.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxChannelsList.gridx = 2;
			gbc_chckbxChannelsList.gridy = 2;
			contentPanel.add(chckbxChannelsList, gbc_chckbxChannelsList);
		}
		{
			JCheckBox chckbxChannels = new JCheckBox("Channels");
			GridBagConstraints gbc_chckbxChannels = new GridBagConstraints();
			gbc_chckbxChannels.anchor = GridBagConstraints.WEST;
			gbc_chckbxChannels.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxChannels.gridx = 0;
			gbc_chckbxChannels.gridy = 3;
			contentPanel.add(chckbxChannels, gbc_chckbxChannels);
		}
		{
			JCheckBox chckbxFileServer = new JCheckBox("File Server");
			GridBagConstraints gbc_chckbxFileServer = new GridBagConstraints();
			gbc_chckbxFileServer.anchor = GridBagConstraints.WEST;
			gbc_chckbxFileServer.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxFileServer.gridx = 1;
			gbc_chckbxFileServer.gridy = 3;
			contentPanel.add(chckbxFileServer, gbc_chckbxFileServer);
		}
		{
			JCheckBox chckbxUrlsList = new JCheckBox("Urls List");
			GridBagConstraints gbc_chckbxUrlsList = new GridBagConstraints();
			gbc_chckbxUrlsList.anchor = GridBagConstraints.WEST;
			gbc_chckbxUrlsList.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxUrlsList.gridx = 2;
			gbc_chckbxUrlsList.gridy = 3;
			contentPanel.add(chckbxUrlsList, gbc_chckbxUrlsList);
		}
		{
			JCheckBox chckbxNotifyList = new JCheckBox("Notify List");
			GridBagConstraints gbc_chckbxNotifyList = new GridBagConstraints();
			gbc_chckbxNotifyList.anchor = GridBagConstraints.WEST;
			gbc_chckbxNotifyList.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxNotifyList.gridx = 2;
			gbc_chckbxNotifyList.gridy = 4;
			contentPanel.add(chckbxNotifyList, gbc_chckbxNotifyList);
		}
		{
			JCheckBox chckbxOpenWindowsOn = new JCheckBox("Open windows on top by default");
			GridBagConstraints gbc_chckbxOpenWindowsOn = new GridBagConstraints();
			gbc_chckbxOpenWindowsOn.insets = new Insets(0, 0, 5, 0);
			gbc_chckbxOpenWindowsOn.anchor = GridBagConstraints.WEST;
			gbc_chckbxOpenWindowsOn.gridwidth = 4;
			gbc_chckbxOpenWindowsOn.gridx = 0;
			gbc_chckbxOpenWindowsOn.gridy = 5;
			contentPanel.add(chckbxOpenWindowsOn, gbc_chckbxOpenWindowsOn);
		}
		{
			JCheckBox chckbxJavaircMainWindow = new JCheckBox("JavaIRC main window always on top");
			GridBagConstraints gbc_chckbxJavaircMainWindow = new GridBagConstraints();
			gbc_chckbxJavaircMainWindow.insets = new Insets(0, 0, 5, 0);
			gbc_chckbxJavaircMainWindow.anchor = GridBagConstraints.WEST;
			gbc_chckbxJavaircMainWindow.gridwidth = 4;
			gbc_chckbxJavaircMainWindow.gridx = 0;
			gbc_chckbxJavaircMainWindow.gridy = 6;
			contentPanel.add(chckbxJavaircMainWindow, gbc_chckbxJavaircMainWindow);
		}
		{
			JCheckBox chckbxHideMinimizedDesktop = new JCheckBox("Hide minimized desktop windows");
			GridBagConstraints gbc_chckbxHideMinimizedDesktop = new GridBagConstraints();
			gbc_chckbxHideMinimizedDesktop.insets = new Insets(0, 0, 5, 0);
			gbc_chckbxHideMinimizedDesktop.anchor = GridBagConstraints.WEST;
			gbc_chckbxHideMinimizedDesktop.gridwidth = 4;
			gbc_chckbxHideMinimizedDesktop.gridx = 0;
			gbc_chckbxHideMinimizedDesktop.gridy = 7;
			contentPanel.add(chckbxHideMinimizedDesktop, gbc_chckbxHideMinimizedDesktop);
		}
		{
			JCheckBox chckbxMinimizeJavaircOn = new JCheckBox("Minimize JavaIRC on close");
			GridBagConstraints gbc_chckbxMinimizeJavaircOn = new GridBagConstraints();
			gbc_chckbxMinimizeJavaircOn.insets = new Insets(0, 0, 5, 0);
			gbc_chckbxMinimizeJavaircOn.anchor = GridBagConstraints.WEST;
			gbc_chckbxMinimizeJavaircOn.gridwidth = 4;
			gbc_chckbxMinimizeJavaircOn.gridx = 0;
			gbc_chckbxMinimizeJavaircOn.gridy = 8;
			contentPanel.add(chckbxMinimizeJavaircOn, gbc_chckbxMinimizeJavaircOn);
		}
		{
			JLabel lblTransparencyForDesktop = new JLabel("Transparency for desktop windows:");
			GridBagConstraints gbc_lblTransparencyForDesktop = new GridBagConstraints();
			gbc_lblTransparencyForDesktop.anchor = GridBagConstraints.EAST;
			gbc_lblTransparencyForDesktop.gridwidth = 2;
			gbc_lblTransparencyForDesktop.insets = new Insets(0, 0, 0, 5);
			gbc_lblTransparencyForDesktop.gridx = 0;
			gbc_lblTransparencyForDesktop.gridy = 9;
			contentPanel.add(lblTransparencyForDesktop, gbc_lblTransparencyForDesktop);
		}
		{
			JComboBox<String> comboBox = new JComboBox<>();
			comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"0%", "5%", "10%", "15%", "20%", "25%", "35%", "40%", "45%", "50%", "55%", "60%", "65%", "70%", "75%"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 0, 5);
			gbc_comboBox.anchor = GridBagConstraints.WEST;
			gbc_comboBox.gridx = 2;
			gbc_comboBox.gridy = 9;
			contentPanel.add(comboBox, gbc_comboBox);
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
