package net.controltheory.JavaIRC.UiElements.OptionWindows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;

public class Names extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public Names() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setTitle("Multi-Server");
		setResizable(false);
		setBounds(100, 100, 241, 173);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Show in status window switchbar button:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(2, 2, 5, 0);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 0;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxNetworkName = new JCheckBox("Network name");
				GridBagConstraints gbc_chckbxNetworkName = new GridBagConstraints();
				gbc_chckbxNetworkName.insets = new Insets(0, 0, 0, 5);
				gbc_chckbxNetworkName.gridx = 0;
				gbc_chckbxNetworkName.gridy = 0;
				panel.add(chckbxNetworkName, gbc_chckbxNetworkName);
			}
			{
				JCheckBox chckbxOwnNickname = new JCheckBox("Own nickname");
				GridBagConstraints gbc_chckbxOwnNickname = new GridBagConstraints();
				gbc_chckbxOwnNickname.gridx = 1;
				gbc_chckbxOwnNickname.gridy = 0;
				panel.add(chckbxOwnNickname, gbc_chckbxOwnNickname);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Show in channel/query titlebars:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 1;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JCheckBox chckbxNetworkName_1 = new JCheckBox("Network name");
				GridBagConstraints gbc_chckbxNetworkName_1 = new GridBagConstraints();
				gbc_chckbxNetworkName_1.insets = new Insets(0, 0, 0, 5);
				gbc_chckbxNetworkName_1.gridx = 0;
				gbc_chckbxNetworkName_1.gridy = 0;
				panel.add(chckbxNetworkName_1, gbc_chckbxNetworkName_1);
			}
			{
				JCheckBox chckbxOwnNickname_1 = new JCheckBox("Own nickname");
				GridBagConstraints gbc_chckbxOwnNickname_1 = new GridBagConstraints();
				gbc_chckbxOwnNickname_1.gridx = 1;
				gbc_chckbxOwnNickname_1.gridy = 0;
				panel.add(chckbxOwnNickname_1, gbc_chckbxOwnNickname_1);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.RIGHT);
			fl_buttonPane.setHgap(7);
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
