package p2022_01_11;

import java.util.*;

class Collections05 {
  public static void main(String[] args) {

    Vector vec = new Vector();
	vec.add("Apple");
    vec.add("banana");
	vec.add("oRANGE");
	vec.add(50);
	vec.add(3.14);
	vec.add('k');
	vec.add(true);

//	Object get(int index)
	String temp;
    for(int i=0; i<vec.size(); i++){
		temp=(String) vec.get(i); 	//다운 캐스팅
//		temp=vec.get(i);			//오류 발생
		System.out.println(vec.get(i));
		System.out.println(temp.toUpperCase());
	}    
  } 
}                                                                                           
