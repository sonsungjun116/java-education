package p2021_12_29;

public class ArrayEx07 {

	
	// 절대값을 구해주는 메소드
	public static int abs(int data) {
		if(data < 0)		//음수
			data = -data;
		return data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//args[0] = "-10";
		System.out.println("args[0]:" + args[0]);
		System.out.println("args[1]:" + args[1]);
		
		// args[0] = "-10"	---> -10 : 자료형 변환
		int num = Integer.parseInt(args[0]);	//int num = -10
		System.out.println("절대값:" + abs(num));	//abs()메소드 호출
		

	}

}
