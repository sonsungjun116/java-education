package p2022_01_05;

class TestClass {
	private int member;					//필드

	public void setValue(int value) {	//메소드
		member = value;
	}

	public void setValue(double d) {
		
	}
	public void setValue(String s) {
		
	}
	
		
	
	public int getValue() {				//메소드
		return member;
	}
}

class GenericTest01 {
	public static void main(String[] args) {
		TestClass obj01 = new TestClass();
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		obj01.setValue(3.4);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj01.getValue());
	}
}
