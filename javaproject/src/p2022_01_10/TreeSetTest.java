package p2022_01_10;

import java.util.Iterator;
import java.util.TreeSet;

// TreeSet
// : 오름차순으로 정렬하고 저장하고 출력하는 기능을 제공
//	 중복된 데이터는 저장 할 수 없다.

//	오름차순 정렬
//------------------------------------------------------
// 숫자 : 작은 숫자부터 큰숫자 순으로 정렬    ex) 1, 2, 3, 4, 5....
// 문자 : 사전순 정렬 ex) a, b, c, d, e....

public class TreeSetTest {
	/**
	 * HashSet 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet hs = new TreeSet();
		
		if(hs.add("korea")){
			System.out.println("첫 번째 korea 추가 성공");
		}
		else{
			System.out.println("첫 번째 korea 추가 실패");
		}
		if(hs.add("japan")){
			System.out.println("japan 추가 성공");
		}
		else{
			System.out.println("japan 추가 실패");
		}
		if(hs.add("america")){
			System.out.println("america 추가 성공");
		}
		else{
			System.out.println("america 추가 실패");
		}
		if(hs.add("britain")){
			System.out.println("britain 추가 성공");
		}
		else{
			System.out.println("britain 추가 실패");
		}
		if(hs.add("korea")){	// 중복된 데이터를 저장할 수 없다.
			System.out.println("두 번째 korea 추가 성공");
		}
		else{
			System.out.println("두 번째 korea 추가 실패");
		}
		
		// 오름차순으로 정렬된 결과를 출력
		System.out.println(hs);
		
		// 반복자: america, britain, japan, korea
		Iterator it = hs.iterator();
		// 가져올값이 있으면 true, 없으면 false
		while(it.hasNext()){
			System.out.println(it.next());
		}		
	}
}
