package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.*;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	public String getService(Entity entity) {
		String response = entity.getFirstName() + " " + entity.getLastName();
		return response;
	}

	public String getGreet(String name) {
		return "<h1><font color=pink>Hello World " + name + " !</font></h1>";
	}

	public String getCondition(String first, String last) {
		if (first.isEmpty() && last.isEmpty()) {
			return "<h1><font color=brown style=italic>Hello World!!!</font></h1>";
		} else if (first.isEmpty() && !last.isEmpty()) {
			return "<h1><font color=brown style=italic>Hello " + last + " !!!</font></h1>";
		} else if ((!first.isEmpty() && last.isEmpty())) {
			return "<h1><font color=brown style=italic>Hello " + first + "!!!</font></h1>";
		} else
			return "<h1><font color=brown style=italic>Hello " + first + " " + last + " !!!</font></h1>";
	}
}
