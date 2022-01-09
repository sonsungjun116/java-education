package p2021_12_30;

class MyDate{   
  private int year;		// 필드 (field), 멤버변수    
  private int month;    
  private int day;

  public  MyDate(){		// 기본 생성자(Default Constructure)
    System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
  }  
  public void print(){	// 메소드(method)
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest02 {     
  public static void main(String[] args) {
    //생성자는 객체를 생성할때 호출된다.
	  MyDate d =  new MyDate();	
//					생성자 호출
    d.print();
//	System.out.println(d.year);
//	MyDate dd =  new MyDate();
 }
} 