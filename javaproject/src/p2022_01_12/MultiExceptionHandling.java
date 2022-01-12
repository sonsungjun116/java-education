package p2022_01_12;

public class MultiExceptionHandling {
    public static void main( String[] args ) {
		
	int value = 20;
	int div = 0;
	int[] intArray = { 1, 2, 3 };

	try {
//		   int arrayValue = intArray[4];		// 예외발생
//		  System.out.println( arrayValue );	

	      // 두수의 나눗셈을 구함
	      int result = value / div;				// 예외발생
	      System.out.println( result );

		  // 배열의 특정 값을 저장
          int arrayValue = intArray[4];
		  System.out.println( arrayValue );	    

	    } catch ( ArithmeticException ae ) {		
			System.out.println( ae.toString() );
			System.out.println("0으로 나눌수 없습니다.");
	    } catch ( ArrayIndexOutOfBoundsException ai ) {
			ai.printStackTrace();
			System.out.println("배열의 범위를 벗어났습니다.");
	    } 
    }    
}



