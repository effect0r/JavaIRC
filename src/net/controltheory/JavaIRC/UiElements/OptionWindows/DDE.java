package net.controltheory.JavaIRC.UiElements.OptionWindows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dialog.ModalityType;
import java.awt.Dialog.ModalExclusionType;

public class DDE extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	public DDE() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setResizable(false);
		setTitle("DDE Server");
		setBounds(100, 100, 238, 174);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{50, 35, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JCheckBox chckbxEnableDdeServer = new JCheckBox("Enable DDE Server");
			GridBagConstraints gbc_chckbxEnableDdeServer = new GridBagConstraints();
			gbc_chckbxEnableDdeServer.anchor = GridBagConstraints.WEST;
			gbc_chckbxEnableDdeServer.gridwidth = 3;
			gbc_chckbxEnableDdeServer.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxEnableDdeServer.gridx = 0;
			gbc_chckbxEnableDdeServer.gridy = 0;
			contentPanel.add(chckbxEnableDdeServer, gbc_chckbxEnableDdeServer);
		}
		{
			JCheckBox chckbxCheckIfService = new JCheckBox("Check if Service Name in use");
			GridBagConstraints gbc_chckbxCheckIfService = new GridBagConstraints();
			gbc_chckbxCheckIfService.anchor = GridBagConstraints.WEST;
			gbc_chckbxCheckIfService.gridwidth = 3;
			gbc_chckbxCheckIfService.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxCheckIfService.gridx = 0;
			gbc_chckbxCheckIfService.gridy = 1;
			contentPanel.add(chckbxCheckIfService, gbc_chckbxCheckIfService);
		}
		{
			JLabel lblServiceName = new JLabel("Service Name:");
			GridBagConstraints gbc_lblServiceName = new GridBagConstraints();
			gbc_lblServiceName.anchor = GridBagConstraints.WEST;
			gbc_lblServiceName.insets = new Insets(0, 0, 5, 5);
			gbc_lblServiceName.gridx = 0;
			gbc_lblServiceName.gridy = 2;
			contentPanel.add(lblServiceName, gbc_lblServiceName);
		}
		{
			JLabel lblDdeDelay = new JLabel("DDE delay:");
			GridBagConstraints gbc_lblDdeDelay = new GridBagConstraints();
			gbc_lblDdeDelay.anchor = GridBagConstraints.WEST;
			gbc_lblDdeDelay.gridwidth = 2;
			gbc_lblDdeDelay.insets = new Insets(0, 0, 5, 0);
			gbc_lblDdeDelay.gridx = 1;
			gbc_lblDdeDelay.gridy = 2;
			contentPanel.add(lblDdeDelay, gbc_lblDdeDelay);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.insets = new Insets(0, 0, 0, 30);
			gbc_textField.gridx = 0;
			gbc_textField.gridy = 3;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.insets = new Insets(0, 0, 0, 5);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 1;
			gbc_textField_1.gridy = 3;
			contentPanel.add(textField_1, gbc_textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblMs = new JLabel("ms");
			GridBagConstraints gbc_lblMs = new GridBagConstraints();
			gbc_lblMs.anchor = GridBagConstraints.WEST;
			gbc_lblMs.gridx = 2;
			gbc_lblMs.gridy = 3;
			contentPanel.add(lblMs, gbc_lblMs);
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
