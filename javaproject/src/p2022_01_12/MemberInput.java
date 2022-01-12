package p2022_01_12;


import java.util.ArrayList;
import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		제네릭 : 한가지 자료형의 자료만 저장한다는 의미
//		List에 MemberInfo객체만 저장 할 수 있다.
		
		
		ArrayList<MemberInfo> li = new ArrayList<MemberInfo>();
//		li.add(30);
		MemberInfo mm;
		String yn;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("성명을 입력하세요? ");
			String name = sc.nextLine();
			System.out.print("나이를 입력하세요? ");
			int age = sc.nextInt();	//숫자는 다음에 null값이 입력됨
			sc.nextLine();			// 다시 받으려면 nextLine해야함
			System.out.print("E-Mail을 입력하세요? ");
			String email = sc.nextLine();
			System.out.print("주소를 입력하세요? ");
			String address = sc.nextLine();

			MemberInfo m = new MemberInfo();
			// m.name="홍길동";	//맴버변수가 private이기 때문에 바로 접근이 불가능하다
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

			li.add(m);

			System.out.println("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.next();
			if (yn.equals("y")) {
				continue;
			} else if (yn.equals("n")) {
				break;
			}

		} while (true);

//		Object get(int index)
		for (int i = 0; i < li.size(); i++) {
			mm = (MemberInfo) li.get(i);

			System.out.println("성명:" + mm.getName());
			System.out.println("나이:" + mm.getAge());
			System.out.println("E-Mail:" + mm.getEmail());
			System.out.println("주소:" + mm.getAddress());
		}
	}

}

//	DTO(Data Transfer Object)
class MemberInfo extends Object {
	private String name;				// 필드
	private int age;
	private String email;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
