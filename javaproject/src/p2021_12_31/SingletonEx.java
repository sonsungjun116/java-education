package p2021_12_31;

//p244

class Singleton {

	// 싱글톤(Singleton) : 객체 생성을 1번만 수행
	private static Singleton s = new Singleton(); // 정적 필드

	public static Singleton getInstance() { // 정적 메소드 ,클래스 형태의 자료형
		return s;
	}

	public void check() {
		System.out.println("메소드 호출 성공1");
	}
	public void check1() {
		System.out.println("메소드 호출 성공2");
	}

}

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Singleton.s); private설정 되었기 때문에 접근 안됨
	
	Singleton obj1 = Singleton.getInstance(); //싱글톤 형태로 받아 주어야 한다
	Singleton obj2 = Singleton.getInstance(); //싱글톤 형태로 받아 주어야 한다
	System.out.println(obj1);
	System.out.println(obj2);
	if(obj1==obj2) {
		System.out.println("같은 주소");
	}else {
		System.out.println("다른 주소");
	}
	
	obj1.check();
	obj1.check1();
	obj2.check();
	obj2.check1();
	
	
	
	}

}
