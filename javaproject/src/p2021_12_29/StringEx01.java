package p2021_12_29;

public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "자바";
		String str2 = "자바";
		if(str1 == str2) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		String str3 = new String("자바");
		String str4 = new String("자바");
		if(str3 == str4) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		if(str1 == str3) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		if(str1.equals(str2)) {
			System.out.println("참조하는 값이 같다.");
		}else {
			System.out.println("참조하는 값이 다르다.");
		}
		if(str3.equals(str4)) {
			System.out.println("참조하는 값이 같다.");
		}else {
			System.out.println("참조하는 값이 다르다.");
		}
		if(str1.equals(str3)) {
			System.out.println("참조하는 값이 같다.");
		}else {
			System.out.println("참조하는 값이 다르다.");
		}
		
		boolean b = "자바".equals("파이썬");
		if(b) {
			System.out.println("같은 값");			
		}else {
			System.out.println("다른 값");
		}
		
		if("오라클".equals("스프링")) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		if(new Integer(30).equals(30)) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
	
	
	
	
	}
}
