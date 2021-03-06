package byteIOstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			
			byte[] bs = new byte[10];
			/*
			while((i = fis.read(bs)) != -1 ) { //인덱스가 -1일 아닐때까지 읽는다.
				
				for(int j=0; j <i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "바이트 읽음");
			*/	
			while ( (i = fis.read(bs, 1, 9)) != -1){
				for(int k= 0; k<i; k++){
					System.out.print((char)bs[k]);
				}
				System.out.println(": " +i + "바이트 읽음" );
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
