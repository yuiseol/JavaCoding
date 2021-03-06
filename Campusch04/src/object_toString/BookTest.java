package object_toString;

class Book {
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
	
}

public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("데미안", "헤르만 헤세");
		
		System.out.println(book.toString());//jvm이 준 가상메모리값, 실제 메모리값이 아님
		
		String str = new String("test");
		System.out.println(str.toString()); //str만 해도 문자열이 값이 나옴 toString이 오버라이딩 되있어서.이미 재정의가 되 있다.
	}
	
}
