package com.hibernate.demo.UserStorage;

import javax.persistence.Embeddable;

import org.hibernate.annotations.ColumnDefault;

import net.bytebuddy.implementation.bind.annotation.Default;

@Embeddable
public class Address {
private String streetName;
private String stateName;
@ColumnDefault("2")
private int doorNo;

public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getStateName() {
	return stateName;
}
public void setStateName(String stateName) {
	this.stateName = stateName;
}
public int getDoorNo() {
	return doorNo;
}
public void setDoorNo(int doorNo) {
	this.doorNo = doorNo;
}

}
