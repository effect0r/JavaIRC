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
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Dialog.ModalExclusionType;

public class Tray extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public Tray() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Tray");
		setBounds(100, 100, 240, 270);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{77, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 23, 19, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JCheckBox chckbxAlwaysShowJavairc = new JCheckBox("Always show JavaIRC icon in tray");
			GridBagConstraints gbc_chckbxAlwaysShowJavairc = new GridBagConstraints();
			gbc_chckbxAlwaysShowJavairc.anchor = GridBagConstraints.WEST;
			gbc_chckbxAlwaysShowJavairc.gridwidth = 3;
			gbc_chckbxAlwaysShowJavairc.gridx = 0;
			gbc_chckbxAlwaysShowJavairc.gridy = 0;
			contentPanel.add(chckbxAlwaysShowJavairc, gbc_chckbxAlwaysShowJavairc);
		}
		{
			JCheckBox chckbxOnStartupMinimize = new JCheckBox("On startup minimize JavaIRC to tray");
			GridBagConstraints gbc_chckbxOnStartupMinimize = new GridBagConstraints();
			gbc_chckbxOnStartupMinimize.insets = new Insets(0, 0, 1, 0);
			gbc_chckbxOnStartupMinimize.anchor = GridBagConstraints.WEST;
			gbc_chckbxOnStartupMinimize.gridwidth = 3;
			gbc_chckbxOnStartupMinimize.gridx = 0;
			gbc_chckbxOnStartupMinimize.gridy = 1;
			contentPanel.add(chckbxOnStartupMinimize, gbc_chckbxOnStartupMinimize);
		}
		{
			JCheckBox chckbxPlaceJavaircIn = new JCheckBox("Place JavaIRC in tray when minimized");
			GridBagConstraints gbc_chckbxPlaceJavaircIn = new GridBagConstraints();
			gbc_chckbxPlaceJavaircIn.insets = new Insets(0, 0, 1, 0);
			gbc_chckbxPlaceJavaircIn.gridwidth = 3;
			gbc_chckbxPlaceJavaircIn.anchor = GridBagConstraints.WEST;
			gbc_chckbxPlaceJavaircIn.gridx = 0;
			gbc_chckbxPlaceJavaircIn.gridy = 2;
			contentPanel.add(chckbxPlaceJavaircIn, gbc_chckbxPlaceJavaircIn);
		}
		{
			JCheckBox chckbxAnimiateIconWhen = new JCheckBox("Animiate icon when there is activity");
			GridBagConstraints gbc_chckbxAnimiateIconWhen = new GridBagConstraints();
			gbc_chckbxAnimiateIconWhen.insets = new Insets(0, 0, 1, 0);
			gbc_chckbxAnimiateIconWhen.anchor = GridBagConstraints.WEST;
			gbc_chckbxAnimiateIconWhen.gridwidth = 3;
			gbc_chckbxAnimiateIconWhen.gridx = 0;
			gbc_chckbxAnimiateIconWhen.gridy = 3;
			contentPanel.add(chckbxAnimiateIconWhen, gbc_chckbxAnimiateIconWhen);
		}
		{
			JCheckBox chckbxSingleClickOn = new JCheckBox("Single click on tray icon to open");
			GridBagConstraints gbc_chckbxSingleClickOn = new GridBagConstraints();
			gbc_chckbxSingleClickOn.insets = new Insets(0, 0, 1, 0);
			gbc_chckbxSingleClickOn.anchor = GridBagConstraints.WEST;
			gbc_chckbxSingleClickOn.gridwidth = 3;
			gbc_chckbxSingleClickOn.gridx = 0;
			gbc_chckbxSingleClickOn.gridy = 4;
			contentPanel.add(chckbxSingleClickOn, gbc_chckbxSingleClickOn);
		}
		{
			JLabel lblTrayIcon = new JLabel("Tray icon:");
			GridBagConstraints gbc_lblTrayIcon = new GridBagConstraints();
			gbc_lblTrayIcon.insets = new Insets(0, 0, 1, 5);
			gbc_lblTrayIcon.gridx = 1;
			gbc_lblTrayIcon.gridy = 5;
			contentPanel.add(lblTrayIcon, gbc_lblTrayIcon);
		}
		{
			JTextPane textPane = new JTextPane();
			GridBagConstraints gbc_textPane = new GridBagConstraints();
			gbc_textPane.gridheight = 2;
			gbc_textPane.insets = new Insets(0, 0, 1, 5);
			gbc_textPane.fill = GridBagConstraints.BOTH;
			gbc_textPane.gridx = 1;
			gbc_textPane.gridy = 6;
			contentPanel.add(textPane, gbc_textPane);
		}
		{
			JButton btnDefault = new JButton("Default");
			btnDefault.setPreferredSize(new Dimension(75, 23));
			GridBagConstraints gbc_btnDefault = new GridBagConstraints();
			gbc_btnDefault.anchor = GridBagConstraints.NORTH;
			gbc_btnDefault.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnDefault.insets = new Insets(0, 0, 1, 0);
			gbc_btnDefault.gridx = 2;
			gbc_btnDefault.gridy = 6;
			contentPanel.add(btnDefault, gbc_btnDefault);
		}
		{
			JButton btnSelect = new JButton("Select");
			btnSelect.setPreferredSize(new Dimension(23, 23));
			GridBagConstraints gbc_btnSelect = new GridBagConstraints();
			gbc_btnSelect.anchor = GridBagConstraints.NORTH;
			gbc_btnSelect.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnSelect.gridx = 2;
			gbc_btnSelect.gridy = 7;
			contentPanel.add(btnSelect, gbc_btnSelect);
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
