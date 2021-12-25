package ArrayList;

import java.util.ArrayList;
import array.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>(); //f1 눌러서 다큐먼트 문서 정확한 정보 찾아보기
		
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
		
		for(int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
