package net.controltheory.JavaIRC.Structures;

public class User implements Comparable<User> {
	String nickname;
	String address;
	boolean isOp;
	boolean isVoice;
	boolean isHalfOp;

	public User(String nick, String address, boolean isOp, boolean isVoice, boolean isHalfOp) {
		this.nickname = nick;
		this.address = address;
		this.isHalfOp = isHalfOp;
		this.isOp = isOp;
		this.isVoice = isVoice;
	}

	public boolean isOp() {
		return this.isOp;
	}

	public boolean isVoice() {
		return this.isVoice;
	}

	public boolean isHalfOp() {
		return this.isHalfOp;
	}

	public String toString() {
		String ret = nickname;
		if (isVoice)
			ret = "+" + nickname;
		if (isHalfOp)
			ret = "%" + nickname;
		if (isOp)
			ret = "@" + nickname;
		return ret;

	}

	public void setHOp(boolean b) {
		this.isHalfOp = b;
	}

	public void setVoice(boolean b) {
		this.isVoice = b;
	}

	public void setOp(boolean b) {
		this.isOp = b;
	}

	public void setNick(String nick) {
		this.nickname = nick;
	}

	public void setAddress(String addy) {
		this.address = addy;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof User) {
			if (this.nickname.equals(((User) o).getNick())) {
				return true;
			}
		}
		return false;

	}

	public String getNick() {
		// TODO Auto-generated method stub
		return this.nickname;
	}

	@Override
	public int compareTo(User user) {
		return this.getNick().compareToIgnoreCase(((User) user).getNick());
	}

}
