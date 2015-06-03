package net.controltheory.JavaIRC.Structures;

@SuppressWarnings("hiding")
public interface SetInterface<User> {

	public int size();

	public boolean add(User item);

	public boolean remove(User item);

	public boolean contains(User item);

	public int getFrequencyOf(User item);

	public User[] toArr();
	
}
