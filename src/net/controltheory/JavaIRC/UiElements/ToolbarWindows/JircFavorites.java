package net.controltheory.JavaIRC.UiElements.ToolbarWindows;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JCheckBox;

public class JircFavorites extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	public JircFavorites() {
		setTitle("JavaIRC Favorites");
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setBounds(100, 100, 305, 364);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblEnterAChannel = new JLabel("Enter a channel name and click join:");
		GridBagConstraints gbc_lblEnterAChannel = new GridBagConstraints();
		gbc_lblEnterAChannel.fill = GridBagConstraints.BOTH;
		gbc_lblEnterAChannel.insets = new Insets(0, 5, 5, 0);
		gbc_lblEnterAChannel.gridx = 0;
		gbc_lblEnterAChannel.gridy = 0;
		panel.add(lblEnterAChannel, gbc_lblEnterAChannel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 5, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblOrSelectA = new JLabel("Or select a channel from the list below:");
		GridBagConstraints gbc_lblOrSelectA = new GridBagConstraints();
		gbc_lblOrSelectA.insets = new Insets(0, 5, 5, 0);
		gbc_lblOrSelectA.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblOrSelectA.gridx = 0;
		gbc_lblOrSelectA.gridy = 2;
		panel.add(lblOrSelectA, gbc_lblOrSelectA);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.insets = new Insets(0, 5, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 3;
		panel.add(scrollPane, gbc_scrollPane);
		
		JList<String> list = new JList<>();
		list.setModel(new AbstractListModel<String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		JCheckBox chckbxPopupFavoritesOn = new JCheckBox("Popup favorites on connect");
		GridBagConstraints gbc_chckbxPopupFavoritesOn = new GridBagConstraints();
		gbc_chckbxPopupFavoritesOn.insets = new Insets(0, 5, 5, 0);
		gbc_chckbxPopupFavoritesOn.fill = GridBagConstraints.BOTH;
		gbc_chckbxPopupFavoritesOn.gridx = 0;
		gbc_chckbxPopupFavoritesOn.gridy = 6;
		panel.add(chckbxPopupFavoritesOn, gbc_chckbxPopupFavoritesOn);
		
		JCheckBox chckbxEnableJoinOn = new JCheckBox("Enable join on connect");
		GridBagConstraints gbc_chckbxEnableJoinOn = new GridBagConstraints();
		gbc_chckbxEnableJoinOn.insets = new Insets(0,5,5,0);
		gbc_chckbxEnableJoinOn.fill = GridBagConstraints.BOTH;
		gbc_chckbxEnableJoinOn.gridx = 0;
		gbc_chckbxEnableJoinOn.gridy = 7;
		panel.add(chckbxEnableJoinOn, gbc_chckbxEnableJoinOn);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.EAST);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{75, 0};
		gbl_panel_1.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnJoin = new JButton("Join");
		btnJoin.setPreferredSize(new Dimension(75, 23));
		GridBagConstraints gbc_btnJoin = new GridBagConstraints();
		gbc_btnJoin.insets = new Insets(21, 0, 5, 0);
		gbc_btnJoin.fill = GridBagConstraints.BOTH;
		gbc_btnJoin.gridx = 0;
		gbc_btnJoin.gridy = 0;
		panel_1.add(btnJoin, gbc_btnJoin);
		
		JButton btnAdd = new JButton("Add");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 0, 5, 0);
		gbc_btnAdd.fill = GridBagConstraints.BOTH;
		gbc_btnAdd.gridx = 0;
		gbc_btnAdd.gridy = 2;
		panel_1.add(btnAdd, gbc_btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		GridBagConstraints gbc_btnEdit = new GridBagConstraints();
		gbc_btnEdit.insets = new Insets(0, 0, 5, 0);
		gbc_btnEdit.fill = GridBagConstraints.BOTH;
		gbc_btnEdit.gridx = 0;
		gbc_btnEdit.gridy = 3;
		panel_1.add(btnEdit, gbc_btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.insets = new Insets(0, 0, 5, 0);
		gbc_btnDelete.fill = GridBagConstraints.BOTH;
		gbc_btnDelete.gridx = 0;
		gbc_btnDelete.gridy = 4;
		panel_1.add(btnDelete, gbc_btnDelete);
		
		JButton btnJoin_1 = new JButton("Join");
		GridBagConstraints gbc_btnJoin_1 = new GridBagConstraints();
		gbc_btnJoin_1.insets = new Insets(15, 0, 5, 0);
		gbc_btnJoin_1.fill = GridBagConstraints.BOTH;
		gbc_btnJoin_1.gridx = 0;
		gbc_btnJoin_1.gridy = 5;
		panel_1.add(btnJoin_1, gbc_btnJoin_1);
		
		JButton btnNames = new JButton("Names");
		GridBagConstraints gbc_btnNames = new GridBagConstraints();
		gbc_btnNames.insets = new Insets(0, 0, 12, 0);
		gbc_btnNames.fill = GridBagConstraints.BOTH;
		gbc_btnNames.gridx = 0;
		gbc_btnNames.gridy = 6;
		panel_1.add(btnNames, gbc_btnNames);
		
		JButton btnOk = new JButton("Ok");
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.fill = GridBagConstraints.BOTH;
		gbc_btnOk.gridx = 0;
		gbc_btnOk.gridy = 7;
		panel_1.add(btnOk, gbc_btnOk);
	}

}
