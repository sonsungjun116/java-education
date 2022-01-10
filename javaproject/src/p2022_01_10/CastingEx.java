package p2022_01_10;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		** 레퍼런스 형변환 **
//		   - 두개의 클래스 사이에 상속관계가 있어야함
//		 
//		* 업캐스팅(자동 형변환)
//		   1. 서브클래스에서 슈퍼클래스로 형변환 하는것
//		   2. 참조 가능한 영역이 축소가 된다.
//		   3. 컴파일러에 의해서 암시적 형변환(자동 형변환) 된다.
		
// ex1.		java.util.Calendar
//				- java.util.GregorianCalendar
		
//		Calendar c = new Calendar();	// 오류 발생
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = new GregorianCalendar();	// 업캐스팅
		GregorianCalendar c3 = new GregorianCalendar();
		
// ex2.
//		List 인터페이스는 자체적으로 객체를 생성할 수 없다.		
//		List li = new List();				// 오류 발생
		List list =(List) new ArrayList();	// 업캐스팅
		ArrayList al = new ArrayList();
		
//	ex3.
//		add(Object e)		
		list.add(10);	// Object e = new Integer(10);	박싱 + 업캐스팅
		list.add(3.14);	// Object e = new Double(3.14);	박싱 + 업캐스팅
		list.add('j');	// Object e = new Character('j');박싱 + 업캐스팅
		list.add(true); // Object e = new Boolean(true);박싱 + 업캐스팅
		list.add("자바");// Object e = new String("자바");	박싱 + 업캐스팅
		
//		boolean equals(Object an)
//		매소드의 매개변수가 최상위 클래스인 Object형으로 구성되어있을때가 업캐스팅이 가장 많이 쓰인다.
		
//		Object an =(Object) new String("java");		// 업캐스팅		
		if("java".equals(new String("java"))) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
//		Object an = new Integer(30);	//박싱 + 업캐스팅
//		Object an = 30;	//자동박싱 + 업캐스팅
		
		if(new Integer(30).equals(new Integer(30))) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
//		Object an = new Double(3.15);	// 박싱 + 업캐스팅
//		Object an = 3.15;				// 자동박싱 + 업캐스팅
		
		if(new Double(3.14).equals(new Double(3.15))) {			
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
	}
//-------------------------------------------------------------------
//		* 다운 캐스팅(강제 형변환)
//		   1. 슈퍼클래스에서 서브클래스로 형변환 하는것
//		   2. 참조 가능한 영역이 확대가 된다.
//		   3. 컴파일러에 의해서 암시적 형변환(자동 형변환)이 되지 않기    
//		      때문에 자료형을 생략할 수 없다.(강제 형변환)
		
//		ex1.
			List lt = new ArrayList();		// 업캐스팅
			
//			add(Object e)
			lt.add(new String("자바"));		// 업캐스팅
			lt.add("오라클");
			lt.add("JSP");
			lt.add("스프링");
			lt.add("파이썬");
			lt.add("텐스플로우");
			lt.add("케라스");
			
//		Object get(int index)
			for(int i =0; i<lt.size(); i++) {
//				Object obj = lt.get(i);

				String str =(String) lt.get(i);	//다운 캐스팅
				System.out.println(str);
			}
		
//		ex2.
			List ls = new ArrayList();		// 업캐스팅 형의 예
			
//			add(Object e)
			ls.add(new Integer(10));				// 자동박싱 + 업캐스팅
			ls.add(200);
			ls.add(3000);
			ls.add(40000);
			ls.add(500000);
			
//			Object get(int index)
			for(int i=0; i<ls.size(); i++) {
//				Object obj = ls.get(i);

				Integer it = (Integer) ls.get(i);			// 다운캐스팅
				int n = it.intValue();						//언박싱
				
				// 다운 캐스팅  + 언박싱
				int n1 = ((Integer)ls.get(i)).intValue();
				System.out.println(n1);
				
			}
		
		
		
}
}
