package com.jjp.dao;
/**
 * 接口类dao
 * @author JJP
 *
 */
public interface UserDao {
	void findUserInfo();
	int deleteInfo(int num);
	int addInfo(Users users);
	int updateInfo(Users users);
}
