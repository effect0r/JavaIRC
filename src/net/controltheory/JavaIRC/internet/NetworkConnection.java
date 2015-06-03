package net.controltheory.JavaIRC.internet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

import net.controltheory.JavaIRC.Structures.User;
import net.controltheory.JavaIRC.UiElements.MainWindow;

public class NetworkConnection implements Runnable {
	static Thread thread;
	static String server;
	static String name;
	String channel;
	static String email_prefix;
	int port;
	static BufferedWriter writer;
	static BufferedReader reader;
	static Socket socket;
	boolean isConnected = false;

	public NetworkConnection(String server, int port, String name, String channel, String email_prefix) {
		NetworkConnection.server = server;
		this.port = port;
		NetworkConnection.name = name;
		this.channel = channel;

		NetworkConnection.email_prefix = email_prefix;
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket(server, port);
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		isConnected = true;
	}

	public void connect() {
		thread = new Thread(this);
		thread.start();
	}

	public boolean isConnected() {
		return this.isConnected;
	}

	ArrayList<User> userList = new ArrayList<>();
	String channelFor366 = "";

	@Override
	public void run() {
		try {
			writer.write("NICK " + name + "\r\n");
			writer.write("USER " + name + " 8 * : What does this do\r\n");
			writer.flush();
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println("[DEBUG]: " + line);
				String[] tokens = line.split(" ");
				// [0] address
				// [1] command

				if (tokens[1].equals("004")) {
					writer.write("NICK " + name + "\r\n");
					writer.write("USER " + email_prefix + " 8 * : What does this do\r\n");
					
					writer.flush();
				} else if (tokens[1].equals("433")) {
					System.out.println("Nick in use.");
					writer.write("NICK " + name + "`\r\n");
					writer.write("USER " + email_prefix + " 8 * : Stuff\r\n");
					
					writer.flush();
					name = name + "`";
				}

				if (tokens[0].equals("PING")) {
					writer.write("PONG " + line.substring(5) + "\r\n");
					// writer.write("PRIVMSG " + channel +
					// " :I got pinged!\r\n");
					writer.flush();
				}			 
				if (tokens[1].equals("310")){
					//:paintball.tx.us.globalgamers.net 310 effect0r`java ChanServ :is a Network Service
					MainWindow.writeToConsole(line, MainWindow.getSelectedButton().getName());
				}
				if (tokens[1].equals("311")) {
					//address and identity
					//:paintball.tx.us.globalgamers.net 311 effect0r`java effect0r`java effect0r`j effect0r.user.globalgamers.net * : What does this do
					MainWindow.writeToConsole(line, MainWindow.getSelectedButton().getName());
				}
				if (tokens[1].equals("312")) {
					//server connected to
					//:paintball.tx.us.globalgamers.net 312 effect0r`java effect0r`java paintball.tx.us.globalgamers.net :The goggles!  They do nothing!
					MainWindow.writeToConsole(line, MainWindow.getSelectedButton().getName());
				}
				if (tokens[1].equals("313")) {
					//:paintball.tx.us.globalgamers.net 313 effect0r`java ChanServ :is an IRC Operator
					MainWindow.writeToConsole(line, MainWindow.getSelectedButton().getName());
				}
				if (tokens[1].equals("317")) {
					//idle time, signon time
					//:paintball.tx.us.globalgamers.net 317 effect0r`java effect0r`java 12 1420097951 :seconds idle, signon time
					MainWindow.writeToConsole(line, MainWindow.getSelectedButton().getName());
				}
				if (tokens[1].equals("318")) {
					//end of whois list
					//:paintball.tx.us.globalgamers.net 318 effect0r`java effect0r`java :End of /WHOIS list.
					MainWindow.writeToConsole(line, MainWindow.getSelectedButton().getName());
				}
				if (tokens[1].equals("319")) {
					//channels list (and status within)
					//:paintball.tx.us.globalgamers.net 319 effect0r`java effect0r`java :@#effect0r
					MainWindow.writeToConsole(line, MainWindow.getSelectedButton().getName());
				}
				if (tokens[1].equals("320")) {
					//connected from
					//:paintball.tx.us.globalgamers.net 320 effect0r`java effect0r`java :is connected from United States
					MainWindow.writeToConsole(line, MainWindow.getSelectedButton().getName());
				}
				if (tokens[1].equals("330")) {
					//login name
					//:paintball.tx.us.globalgamers.net 330 effect0r`java effect0r`java effect0r :is logged in as
					MainWindow.writeToConsole(line, MainWindow.getSelectedButton().getName());
				}
				if (tokens[1].equals("338")) {
					//user@host, actual ip
					//:paintball.tx.us.globalgamers.net 338 effect0r`java effect0r`java effect0r`j@97.87.32.235 97.87.32.235 :Actual user@host, Actual IP
					MainWindow.writeToConsole(line, MainWindow.getSelectedButton().getName());
				}
				if (tokens[1].equals("324")) {
					// channel modes
					MainWindow.parseMode(line);
				}
				if (tokens[1].equals("332")) {
					String[] lineTokens = line.split(" ");
					/*
					 * :paintball.tx.us.globalgamers.net 332 effect0r`java
					 * #scriptij :Merry Christmas to all! [0] address [1] this
					 * number [2] YOUR nick [3] channel [4] :msg
					 */
					String msg = "";
					for (int i = 4; i < lineTokens.length; i++) {
						if (i == 4) {
							msg += lineTokens[i].substring(1) + " ";
						} else {
							msg += lineTokens[i] + " ";
						}
						// System.out.println(infoSplit[i]);
					}
					MainWindow.topic(lineTokens[3], msg.substring(0, msg.length() - 1));
				}
				if (tokens[1].equals("333")) {
					String[] lineTokens = line.split(" ");
					// topic set time
					/*
					 * :paintball.tx.us.globalgamers.net 333 effect0r`java
					 * #scriptij Schm0rky 1419466466 [0] address [1] this number
					 * [2] your nick [3] channel [4] setter's nick [5] set time
					 */
					// do stuff with this.. at some point
				}
				if (tokens[1].equals("353")) {
					// user list
					// build the array list here and send it with 366
					// <- :paintball.tx.us.globalgamers.net 353 effect0r @
					// #scriptij :effect0r!acid@effect0r.user.globalgamers.net
					// @effect0r`java!effect0r`j@effect0r.user.globalgamers.net
					// @+Schm0rky|bnc!Schm0rky@Schm0rky.user.globalgamers.net
					// @+Rob!uid25947@rob.user.globalgamers.net
					// @ChanServ!ChanServ@services.globalgamers.net

					String[] lineTokens = line.split(" ");
					// [0] => server address
					// [1] => command
					// [2] => request username
					// [3] => YOUR MODE
					// [4] => channel
					// [5] => (onward) usernames
					for (int i = 5; i < lineTokens.length; i++) {
						String address = lineTokens[i];
						String user = lineTokens[i].split("!")[0];
						boolean op, voice, hop;
						op = voice = hop = false;
						String name;
						if (user.substring(1).equals(tokens[2])) {
							// it's me
							switch (tokens[3].charAt(0)) {
							case '@':
								op = true;
								name = user.substring(1);
								break;
							// user is voiced
							case '+':
								voice = true;
								name = user.substring(1);
								break;
							// user is halfopped
							case '%':
								hop = true;
								name = user.substring(1);
								break;
							case '=':
								name = user.substring(1);
								break;
							// normal user
							default:
								name = user.substring(1);
								break;
							}
						} else {
							switch (user.charAt(0)) {
							// user is opped
							case '@':
								op = true;
								name = user.substring(1);
								break;
							// user is voiced
							case '+':
								voice = true;
								name = user.substring(1);
								break;
							// user is halfopped
							case '%':
								hop = true;
								name = user.substring(1);
								break;
							case ':':
								name = user.substring(1);
								break;
							// normal user
							default:
								name = user;
								break;
							}
						}
						User u = new User(name, address, op, voice, hop);
						userList.add(u);
					}
					channelFor366 = lineTokens[4];
				}
				if (tokens[1].equals("366")) {
					MainWindow.populateUserList(userList, tokens[3]);
					userList.clear();
				}
				if (tokens[1].equals("PART")) {
					String[] lineTokens = line.split(" ");
					// [0] => user address
					// [1] => command
					// [2] => channel
					MainWindow.updateUsers(lineTokens[0], lineTokens[1], lineTokens[2]);

				}
				if (tokens[1].equals("JOIN")) {
					if ((line.split(":")[1]).split("!")[0].equals(name)) {

						// :effect0r`java!effect0r`j@effect0r.user.globalgamers.net
						// JOIN #scriptij
						String[] lineTokens = line.split(" ");

						MainWindow.createChannelWindow(lineTokens[2]);
						sendCommand("MODE " + lineTokens[2] + "\r\n");
					} else {
						// someone else joined
						// :effect0r`!acid@effect0r.user.globalgamers.net JOIN
						// #scriptij
						String[] lineTokens = line.split(" ");
						/*
						 * [0] address [1] command [2] channel
						 */
						MainWindow.updateUsers(lineTokens[0], lineTokens[1], lineTokens[2]);
					}
				}
				if (tokens[1].equals("MODE")) {
					MainWindow.parseMode(line);
				}
				if (tokens[1].equals("NICK")) {
					
					MainWindow.updateAllNicks(line);
				}
				if (tokens[1].equals("PRIVMSG")) {
					// :Venfayth!quassel@venfayth.user.globalgamers.net PRIVMSG
					// #globalgamers :no

					String[] lineTokens = line.split(" ");
					/*
					 * [0] address
					 * :Venfayth!quassel@venfayth.user.globalgamers.net [1]
					 * command [2] channel [3].. message
					 */
					String msg = "(" + lineTokens[0].split("!")[0].substring(1) + ")";
					for (int i = 3; i < lineTokens.length; i++) {
						if (i == 3) {
							msg += lineTokens[i].substring(1) + " ";
						} else {
							msg += lineTokens[i] + " ";
						}

					}
					MainWindow.writeToConsole(msg.substring(0, msg.length() - 1), lineTokens[2]);
					continue;
				}
				MainWindow.writeToConsole(line, "System");
			}
			isConnected = false;
			// socket.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void sendCommand(String command) {
		try {
			writer.write(command);
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void joinChannel(String channel) {
		try {
			writer.write("JOIN " + channel + "\r\n");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void destroy() throws IOException {
		if (socket != null) {
			socket.close();
		}
		if (writer != null) {
			writer.close();
		}
		if (reader != null) {
			reader.close();
		}

	}

	public static String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
