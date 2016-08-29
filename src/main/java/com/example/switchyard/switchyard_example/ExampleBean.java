package com.example.switchyard.switchyard_example;

import org.switchyard.component.bean.Service;

@Service(Example.class)
public class ExampleBean implements Example {
	
	public Sample execute(String input) {
		Sample sample = new Sample();
		sample.setId("12345");
		sample.setName("NAME");
		return sample;
	}

}
