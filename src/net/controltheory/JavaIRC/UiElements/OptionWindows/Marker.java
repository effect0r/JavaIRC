package net.controltheory.JavaIRC.UiElements.OptionWindows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dimension;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;

public class Marker extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public Marker() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setTitle("Marker");
		setBounds(100, 100, 194, 211);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JCheckBox chckbxShowLineMarker = new JCheckBox("Show line marker");
			GridBagConstraints gbc_chckbxShowLineMarker = new GridBagConstraints();
			gbc_chckbxShowLineMarker.gridwidth = 2;
			gbc_chckbxShowLineMarker.anchor = GridBagConstraints.WEST;
			gbc_chckbxShowLineMarker.insets = new Insets(5, 0, 5, 5);
			gbc_chckbxShowLineMarker.gridx = 0;
			gbc_chckbxShowLineMarker.gridy = 0;
			contentPanel.add(chckbxShowLineMarker, gbc_chckbxShowLineMarker);
		}
		{
			JLabel lblColor = new JLabel("Color:");
			GridBagConstraints gbc_lblColor = new GridBagConstraints();
			gbc_lblColor.insets = new Insets(0, 0, 5, 5);
			gbc_lblColor.anchor = GridBagConstraints.WEST;
			gbc_lblColor.gridx = 0;
			gbc_lblColor.gridy = 1;
			contentPanel.add(lblColor, gbc_lblColor);
		}
		{
			JLabel lblSize = new JLabel("Size:");
			GridBagConstraints gbc_lblSize = new GridBagConstraints();
			gbc_lblSize.insets = new Insets(0, 0, 5, 5);
			gbc_lblSize.anchor = GridBagConstraints.WEST;
			gbc_lblSize.gridx = 1;
			gbc_lblSize.gridy = 1;
			contentPanel.add(lblSize, gbc_lblSize);
		}
		{
			JComboBox comboBox = new JComboBox();
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 15, 5);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 0;
			gbc_comboBox.gridy = 2;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 15, 5);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 2;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JLabel lblUserPictureAs = new JLabel("User picture as line marker:");
			GridBagConstraints gbc_lblUserPictureAs = new GridBagConstraints();
			gbc_lblUserPictureAs.insets = new Insets(0, 0, 5, 0);
			gbc_lblUserPictureAs.gridwidth = 3;
			gbc_lblUserPictureAs.gridx = 0;
			gbc_lblUserPictureAs.gridy = 3;
			contentPanel.add(lblUserPictureAs, gbc_lblUserPictureAs);
		}
		{
			JButton button = new JButton("");
			button.setPreferredSize(new Dimension(33, 23));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.fill = GridBagConstraints.BOTH;
			gbc_button.gridwidth = 3;
			gbc_button.gridx = 0;
			gbc_button.gridy = 4;
			contentPanel.add(button, gbc_button);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
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
