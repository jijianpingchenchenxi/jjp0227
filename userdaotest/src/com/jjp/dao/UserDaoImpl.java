package com.jjp.dao;

import java.util.ArrayList;

//import java.util.Arrays;
import java.util.List;
/**
 * 接口实现类
 * @author JJP
 *
 */
public class UserDaoImpl implements UserDao {
	static List<Users> usersList = new ArrayList<Users>();
	static {
		Users users01 = new Users(1,"jjp1",'男');
		Users users02 = new Users(2,"jjp2",'男');
		Users users03 = new Users(3,"jjp3",'男');
		usersList.add(users01);
		usersList.add(users02);
		usersList.add(users03);
	}
	@Override
	public void findUserInfo() {
		System.out.println(usersList);
	}

	@Override
	public int deleteInfo(int num) {
		int deleteResult = 0;
		if(num>0&&num<usersList.size()){
			usersList.remove(num-1);
			for (int i = num; i < usersList.size()+1; i++) {
				 usersList.get(i-1).setNum(i);
			}
			deleteResult = 1;
		}
		return deleteResult;
		
	}
	@Override
	public int addInfo(Users users) {
		int addResult = 0;
		if (users.getNum() == usersList.size()+1){
			usersList.add(users);
			addResult = -1;
		}
		return addResult;
	}
	private int getIdIndex(int id) {
		int IdIndex = -1;
		for (int i = 0; i < usersList.size(); i++) {
			if (usersList.get(i)!=null) {
				if (id == usersList.get(i).getNum()) {
					IdIndex = i;
					break;
				}
			}
		}
		return  IdIndex;
	}

	@Override
	public int updateInfo(Users users) {
		int uppdateResult = 0;
		int idIndex = -1;
		if (users!=null) {
			idIndex = getIdIndex(users.getNum());
			usersList.get(idIndex).setName(users.getName());
			uppdateResult = 1;
		}
		return uppdateResult;
		
	}
	
}

