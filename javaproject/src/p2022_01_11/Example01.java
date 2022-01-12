package p2022_01_11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import java.util.*;

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;

	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public void print() {
		System.out.println(" 이름=" + name + "\n" + " 나이=" + age + "\n" + " 이메일=" + email + "\n" + " 주소=" + address);
	}

}

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<MemberInfo> al = new ArrayList<MemberInfo>();

		while (true) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();

			System.out.print("나이를 입력하세요 : ");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.print("이메일을 입력하세요 : ");
			String email = sc.nextLine();

			System.out.print("주소를 입력하세요 : ");
			String address = sc.nextLine();

			MemberInfo x = new MemberInfo(name, age, email, address);

			System.out.println("추가 진행 y, 그만두기 n");
			String answer = sc.nextLine();
			if (answer.equals('y') || answer.equals('Y')|| answer.equals('ㅛ')) {
				continue;
			} else if (answer.equals('n') || answer.equals('N')|| answer.equals('ㅜ')) {
				break;
			}
		}
		for (int i = 0; i < al.size(); i++) {
				MemberInfo m = al.get(i);
				System.out.println(m.getName());
				System.out.println(m.getAge());
				System.out.println(m.getEmail());
				System.out.println(m.getAddress());
		}

	}

}
