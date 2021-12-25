package ch16_01_interface;

public class PriorityAllocation implements Scheduler {


	@Override
	public void getNextCall() {
		System.out.println("고객등급이 높은 고객의 call을 먼저 가져옵니다");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무능력이 우수한 상담원에게 배분합니다.");
		
	}

}
