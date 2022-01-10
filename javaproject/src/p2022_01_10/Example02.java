package p2022_01_10;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.*;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Set ss = new TreeSet();
		
		while(ss.size() != 6) {
			int n = (int)(Math.random() * 45) + 1;
			ss.add(n);
		}
		System.out.println(ss);
	
	
	
	
	
	}

}
