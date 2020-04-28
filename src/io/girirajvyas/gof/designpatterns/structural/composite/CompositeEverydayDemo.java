package io.girirajvyas.gof.designpatterns.structural.composite;

import java.util.HashMap;
import java.util.Map;

public class CompositeEverydayDemo {
	public static void main(String[] args) {
		Map<String, String> personAttributes = new HashMap<>();
		personAttributes.put("site_role", "person");
		personAttributes.put("access_role", "limited");
		
		Map<String, String> groupAttributes = new HashMap<>();
		groupAttributes.put("group_role", "claims");
		
		Map<String, String> securityAttributes = new HashMap<>();
		securityAttributes.putAll(personAttributes);
		securityAttributes.putAll(groupAttributes);
		
		System.out.println(securityAttributes);
		
		
	}

}
