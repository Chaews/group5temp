package 자판기;

public class TimeCheck extends Thread {
	
	@Override
	public synchronized void run() {
		
		while(true) { // 시간체크 반복
			long 현재시간 = System.currentTimeMillis(); // 스레드가 실행되고있는 현재 시간 저장
			long 시간차이 = (현재시간-Drink.시작시간)/1000; // 게임시작시 저장해두었던 시작시간과의 차이를 구하여
			Drink.시간차이=((int)시간차이/5)+1; // 시간차이 변수에 저장
		}
	}

}