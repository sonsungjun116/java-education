package p2022_01_06;

//1. 메소드 오버라이딩을 하면 메소드 오버라이딩 된 메소드만 호출해서 사용할 수 있다.
//2. 부모 클래스에 은닉된 메소드를 호출할때는 자식 클래스의 메소드 안에서 super.parentPrn() 형식
// 으로 호출해야 한다.


class Parent05{					// 부모 클래스
  public void parentPrn( ){			//은닉 메소드	
     System.out.println("슈퍼 클래스 : ParentPrn 메서드");  
  }			
}
//Parent를 슈퍼 클래스로 하는 서브 클래스 Child 정의 
class Child05 extends Parent05{
  //슈퍼 클래스에 있는 ParentPrn 메서드를 오버라이딩하면 
  //Child로 선언된 객체는 슈퍼 클래스의 메서드가 은닉되어 상속 받지 못하게 된다. 
  public void parentPrn( ){	//메소드 오버라이딩
     System.out.println("서브 클래스 : ParentPrn 메서드");  
  }
  public void childPrn( ){
     super.parentPrn(); 	//부모 클래스에 은닉된 메소드 호출, 자식클래스의 메소드안에 넣어야 함
	  System.out.println("서브 클래스 : ChildPrn 메서드");  
 }                                             
}

class SuperSub05{
  public static void main(String[] args){
    Child05 c = new Child05( );  	//서브 클래스로 객체를 생성
    c.parentPrn( );          	//오버라이딩된 서브 클래스의 메서드 호출 
    c.childPrn( );             	//서브 클래스 자기 자신의 메서드 호출
    System.out.println("-------------------------------------------->> ");  
    Parent05 p = new Parent05( );	//슈퍼 클래스로 객체를 생성
    p.parentPrn( );            	//슈퍼 클래스(자기 자신)의 메서드 호출
  }                                           
}                                                                                      
