package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println();
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n)); //is는 한번 쓰고 나면 재사용 불가.
		
		long sum = Arrays.stream(arr).sum(); // 다시 생성
		System.out.println(sum);
	}

}
