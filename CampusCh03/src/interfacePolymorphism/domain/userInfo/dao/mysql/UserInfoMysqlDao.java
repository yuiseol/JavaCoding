package interfacePolymorphism.domain.userInfo.dao.mysql;

import interfacePolymorphism.domain.userInfo.UserInfo;
import interfacePolymorphism.domain.userInfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userId = " + userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into MySQL DB userId = " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from MySQL DB userId = " + userInfo.getUserId());
		
	}

}
