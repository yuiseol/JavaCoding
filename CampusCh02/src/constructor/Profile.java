package constructor;

public class Profile {
	
	String name;
	String gender;
	int age;
	int height;
	int weight;
	
	
	public void ProfileInfo(int height, int weight, String gender, String name, int age) {
		System.out.println("키가 "+ height + "이고 몸무게가 "+ weight + "킬로인 " + gender + "이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세입니다.");
	}
	
}

