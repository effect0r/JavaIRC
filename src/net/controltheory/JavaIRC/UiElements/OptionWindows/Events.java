package net.controltheory.JavaIRC.UiElements.OptionWindows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;

public class Events extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public Events() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Events");
		setBounds(100, 100, 220, 280);
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setHgap(5);
		getContentPane().setLayout(borderLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblTheDefaultDisplay = new JLabel("<html>The default display settings for various channel events can be changed here.</html>");
			lblTheDefaultDisplay.setFont(new Font("Tahoma", Font.PLAIN, 11));
			GridBagConstraints gbc_lblTheDefaultDisplay = new GridBagConstraints();
			gbc_lblTheDefaultDisplay.fill = GridBagConstraints.BOTH;
			gbc_lblTheDefaultDisplay.gridwidth = 2;
			gbc_lblTheDefaultDisplay.insets = new Insets(3, 3, 5, 0);
			gbc_lblTheDefaultDisplay.gridx = 0;
			gbc_lblTheDefaultDisplay.gridy = 0;
			contentPanel.add(lblTheDefaultDisplay, gbc_lblTheDefaultDisplay);
		}
		{
			JLabel lblJoins = new JLabel("Joins:");
			GridBagConstraints gbc_lblJoins = new GridBagConstraints();
			gbc_lblJoins.anchor = GridBagConstraints.WEST;
			gbc_lblJoins.insets = new Insets(0, 12, 0, 0);
			gbc_lblJoins.gridx = 0;
			gbc_lblJoins.gridy = 1;
			contentPanel.add(lblJoins, gbc_lblJoins);
		}
		{
			JLabel lblModes = new JLabel("Modes:");
			GridBagConstraints gbc_lblModes = new GridBagConstraints();
			gbc_lblModes.anchor = GridBagConstraints.WEST;
			gbc_lblModes.gridx = 1;
			gbc_lblModes.gridy = 1;
			contentPanel.add(lblModes, gbc_lblModes);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"In Channel", "In Status", "Hide"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.anchor = GridBagConstraints.WEST;
			gbc_comboBox.insets = new Insets(0, 10, 0, 5);
			gbc_comboBox.gridx = 0;
			gbc_comboBox.gridy = 2;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"In Channel", "In Status", "Hide"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.anchor = GridBagConstraints.WEST;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 2;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JLabel lblParts = new JLabel("Parts:");
			GridBagConstraints gbc_lblParts = new GridBagConstraints();
			gbc_lblParts.anchor = GridBagConstraints.WEST;
			gbc_lblParts.insets = new Insets(0, 12, 0, 0);
			gbc_lblParts.gridx = 0;
			gbc_lblParts.gridy = 3;
			contentPanel.add(lblParts, gbc_lblParts);
		}
		{
			JLabel lblTopics = new JLabel("Topics:");
			GridBagConstraints gbc_lblTopics = new GridBagConstraints();
			gbc_lblTopics.anchor = GridBagConstraints.WEST;
			gbc_lblTopics.gridx = 1;
			gbc_lblTopics.gridy = 3;
			contentPanel.add(lblTopics, gbc_lblTopics);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"In Channel", "In Status", "Hide"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.anchor = GridBagConstraints.WEST;
			gbc_comboBox.insets = new Insets(0, 10, 0, 5);
			gbc_comboBox.gridx = 0;
			gbc_comboBox.gridy = 4;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"In Channel", "In Status", "Hide"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.anchor = GridBagConstraints.WEST;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 4;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JLabel lblQuits = new JLabel("Quits:");
			GridBagConstraints gbc_lblQuits = new GridBagConstraints();
			gbc_lblQuits.anchor = GridBagConstraints.WEST;
			gbc_lblQuits.insets = new Insets(0, 12, 0, 5);
			gbc_lblQuits.gridx = 0;
			gbc_lblQuits.gridy = 5;
			contentPanel.add(lblQuits, gbc_lblQuits);
		}
		{
			JLabel lblCtcps = new JLabel("Ctcps:");
			GridBagConstraints gbc_lblCtcps = new GridBagConstraints();
			gbc_lblCtcps.anchor = GridBagConstraints.WEST;
			gbc_lblCtcps.insets = new Insets(0, 5, 0, 0);
			gbc_lblCtcps.gridx = 1;
			gbc_lblCtcps.gridy = 5;
			contentPanel.add(lblCtcps, gbc_lblCtcps);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"In Channel", "In Status", "Hide"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.anchor = GridBagConstraints.WEST;
			gbc_comboBox.insets = new Insets(0, 10, 0, 5);
			gbc_comboBox.gridx = 0;
			gbc_comboBox.gridy = 6;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"In Channel", "In Status", "Hide"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.anchor = GridBagConstraints.WEST;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 6;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JLabel lblKicks = new JLabel("Kicks:");
			GridBagConstraints gbc_lblKicks = new GridBagConstraints();
			gbc_lblKicks.anchor = GridBagConstraints.WEST;
			gbc_lblKicks.insets = new Insets(0, 12, 0, 5);
			gbc_lblKicks.gridx = 0;
			gbc_lblKicks.gridy = 7;
			contentPanel.add(lblKicks, gbc_lblKicks);
		}
		{
			JLabel lblNicks = new JLabel("Nicks:");
			GridBagConstraints gbc_lblNicks = new GridBagConstraints();
			gbc_lblNicks.anchor = GridBagConstraints.WEST;
			gbc_lblNicks.insets = new Insets(0, 5, 0, 0);
			gbc_lblNicks.gridx = 1;
			gbc_lblNicks.gridy = 7;
			contentPanel.add(lblNicks, gbc_lblNicks);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"In Channel", "In Status", "Hide"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.anchor = GridBagConstraints.WEST;
			gbc_comboBox.insets = new Insets(0, 10, 0, 0);
			gbc_comboBox.gridx = 0;
			gbc_comboBox.gridy = 8;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"In Channel", "In Status", "Hide"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.anchor = GridBagConstraints.WEST;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 8;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				okButton.setPreferredSize(new Dimension(73,23));
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setPreferredSize(new Dimension(73,23));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
