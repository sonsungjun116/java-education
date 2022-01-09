package p2022_01_06;

import java.text.DecimalFormat;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat ss = new DecimalFormat("0.##");
		
		int r = 5;
		
		double circum = Math.PI * 2 * r ;
		double area = Math.PI * r * r;
		double surface = Math.PI * 4 * r * r;
		double volume = Math.PI * (4.0/3) * r * r *r;
		
		
		System.out.println(circum);
		System.out.println(ss.format(circum));
		System.out.println(ss.format(area));
		System.out.println(ss.format(surface));
		System.out.println(ss.format(volume));
		
	}

}
