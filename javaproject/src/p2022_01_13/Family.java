package p2022_01_13;

// Thread 클래스를 상속받아 Thread를 정의함.

public class Family extends Thread {
    Toilet toilet;
    String who;
    boolean key; // 초기값: false

    // 생성자
    public Family( String name, Toilet t ) {
		who = name;
		toilet = t;	// toilet 객체 t를 매개변수로 멤버 변수로 전달함으로서 run에서 toilet사용 가능
    }
    
    public void run() {	//스레드의 상속을 받았기 때문에 run가능
		toilet.openDoor( who, key );
    }
}