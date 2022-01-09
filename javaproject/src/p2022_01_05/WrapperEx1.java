package p2022_01_05;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Integer num = new Integer();		// 오류발생
		//매개변수가 int형이거나 string형이여야 하기 때문
		
// 원래 n은 지역변수여서 stack에 저장되지만 박싱을 통해 heap 저장되게 된다.		
// stack에 n=10이 들어감, 이후 stack에 num01이 들어가고 num01은 heap메모리에 10을 저장시킴
// 박싱(boxing) : heap메모리를 박스로 생각하고, stack메모리에 저장된 10을
// heap메모리에 복사 하는 것(박스에 집어 넣는다)		
			
		int n = 10;							// 지역변수(stack영역에 저장됨)
		Integer num01 = new Integer(n);		// 박싱(boxing)
			
		// 언박싱(unboxing) : heap메모리에 있는 데이터를 stack메모리로 가져오는 것을 의미함		
		int n01 = num01.intValue();		//언방싱(unboxing)
	
//		자료형 변환 : "20" ---> 20		
		Integer num02 = new Integer("20");		//박싱(boxing)
		int n02 = num02.intValue();				//언박싱(unboxing)

		
	}

}
