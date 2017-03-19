/**
 * Copyright 2016-2017 Shyam Bhimani
 */

package org.shyam.sdk.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.shyam.sdk.messenger.model.Message;
import org.shyam.sdk.messenger.model.Profile;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	public static Map<String, Profile> getProfiles(){
		return profiles;
	}
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
}