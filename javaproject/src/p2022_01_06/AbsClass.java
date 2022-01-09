package p2022_01_06;

//추상 클래스
public abstract class AbsClass {

	int a = 10;
	void check() {
		System.out.println("메소드 호출 성공");
	}

	abstract int absmethod(int a);			// 추상 메소드




}
