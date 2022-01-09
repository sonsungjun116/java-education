package p2022_01_04;

public class SplitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// String[]	 split("구분기호")
		
		String jumin = "900101-1234567";
		String[] j = jumin.split("-");
		System.out.println("주민번호 앞자리:"+j[0]);
		System.out.println("주민번호 뒷자리:"+j[1]);
		for(int i=0; i<j.length;i++)
			System.out.println(j[i]);
		
		for(String s : j)
			System.out.println(s);
		
		String tel = "010-1234-5678";
		String[] t = tel.split("-");
		System.out.println("전화번호 앞자리:"+t[0]);
		System.out.println("전화번호 중간자리:"+t[1]);
		System.out.println("전화번호 끝자리:"+t[2]);
		
		String email = "totoro@naver.com";
		String[] e = email.split("@");
		System.out.println("아이디:"+ e[0]);
		System.out.println("도메인:"+ e[1]);
				
	}

}
