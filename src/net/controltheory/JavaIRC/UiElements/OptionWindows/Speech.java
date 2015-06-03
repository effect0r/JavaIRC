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
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Dialog.ModalExclusionType;

public class Speech extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	public Speech() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Speech Options");
		setBounds(100, 100, 370, 290);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Speech options:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 0;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblSpeed = new JLabel("Speed:");
				GridBagConstraints gbc_lblSpeed = new GridBagConstraints();
				gbc_lblSpeed.anchor = GridBagConstraints.EAST;
				gbc_lblSpeed.insets = new Insets(5, 5, 5, 5);
				gbc_lblSpeed.gridx = 0;
				gbc_lblSpeed.gridy = 0;
				panel.add(lblSpeed, gbc_lblSpeed);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%"}));
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.anchor = GridBagConstraints.WEST;
				gbc_comboBox.insets = new Insets(0, 0, 5, 0);
				gbc_comboBox.gridx = 1;
				gbc_comboBox.gridy = 0;
				panel.add(comboBox, gbc_comboBox);
			}
			{
				JLabel lblPitch = new JLabel("Pitch:");
				GridBagConstraints gbc_lblPitch = new GridBagConstraints();
				gbc_lblPitch.anchor = GridBagConstraints.EAST;
				gbc_lblPitch.insets = new Insets(0, 0, 0, 5);
				gbc_lblPitch.gridx = 0;
				gbc_lblPitch.gridy = 1;
				panel.add(lblPitch, gbc_lblPitch);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%"}));
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.anchor = GridBagConstraints.WEST;
				gbc_comboBox.gridx = 1;
				gbc_comboBox.gridy = 1;
				panel.add(comboBox, gbc_comboBox);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridwidth = 2;
			gbc_panel.gridx = 1;
			gbc_panel.gridheight = 3;
			gbc_panel.gridy = 0;
			contentPanel.add(panel, gbc_panel);
			{
				JCheckBox chckbxIncreaseTalkingSpeed = new JCheckBox("Increase talking speed to:");
				chckbxIncreaseTalkingSpeed.setBounds(4, -1, 151, 23);
				panel.add(chckbxIncreaseTalkingSpeed);
			}
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%"}));
			comboBox.setBounds(161, 0, 54, 20);
			panel.add(comboBox);
			
			JLabel lblIfMoreThan = new JLabel("if more than");
			lblIfMoreThan.setBounds(18, 25, 58, 14);
			panel.add(lblIfMoreThan);
			
			textField = new JTextField();
			textField.setText("10");
			textField.setBounds(82, 22, 30, 20);
			panel.add(textField);
			textField.setColumns(10);
			
			JLabel lblLinesAreQueued = new JLabel("lines are queued");
			lblLinesAreQueued.setBounds(121, 25, 79, 14);
			panel.add(lblLinesAreQueued);
			
			JLabel lblMaxLinesTo = new JLabel("Max. lines to queue:");
			lblMaxLinesTo.setBounds(22, 60, 98, 14);
			panel.add(lblMaxLinesTo);
			
			textField_1 = new JTextField();
			textField_1.setText("50");
			textField_1.setBounds(131, 57, 24, 20);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JCheckBox chckbxIgnoreMessageIf = new JCheckBox("Ignore message if it is more than");
			chckbxIgnoreMessageIf.setBounds(4, 93, 183, 23);
			panel.add(chckbxIgnoreMessageIf);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%"}));
			comboBox_1.setBounds(22, 123, 54, 20);
			panel.add(comboBox_1);
			
			JLabel lblNontext = new JLabel("non-text");
			lblNontext.setBounds(86, 126, 46, 14);
			panel.add(lblNontext);
			
			JCheckBox chckbxonlySpeakChannel = new JCheckBox("<html>Only speak channel name if it has changed since the last message");
			chckbxonlySpeakChannel.setBounds(4, 150, 201, 37);
			panel.add(chckbxonlySpeakChannel);
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Lowercase:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 1;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxNicknames = new JCheckBox("Nicknames");
				GridBagConstraints gbc_chckbxNicknames = new GridBagConstraints();
				gbc_chckbxNicknames.anchor = GridBagConstraints.WEST;
				gbc_chckbxNicknames.insets = new Insets(0, 0, 5, 0);
				gbc_chckbxNicknames.gridx = 0;
				gbc_chckbxNicknames.gridy = 0;
				panel.add(chckbxNicknames, gbc_chckbxNicknames);
			}
			{
				JCheckBox chckbxChannelNames = new JCheckBox("Channel names");
				GridBagConstraints gbc_chckbxChannelNames = new GridBagConstraints();
				gbc_chckbxChannelNames.anchor = GridBagConstraints.WEST;
				gbc_chckbxChannelNames.insets = new Insets(0, 0, 5, 0);
				gbc_chckbxChannelNames.gridx = 0;
				gbc_chckbxChannelNames.gridy = 1;
				panel.add(chckbxChannelNames, gbc_chckbxChannelNames);
			}
			{
				JCheckBox chckbxMessages = new JCheckBox("Messages");
				GridBagConstraints gbc_chckbxMessages = new GridBagConstraints();
				gbc_chckbxMessages.anchor = GridBagConstraints.WEST;
				gbc_chckbxMessages.gridx = 0;
				gbc_chckbxMessages.gridy = 2;
				panel.add(chckbxMessages, gbc_chckbxMessages);
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
