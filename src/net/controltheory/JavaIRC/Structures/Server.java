package net.controltheory.JavaIRC.Structures;

import org.json.simple.JSONObject;

public class Server {
	private String description;
	private String server;
	private String group;
	private String password;
	private int port;
	
	public Server(String desc, String server,String group,String password, int port) {
		this.description=desc;
		this.server=server;
		this.port=port;
		this.group = group;
		this.password=password;
	}

	public String getDescription() {
		return description;
	}

	public String getServer() {
		return server;
	}

	public String getGroup() {
		return group;
	}

	public String getPassword() {
		return password;
	}

	public int getPort() {
		return port;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	public JSONObject getJsonObject() {
		JSONObject obj = new JSONObject();
		obj.put("Description", description);
		obj.put("IRC Server", server);
		obj.put("Port",port);
		obj.put("Group", group);
		obj.put("Password", password);
		return obj;
	}
}
