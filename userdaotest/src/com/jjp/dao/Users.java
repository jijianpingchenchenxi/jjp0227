package com.jjp.dao;
/**
 * 
 * @author JJP
 *
 */
public class Users {
	private int num;
	private String name;
	private char sex;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Users(int num, String name, char sex) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
	}
	public Users() {
		
	}
	@Override
	public String toString() {
		return "Users [序号=" + num + ", 名字=" + name + ", 性别=" + sex + "]";
	}
	
	
}
