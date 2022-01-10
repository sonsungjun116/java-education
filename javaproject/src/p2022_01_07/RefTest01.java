package p2022_01_07;

class Parent {
	public void parentPrn() {		// 부모 클래스
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child extends Parent {		// 자식 클래스
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

//* 업캐스팅(자동 형변환)
//1. 서브클래스에서 슈퍼클래스로 형변환 하는것
//2. 참조 가능한 영역이 축소가 된다.
//3. 컴파일러에 의해서 암시적 형변환(자동 형변환) 된다.

class RefTest01 {
	public static void main(String[] args) {
		Child c = new Child();
		c.parentPrn();				// 상속받은 메소드 호출
		c.childPrn();			
		
		Parent p;
		p = (Parent) c; 			// 암시적으로 업 캐스팅이 일어남,(Parent)생략가능
		
		Parent p1 = (Parent)new Child();	// 업캐스팅 ,(Parent)생략가능
		
		p.parentPrn(); // 업 캐스팅 후에는 부모로부터 상속받은 메서드만 호출할 수 있다,
// p.childPrn(); //컴파일 에러가 발생하게 된다. 
	}
}