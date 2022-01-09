package p2022_01_06;

class Point2D04{
  protected int x=10; //은닉 변수
  protected int y=20; //혹은 쉐도우 변수 
}
class Point3D04 extends Point2D04{
  protected int x=40; //슈퍼 클래스에 존재하는 멤버변수를 
  protected int y=50; //서브 클래스에 다시 한 번 정의함

  protected int z=30;
  public void print( ){
    System.out.println(  x  +", "+y+", "+z);   //x와 y는 재 정의된 Point3D 클래스 소속
  }
  
  // super : 부모 클래스를 의미하는 레퍼런스 변수
  // super를 사용 할때는 자식 클래스의 메소드 안에서 사용해야 한다.
  // super.x는 부모 클래스의 은닉된 필드에 접근 할때 사용된다.
  //System.out.println(super.x);	오류 발생
  public void print02( ){
    System.out.println(super.x+", "+super.y+", "+z); //Point2D 클래스 소속 멤버변수로 접근
  }
}
class SuperTest04{
  public static void main(String[] args){
    Point3D04 pt=new Point3D04( );
    pt.print( );   //40, 50, 30 // Point3D의 x, y
    pt.print02( ); //10, 20, 30 // Point2D의 x, y
  }
}              