package interfacePolymorphism.web.userInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import interfacePolymorphism.domain.userInfo.UserInfo;
import interfacePolymorphism.domain.userInfo.dao.UserInfoDao;
import interfacePolymorphism.domain.userInfo.dao.oracle.UserInfoOracleDao;
import interfacePolymorphism.domain.userInfo.dao.mysql.UserInfoMysqlDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("@#$%^");
		userInfo.setUserName("Lee");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		}else {
			System.out.println("db error");
			return;
		}
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
