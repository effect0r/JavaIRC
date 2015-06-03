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
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dialog.ModalExclusionType;

public class Retry extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	
	public Retry() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Retry");
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 225, 230);
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setHgap(5);
		getContentPane().setLayout(borderLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0};
		gbl_contentPanel.rowHeights = new int[]{6, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JCheckBox chckbxEnableConnectRetry = new JCheckBox("Enable connect retry");
			GridBagConstraints gbc_chckbxEnableConnectRetry = new GridBagConstraints();
			gbc_chckbxEnableConnectRetry.anchor = GridBagConstraints.WEST;
			gbc_chckbxEnableConnectRetry.insets = new Insets(1, 6, 5, 0);
			gbc_chckbxEnableConnectRetry.gridx = 0;
			gbc_chckbxEnableConnectRetry.gridy = 0;
			contentPanel.add(chckbxEnableConnectRetry, gbc_chckbxEnableConnectRetry);
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "When connecting:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridheight = 4;
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 1;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 40, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblIfNotConnected = new JLabel("If not connected in:");
				GridBagConstraints gbc_lblIfNotConnected = new GridBagConstraints();
				gbc_lblIfNotConnected.anchor = GridBagConstraints.EAST;
				gbc_lblIfNotConnected.insets = new Insets(0, 5, 5, 5);
				gbc_lblIfNotConnected.gridx = 0;
				gbc_lblIfNotConnected.gridy = 0;
				panel.add(lblIfNotConnected, gbc_lblIfNotConnected);
			}
			{
				textField = new JTextField();
				textField.setText("60");
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.insets = new Insets(0, 0, 5, 5);
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.gridx = 1;
				gbc_textField.gridy = 0;
				panel.add(textField, gbc_textField);
				textField.setColumns(10);
			}
			{
				JLabel lblSecs = new JLabel("secs");
				GridBagConstraints gbc_lblSecs = new GridBagConstraints();
				gbc_lblSecs.anchor = GridBagConstraints.WEST;
				gbc_lblSecs.insets = new Insets(0, 0, 5, 0);
				gbc_lblSecs.gridx = 2;
				gbc_lblSecs.gridy = 0;
				panel.add(lblSecs, gbc_lblSecs);
			}
			{
				JLabel lblRetryConnection = new JLabel("Retry connection:");
				GridBagConstraints gbc_lblRetryConnection = new GridBagConstraints();
				gbc_lblRetryConnection.anchor = GridBagConstraints.EAST;
				gbc_lblRetryConnection.insets = new Insets(0, 0, 0, 5);
				gbc_lblRetryConnection.gridx = 0;
				gbc_lblRetryConnection.gridy = 1;
				panel.add(lblRetryConnection, gbc_lblRetryConnection);
			}
			{
				textField_1 = new JTextField();
				textField_1.setText("9999");
				GridBagConstraints gbc_textField_1 = new GridBagConstraints();
				gbc_textField_1.insets = new Insets(0, 0, 0, 5);
				gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_1.gridx = 1;
				gbc_textField_1.gridy = 1;
				panel.add(textField_1, gbc_textField_1);
				textField_1.setColumns(10);
			}
			{
				JLabel lblTimes = new JLabel("time(s)");
				GridBagConstraints gbc_lblTimes = new GridBagConstraints();
				gbc_lblTimes.anchor = GridBagConstraints.WEST;
				gbc_lblTimes.gridx = 2;
				gbc_lblTimes.gridy = 1;
				panel.add(lblTimes, gbc_lblTimes);
			}
			{
				JLabel lblRetryDelay = new JLabel("Retry delay:");
				GridBagConstraints gbc_lblRetryDelay = new GridBagConstraints();
				gbc_lblRetryDelay.anchor = GridBagConstraints.EAST;
				gbc_lblRetryDelay.insets = new Insets(5, 0, 5, 5);
				gbc_lblRetryDelay.gridx = 0;
				gbc_lblRetryDelay.gridy = 2;
				panel.add(lblRetryDelay, gbc_lblRetryDelay);
			}
			{
				textField_2 = new JTextField();
				textField_2.setText("3");
				GridBagConstraints gbc_textField_2 = new GridBagConstraints();
				gbc_textField_2.insets = new Insets(5, 0, 5, 5);
				gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_2.gridx = 1;
				gbc_textField_2.gridy = 2;
				panel.add(textField_2, gbc_textField_2);
				textField_2.setColumns(10);
			}
			{
				JLabel lblSecs_1 = new JLabel("secs");
				GridBagConstraints gbc_lblSecs_1 = new GridBagConstraints();
				gbc_lblSecs_1.insets = new Insets(5, 0, 5, 0);
				gbc_lblSecs_1.anchor = GridBagConstraints.WEST;
				gbc_lblSecs_1.gridx = 2;
				gbc_lblSecs_1.gridy = 2;
				panel.add(lblSecs_1, gbc_lblSecs_1);
			}
			{
				JCheckBox chckbxTryNextServer = new JCheckBox("Try next server in group");
				GridBagConstraints gbc_chckbxTryNextServer = new GridBagConstraints();
				gbc_chckbxTryNextServer.anchor = GridBagConstraints.WEST;
				gbc_chckbxTryNextServer.gridwidth = 3;
				gbc_chckbxTryNextServer.insets = new Insets(5, 5, 0, 5);
				gbc_chckbxTryNextServer.gridx = 0;
				gbc_chckbxTryNextServer.gridy = 3;
				panel.add(chckbxTryNextServer, gbc_chckbxTryNextServer);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setMaximumSize(new Dimension(73, 23));
				okButton.setMinimumSize(new Dimension(73, 23));
				okButton.setPreferredSize(new Dimension(73, 23));
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
