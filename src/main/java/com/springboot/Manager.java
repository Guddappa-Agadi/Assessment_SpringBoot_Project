package com.springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "manager_tb")
public class Manager {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int manager_id;
	private String manager_name;
	private String manager_email;
	private String manager_phone;

	public Manager(int manager_id, String manager_name, String manager_email, String manager_phone) {
		super();
		this.manager_id = manager_id;
		this.manager_name = manager_name;
		this.manager_email = manager_email;
		this.manager_phone = manager_phone;
	}

	public Manager() {
		super();
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public String getManager_email() {
		return manager_email;
	}

	public void setManager_email(String manager_email) {
		this.manager_email = manager_email;
	}

	public String getManager_phone() {
		return manager_phone;
	}

	public void setManager_phone(String manager_phone) {
		this.manager_phone = manager_phone;
	}

	@Override
	public String toString() {
		return "Manager [manager_id=" + manager_id + ", manager_name=" + manager_name + ", manager_email="
				+ manager_email + ", manager_phone=" + manager_phone + "]";
	}

}
