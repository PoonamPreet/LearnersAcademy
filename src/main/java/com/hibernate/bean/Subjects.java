package com.hibernate.bean;

public class Subjects {
private int sub_id;
private String sub_name;
private String time;
private String class_name;
public int getSub_id() {
	return sub_id;
}
public void setSub_id(int sub_id) {
	this.sub_id = sub_id;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
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

@Override
public String toString() {
	return "Subjects [sub_id=" + sub_id + ", sub_name=" + sub_name + ", time=" + time + ", class_name=" + class_name + "]";
}
}
