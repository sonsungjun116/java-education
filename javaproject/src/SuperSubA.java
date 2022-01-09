import  packTest.packOne.AccessTest;

//AccessTest의 서브 클래스로 SubOne을 설계
class SubOne extends AccessTest {		//자식 클래스
  void subPrn( ){
    System.out.println(a); //[1. Sub] private -X
    System.out.println(b); //[2. Sub] 기본 접근 지정자-X
    System.out.println(c); //[3. Sub] protected -O
    System.out.println(d); //[4. Sub] public -0
 // 원래 패키지가 다르면 public만 가능하지만 상속관계라면 protected도 사용 가능하다
  }
}

//AccessTest랑 상속관계가 없는 클래스 
class SuperSubA{
  public static void main(String[] args){
    AccessTest at=new AccessTest( );
    at.print( );
    System.out.println("main");
    System.out.println(at.a); //[1. main] private -X
    System.out.println(at.b); //[2. main] 기본 접근 지정자-X
    System.out.println(at.c); //[3. main] protected -X
    System.out.println(at.d); //[4. main] public -O
  }
}