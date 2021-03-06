package dataStructure;

public class MyArray {

		int[] intArr;   	//int array
		int count;  		//개수
			
		public int ARRAY_SIZE;
		public static final int ERROR_NUM = -999999999;
		
		public MyArray()
		{
			count = 0;
			ARRAY_SIZE = 10;
			intArr = new int[ARRAY_SIZE];
		}
		
		public MyArray(int size)
		{
			count = 0;
			ARRAY_SIZE = size;
			intArr = new int[size];
		}
		
		public void addElement(int num)
		{
			if(count >= ARRAY_SIZE){
				System.out.println("not enough memory");
				return;
			}
			intArr[count++] = num; //num을 넣고 나서 count 증가 (개수)
					
		}

		//중간에 넣을 때 ,position(=index 0부터 시작, 마지막 인덱스 count-1), 맨 끝에서부터 한칸씩 옆으로 값이 이동해야된다 안그러면 값이 오버라이트된다. num
		public void insertElement(int position, int num) 
		{
			int i;
			
			if(count >= ARRAY_SIZE){  //꽉 찬 경우
				System.out.println("not enough memory");
				return;
			}
			
			if(position < 0 || position > count ){  //index error, count에다 넣으면 중간이 비기 때문에 에러
				System.out.println("insert Error");
				return;
			}
			
			for( i = count-1; i >= position ; i--){
				intArr[i+1]  = intArr[i];        // 하나씩 이동
			}
			
			intArr[position] = num;
			count++;

		}
		
		public int removeElement(int position) // 맨마지막 인덱스까지 하나씩 앞으로 땡겨야함  
		{
			int ret = ERROR_NUM;
			
			if( isEmpty() ){ //비었을 때 
				System.out.println("There is no element");
				return ret;
			}
			
			if(position < 0 || position > count-1 ){  //index error 0보다 작거나 인덱스 보다 클 때
				System.out.println("remove Error");
				return ret;
			}
			
			ret = intArr[position];
			
			for(int i = position; i<count -1; i++ )
			{
				intArr[i] = intArr[i+1];
			}
			count--;
			return ret;

			
		}
		
		public int getSize()
		{
			return count;
		}
		
		public boolean isEmpty()
		{
			if(count == 0){
				return true;
			}
			else return false;
		}
		
		public int getElement(int position)
		{
			if(position < 0 || position > count-1){
				System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
				return ERROR_NUM;
			}
			return intArr[position];
		}
		
		public void printAll()
		{
			if(count == 0){
				System.out.println("출력할 내용이 없습니다.");
				return;
			}
				
			for(int i=0; i<count; i++){
				System.out.println(intArr[i]);
			}
			
		}
		
		public void removeAll()
		{
			for(int i=0; i<count; i++){
				intArr[i] = 0;
			}
			count = 0;
		}
	}


