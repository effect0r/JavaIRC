package net.controltheory.JavaIRC.Structures;


import java.util.HashSet;
import java.util.Set;



public class Channel {
	private String 		topic, 
						key_pass,
						name;
	
	private int 		limit_amount;
	
	private Set<String>	bans_list;
	
	private boolean 	ops_topic_only,
						external_messages,
						invite_only,
						moderated,
						key,
						limit,
						private_chan,
						secret;
	
	public Channel(String name) {	
		this.topic = "";
		this.key_pass = "";
		this.limit_amount = 0;
		this.ops_topic_only = false;
		this.external_messages = false;
		this.invite_only = false;
		this.moderated = false;
		this.key = false;
		this.limit = false;
		this.private_chan = false;
		this.secret = false;
		this.name = name;
		this.bans_list = new HashSet<>();		
	}
	public void update(Channel ch) {
		this.ops_topic_only = ch.isOps_topic_only();
		this.external_messages = ch.isExternal_messages();
		this.invite_only = ch.isInvite_only();
		this.moderated = ch.isModerated();
		this.key = ch.isKey();
		this.limit = ch.isLimit();
		this.private_chan = ch.isPrivate_chan();
		this.secret = ch.isSecret();
	}
	
	
	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}
	/**
	 * @return the key_pass
	 */
	public String getKey_pass() {
		return key_pass;
	}
	/**
	 * @return the limit_amount
	 */
	public int getLimit_amount() {
		return limit_amount;
	}
	/**
	 * @return the bans_list
	 */
	public Set<String> getBans_list() {
		return bans_list;
	}
	/**
	 * @return the ops_topic_only
	 */
	public boolean isOps_topic_only() {
		return ops_topic_only;
	}
	/**
	 * @return the external_messages
	 */
	public boolean isExternal_messages() {
		return external_messages;
	}
	/**
	 * @return the invite_only
	 */
	public boolean isInvite_only() {
		return invite_only;
	}
	/**
	 * @return the moderated
	 */
	public boolean isModerated() {
		return moderated;
	}
	/**
	 * @return the key
	 */
	public boolean isKey() {
		return key;
	}
	/**
	 * @return the limit
	 */
	public boolean isLimit() {
		return limit;
	}
	/**
	 * @return the private_chan
	 */
	public boolean isPrivate_chan() {
		return private_chan;
	}
	/**
	 * @return the secret
	 */
	public boolean isSecret() {
		return secret;
	}
	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}
	/**
	 * @param key_pass the key_pass to set
	 */
	public void setKey_pass(String key_pass) {
		this.key_pass = key_pass;
	}
	/**
	 * @param limit_amount the limit_amount to set
	 */
	public void setLimit_amount(int limit_amount) {
		this.limit_amount = limit_amount;
	}
	
	/**
	 * @param ops_topic_only the ops_topic_only to set
	 */
	public void setOps_topic_only(boolean ops_topic_only) {
		this.ops_topic_only = ops_topic_only;
	}
	/**
	 * @param external_messages the external_messages to set
	 */
	public void setExternal_messages(boolean external_messages) {
		this.external_messages = external_messages;
	}
	/**
	 * @param invite_only the invite_only to set
	 */
	public void setInvite_only(boolean invite_only) {
		this.invite_only = invite_only;
	}
	/**
	 * @param moderated the moderated to set
	 */
	public void setModerated(boolean moderated) {
		this.moderated = moderated;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(boolean key) {
		this.key = key;
	}
	/**
	 * @param limit the limit to set
	 */
	public void setLimit(boolean limit) {
		this.limit = limit;
	}
	/**
	 * @param private_chan the private_chan to set
	 */
	public void setPrivate_chan(boolean private_chan) {
		this.private_chan = private_chan;
	}
	/**
	 * @param secret the secret to set
	 */
	public void setSecret(boolean secret) {
		this.secret = secret;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
}

