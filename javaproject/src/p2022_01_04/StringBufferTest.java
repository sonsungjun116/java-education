package p2022_01_04;

public class StringBufferTest {
	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("gemini");
		System.out.println("sb1.length() : " + sb1.length());
		System.out.println("sb1.capacity() : " + sb1.capacity());

		sb1.append("A string buffer implements" + "a mutable sequence of characters");
		// 값이 변화가 존재하더라도 주소 값이 바뀌지는 않는다. ---> 그냥 String의 경우 heap
		// 안의 내용을 수정하면 주소 값이 바뀌어 수정된다.
		System.out.println("sb1.length() : " + sb1.length());
		System.out.println("sb1.capacity() : " + sb1.capacity());

		StringBuffer sb2 = new StringBuffer();
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
	}
}
