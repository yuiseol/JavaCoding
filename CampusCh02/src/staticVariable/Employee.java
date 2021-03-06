package staticVariable;

public class Employee {

	private static int serialNum = 1000;

	private int employeeId;
	private String employName;
	private String department;

	// 객체가 생성될 때 초기화 작업은 생성자에서 한다
	public Employee() {

		serialNum++; // 사번아이디로 바로 할 수 없는 이유는 모든 인스턴스가 공유를 하니까 모든 사원들이 같이 사번을 가지게 됨
		employeeId = serialNum; // 멤버변수에 복사를 해주면된다.
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployName() {
		return employName;
	}

	public void setEmployName(String employName) {
		this.employName = employName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
