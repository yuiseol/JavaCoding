package Singleton;

public class Company { // 회사는 유일해야 된다

	private static Company instance = new Company(); // 유일한 객체

	private Company() {

	}

	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;

	}

}
