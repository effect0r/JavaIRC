package net.controltheory.JavaIRC.UiElements.OptionWindows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JCheckBox;
import java.awt.Dialog.ModalExclusionType;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class DCCAddFolder extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	public DCCAddFolder() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("DCC Get Folder");
		setBounds(100, 100, 284, 290);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{262, 0};
		gbl_contentPanel.rowHeights = new int[]{22, 20, 14, 14, 23, 23, 14, 23, 14, 20, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblSaveFilesWith = new JLabel("Save files with these Extensions:");
			lblSaveFilesWith.setHorizontalAlignment(SwingConstants.LEFT);
			GridBagConstraints gbc_lblSaveFilesWith = new GridBagConstraints();
			gbc_lblSaveFilesWith.fill = GridBagConstraints.BOTH;
			gbc_lblSaveFilesWith.insets = new Insets(0, 0, 5, 0);
			gbc_lblSaveFilesWith.gridx = 0;
			gbc_lblSaveFilesWith.gridy = 0;
			contentPanel.add(lblSaveFilesWith, gbc_lblSaveFilesWith);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.fill = GridBagConstraints.BOTH;
			gbc_textField.insets = new Insets(0, 0, 5, 0);
			gbc_textField.gridx = 0;
			gbc_textField.gridy = 1;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("(for example: *.txt,*.doc,*.wri)");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 2;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Into this Folder:");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
			gbc_lblNewLabel_1.gridx = 0;
			gbc_lblNewLabel_1.gridy = 3;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			JButton btnNewButton = new JButton("C:\\path\\to\\folder\\folder");
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.fill = GridBagConstraints.BOTH;
			gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
			gbc_btnNewButton.gridx = 0;
			gbc_btnNewButton.gridy = 4;
			contentPanel.add(btnNewButton, gbc_btnNewButton);
		}
		{
			JCheckBox chckbxSortFilesBy = new JCheckBox("Sort files by nickname into own folders");
			GridBagConstraints gbc_chckbxSortFilesBy = new GridBagConstraints();
			gbc_chckbxSortFilesBy.fill = GridBagConstraints.BOTH;
			gbc_chckbxSortFilesBy.insets = new Insets(0, 0, 5, 0);
			gbc_chckbxSortFilesBy.gridx = 0;
			gbc_chckbxSortFilesBy.gridy = 5;
			contentPanel.add(chckbxSortFilesBy, gbc_chckbxSortFilesBy);
		}
		{
			JLabel lblAndThenOpen = new JLabel("And then Open them with this application:");
			GridBagConstraints gbc_lblAndThenOpen = new GridBagConstraints();
			gbc_lblAndThenOpen.fill = GridBagConstraints.BOTH;
			gbc_lblAndThenOpen.insets = new Insets(0, 0, 5, 0);
			gbc_lblAndThenOpen.gridx = 0;
			gbc_lblAndThenOpen.gridy = 6;
			contentPanel.add(lblAndThenOpen, gbc_lblAndThenOpen);
		}
		{
			JButton btnNewButton_1 = new JButton("");
			GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
			gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
			gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
			gbc_btnNewButton_1.gridx = 0;
			gbc_btnNewButton_1.gridy = 7;
			contentPanel.add(btnNewButton_1, gbc_btnNewButton_1);
		}
		{
			JLabel lblOrPerformThis = new JLabel("Or perform this Command on them:");
			GridBagConstraints gbc_lblOrPerformThis = new GridBagConstraints();
			gbc_lblOrPerformThis.fill = GridBagConstraints.VERTICAL;
			gbc_lblOrPerformThis.anchor = GridBagConstraints.WEST;
			gbc_lblOrPerformThis.insets = new Insets(0, 0, 5, 0);
			gbc_lblOrPerformThis.gridx = 0;
			gbc_lblOrPerformThis.gridy = 8;
			contentPanel.add(lblOrPerformThis, gbc_lblOrPerformThis);
		}
		{
			textField_1 = new JTextField();
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.fill = GridBagConstraints.BOTH;
			gbc_textField_1.gridx = 0;
			gbc_textField_1.gridy = 9;
			contentPanel.add(textField_1, gbc_textField_1);
			textField_1.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.RIGHT);
			buttonPane.setLayout(fl_buttonPane);
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
