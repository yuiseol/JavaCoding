package IOstream;

import java.io.InputStreamReader;

public class SysteminTest1 {

	public static void  main(String[] args) {
		
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		
		try {
			InputStreamReader irs = new InputStreamReader(System.in); //InputStreamReader 바이트를 문자로 바꿔주는 클래스
			while((i = irs.read()) != '\n'){ //1byte씩 읽고 반환값이 int
//					System.out.println(i);
					System.out.print((char)i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
