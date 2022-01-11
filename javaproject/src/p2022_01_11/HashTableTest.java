package p2022_01_11;

import java.util.*;

class HashTableTest {
  public static void main(String[] args) {
	
	  //업캐스팅이 되면 참조 가능한 영역의 축소가 일어난다.
//	  업캐스팅이 되면 부모가 상속해준 메소드만 접근할 수 있다.
//	  Map ht = new Hashtable();		//업캐스팅
	  Hashtable ht= new Hashtable();
     // 해쉬 테이블에 키/데이터를 입력한다. 
//	  put(Object key, Object value)
	 ht.put("딸기", "StrawBerry");		//업캐스팅
     ht.put("사과", "Apple");     
     ht.put("포도", "Grapes");         

       // 해쉬 테이블의 값을 키를 이용하여 얻는다.
//	 	Object get(Object key)
     //  Object obj = ht.get("포도");   
     String Val = (String)ht.get("포도");		// 다운 캐스팅
     if(Val != null) {
       System.out.println("포도-> " + Val);
     }  
//     key를 모르는 경우에 사용하는 방법
//     열거형(Enumeration) : 딸기, 사과, 포도
     Enumeration Enum = ht.keys();	//Map의 모든 key를 구해옴
     while(Enum.hasMoreElements()){
         Object  k = Enum.nextElement();
         Object  v = ht.get(k);
         System.out.println(k + " : "+ v );
     }
   }    
}                                                
