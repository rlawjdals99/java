// Multi Thread(멀티 쓰레드) : start, run, sleep, setStop
// 멀티 쓰레드 : CPU의 코어와 관계가 있습니다.
public class oop3 {	
	
	public static void main(String[] args) {
		// 쓰레드(Thread) : 프로세스 내부에서 독립적으로 실행되는 작업을 말함
		// Multi Thread(멀티 쓰레드) : 프로세서 내부에서 두가지 이상의 작업을 동시사용

		Thread mt = new mythread();// 부모 메소드 = 자식 메소드
		Thread mt2 = new test2();
        // 기존사용형태 : 자식 메소드 = 자식 메소드
		mt.start();
		mt2.start();  // Thread 메소드에 기본 run을 작동하기 위한 start 명령어 입니다.
		int ct = 1;
		while(ct <= 10) {
			
			System.out.println("내부 클래스: " + ct);
			
			ct++;
		}
		
		
		
	}

}

class test2 extends Thread{
	@Override
	public void run() {
	int ct=1;
	while(ct<=10) {
		System.out.println("외부클래스2: " + ct);
		ct++;
	}
		
		
		
	}
	
	
}





class mythread extends Thread{ //Thread : JVM 기본으로 탑재 되어 있는 메소드(Therad는 단독으로 사용하지 않음)
     @Override
	public void run() { // run이란 : 멀티메소드 기본 실행 메소드
		int w = 1;
		while (w <= 10) {
			System.out.println("외부클래스: " + w);
			w++;
		}

	}

}