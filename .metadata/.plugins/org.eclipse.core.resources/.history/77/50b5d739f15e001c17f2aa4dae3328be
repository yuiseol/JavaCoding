package dataStructure01;

public class MyLinkedList {

	private MyListNode head;
	int count;

	public MyLinkedList() {
		head = null;
		count = 0;
	}

	// 1방식. 링크드리스트 첫번제 엘레먼트인 head라는애를 만들어놈. head부터 해서 쭉 하나씩 찾아가는 방식, head에 A넣고 다음에 B넣고... 
	// 2방식. head 포인터사용하는 방법, head라는 더미를 노드가 첫번째 요소를 가리키는 역할. head 다음이 첫번째 요소이다.
	// head 이외의 나머지 노드의 추가&삭제 모두 previous node를 알아야한다.
	public MyListNode addElement(String data) // 1방식
	{
		MyListNode newNode;

		if (head == null) {
			newNode = new MyListNode(data);
			head = newNode;
		} else {  							//맨뒤에 노트를 찾으러 가자
			newNode = new MyListNode(data);
			MyListNode temp = head; //head부터 돌면된다.
			while(temp.next != null) { //다음이 null이라는건 마지막노드라는 뜻
				temp = temp.next; //temp는 temp.next 노드를 가리키면 된다
			}
			temp.next = newNode; 
		}
		count ++;
		
		return newNode;
	}
	public MyListNode insertElement(int position, String data )
	{
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null; 
		
		MyListNode newNode = new MyListNode(data); //추가 노드
		
		if(position < 0 || position > count) {
			return null;
		}
		
		if(position == 0) {
			newNode.next = head;
			head = newNode;
		}
		else {
			for(i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		
		count++;
		return newNode;
		
	}
	public MyListNode removeElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null;
		
		if(position >= count ){
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 앞을 삭제하는
			head = tempNode.next;
		}
		else{
			for(i=0; i<position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position + "번째 항목 삭제되었습니다.");
		
		return tempNode;
	}
	
	public String getElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error");
		}
		
		if(position == 0){  //맨 인 경우

			return head.getData();
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode.getData();
	}

	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 인 경우

			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
	}

	public void removeAll()
	{
		head = null;
		count = 0;
		
	}
	
	public int getSize()
	{
		return count;
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
	}
	
}


