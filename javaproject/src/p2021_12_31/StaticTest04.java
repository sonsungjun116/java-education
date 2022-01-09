package p2021_12_31;

class StaticTest4{
  private static int a=10;		// 정적 필드
  private int b=20;				// 인스턴스 필드
  
  public static void printA(){  // 정적 메소드
    System.out.println(a);         
 //   System.out.println(b);   //컴파일 에러 발생
  }							// 정적 메소드 안에는 정적 필드만 사용 할 수 있다.

  public void printB(){        
    System.out.println(b);  
    System.out.println(a);
  }                           
}
public class StaticTest04 {
  public static void main(String[] args) {
    StaticTest4.printA();  
    StaticTest4 s1 = new StaticTest4();
    StaticTest4 s2 = new StaticTest4();
    s1.printB();
    s2.printB();
  }    
}    