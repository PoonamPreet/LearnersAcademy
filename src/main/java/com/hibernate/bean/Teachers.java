package com.hibernate.bean;

public class Teachers {
private int t_id;
private String t_name;
private String t_sub;
private String t_class;

public int getT_id() {
	return t_id;
}
public void setT_id(int t_id) {
	this.t_id = t_id;
}
public String getT_name() {
	return t_name;
}
public void setT_name(String t_name) {
	this.t_name = t_name;
}
public String getT_sub() {
	return t_sub;
}
public void setT_sub(String t_sub) {
	this.t_sub = t_sub;
}
public String getT_class() {
	return t_class;
}
public void setT_class(String t_class) {
	this.t_class = t_class;
}
@Override
public String toString() {
	return "Teachers [t_id=" + t_id + ", t_name=" + t_name + ", t_sub=" + t_sub + ", t_class=" + t_class + "]";
}

}
