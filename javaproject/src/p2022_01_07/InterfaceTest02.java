package p2022_01_07;

interface IHello02 {	// 인터페이스
	public abstract void sayHello(String name);		// 추상 메소드
}

interface IGoodBye02 {	// 인터페이스
	public abstract void sayGoodBye(String name);	// 추상 메소드
}

//두 인터페이스로부터 상속을 받는 클래스 설계 : 인터페이스의 다중 상속
class SubClass02 implements IHello02, IGoodBye02 {
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class InterfaceTest02 {
	public static void main(String[] args) {
		SubClass02 test = new SubClass02();
		test.sayHello("홍길종");
		test.sayGoodBye("이순신");
	}
}