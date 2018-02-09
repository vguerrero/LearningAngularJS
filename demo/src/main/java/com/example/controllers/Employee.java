package com.example.controllers;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private String firtsName;
	private String lastName;
	private float salary;

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
