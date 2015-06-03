package net.controltheory.JavaIRC.UiElements.OptionWindows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Dialog.ModalExclusionType;

public class Confirm extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	public Confirm() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Confirm");
		setBounds(100, 100, 236, 328);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "When closing status window, confirm if:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 0;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxOnAChannel = new JCheckBox("On a channel");
				GridBagConstraints gbc_chckbxOnAChannel = new GridBagConstraints();
				gbc_chckbxOnAChannel.anchor = GridBagConstraints.WEST;
				gbc_chckbxOnAChannel.insets = new Insets(0, 0, 0, 5);
				gbc_chckbxOnAChannel.gridx = 0;
				gbc_chckbxOnAChannel.gridy = 0;
				panel.add(chckbxOnAChannel, gbc_chckbxOnAChannel);
			}
			{
				JCheckBox chckbxQueryOpen = new JCheckBox("Query open");
				GridBagConstraints gbc_chckbxQueryOpen = new GridBagConstraints();
				gbc_chckbxQueryOpen.anchor = GridBagConstraints.WEST;
				gbc_chckbxQueryOpen.gridx = 1;
				gbc_chckbxQueryOpen.gridy = 0;
				panel.add(chckbxQueryOpen, gbc_chckbxQueryOpen);
			}
			{
				JCheckBox chckbxStillConnected = new JCheckBox("Still connected");
				GridBagConstraints gbc_chckbxStillConnected = new GridBagConstraints();
				gbc_chckbxStillConnected.anchor = GridBagConstraints.WEST;
				gbc_chckbxStillConnected.insets = new Insets(0, 0, 0, 5);
				gbc_chckbxStillConnected.gridx = 0;
				gbc_chckbxStillConnected.gridy = 1;
				panel.add(chckbxStillConnected, gbc_chckbxStillConnected);
			}
			{
				JCheckBox chckbxAlways = new JCheckBox("Always");
				GridBagConstraints gbc_chckbxAlways = new GridBagConstraints();
				gbc_chckbxAlways.anchor = GridBagConstraints.WEST;
				gbc_chckbxAlways.gridx = 1;
				gbc_chckbxAlways.gridy = 1;
				panel.add(chckbxAlways, gbc_chckbxAlways);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "When closing JavaIRC, confirm if:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 1;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxOnAChannel_1 = new JCheckBox("On a channel");
				GridBagConstraints gbc_chckbxOnAChannel_1 = new GridBagConstraints();
				gbc_chckbxOnAChannel_1.anchor = GridBagConstraints.WEST;
				gbc_chckbxOnAChannel_1.insets = new Insets(0, 0, 0, 5);
				gbc_chckbxOnAChannel_1.gridx = 0;
				gbc_chckbxOnAChannel_1.gridy = 0;
				panel.add(chckbxOnAChannel_1, gbc_chckbxOnAChannel_1);
			}
			{
				JCheckBox chckbxQueryOpen_1 = new JCheckBox("Query open");
				GridBagConstraints gbc_chckbxQueryOpen_1 = new GridBagConstraints();
				gbc_chckbxQueryOpen_1.anchor = GridBagConstraints.WEST;
				gbc_chckbxQueryOpen_1.gridx = 1;
				gbc_chckbxQueryOpen_1.gridy = 0;
				panel.add(chckbxQueryOpen_1, gbc_chckbxQueryOpen_1);
			}
			{
				JCheckBox chckbxStillConnected_1 = new JCheckBox("Still connected");
				GridBagConstraints gbc_chckbxStillConnected_1 = new GridBagConstraints();
				gbc_chckbxStillConnected_1.anchor = GridBagConstraints.WEST;
				gbc_chckbxStillConnected_1.insets = new Insets(0, 0, 0, 5);
				gbc_chckbxStillConnected_1.gridx = 0;
				gbc_chckbxStillConnected_1.gridy = 1;
				panel.add(chckbxStillConnected_1, gbc_chckbxStillConnected_1);
			}
			{
				JCheckBox chckbxChatOpen = new JCheckBox("Chat open");
				GridBagConstraints gbc_chckbxChatOpen = new GridBagConstraints();
				gbc_chckbxChatOpen.anchor = GridBagConstraints.WEST;
				gbc_chckbxChatOpen.gridx = 1;
				gbc_chckbxChatOpen.gridy = 1;
				panel.add(chckbxChatOpen, gbc_chckbxChatOpen);
			}
			{
				JCheckBox chckbxDccTransfers = new JCheckBox("DCC transfers");
				GridBagConstraints gbc_chckbxDccTransfers = new GridBagConstraints();
				gbc_chckbxDccTransfers.anchor = GridBagConstraints.WEST;
				gbc_chckbxDccTransfers.insets = new Insets(0, 0, 0, 5);
				gbc_chckbxDccTransfers.gridx = 0;
				gbc_chckbxDccTransfers.gridy = 2;
				panel.add(chckbxDccTransfers, gbc_chckbxDccTransfers);
			}
			{
				JCheckBox chckbxAlways_1 = new JCheckBox("Always");
				GridBagConstraints gbc_chckbxAlways_1 = new GridBagConstraints();
				gbc_chckbxAlways_1.anchor = GridBagConstraints.WEST;
				gbc_chckbxAlways_1.gridx = 1;
				gbc_chckbxAlways_1.gridy = 2;
				panel.add(chckbxAlways_1, gbc_chckbxAlways_1);
			}
			{
				JCheckBox chckbxSongPlaying = new JCheckBox("Song playing");
				GridBagConstraints gbc_chckbxSongPlaying = new GridBagConstraints();
				gbc_chckbxSongPlaying.anchor = GridBagConstraints.WEST;
				gbc_chckbxSongPlaying.insets = new Insets(0, 0, 0, 5);
				gbc_chckbxSongPlaying.gridx = 0;
				gbc_chckbxSongPlaying.gridy = 3;
				panel.add(chckbxSongPlaying, gbc_chckbxSongPlaying);
			}
		}
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 2;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{138, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxconfirmToolbarDisconnect = new JCheckBox("<html>Confirm toolbar disconnect button with second click</html>");
				GridBagConstraints gbc_chckbxconfirmToolbarDisconnect = new GridBagConstraints();
				gbc_chckbxconfirmToolbarDisconnect.gridwidth = 2;
				gbc_chckbxconfirmToolbarDisconnect.fill = GridBagConstraints.HORIZONTAL;
				gbc_chckbxconfirmToolbarDisconnect.gridx = 0;
				gbc_chckbxconfirmToolbarDisconnect.gridy = 0;
				panel.add(chckbxconfirmToolbarDisconnect, gbc_chckbxconfirmToolbarDisconnect);
			}
			{
				JCheckBox chckbxconfirmWhenPasting = new JCheckBox("<html>Confirm when pasting or more lines of text");
				GridBagConstraints gbc_chckbxconfirmWhenPasting = new GridBagConstraints();
				gbc_chckbxconfirmWhenPasting.fill = GridBagConstraints.HORIZONTAL;
				gbc_chckbxconfirmWhenPasting.insets = new Insets(0, 0, 0, 5);
				gbc_chckbxconfirmWhenPasting.gridx = 0;
				gbc_chckbxconfirmWhenPasting.gridy = 1;
				panel.add(chckbxconfirmWhenPasting, gbc_chckbxconfirmWhenPasting);
			}
			{
				textField = new JTextField();
				textField.setMinimumSize(new Dimension(30, 20));
				textField.setPreferredSize(new Dimension(20, 20));
				textField.setText("10");
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.anchor = GridBagConstraints.WEST;
				gbc_textField.gridx = 1;
				gbc_textField.gridy = 1;
				panel.add(textField, gbc_textField);
				textField.setColumns(10);
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
