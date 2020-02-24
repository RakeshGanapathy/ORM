package com.hibernate.demo.UserStorage;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "user_details")
public class UserDetails {
	@Id @GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;
	@Column(name = "user_name")
	private String Name;
	@Column(name = "joining_date")
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column(name = "user_ddress")
	@ElementCollection
	private Set<Address> setOfAddress = new HashSet<Address>();

	public Set<Address> getSetOfAddress() {
		return setOfAddress;
	}

	public void setSetOfAddress(Set<Address> setOfAddress) {
		this.setOfAddress = setOfAddress;
	}





	@Lob
	private String Description;

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", Name=" + Name + ", date=" + date + ", setOfAddress=" + setOfAddress
				+ ", Description=" + Description + "]";
	}


	


}
