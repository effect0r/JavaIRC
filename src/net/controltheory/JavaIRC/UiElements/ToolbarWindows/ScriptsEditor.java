package net.controltheory.JavaIRC.UiElements.ToolbarWindows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ScriptsEditor extends JFrame {

	private JPanel contentPane;

	public ScriptsEditor() {
		setTitle("JavaIRC Scripts Editor");
		setMinimumSize(new Dimension(401, 458));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 458);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenu mnAlias = new JMenu("Alias");
		menuBar.add(mnAlias);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		tabbedPane.addTab("Aliases", null, textArea, null);
		
		JTextArea textArea_1 = new JTextArea();
		tabbedPane.addTab("Popups", null, textArea_1, null);
		
		JTextArea textArea_2 = new JTextArea();
		tabbedPane.addTab("Remote", null, textArea_2, null);
		
		JTextArea txtrUsers = new JTextArea();
		txtrUsers.setText("Users");
		tabbedPane.addTab("Users", null, txtrUsers, null);
		
		JTextArea txtrVariables = new JTextArea();
		txtrVariables.setText("Variables");
		tabbedPane.addTab("Variables", null, txtrVariables, null);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblFile = new JLabel("File: aliases.ini");
		GridBagConstraints gbc_lblFile = new GridBagConstraints();
		gbc_lblFile.anchor = GridBagConstraints.WEST;
		gbc_lblFile.gridwidth = 2;
		gbc_lblFile.insets = new Insets(0, 5, 5, 5);
		gbc_lblFile.gridx = 0;
		gbc_lblFile.gridy = 0;
		panel.add(lblFile, gbc_lblFile);
		
		JLabel lblk_1 = new JLabel("74:16/17 (0.4)");
		GridBagConstraints gbc_lblk_1 = new GridBagConstraints();
		gbc_lblk_1.anchor = GridBagConstraints.EAST;
		gbc_lblk_1.gridwidth = 2;
		gbc_lblk_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblk_1.gridx = 3;
		gbc_lblk_1.gridy = 0;
		panel.add(lblk_1, gbc_lblk_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setMinimumSize(new Dimension(75, 23));
		btnNewButton.setMaximumSize(new Dimension(75, 23));
		btnNewButton.setPreferredSize(new Dimension(75, 23));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setMinimumSize(new Dimension(75, 23));
		btnCancel.setMaximumSize(new Dimension(75, 23));
		btnCancel.setPreferredSize(new Dimension(75, 23));
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 2;
		gbc_btnCancel.gridy = 1;
		panel.add(btnCancel, gbc_btnCancel);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setMinimumSize(new Dimension(75, 23));
		btnHelp.setMaximumSize(new Dimension(75, 23));
		btnHelp.setPreferredSize(new Dimension(75, 23));
		GridBagConstraints gbc_btnHelp = new GridBagConstraints();
		gbc_btnHelp.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnHelp.insets = new Insets(0, 0, 0, 5);
		gbc_btnHelp.gridx = 3;
		gbc_btnHelp.gridy = 1;
		panel.add(btnHelp, gbc_btnHelp);
	}

}
