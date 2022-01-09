package p2022_01_03;

public class IndexOfTest {
	public static void main( String[] args ) {
		
		// indexOf() : 특정 문자의 인덱스 번호를 구해주는 메소드
	String message = "Java program creates many objects.";

	int index1 = message.indexOf( 'a' );
	int index2 = message.indexOf( 97 );

	System.out.println( index1 );
	System.out.println( index2 );

	//index번호 13번째 이후에서 a를찾음
	int index3 = message.indexOf( 'a', 13 ); 
	System.out.println( index3 );

	int index4 = message.indexOf( "av" );
	System.out.println( index4 );

	int index5 = message.indexOf( "man", 12 );
	System.out.println( index5 );

//	index번호 12번 이후에서 'man'의 인덱스 번호를 구함
	int index6 = message.indexOf( "java" );
	System.out.println( index6 );
    }
}



