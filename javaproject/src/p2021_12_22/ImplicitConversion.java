package p2021_12_22;


// 자동 형변환
public class ImplicitConversion {

    public static void main( String[] args ) {
    	
	// char 변수 선언 및 초기화.
	char charValue = 'a';
	System.out.println( "charValue = " + charValue );
 
	// int 변수 선언 및 'a'의 값으로 초기화.
//	int intValueOfChar = charValue;	//자동 형변환
	int intValueOfChar = 'a'; //'a' 문자의 10진수 아스키코드값은
	System.out.println( "intValueOfChar = " + intValueOfChar );

	// int 변수 선언 및 초기화.
	int intValue = 30;
	System.out.println( "intValue = " + intValue );

	// float 변수 선언 및 intValue 변수 값 할당
	float floatValue = intValue; //자동 형변환
	System.out.println( "floatValue = " + floatValue );

	// double 변수 선언및 floatValue,intValue 변수 값 할당
	double doubleValue1 = floatValue;	//자동 형변환
	double doubleValue2 = intValue;		//자동 형변환
	System.out.println("doubleValue1 ="+doubleValue1);
	System.out.println("doubleValue2 ="+doubleValue2);

    }//main end
}//class end



