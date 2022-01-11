package p2022_01_11;

import java.util.*;

class Collections06 {
  public static void main(String[] args) {
    
//	  제네릭(Generic) : 한가지 자료형의 데이터만 저장 하도록 해준다.
	  
	  Vector<String> vec = new Vector<String>();

	vec.add("Apple");
    vec.add("banana");
	vec.add("oRANGE");
//	vec.add(200);	//오류발생, String형 데이터만 저장 할 수 있다.
	
//	제네릭을 사용하게 되면, 자료구조에서 데이터를 구해올때 자료형을 생략할 수 있다.
	String temp;
    for(int i=0; i<vec.size(); i++){
      temp=vec.get(i);		// (String) 생략가능  	
      System.out.println(temp.toUpperCase());
    }
  } 
}                                                                                           
