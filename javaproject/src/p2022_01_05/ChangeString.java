package p2022_01_05;

public class ChangeString {
    public static void main( String[] args ) {
    
	// 기본 데이터 형 선언
	int a = 10;
	System.out.println( a + 10 );

	// String 형으로 변환 : 10 ---> "10"
	String sa1 = String.valueOf( a );
	System.out.println( sa1 + 10 );

	// Wrapper Class 객체 생성 
	Integer oint = new Integer( 10 );
	
	// String 형으로 변환 : 10 --> "10"
	String sa2 = oint.toString();
	System.out.println( sa2 + 10 );

//  String형을 int형으로 변환 : "10" --> 10
// 	int k =  Integer.parseInt(sa2);
    }
}