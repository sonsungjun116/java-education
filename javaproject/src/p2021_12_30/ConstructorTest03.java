package p2021_12_30;

class MyDate03{   
  private int year;	// 필드, 멤버변수
  private int month;    
  private int day;
  
  // 생성자 : 객체를 생성할때 생성자가 호출되고, 필드값을 초기화 시켜주는 역할을 한다.
  public MyDate03(){ // 기본 생성자 
    year=2016;
    month=4;
    day=1;
  }  
  
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest03 {     
  public static void main(String[] args) {
    MyDate03 d=new MyDate03();
//					생성자 호출
    //처음엔 heap에 초기값 0/0/0이 입력되지만 생성자가 호출됨으로써 필드값이 초기화되어 2016/4/1이 입력된다
    d.print(); 
  }
}               