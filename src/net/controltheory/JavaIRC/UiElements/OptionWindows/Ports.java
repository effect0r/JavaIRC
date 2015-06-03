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
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Dimension;
import java.awt.Dialog.ModalExclusionType;

public class Ports extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	public Ports() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Ports");
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 270, 350);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0};
		gbl_contentPanel.rowHeights = new int[]{45, 50, 60};
		gbl_contentPanel.columnWeights = new double[]{1.0};
		gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, 1.0};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Port range:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.HORIZONTAL;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 0;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{174, 0, 0};
			gbl_panel.rowHeights = new int[]{ 34, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxServerConnections = new JCheckBox("Server connections");
				GridBagConstraints gbc_chckbxServerConnections = new GridBagConstraints();
				gbc_chckbxServerConnections.anchor = GridBagConstraints.WEST;
				gbc_chckbxServerConnections.gridx = 0;
				gbc_chckbxServerConnections.gridy = 0;
				panel.add(chckbxServerConnections, gbc_chckbxServerConnections);
			}
			{
				JLabel lblFirstPort = new JLabel("First port:");
				GridBagConstraints gbc_lblFirstPort = new GridBagConstraints();
				gbc_lblFirstPort.anchor = GridBagConstraints.WEST;
				gbc_lblFirstPort.insets = new Insets(0, 2, 0, 0);
				gbc_lblFirstPort.gridx = 1;
				gbc_lblFirstPort.gridy = 0;
				panel.add(lblFirstPort, gbc_lblFirstPort);
			}
			{
				textField = new JTextField();
				textField.setText("1024");
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.gridx = 1;
				gbc_textField.gridy = 1;
				panel.add(textField, gbc_textField);
				textField.setColumns(10);
			}
			{
				JCheckBox chckbxDccSendGet = new JCheckBox("<html>DCC Send, Get, and Chat connections</html>");
				GridBagConstraints gbc_chckbxDccSendGet = new GridBagConstraints();
				gbc_chckbxDccSendGet.gridheight = 2;
				gbc_chckbxDccSendGet.anchor = GridBagConstraints.NORTH;
				gbc_chckbxDccSendGet.fill = GridBagConstraints.HORIZONTAL;
				gbc_chckbxDccSendGet.gridx = 0;
				gbc_chckbxDccSendGet.gridy = 1;
				panel.add(chckbxDccSendGet, gbc_chckbxDccSendGet);
			}
			{
				JLabel lblLastPort = new JLabel("Last port:");
				GridBagConstraints gbc_lblLastPort = new GridBagConstraints();
				gbc_lblLastPort.insets = new Insets(0, 2, 0, 0);
				gbc_lblLastPort.anchor = GridBagConstraints.SOUTHWEST;
				gbc_lblLastPort.gridx = 1;
				gbc_lblLastPort.gridy = 2;
				panel.add(lblLastPort, gbc_lblLastPort);
			}
			{
				JCheckBox chckbxRandomizePorts = new JCheckBox("Randomize ports");
				GridBagConstraints gbc_chckbxRandomizePorts = new GridBagConstraints();
				gbc_chckbxRandomizePorts.anchor = GridBagConstraints.NORTHWEST;
				gbc_chckbxRandomizePorts.gridx = 0;
				gbc_chckbxRandomizePorts.gridy = 3;
				panel.add(chckbxRandomizePorts, gbc_chckbxRandomizePorts);
			}
			{
				textField_1 = new JTextField();
				textField_1.setText("5000");
				GridBagConstraints gbc_textField_1 = new GridBagConstraints();
				gbc_textField_1.anchor = GridBagConstraints.NORTH;
				gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_1.gridx = 1;
				gbc_textField_1.gridy = 3;
				panel.add(textField_1, gbc_textField_1);
				textField_1.setColumns(10);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "UPnP support:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.HORIZONTAL;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 1;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxIpAddress = new JCheckBox("IP address");
				GridBagConstraints gbc_chckbxIpAddress = new GridBagConstraints();
				gbc_chckbxIpAddress.anchor = GridBagConstraints.WEST;
				gbc_chckbxIpAddress.gridx = 0;
				gbc_chckbxIpAddress.gridy = 0;
				panel.add(chckbxIpAddress, gbc_chckbxIpAddress);
			}
			{
				JCheckBox chckbxDccConnections = new JCheckBox("DCC connections");
				GridBagConstraints gbc_chckbxDccConnections = new GridBagConstraints();
				gbc_chckbxDccConnections.anchor = GridBagConstraints.WEST;
				gbc_chckbxDccConnections.gridx = 1;
				gbc_chckbxDccConnections.gridy = 0;
				panel.add(chckbxDccConnections, gbc_chckbxDccConnections);
			}
			{
				JCheckBox chckbxIdentdServer = new JCheckBox("Identd server");
				GridBagConstraints gbc_chckbxIdentdServer = new GridBagConstraints();
				gbc_chckbxIdentdServer.anchor = GridBagConstraints.WEST;
				gbc_chckbxIdentdServer.insets = new Insets(0, 0, 0, 5);
				gbc_chckbxIdentdServer.gridx = 0;
				gbc_chckbxIdentdServer.gridy = 1;
				panel.add(chckbxIdentdServer, gbc_chckbxIdentdServer);
			}
			{
				JCheckBox chckbxDccServer = new JCheckBox("DCC server");
				GridBagConstraints gbc_chckbxDccServer = new GridBagConstraints();
				gbc_chckbxDccServer.anchor = GridBagConstraints.WEST;
				gbc_chckbxDccServer.gridx = 1;
				gbc_chckbxDccServer.gridy = 1;
				panel.add(chckbxDccServer, gbc_chckbxDccServer);
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
			gbl_panel.columnWidths = new int[]{0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxBindToAdapter = new JCheckBox("Bind to Adapter or IP address:");
				GridBagConstraints gbc_chckbxBindToAdapter = new GridBagConstraints();
				gbc_chckbxBindToAdapter.anchor = GridBagConstraints.WEST;
				gbc_chckbxBindToAdapter.gridx = 0;
				gbc_chckbxBindToAdapter.gridy = 0;
				panel.add(chckbxBindToAdapter, gbc_chckbxBindToAdapter);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setEditable(true);
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.gridx = 0;
				gbc_comboBox.gridy = 1;
				panel.add(comboBox, gbc_comboBox);
			}
			{
				JCheckBox chckbxenableIpvSupport = new JCheckBox("<html>Enable IPv6 support and prioritize IPv6 over IPv4 connections");
				GridBagConstraints gbc_chckbxenableIpvSupport = new GridBagConstraints();
				gbc_chckbxenableIpvSupport.fill = GridBagConstraints.HORIZONTAL;
				gbc_chckbxenableIpvSupport.gridx = 0;
				gbc_chckbxenableIpvSupport.gridy = 2;
				panel.add(chckbxenableIpvSupport, gbc_chckbxenableIpvSupport);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setPreferredSize(new Dimension(73, 23));
				okButton.setMinimumSize(new Dimension(73, 23));
				okButton.setMaximumSize(new Dimension(73, 23));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setPreferredSize(new Dimension(73, 23));
				cancelButton.setMinimumSize(new Dimension(73, 23));
				cancelButton.setMaximumSize(new Dimension(73, 23));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
