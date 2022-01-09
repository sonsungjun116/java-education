package p2022_01_06;

class Point2D4{
  protected int x=10;     //  private int x=10;	private는 자식이라도 상속 받을수 없다.
  protected int y=20;     //  private int y=20;
}

class Point3D4 extends Point2D4{
  protected int z=30;
  
  public void print( ){
    System.out.println(  x  + "," + y +"," + z);   
  }
}

class SuperSub04{
  public static void main(String[] args){	//독립적인 실행을 위해
    Point3D4 pt=new Point3D4( );
    pt.print( );
  }
}