package org.zerock.domain;

import lombok.Data;

@Data
public class SampleDTO {
	private String name;
	private int age;

	public SampleDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public SampleDTO() {
		
	}
}
