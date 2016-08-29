package com.example.switchyard.switchyard_example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Sample {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String id;

}
