package p2021_12_30;

class MyDate04{   
  int year;    
  int month;    
  int day;  

  public MyDate04(){
    year=2016;    month=4;    day=1;
  }
  
 public MyDate04(int year, int month, int day) {
	this.year = year;
	this.month = month;
	this.day = day;
}

// this : 내부 레퍼런스 변수
//  public MyDate04(int year,int month,int day){
//   this.year=year;
//   this.month=month;
//   this.day=day;
//  }
  
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest04 {     
  public static void main(String[] args) {
    MyDate04 d=new MyDate04();	
    System.out.println(d.year);
    System.out.println(d.month);
    System.out.println(d.day);
    d.print();

    MyDate04 d2=new MyDate04(2017, 7, 19);
    System.out.println(d2.year);
    System.out.println(d2.month);
    System.out.println(d2.day);
    d2.print();
  }
}            