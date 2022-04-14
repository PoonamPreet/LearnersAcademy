package com.hibernate.bean;

public class Student {
private int Id;
private String class_name;
private String sub_name;
private String std_name;

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getClass_name() {
	return class_name;
}

public void setClass_name(String class_name) {
	this.class_name = class_name;
}

public String getSub_name() {
	return sub_name;
}

public void setSub_name(String sub_name) {
	this.sub_name = sub_name;
}

public String getStd_name() {
	return std_name;
}

public void setStd_name(String std_name) {
	this.std_name = std_name;
}

@Override
public String toString() {
	return "Student [Id=" + Id + ", class_name=" + class_name + ", sub_name=" + sub_name + ", std_name=" + std_name
			+ "]";
}

}
