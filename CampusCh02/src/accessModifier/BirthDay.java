package accessModifier;

public class BirthDay {

	private int day;
	private int month;
	private int year;

	private boolean isValid; // default 값이 false //isValid는 이 안에서 값이 유효한지 아닌지만 체크하기 때문에 밖에 내보낼일이 없다.만약 필요하다면 get() , set()메서드는 제공하지 x-read only 속성

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			isValid = false;
		} else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		if (isValid) {
			System.out.println(year + "년" + month + "월" + day + "일 입니다");
		} else {
			System.out.println("유효하지 않은 날짜입니다");
		}
	}

}
