package p2022_01_03;

import java.util.Scanner;

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
	public void setName() {
		this.name = name;
	}
	
	public void setAge() {
		this.age = age;
	}
	public void setEmail() {
		this.email = email;
	}
	public void setAddress() {
		this.address = address;
	}
	
	public void print(){
		System.out.println(name+ "/" +age+ "/" +email+"/"+address); 
	  }
}



public class MemberInput {

	public static void main(String[] args) {

		System.out.println("이름, 나이, 이메일, 주소를 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		
		String name1 = sc.nextLine();
		int age1 =sc.nextInt();
		sc.nextLine();
		String email1 = sc.nextLine();
		String address1 = sc.nextLine();
		
		MemberInfo x = new MemberInfo(name1,age1,email1,address1);
		x.print();
	}

}
