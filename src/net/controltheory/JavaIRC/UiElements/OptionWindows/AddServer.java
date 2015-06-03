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
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextField;

import net.controltheory.JavaIRC.UiElements.OptionsFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dialog.ModalExclusionType;

public class AddServer extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtDescription;
	private JTextField txtServerName;
	private JTextField txtPorts;
	private JTextField txtGroup;
	private JTextField txtPassword;

	public AddServer() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Add Server");
		setModalityType(ModalityType.APPLICATION_MODAL);
		setResizable(false);
		setBounds(100, 100, 266, 253);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 230, 187, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblDescription = new JLabel("Description:");
			GridBagConstraints gbc_lblDescription = new GridBagConstraints();
			gbc_lblDescription.anchor = GridBagConstraints.EAST;
			gbc_lblDescription.insets = new Insets(10, 5, 2, 5);
			gbc_lblDescription.gridx = 0;
			gbc_lblDescription.gridy = 0;
			contentPanel.add(lblDescription, gbc_lblDescription);
		}
		{
			txtDescription = new JTextField();
			txtDescription.setText("Description");
			GridBagConstraints gbc_txtDescription = new GridBagConstraints();
			gbc_txtDescription.gridwidth = 2;
			gbc_txtDescription.insets = new Insets(5, 0, 2, 5);
			gbc_txtDescription.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtDescription.gridx = 1;
			gbc_txtDescription.gridy = 0;
			contentPanel.add(txtDescription, gbc_txtDescription);
			txtDescription.setColumns(10);
		}
		{
			JLabel lblIrcServer = new JLabel("IRC Server:");
			GridBagConstraints gbc_lblIrcServer = new GridBagConstraints();
			gbc_lblIrcServer.anchor = GridBagConstraints.EAST;
			gbc_lblIrcServer.insets = new Insets(5, 0, 2, 5);
			gbc_lblIrcServer.gridx = 0;
			gbc_lblIrcServer.gridy = 1;
			contentPanel.add(lblIrcServer, gbc_lblIrcServer);
		}
		{
			txtServerName = new JTextField();
			txtServerName.setText("server name");
			GridBagConstraints gbc_txtServerName = new GridBagConstraints();
			gbc_txtServerName.gridwidth = 2;
			gbc_txtServerName.insets = new Insets(5, 0, 2, 5);
			gbc_txtServerName.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtServerName.gridx = 1;
			gbc_txtServerName.gridy = 1;
			contentPanel.add(txtServerName, gbc_txtServerName);
			txtServerName.setColumns(10);
		}
		{
			JLabel lblPorts = new JLabel("Ports:");
			GridBagConstraints gbc_lblPorts = new GridBagConstraints();
			gbc_lblPorts.anchor = GridBagConstraints.EAST;
			gbc_lblPorts.insets = new Insets(5, 5, 2, 5);
			gbc_lblPorts.gridx = 0;
			gbc_lblPorts.gridy = 2;
			contentPanel.add(lblPorts, gbc_lblPorts);
		}
		{
			txtPorts = new JTextField();
			txtPorts.setText("6667");
			GridBagConstraints gbc_txtPorts = new GridBagConstraints();
			gbc_txtPorts.gridwidth = 2;
			gbc_txtPorts.insets = new Insets(5, 0, 2, 5);
			gbc_txtPorts.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtPorts.gridx = 1;
			gbc_txtPorts.gridy = 2;
			contentPanel.add(txtPorts, gbc_txtPorts);
			txtPorts.setColumns(10);
		}
		{
			JLabel lblGroup = new JLabel("Group:");
			GridBagConstraints gbc_lblGroup = new GridBagConstraints();
			gbc_lblGroup.anchor = GridBagConstraints.EAST;
			gbc_lblGroup.insets = new Insets(5, 5, 2, 5);
			gbc_lblGroup.gridx = 0;
			gbc_lblGroup.gridy = 3;
			contentPanel.add(lblGroup, gbc_lblGroup);
		}
		{
			txtGroup = new JTextField();
			txtGroup.setText("group");
			GridBagConstraints gbc_txtGroup = new GridBagConstraints();
			gbc_txtGroup.insets = new Insets(5, 0, 2, 5);
			gbc_txtGroup.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtGroup.gridx = 1;
			gbc_txtGroup.gridy = 3;
			contentPanel.add(txtGroup, gbc_txtGroup);
			txtGroup.setColumns(10);
		}
		{
			JLabel lblOnlyCertainTypes = new JLabel("<html>Only certain types of users need to use a password.</html>");
			GridBagConstraints gbc_lblOnlyCertainTypes = new GridBagConstraints();
			gbc_lblOnlyCertainTypes.gridwidth = 2;
			gbc_lblOnlyCertainTypes.fill = GridBagConstraints.BOTH;
			gbc_lblOnlyCertainTypes.insets = new Insets(10, 5, 2, 5);
			gbc_lblOnlyCertainTypes.gridx = 1;
			gbc_lblOnlyCertainTypes.gridy = 4;
			contentPanel.add(lblOnlyCertainTypes, gbc_lblOnlyCertainTypes);
		}
		{
			JLabel lblPassword = new JLabel("Password:");
			GridBagConstraints gbc_lblPassword = new GridBagConstraints();
			gbc_lblPassword.anchor = GridBagConstraints.EAST;
			gbc_lblPassword.insets = new Insets(5, 5, 0, 5);
			gbc_lblPassword.gridx = 0;
			gbc_lblPassword.gridy = 5;
			contentPanel.add(lblPassword, gbc_lblPassword);
		}
		{
			txtPassword = new JTextField();
			txtPassword.setText("password");
			GridBagConstraints gbc_txtPassword = new GridBagConstraints();
			gbc_txtPassword.insets = new Insets(5, 0, 0, 5);
			gbc_txtPassword.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtPassword.gridx = 1;
			gbc_txtPassword.gridy = 5;
			contentPanel.add(txtPassword, gbc_txtPassword);
			txtPassword.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			GridBagLayout gbl_buttonPane = new GridBagLayout();
			gbl_buttonPane.columnWidths = new int[]{70, 70, 70, 0};
			gbl_buttonPane.rowHeights = new int[]{0, 0};
			gbl_buttonPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_buttonPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
			buttonPane.setLayout(gbl_buttonPane);
			{
				JButton btnAdd = new JButton("Add");
				btnAdd.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						OptionsFrame.addServer();
					}
				});
				btnAdd.setPreferredSize(new Dimension(70, 23));
				btnAdd.setMinimumSize(new Dimension(70, 23));
				btnAdd.setMaximumSize(new Dimension(75, 23));
				GridBagConstraints gbc_btnAdd = new GridBagConstraints();
				gbc_btnAdd.insets = new Insets(0, 14, 10, 0);
				gbc_btnAdd.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnAdd.gridx = 0;
				gbc_btnAdd.gridy = 0;
				buttonPane.add(btnAdd, gbc_btnAdd);
			}
			{
				JButton btnCancel = new JButton("Cancel");
				btnCancel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
					}
				});
				btnCancel.setPreferredSize(new Dimension(70, 23));
				btnCancel.setMinimumSize(new Dimension(70, 23));
				btnCancel.setMaximumSize(new Dimension(75, 23));
				GridBagConstraints gbc_btnCancel = new GridBagConstraints();
				gbc_btnCancel.insets = new Insets(0, 5, 10, 5);
				gbc_btnCancel.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnCancel.gridx = 1;
				gbc_btnCancel.gridy = 0;
				buttonPane.add(btnCancel, gbc_btnCancel);
			}
			{
				JButton btnHelp = new JButton("Help");
				btnHelp.setPreferredSize(new Dimension(70, 23));
				btnHelp.setMinimumSize(new Dimension(70, 23));
				btnHelp.setMaximumSize(new Dimension(75, 23));
				GridBagConstraints gbc_btnHelp = new GridBagConstraints();
				gbc_btnHelp.insets = new Insets(0, 0, 10, 7);
				gbc_btnHelp.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnHelp.gridx = 2;
				gbc_btnHelp.gridy = 0;
				buttonPane.add(btnHelp, gbc_btnHelp);
			}
		}
	}

}
