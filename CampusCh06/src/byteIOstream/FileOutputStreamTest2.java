package byteIOstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//OutputStream은 inputStream과 다르게 파일이 없으면 만들어 줌, 파일에 이어서 쓰고 싶으면 두번째 매개변수에 true
public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {

		FileOutputStream fos = new FileOutputStream("output3.txt", true);
		
		try(fos) {
			
			byte[] bs = new byte[26];
			
			byte data = 65;
			for(int i=0; i<bs.length; i++) {
				bs[i] = data++;
			}
			
//			fos.write(bs);
			fos.write(bs, 2, 10);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
		}
	}


