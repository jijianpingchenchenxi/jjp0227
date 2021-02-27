package com.jjp.dao.test;

import com.jjp.dao.UserDao;

import com.jjp.dao.UserDaoImpl;
import com.jjp.dao.Users;

public class UserTest {
	public static void main(String[] args) {
		UserDao a = new UserDaoImpl();
		System.out.println("HELLOW WORLD");
		System.out.println("HELLOW WORLD");
		/**
		 * 添加数据
		 */
		Users users01 = new Users(4,"666",'男');
		int addCount = a.addInfo(users01);
		System.out.println(addCount == 0?"添加编号用户信息失败":"添加用户信息成功。");
		a.findUserInfo();
		System.out.println("------------------------------");
		/**
		 * 更新数据内容
		 */
		Users users = new Users(2,"hhh",'男');
		int updateCount = a.updateInfo(users);
		System.out.println(updateCount == 0?"修改编号"+users.getNum()+"用户信息失败":"修改用户信息成功。");
		a.findUserInfo();
		System.out.println("------------------------------");
		/**
		 * 删除数据
		 */
		int deleteNum = 2;
		int deleCount = a.deleteInfo(deleteNum);
		System.out.println(deleCount == 0?"删除编号"+deleteNum+"用户信息失败":"删除用户信息成功。");
		a.findUserInfo();
		System.out.println("------------------------------");
	}
}
