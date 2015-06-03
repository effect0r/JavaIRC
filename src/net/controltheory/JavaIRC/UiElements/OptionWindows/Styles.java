package net.controltheory.JavaIRC.UiElements.OptionWindows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import java.awt.Dimension;
import java.awt.Dialog.ModalExclusionType;

public class Styles extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public Styles() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Styles");
		setBounds(100, 100, 179, 168);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{78, 29, -5, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblFrameStyle = new JLabel("Frame style:");
			GridBagConstraints gbc_lblFrameStyle = new GridBagConstraints();
			gbc_lblFrameStyle.anchor = GridBagConstraints.WEST;
			gbc_lblFrameStyle.insets = new Insets(0, 5, 5, 5);
			gbc_lblFrameStyle.gridx = 0;
			gbc_lblFrameStyle.gridy = 0;
			contentPanel.add(lblFrameStyle, gbc_lblFrameStyle);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Thin frame", "No frame"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.insets = new Insets(0, 5, 5, 5);
			gbc_comboBox.gridx = 0;
			gbc_comboBox.gridy = 1;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JLabel lblBorderColor = new JLabel("Border color:");
			GridBagConstraints gbc_lblBorderColor = new GridBagConstraints();
			gbc_lblBorderColor.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblBorderColor.insets = new Insets(0, 5, 5, 5);
			gbc_lblBorderColor.gridx = 0;
			gbc_lblBorderColor.gridy = 2;
			contentPanel.add(lblBorderColor, gbc_lblBorderColor);
		}
		{
			JLabel lblBorderSize = new JLabel("Border Size:");
			GridBagConstraints gbc_lblBorderSize = new GridBagConstraints();
			gbc_lblBorderSize.gridwidth = 2;
			gbc_lblBorderSize.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblBorderSize.insets = new Insets(0, 0, 5, 5);
			gbc_lblBorderSize.gridx = 1;
			gbc_lblBorderSize.gridy = 2;
			contentPanel.add(lblBorderSize, gbc_lblBorderSize);
		}
		{
			JEditorPane editorPane = new JEditorPane();
			GridBagConstraints gbc_editorPane = new GridBagConstraints();
			gbc_editorPane.anchor = GridBagConstraints.WEST;
			gbc_editorPane.insets = new Insets(0, 5, 0, 5);
			gbc_editorPane.fill = GridBagConstraints.VERTICAL;
			gbc_editorPane.gridx = 0;
			gbc_editorPane.gridy = 3;
			contentPanel.add(editorPane, gbc_editorPane);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.gridwidth = 2;
			gbc_comboBox.insets = new Insets(0, 0, 0, 5);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 3;
			contentPanel.add(comboBox, gbc_comboBox);
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
