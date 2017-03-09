/**
 * Copyright 2016-2017 Shyam Bhimani
 */

package org.shyam.sdk.messenger.services;

import java.util.ArrayList;
import java.util.List;

import org.shyam.sdk.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1L, "Hello World!", "Shyam");
		Message m2 = new Message(2L, "Jersey Here", "Shyam");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}

}
