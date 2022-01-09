package p2022_01_06;

class Point2D{				// 부모 클래스(공통 코드)
  private int x;
  private int y;
  public int getX( ){
     return x;
  }
  public void setX(int new_X){
    x=new_X;						// x = 10
  }
  public int getY( ){
     return y;
  }
  public void setY(int new_Y){
    y=new_Y;						// y = 20
  }
}
class Point3D extends Point2D{		// 자식 클래스
  private int z;
  public int getZ( ){
     return z;
  }
  public void setZ(int new_Z){
    z=new_Z;						// z = 30
  }
}
class SuperSub00{
  public static void main(String[] args){

    Point3D  pt=new Point3D( ); //자식 클래스로 객체를 생성 , 부모클래스를 가지고 객체를 생성하는것은 의미가 없음
    pt.setX(10); 					//상속받아 사용
    pt.setY(20); 					//상속받아 사용
    pt.setZ(30); 					//자신의 것 사용
    System.out.println( pt.getX( )	//상속받아 사용 
               +", "+ pt.getY( )	//상속받아 사용 
               +", "+ pt.getZ( ));	//자신의 것 사용
  }
}