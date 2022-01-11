package p2022_01_11;

class TestClass {
	private int member;

	public void setValue(int value) { // Object value = 3;
		member = value;
	}

	public int getValue() {
		return member;
	}
}

class GenericTest01 {
	public static void main(String[] args) {
		TestClass obj01 = new TestClass();

		// Object value = 3; 자동박싱 + 업캐스팅
		// Object value = new Integer(3); 박싱 + 업캐스팅
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		
		// 다운캐스팅 + 언박싱
		int n01 = ((Integer) (obj01.getValue())).intValue();
		int n02 = ((Integer) (obj01.getValue())); // 다운캐스팅 + 자동언박싱
//------------------------------------------------------------------		
		// Object value = 3.4; 		자동박싱 + 업캐스팅
		// Object value = new Double(3.4); 박싱 + 업캐스팅
//		obj01.setValue(3.4);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		// 다운캐스팅 + 언박싱
//				double n03 = ((Double) (obj01.getValue())).doubleValue();
//				double n04 =((Double) (obj01.getValue())); // 다운캐스팅 + 자동언박싱
//------------------------------------------------------------------
				
//		obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj01.getValue());
		
//		String str = (String) obj01.getValue();
	}
}
