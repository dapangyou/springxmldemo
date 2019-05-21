package com.test.entity;

import java.io.Serializable;

/**
 * 实体类,每个字段对应springDemo表中的字段
 */
public class User implements Serializable {

	private int id;

	private String name;

	private String sex;

	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
