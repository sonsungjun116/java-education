package p2021_12_30;

class MyDate06{   
  private int year;    
  private int month;    
  private int day;
 
public MyDate06(int year, int month, int day) {
	this.year = year;
	this.month = month;
	this.day = day;
}
//  public MyDate(){//default 생성자
//  }  
//  public MyDate06(int new_year, int new_month, int new_day){
//    year=new_year;  // 2017
//	month=new_month;  // 7  
//	day=new_day; // 19
//  } 
  
//  public void SetYear(int year){
//    this.year=year; 
// //      year=year; 
//  }
//  public void SetMonth(int new_month){
//	month=new_month; // month=8
// }

  public int getYear() {			// 
	return year;
}

public int getMonth() {
	return month;
}

public int getDay() {
	return day;
}

public void setYear(int year) {		// setters method
	this.year = year;
}

public void setMonth(int month) {
	this.month = month;
}

public void setDay(int day) {
	this.day = day;
}

public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}
public class ConstructorTest06 {     
  public static void main(String[] args) {	
    MyDate06 d=new MyDate06(2017, 7, 19);
    d.print();               
//	d.year = 2018; 접근 제어가가 private이기때문에 외부 클래스에서 접근 할 수 없다.   
    
    d.setYear(2021);   //변경되지 않음 
    d.print();        
   
    d.setMonth(12);    //변경됨 
    d.print();   
    
    d.setDay(30);
    d.print();
    
    System.out.println(d.getYear());
    System.out.println(d.getMonth());
    System.out.println(d.getDay());
  }
}     