package com.springboot;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="guest_tb")
public class Guest {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int guest_id;
	private String guest_name;
	private String guest_email;
	private String guest_phone;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Manager> manager = new ArrayList<>();
	public Guest(int guest_id, String guest_name, String guest_email, String guest_phone, List<Manager> manager) {
		super();
		this.guest_id = guest_id;
		this.guest_name = guest_name;
		this.guest_email = guest_email;
		this.guest_phone = guest_phone;
		this.manager = manager;
	}
	public Guest() {
		super();
	}
	public int getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}
	public String getGuest_name() {
		return guest_name;
	}
	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}
	public String getGuest_email() {
		return guest_email;
	}
	public void setGuest_email(String guest_email) {
		this.guest_email = guest_email;
	}
	public String getGuest_phone() {
		return guest_phone;
	}
	public void setGuest_phone(String guest_phone) {
		this.guest_phone = guest_phone;
	}
	public List<Manager> getManager() {
		return manager;
	}
	public void setManager(List<Manager> manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Guest [guest_id=" + guest_id + ", guest_name=" + guest_name + ", guest_email=" + guest_email
				+ ", guest_phone=" + guest_phone + ", manager=" + manager + "]";
	}
	
	
}
