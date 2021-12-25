package interfacePolymorphism.domain.userInfo.dao;

import interfacePolymorphism.domain.userInfo.UserInfo;

//User에 대한 DB 오퍼레이션을 할 때 기능을 해야되는건 이것이것이다 라고 명세
public interface UserInfoDao {

	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
