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
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.ScrollPaneConstants;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;

public class Lexicon extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;

	public Lexicon() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setTitle("Speech Lexicon");
		setBounds(100, 100, 260, 310);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblReplace = new JLabel("Replace:");
			GridBagConstraints gbc_lblReplace = new GridBagConstraints();
			gbc_lblReplace.insets = new Insets(0, 0, 5, 5);
			gbc_lblReplace.gridx = 0;
			gbc_lblReplace.gridy = 0;
			contentPanel.add(lblReplace, gbc_lblReplace);
		}
		{
			JLabel lblWithThisText = new JLabel("With this text:");
			GridBagConstraints gbc_lblWithThisText = new GridBagConstraints();
			gbc_lblWithThisText.insets = new Insets(0, 0, 5, 5);
			gbc_lblWithThisText.gridx = 1;
			gbc_lblWithThisText.gridy = 0;
			contentPanel.add(lblWithThisText, gbc_lblWithThisText);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 15);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 0;
			gbc_textField.gridy = 1;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.insets = new Insets(0, 0, 5, 5);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 1;
			gbc_textField_1.gridy = 1;
			contentPanel.add(textField_1, gbc_textField_1);
			textField_1.setColumns(10);
		}
		{
			JButton btnAdd = new JButton("Add");
			GridBagConstraints gbc_btnAdd = new GridBagConstraints();
			gbc_btnAdd.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnAdd.insets = new Insets(0, 0, 5, 0);
			gbc_btnAdd.gridx = 2;
			gbc_btnAdd.gridy = 1;
			contentPanel.add(btnAdd, gbc_btnAdd);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridwidth = 2;
			gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 2;
			contentPanel.add(scrollPane, gbc_scrollPane);
			{
				table = new JTable();
				table.setShowVerticalLines(false);
				table.setFillsViewportHeight(true);
				table.setShowGrid(false);
				table.setShowHorizontalLines(false);
				table.setTableHeader(null);
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null},
					},
					new String[] {
						"New column", "New column"
					}
				) {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;
					boolean[] columnEditables = new boolean[] {
						false, true
					};
					public boolean isCellEditable(int row, int column) {
						return columnEditables[column];
					}
				});
				table.getColumnModel().getColumn(0).setResizable(false);
				scrollPane.setViewportView(table);
			}
		}
		{
			JButton btnDelete = new JButton("Delete");
			GridBagConstraints gbc_btnDelete = new GridBagConstraints();
			gbc_btnDelete.insets = new Insets(0, 0, 5, 0);
			gbc_btnDelete.anchor = GridBagConstraints.NORTH;
			gbc_btnDelete.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnDelete.gridx = 2;
			gbc_btnDelete.gridy = 2;
			contentPanel.add(btnDelete, gbc_btnDelete);
		}
		{
			textField_2 = new JTextField();
			GridBagConstraints gbc_textField_2 = new GridBagConstraints();
			gbc_textField_2.gridwidth = 2;
			gbc_textField_2.insets = new Insets(0, 0, 5, 5);
			gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_2.gridx = 0;
			gbc_textField_2.gridy = 3;
			contentPanel.add(textField_2, gbc_textField_2);
			textField_2.setColumns(10);
		}
		{
			JButton btnTest = new JButton("Test");
			GridBagConstraints gbc_btnTest = new GridBagConstraints();
			gbc_btnTest.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnTest.insets = new Insets(0, 0, 5, 0);
			gbc_btnTest.gridx = 2;
			gbc_btnTest.gridy = 3;
			contentPanel.add(btnTest, gbc_btnTest);
		}
		{
			JCheckBox chckbxMatchOnlyWhole = new JCheckBox("Match only whole words");
			GridBagConstraints gbc_chckbxMatchOnlyWhole = new GridBagConstraints();
			gbc_chckbxMatchOnlyWhole.gridwidth = 2;
			gbc_chckbxMatchOnlyWhole.insets = new Insets(5, 0, 0, 5);
			gbc_chckbxMatchOnlyWhole.gridx = 0;
			gbc_chckbxMatchOnlyWhole.gridy = 4;
			contentPanel.add(chckbxMatchOnlyWhole, gbc_chckbxMatchOnlyWhole);
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
