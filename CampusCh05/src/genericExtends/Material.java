package genericExtends;

public abstract class Material { //하위클래스들은 이 클래스를 상속받아서 쓰고 직접 쓸 일은 없으니까 abstract
	
	//재료들이 공통으로 사용할 메서드들은 여기서 선언
	public abstract void doPrinting();

}
