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
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;

public class Keys extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public Keys() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Keys");
		setResizable(false);
		setBounds(100, 100, 227, 255);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JCheckBox chckbxAltzClosesActive = new JCheckBox("Alt+Z closes active window");
			GridBagConstraints gbc_chckbxAltzClosesActive = new GridBagConstraints();
			gbc_chckbxAltzClosesActive.anchor = GridBagConstraints.WEST;
			gbc_chckbxAltzClosesActive.gridx = 0;
			gbc_chckbxAltzClosesActive.gridy = 0;
			contentPanel.add(chckbxAltzClosesActive, gbc_chckbxAltzClosesActive);
		}
		{
			JCheckBox chckbxControlkPopsUp = new JCheckBox("Control+K pops up color index");
			GridBagConstraints gbc_chckbxControlkPopsUp = new GridBagConstraints();
			gbc_chckbxControlkPopsUp.anchor = GridBagConstraints.WEST;
			gbc_chckbxControlkPopsUp.gridx = 0;
			gbc_chckbxControlkPopsUp.gridy = 1;
			contentPanel.add(chckbxControlkPopsUp, gbc_chckbxControlkPopsUp);
		}
		{
			JCheckBox chckbxControltabUsesSwitchbar = new JCheckBox("Control+Tab uses switchbar order");
			GridBagConstraints gbc_chckbxControltabUsesSwitchbar = new GridBagConstraints();
			gbc_chckbxControltabUsesSwitchbar.anchor = GridBagConstraints.WEST;
			gbc_chckbxControltabUsesSwitchbar.gridx = 0;
			gbc_chckbxControltabUsesSwitchbar.gridy = 2;
			contentPanel.add(chckbxControltabUsesSwitchbar, gbc_chckbxControltabUsesSwitchbar);
		}
		{
			JCheckBox chckbxEscapeKeyMinimizes = new JCheckBox("Escape key minimizes window");
			GridBagConstraints gbc_chckbxEscapeKeyMinimizes = new GridBagConstraints();
			gbc_chckbxEscapeKeyMinimizes.anchor = GridBagConstraints.WEST;
			gbc_chckbxEscapeKeyMinimizes.gridx = 0;
			gbc_chckbxEscapeKeyMinimizes.gridy = 3;
			contentPanel.add(chckbxEscapeKeyMinimizes, gbc_chckbxEscapeKeyMinimizes);
		}
		{
			JCheckBox chckbxShiftKeyEnables = new JCheckBox("Shift key enables hotlinks");
			GridBagConstraints gbc_chckbxShiftKeyEnables = new GridBagConstraints();
			gbc_chckbxShiftKeyEnables.anchor = GridBagConstraints.WEST;
			gbc_chckbxShiftKeyEnables.gridx = 0;
			gbc_chckbxShiftKeyEnables.gridy = 4;
			contentPanel.add(chckbxShiftKeyEnables, gbc_chckbxShiftKeyEnables);
		}
		{
			JCheckBox chckbxShiftKeyEnables_1 = new JCheckBox("Shift key enables right-click on titlebar");
			GridBagConstraints gbc_chckbxShiftKeyEnables_1 = new GridBagConstraints();
			gbc_chckbxShiftKeyEnables_1.anchor = GridBagConstraints.WEST;
			gbc_chckbxShiftKeyEnables_1.gridx = 0;
			gbc_chckbxShiftKeyEnables_1.gridy = 5;
			contentPanel.add(chckbxShiftKeyEnables_1, gbc_chckbxShiftKeyEnables_1);
		}
		{
			JCheckBox chckbxRightclickInListbox = new JCheckBox("Right-click in listbox selects line");
			GridBagConstraints gbc_chckbxRightclickInListbox = new GridBagConstraints();
			gbc_chckbxRightclickInListbox.anchor = GridBagConstraints.WEST;
			gbc_chckbxRightclickInListbox.gridx = 0;
			gbc_chckbxRightclickInListbox.gridy = 6;
			contentPanel.add(chckbxRightclickInListbox, gbc_chckbxRightclickInListbox);
		}
		{
			JCheckBox chckbxTabKeyChanges = new JCheckBox("Tab key changes editbox focus");
			GridBagConstraints gbc_chckbxTabKeyChanges = new GridBagConstraints();
			gbc_chckbxTabKeyChanges.anchor = GridBagConstraints.WEST;
			gbc_chckbxTabKeyChanges.gridx = 0;
			gbc_chckbxTabKeyChanges.gridy = 7;
			contentPanel.add(chckbxTabKeyChanges, gbc_chckbxTabKeyChanges);
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
