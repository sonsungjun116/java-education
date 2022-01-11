package p2022_01_11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class MemberInfo{
		private String name;
		private int age;
		private String email;
		private String address;
		
		public MemberInfo(String name,int age,String email,String address) {
			this.name = name;
			this.age = age;
			this.email = email;
			this.address = address;
			
}
	public void print() {
		System.out.println(" 이름="+name+"\n" +" 나이="+ age +"\n" +" 이메일="+ email +"\n" + " 주소="+address);
	}



}


public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 나이, 이메일, 주소를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		String name1 = sc.nextLine();
		int age1 =sc.nextInt();
		sc.nextLine();
		String email1 = sc.nextLine();
		String address1 = sc.nextLine();
		
		MemberInfo x = new MemberInfo(name1,age1,email1,address1);
	
		x.print();
		ArrayList<MemberInfo> al = new ArrayList<MemberInfo>();
		
	System.out.println(al);
	}

}
