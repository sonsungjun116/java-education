package p2022_01_06;

// 부모 클래스에 있는 필드를 자식 클래스에서 재정의(동일한 이름의 변수)
class Point2D3{			//부모 클래스
  protected int x=10; //Point3D에서 다시 한번 정의되므로 은닉 변수가 됨
  protected int y=20; //은닉 변수는 쉐도우 변수라고도 함
}
class Point3D3 extends Point2D3{	//자식 클래스
  protected int x=40; //슈퍼 클래스에 존재하는 멤버변수를 
  protected int y=50; //서브 클래스에 다시 한 번 정의함

  protected int z=30;
  public void print( ){
    System.out.println(  x  +", "+y+", "+z);   //x와 y는 재 정의된 Point3D 클래스 소속
  }
}

class SuperTest03{
  public static void main(String[] args){
    Point3D3 pt=new Point3D3( );
    pt.print( );
  }
}          