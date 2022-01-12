package p2022_01_12;

public class RunnableTest implements Runnable {
	
    // 1부터 20까지 화면에 출력시키는 메소드 
//    public void printNumber() {
//		for( int i=1 ; i<=20 ; i++ ) {
//			System.out.println( "number = " + i );
//		}
//    }
    @Override
    public void run() {
    	// TODO Auto-generated method stub
    	for( int i=1 ; i<=20 ; i++ ) {
			System.out.println( "number = " + i );
		}
    }
//    public void run() {
//		printNumber();
//    }

    public static void main( String[] args ) {
		// 객체 생성
		RunnableTest tt = new RunnableTest();
		// Thread 클래스 객체 생성
		Thread t = new Thread( tt );
		// Thread를 시작시킴
		t.start();		// 실행가능한 상태: run() 메소드를 호출함.
		System.out.println( "--------> main thread end" );
    }


}
