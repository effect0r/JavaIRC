package net.controltheory.JavaIRC.Structures;

import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.AbstractListModel;

public class SortedUserList extends AbstractListModel<User> {
	
	SortedSet<User> model;
	
	private static final long serialVersionUID = 1L;
	
	SortedUserList() {
		this.model = new TreeSet<User>();
	}
	
	
	@Override
	public User getElementAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
