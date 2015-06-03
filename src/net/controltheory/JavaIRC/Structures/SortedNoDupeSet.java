package net.controltheory.JavaIRC.Structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.AbstractListModel;

public class SortedNoDupeSet extends AbstractListModel<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User[] set;
	private int indexOfLast;

	public SortedNoDupeSet() {
		set = new User[50];
		Arrays.fill(set, null);
		indexOfLast = 0;
	}

	private void sort() {
		ArrayList<User> opsList = getOps();
		ArrayList<User> voiceList = getVoice();
		ArrayList<User> hopList = getHops();
		ArrayList<User> normalList = getNormals();
		ArrayList<User> tmp = new ArrayList<>();
		Collections.sort(opsList);
		Collections.sort(voiceList);
		Collections.sort(normalList);
		Collections.sort(hopList);
		tmp.addAll(opsList);
		tmp.addAll(hopList);
		tmp.addAll(voiceList);
		tmp.addAll(normalList);
		Arrays.fill(set, null);
		indexOfLast = 0;		
		for (User u : tmp) {
			addInternal(u);
		}
		fireContentsChanged(this, 0, getSize());
	}

	private ArrayList<User> getOps() {
		// TODO Auto-generated method stub
		ArrayList<User> tmp = new ArrayList<>();
		for (User u : set) {
			if (u == null) {
				continue;
			}
			if (u.isOp()) {
				tmp.add(u);
			}
		}
		return tmp;
	}

	private ArrayList<User> getVoice() {
		// TODO Auto-generated method stub
		ArrayList<User> tmp = new ArrayList<>();
		for (User u : set) {
			if (u == null) {
				continue;
			}
			if (u.isVoice()) {
				tmp.add(u);
			}
		}
		return tmp;
	}

	private ArrayList<User> getHops() {
		// TODO Auto-generated method stub
		ArrayList<User> tmp = new ArrayList<>();
		for (User u : set) {
			if (u == null) {
				continue;
			}
			if (u.isHalfOp()) {
				tmp.add(u);
			}
		}
		return tmp;
	}

	private ArrayList<User> getNormals() {
		// TODO Auto-generated method stub
		ArrayList<User> tmp = new ArrayList<>();
		for (User u : set) {
			if (u == null) {
				continue;
			}
			if (!u.isVoice() && !u.isOp() && !u.isVoice()) {
				tmp.add(u);
			}
		}
		return tmp;
	}

	public boolean add(User item) {
		if (!contains(item)) {
			if (indexOfLast < set.length) {
				set[indexOfLast++] = item;
				sort();
				return true;
			} else {
				// doesn't contain item
				// double the array, then add.
				set = Arrays.copyOf(set, getSize() * 2);
				set[indexOfLast++] = item;
				sort();
				return true;
			}
		} else {
			return false;
		}
	}
	

	/**
	 * Add from within the class
	 * 
	 * @param u
	 *            user to be added
	 * @return true if item is added to the set, false otherwise.
	 */
	private boolean addInternal(User u) {
		if (!contains(u)) {
			if (indexOfLast < set.length) {
				set[indexOfLast++] = u;
				return true;
			} else {
				// double the array, then add.
				set = Arrays.copyOf(set, getSize() * 2);
				set[indexOfLast++] = u;
				return true;
			}
		} else {
			return false;
		}
	}

	public User remove(User item) {
		if (contains(item)) {
			int idxOf = findItemId(item);
			User tmp = set[idxOf];
			set[idxOf] = null;
			indexOfLast--;
			sort();
			return tmp;
		} else {
			return null;
		}
	}

	/**
	 * Finds item id
	 * 
	 * @param item
	 *            item to be found
	 * @return idx >=0 if found, -1 otherwise.
	 */
	private int findItemId(User item) {
		for (int i = 0; i < getSize(); i++) {
			if (set[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}

	public boolean contains(User item) {
		// TODO Auto-generated method stub
		return findItemId(item) >= 0 ? true : false;
	}

	public int getFrequencyOf(User item) {
		// TODO Auto-generated method stub
		return contains(item) ? 1 : 0;
	}

	public User[] toArr() {
		// TODO Auto-generated method stub
		User[] arr = new User[getSize()];
		arr = set;
		return arr;
	}

	@Override
	public User getElementAt(int index) {
		if (index <= indexOfLast)
			return set[index];
		else
			return null;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return indexOfLast;
	}

	public void update() {
		sort();
	}
}
