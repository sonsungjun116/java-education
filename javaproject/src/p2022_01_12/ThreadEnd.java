package p2022_01_12;

public class ThreadEnd extends Thread {
	// thead : 1개의 process를 구성하는 작업단위
	// thread를 만드는 방법
//	1. thread 클래스를 상속 받아서 만드는 방법
//	2. Runnable 인터페이스를 상속 받아서 만드는 방법
	@Override
    public void run() {	// 실행중인 상태
		// thread가 시작되면 실행되는 문장
		for( int i=1 ; i<=20 ; i++ ) {
			System.out.println( "run number = " + i );
		}
    }

    public static void main( String[] args ) {		
		ThreadEnd tt = new ThreadEnd();
		// thread를 실행시킴
		tt.start();		// 실행가능한 상태: run() 메소드를 호출함.
		
		// main()내에서 화면에 101부터 120까지 출력
		for( int i=101 ; i<=120 ; i++ ) {
			System.out.println( "-------> main number = " + i );
		}
    }

}
