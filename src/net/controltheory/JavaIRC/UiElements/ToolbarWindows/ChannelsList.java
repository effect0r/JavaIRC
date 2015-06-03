package net.controltheory.JavaIRC.UiElements.ToolbarWindows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class ChannelsList extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public ChannelsList() {
		setResizable(false);
		setTitle("JavaIRC Channels List");
		setBounds(100, 100, 262, 320);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lbllistAllChannels = new JLabel("<html>List all channels that match the following criteria.</html>");
			GridBagConstraints gbc_lbllistAllChannels = new GridBagConstraints();
			gbc_lbllistAllChannels.gridwidth = 4;
			gbc_lbllistAllChannels.fill = GridBagConstraints.BOTH;
			gbc_lbllistAllChannels.insets = new Insets(5, 5, 5, 5);
			gbc_lbllistAllChannels.gridx = 0;
			gbc_lbllistAllChannels.gridy = 0;
			contentPanel.add(lbllistAllChannels, gbc_lbllistAllChannels);
		}
		{
			JLabel lblFile = new JLabel("File:");
			GridBagConstraints gbc_lblFile = new GridBagConstraints();
			gbc_lblFile.anchor = GridBagConstraints.SOUTH;
			gbc_lblFile.gridwidth = 5;
			gbc_lblFile.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblFile.insets = new Insets(0, 5, 5, 0);
			gbc_lblFile.gridx = 0;
			gbc_lblFile.gridy = 1;
			contentPanel.add(lblFile, gbc_lblFile);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setEditable(true);
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.gridwidth = 4;
			gbc_comboBox.insets = new Insets(0, 5, 5, 5);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 0;
			gbc_comboBox.gridy = 2;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JButton btnGetList = new JButton("Get List");
			btnGetList.setPreferredSize(new Dimension(75, 23));
			GridBagConstraints gbc_btnGetList = new GridBagConstraints();
			gbc_btnGetList.insets = new Insets(0, 0, 5, 0);
			gbc_btnGetList.gridx = 4;
			gbc_btnGetList.gridy = 2;
			contentPanel.add(btnGetList, gbc_btnGetList);
		}
		{
			JLabel lblText = new JLabel("Text:");
			GridBagConstraints gbc_lblText = new GridBagConstraints();
			gbc_lblText.anchor = GridBagConstraints.SOUTH;
			gbc_lblText.gridwidth = 4;
			gbc_lblText.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblText.insets = new Insets(0, 5, 5, 5);
			gbc_lblText.gridx = 0;
			gbc_lblText.gridy = 3;
			contentPanel.add(lblText, gbc_lblText);
		}
		{
			textField_3 = new JTextField();
			GridBagConstraints gbc_textField_3 = new GridBagConstraints();
			gbc_textField_3.gridwidth = 4;
			gbc_textField_3.insets = new Insets(0, 5, 5, 5);
			gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_3.gridx = 0;
			gbc_textField_3.gridy = 4;
			contentPanel.add(textField_3, gbc_textField_3);
			textField_3.setColumns(10);
		}
		{
			JButton btnApply = new JButton("Apply");
			GridBagConstraints gbc_btnApply = new GridBagConstraints();
			gbc_btnApply.insets = new Insets(0, 0, 5, 0);
			gbc_btnApply.fill = GridBagConstraints.BOTH;
			gbc_btnApply.gridx = 4;
			gbc_btnApply.gridy = 4;
			contentPanel.add(btnApply, gbc_btnApply);
		}
		{
			JCheckBox chckbxMatchTextIn = new JCheckBox("Match text in topics");
			GridBagConstraints gbc_chckbxMatchTextIn = new GridBagConstraints();
			gbc_chckbxMatchTextIn.insets = new Insets(0, 5, 5, 0);
			gbc_chckbxMatchTextIn.gridwidth = 5;
			gbc_chckbxMatchTextIn.fill = GridBagConstraints.HORIZONTAL;
			gbc_chckbxMatchTextIn.gridx = 0;
			gbc_chckbxMatchTextIn.gridy = 5;
			contentPanel.add(chckbxMatchTextIn, gbc_chckbxMatchTextIn);
		}
		{
			JLabel lblNumberOfUsers = new JLabel("Number of users on a channel:");
			GridBagConstraints gbc_lblNumberOfUsers = new GridBagConstraints();
			gbc_lblNumberOfUsers.gridwidth = 4;
			gbc_lblNumberOfUsers.anchor = GridBagConstraints.SOUTH;
			gbc_lblNumberOfUsers.insets = new Insets(0, 0, 5, 5);
			gbc_lblNumberOfUsers.gridx = 0;
			gbc_lblNumberOfUsers.gridy = 6;
			contentPanel.add(lblNumberOfUsers, gbc_lblNumberOfUsers);
		}
		{
			JButton btnOk = new JButton("OK");
			GridBagConstraints gbc_btnOk = new GridBagConstraints();
			gbc_btnOk.insets = new Insets(0, 0, 5, 0);
			gbc_btnOk.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnOk.gridx = 4;
			gbc_btnOk.gridy = 6;
			contentPanel.add(btnOk, gbc_btnOk);
		}
		{
			JLabel lblMin = new JLabel("min:");
			GridBagConstraints gbc_lblMin = new GridBagConstraints();
			gbc_lblMin.anchor = GridBagConstraints.EAST;
			gbc_lblMin.insets = new Insets(0, 15, 5, 5);
			gbc_lblMin.gridx = 0;
			gbc_lblMin.gridy = 7;
			contentPanel.add(lblMin, gbc_lblMin);
		}
		{
			textField = new JTextField();
			textField.setText("9999");
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 1;
			gbc_textField.gridy = 7;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JLabel lblMax = new JLabel("max:");
			GridBagConstraints gbc_lblMax = new GridBagConstraints();
			gbc_lblMax.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblMax.insets = new Insets(0, 0, 5, 5);
			gbc_lblMax.gridx = 2;
			gbc_lblMax.gridy = 7;
			contentPanel.add(lblMax, gbc_lblMax);
		}
		{
			textField_1 = new JTextField();
			textField_1.setText("9999");
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.insets = new Insets(0, 0, 5, 5);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 3;
			gbc_textField_1.gridy = 7;
			contentPanel.add(textField_1, gbc_textField_1);
			textField_1.setColumns(10);
		}
		{
			JButton btnLock = new JButton("Lock");
			GridBagConstraints gbc_btnLock = new GridBagConstraints();
			gbc_btnLock.insets = new Insets(0, 0, 5, 0);
			gbc_btnLock.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnLock.gridx = 4;
			gbc_btnLock.gridy = 7;
			contentPanel.add(btnLock, gbc_btnLock);
		}
		{
			JCheckBox chckbxHideChannels = new JCheckBox("Hide channels that match:");
			GridBagConstraints gbc_chckbxHideChannels = new GridBagConstraints();
			gbc_chckbxHideChannels.anchor = GridBagConstraints.SOUTH;
			gbc_chckbxHideChannels.fill = GridBagConstraints.HORIZONTAL;
			gbc_chckbxHideChannels.gridwidth = 4;
			gbc_chckbxHideChannels.insets = new Insets(0, 5, 5, 5);
			gbc_chckbxHideChannels.gridx = 0;
			gbc_chckbxHideChannels.gridy = 8;
			contentPanel.add(chckbxHideChannels, gbc_chckbxHideChannels);
		}
		{
			textField_2 = new JTextField();
			GridBagConstraints gbc_textField_2 = new GridBagConstraints();
			gbc_textField_2.gridwidth = 4;
			gbc_textField_2.insets = new Insets(0, 5, 5, 5);
			gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_2.gridx = 0;
			gbc_textField_2.gridy = 9;
			contentPanel.add(textField_2, gbc_textField_2);
			textField_2.setColumns(10);
		}
		{
			JCheckBox chckbxHideNontextChannels = new JCheckBox("Hide non-text channels");
			GridBagConstraints gbc_chckbxHideNontextChannels = new GridBagConstraints();
			gbc_chckbxHideNontextChannels.anchor = GridBagConstraints.SOUTH;
			gbc_chckbxHideNontextChannels.fill = GridBagConstraints.HORIZONTAL;
			gbc_chckbxHideNontextChannels.gridwidth = 4;
			gbc_chckbxHideNontextChannels.insets = new Insets(0, 5, 5, 5);
			gbc_chckbxHideNontextChannels.gridx = 0;
			gbc_chckbxHideNontextChannels.gridy = 10;
			contentPanel.add(chckbxHideNontextChannels, gbc_chckbxHideNontextChannels);
		}
	}

}
