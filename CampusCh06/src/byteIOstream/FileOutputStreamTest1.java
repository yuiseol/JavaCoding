package byteIOstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	
	public static void main(String[] args) { 
		
		try(FileOutputStream fos = new FileOutputStream("output.txt")) {
			
			fos.write(65); //숫자에 해당하는 char가 쓰임
			fos.write(66);
			fos.write(67);

		} catch (IOException e) { //IOException이 FileNotFoundException 포함
			System.out.println();
		}
		System.out.println("end");
	}

}
