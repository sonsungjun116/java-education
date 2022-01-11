package p2022_01_11;

import java.util.*;

// Map
//1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
//ex) int, double, char, boolean, String etc
//2. Data를 저장할 때 Key, Value 를 동시에 저장한다.
//3. key값은 중복이 되면 안된다.
//	 만약에 중복된 key가 있으면, 가장 마지막에 설정된 value만 사용할 수 있다.
//	4. value값은 중복이 되어도 상관없다.

public class MapTest {
    public static void main( String[] args ) {
        //HashMap 객체 생성
//		Map hm = new HashMap();		// 업캐스팅
        HashMap hm = new HashMap();
        //키와 데이터 쌍을 삽입
//      put(Object key, Object value)
        hm.put( "woman", "gemini" );
        hm.put( "man", "johnharu" );
        hm.put( "age", new Integer(10) );
        hm.put( "city", "seoul" );
        hm.put( "city", "busan" );
        
        //HashMap에 있는 객체들을 출력
        System.out.println( hm );
        
        //키 값만 출력
        System.out.println( hm.keySet() );
        
        //키를 이용해 해당 데이터를 출력
        //Object get(Object key)
        System.out.println( hm.get( "woman" ));
        System.out.println( hm.get( "city" ));
    }
}        
         
         
        