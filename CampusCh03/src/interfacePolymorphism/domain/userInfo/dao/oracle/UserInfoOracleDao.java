package interfacePolymorphism.domain.userInfo.dao.oracle;

import interfacePolymorphism.domain.userInfo.UserInfo;
import interfacePolymorphism.domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into ORACLE DB userId = " + userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into ORACLE DB userId = " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from ORACLE DB userId = " + userInfo.getUserId());
		
	}
}
