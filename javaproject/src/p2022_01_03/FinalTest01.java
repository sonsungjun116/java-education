package p2022_01_03;

class FinalMember {
  final int a=10;	// 상수 : 값을 수정 할 수 없다.
  
  public void setA(int a){
    this.a=a;
  }
}
public class FinalTest01{
  public static void main(String[] args) {
    FinalMember ft= new FinalMember();
	final int a=1000;
    ft.setA(100);
    System.out.println(a);
  }
}                                                    
