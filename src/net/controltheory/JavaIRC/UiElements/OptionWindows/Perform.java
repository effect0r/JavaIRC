package net.controltheory.JavaIRC.UiElements.OptionWindows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Window.Type;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;

public class Perform extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public Perform() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Perform");
		setModalityType(ModalityType.APPLICATION_MODAL);
		setResizable(false);
		setBounds(100, 100, 298, 328);
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setHgap(5);
		getContentPane().setLayout(borderLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{149, 149, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JCheckBox chckbxEnablePerformOn = new JCheckBox("Enable perform on connect");
			GridBagConstraints gbc_chckbxEnablePerformOn = new GridBagConstraints();
			gbc_chckbxEnablePerformOn.gridwidth = 2;
			gbc_chckbxEnablePerformOn.anchor = GridBagConstraints.WEST;
			gbc_chckbxEnablePerformOn.insets = new Insets(5, 0, 5, 0);
			gbc_chckbxEnablePerformOn.gridx = 0;
			gbc_chckbxEnablePerformOn.gridy = 0;
			contentPanel.add(chckbxEnablePerformOn, gbc_chckbxEnablePerformOn);
		}
		{
			JLabel lblNetwork = new JLabel("Network:");
			GridBagConstraints gbc_lblNetwork = new GridBagConstraints();
			gbc_lblNetwork.anchor = GridBagConstraints.WEST;
			gbc_lblNetwork.gridwidth = 2;
			gbc_lblNetwork.insets = new Insets(10, 5, 5, 0);
			gbc_lblNetwork.gridx = 0;
			gbc_lblNetwork.gridy = 1;
			contentPanel.add(lblNetwork, gbc_lblNetwork);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBackground(new Color(240,240,240,1));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"All Networks", "Enterthegame", "Other Networks"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.insets = new Insets(0, 3, 5, 5);
			gbc_comboBox.anchor = GridBagConstraints.ABOVE_BASELINE;
			gbc_comboBox.gridx = 0;
			gbc_comboBox.gridy = 2;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JButton btnAdd = new JButton("Add");
			btnAdd.setMaximumSize(new Dimension(75, 23));
			btnAdd.setMinimumSize(new Dimension(75, 23));
			btnAdd.setPreferredSize(new Dimension(75, 23));
			GridBagConstraints gbc_btnAdd = new GridBagConstraints();
			gbc_btnAdd.anchor = GridBagConstraints.WEST;
			gbc_btnAdd.insets = new Insets(0, 0, 5, 0);
			gbc_btnAdd.gridx = 1;
			gbc_btnAdd.gridy = 2;
			contentPanel.add(btnAdd, gbc_btnAdd);
		}
		{
			JButton btnDelete = new JButton("Delete");
			btnDelete.setPreferredSize(new Dimension(75, 23));
			btnDelete.setMinimumSize(new Dimension(75, 23));
			btnDelete.setMaximumSize(new Dimension(75, 23));
			GridBagConstraints gbc_btnDelete = new GridBagConstraints();
			gbc_btnDelete.anchor = GridBagConstraints.WEST;
			gbc_btnDelete.insets = new Insets(0, 0, 5, 0);
			gbc_btnDelete.gridx = 1;
			gbc_btnDelete.gridy = 3;
			contentPanel.add(btnDelete, gbc_btnDelete);
		}
		{
			JLabel lblPerformCommands = new JLabel("Perform commands:");
			GridBagConstraints gbc_lblPerformCommands = new GridBagConstraints();
			gbc_lblPerformCommands.anchor = GridBagConstraints.WEST;
			gbc_lblPerformCommands.insets = new Insets(0, 5, 5, 5);
			gbc_lblPerformCommands.gridx = 0;
			gbc_lblPerformCommands.gridy = 4;
			contentPanel.add(lblPerformCommands, gbc_lblPerformCommands);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridwidth = 2;
			gbc_scrollPane.insets = new Insets(0, 5, 0, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 5;
			contentPanel.add(scrollPane, gbc_scrollPane);
			{
				JTextArea txtrPerformCommands = new JTextArea();
				scrollPane.setViewportView(txtrPerformCommands);
			}
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
