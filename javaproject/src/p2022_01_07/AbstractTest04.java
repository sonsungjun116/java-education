package p2022_01_07;

interface IHello04 {							// 인터페이스
	public abstract void sayHello(String name);	// 추상 메소드 : public abstract 생략 가능
}

abstract class GoodBye04 {						// 추상 클래스
	public abstract void sayGoodBye(String name);//추상 메소드
}

// 클래스와 인터페이스를 동시에 상속을 받을때는 클래스를 먼저 상속을 받고, 그 후
// 인터페이스를 나중에 상속을 받아야 한다. (상속받는 순서가 바뀌면 오류가 발생한다.)
class SubClass04 extends GoodBye04 implements IHello04 {
	public void sayHello(String name) { 	// 메소드 오버라이딩
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {	// 메소드 오버라이딩
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class AbstractTest04 {
	public static void main(String[] args) {
		SubClass04 test = new SubClass04();
		test.sayHello("홍길동");
		test.sayGoodBye("이순신");
	}
}