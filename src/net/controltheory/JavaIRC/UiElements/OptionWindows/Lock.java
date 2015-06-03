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
import javax.swing.JPasswordField;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;

public class Lock extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField pwdPassword;
	private JPasswordField pwdConfirmPassword;

	public Lock() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Lock Password");
		setResizable(false);
		setBounds(100, 100, 203, 129);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblPassword = new JLabel("Password:");
			GridBagConstraints gbc_lblPassword = new GridBagConstraints();
			gbc_lblPassword.anchor = GridBagConstraints.EAST;
			gbc_lblPassword.insets = new Insets(0, 0, 0, 5);
			gbc_lblPassword.gridx = 0;
			gbc_lblPassword.gridy = 0;
			contentPanel.add(lblPassword, gbc_lblPassword);
		}
		{
			pwdPassword = new JPasswordField();
			GridBagConstraints gbc_pwdPassword = new GridBagConstraints();
			gbc_pwdPassword.fill = GridBagConstraints.HORIZONTAL;
			gbc_pwdPassword.gridx = 1;
			gbc_pwdPassword.gridy = 0;
			contentPanel.add(pwdPassword, gbc_pwdPassword);
		}
		{
			JLabel lblConfirm = new JLabel("Confirm:");
			GridBagConstraints gbc_lblConfirm = new GridBagConstraints();
			gbc_lblConfirm.anchor = GridBagConstraints.EAST;
			gbc_lblConfirm.insets = new Insets(0, 0, 0, 5);
			gbc_lblConfirm.gridx = 0;
			gbc_lblConfirm.gridy = 1;
			contentPanel.add(lblConfirm, gbc_lblConfirm);
		}
		{
			pwdConfirmPassword = new JPasswordField();
			GridBagConstraints gbc_pwdConfirmPassword = new GridBagConstraints();
			gbc_pwdConfirmPassword.fill = GridBagConstraints.HORIZONTAL;
			gbc_pwdConfirmPassword.gridx = 1;
			gbc_pwdConfirmPassword.gridy = 1;
			contentPanel.add(pwdConfirmPassword, gbc_pwdConfirmPassword);
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
