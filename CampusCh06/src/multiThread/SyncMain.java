package multiThread;

class Bank{
	
	private int money = 10000;
	
	public void saveMoney(int save) { //synchronized 다른메서드들이 접근을 못하게함 
		
		synchronized(this) { //synchronized 블록 ,블록안에 수행문이 실행되는 동안 다른 메서드가 사용하지 못하도록 객체에 락을 걸어라 .
			
			int m = getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m + save);
		}
		
	}

	public synchronized void minusMoney(int minus) {
		
		int m = getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m - minus);		
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park extends Thread{
	
	public void run() {
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("startMoney(3000) : " + SyncMain.myBank.getMoney());
	}
}

class ParkWife extends Thread{
	
	public void run() {
			System.out.println("start minus");
			SyncMain.myBank.minusMoney(1000);
			System.out.println("minusMoney(1000) : " + SyncMain.myBank.getMoney());
		}
	
	/* 위 메서드에 synchronized를 안 걸고 여기다 거는 방법도 있다.
	public void run() {
		synchronized(SyncMain.myBank) {
			System.out.println("start minus");
			SyncMain.myBank.minusMoney(1000);
			System.out.println("minusMoney(1000) : " + SyncMain.myBank.getMoney());
		}
	}*/
}

public class SyncMain {
	
	public static Bank myBank = new Bank();

	public static void main(String[] args) {

		Park p = new Park();
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ParkWife pw = new ParkWife();
		pw.start();
	}

}
