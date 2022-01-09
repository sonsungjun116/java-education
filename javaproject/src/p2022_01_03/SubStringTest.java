package p2022_01_03;

public class SubStringTest {
    public static void main( String[] args ) {
		
	String message = "Java program creates many objects.";
		
	String str1 = message.substring( 13 );
	System.out.println( str1 );

	String str2 = message.substring( 13, 16 );
	System.out.println( str2 );
    }
}


// substring() : 전체 문자열에서 특정 범위의 문자를 추출하는 역할

//substring(n) : index번호 n번 부터 끝까지 추출
//
//substring(n1, n2) : index번호 n1번 부터 
//		    (n2-1)번 까지 추출