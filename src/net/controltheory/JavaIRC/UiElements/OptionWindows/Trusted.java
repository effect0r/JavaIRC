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
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Trusted extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	public Trusted() {
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Trusted Users");
		setBounds(100, 100, 290, 330);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JCheckBox chckbxLimitAutogetTo = new JCheckBox("Limit auto-get to trusted users");
			GridBagConstraints gbc_chckbxLimitAutogetTo = new GridBagConstraints();
			gbc_chckbxLimitAutogetTo.insets = new Insets(7, 5, 0, 0);
			gbc_chckbxLimitAutogetTo.anchor = GridBagConstraints.WEST;
			gbc_chckbxLimitAutogetTo.gridwidth = 3;
			gbc_chckbxLimitAutogetTo.gridx = 0;
			gbc_chckbxLimitAutogetTo.gridy = 0;
			contentPanel.add(chckbxLimitAutogetTo, gbc_chckbxLimitAutogetTo);
		}
		{
			JCheckBox chckbxShowGetDialog = new JCheckBox("Show get dialog for non-trusted users");
			GridBagConstraints gbc_chckbxShowGetDialog = new GridBagConstraints();
			gbc_chckbxShowGetDialog.insets = new Insets(0, 5, 8, 0);
			gbc_chckbxShowGetDialog.anchor = GridBagConstraints.WEST;
			gbc_chckbxShowGetDialog.gridx = 0;
			gbc_chckbxShowGetDialog.gridy = 1;
			contentPanel.add(chckbxShowGetDialog, gbc_chckbxShowGetDialog);
		}
		{
			JLabel lblyouCanEnter = new JLabel("<html>You can enter a wildcard address blow in the form nick!user@host.");
			GridBagConstraints gbc_lblyouCanEnter = new GridBagConstraints();
			gbc_lblyouCanEnter.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblyouCanEnter.insets = new Insets(0, 10, 5, 0);
			gbc_lblyouCanEnter.gridx = 0;
			gbc_lblyouCanEnter.gridy = 2;
			contentPanel.add(lblyouCanEnter, gbc_lblyouCanEnter);
		}
		{
			JLabel lblifYouDo = new JLabel("<html>If you do not enter a full address, your entry is treated as user level.");
			GridBagConstraints gbc_lblifYouDo = new GridBagConstraints();
			gbc_lblifYouDo.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblifYouDo.insets = new Insets(1, 10, 9, 0);
			gbc_lblifYouDo.gridx = 0;
			gbc_lblifYouDo.gridy = 3;
			contentPanel.add(lblifYouDo, gbc_lblifYouDo);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 5, 0, 0);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 0;
			gbc_textField.gridy = 4;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("Add");
			btnNewButton.setMinimumSize(new Dimension(75, 23));
			btnNewButton.setMaximumSize(new Dimension(75, 23));
			btnNewButton.setPreferredSize(new Dimension(75, 23));
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
			gbc_btnNewButton.gridwidth = 2;
			gbc_btnNewButton.gridx = 1;
			gbc_btnNewButton.gridy = 4;
			contentPanel.add(btnNewButton, gbc_btnNewButton);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.insets = new Insets(0, 5, 0, 0);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 5;
			contentPanel.add(scrollPane, gbc_scrollPane);
			{
				JList list = new JList();
				scrollPane.setViewportView(list);
			}
		}
		{
			JButton btnNewButton_1 = new JButton("Delete");
			btnNewButton_1.setMinimumSize(new Dimension(75, 23));
			btnNewButton_1.setMaximumSize(new Dimension(75, 23));
			btnNewButton_1.setPreferredSize(new Dimension(75, 23));
			GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
			gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnNewButton_1.anchor = GridBagConstraints.NORTH;
			gbc_btnNewButton_1.gridwidth = 2;
			gbc_btnNewButton_1.gridx = 1;
			gbc_btnNewButton_1.gridy = 5;
			contentPanel.add(btnNewButton_1, gbc_btnNewButton_1);
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
