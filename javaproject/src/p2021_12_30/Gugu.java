package p2021_12_30;

public class Gugu {

	public static void main(String[] args) {
		
		
		int array[][] = new int[8][9];
		int array2[] = new int[9];
		int array3[] = new int[9];
		
						
		for(int i = 0; i < 8; i++) {							
		for(int j = 0; j < 9;j++) {
			array[i][j] = (i+2)*(j+1);
				System.out.print(array[i][j]+"\t");
		}		
		System.out.println();
		}
		
		
//		for(int j = 0; j < 9; j++) {					
//			
//			for(int i = 0; i < 8;i++) {
//				array2[i] = (i+1)*(j+2);
//				array[j][i] = array2[i];
//			
//			}		
//			}
//				
//		
//		for(int j = 0; j < 9; j++) {								
//			for(int i = 0; i < 8;i++) {
//		System.out.println(array[j][i]);
//			}
//		}
	}
}



//		 //단 title출력 
//		for(int dan=2; dan<=9; dan++){ 
//			System.out.print("[" + dan + "단]" + "\t");
//		array[][] =
//		}
//		System.out.println();
//		for(int i=1; i<=9; i++){
//			for(int j=2; j<=9;j++){	// 각 단 출력  		
//				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
//			}
//			System.out.println();
//		}
//	} 
//}
//
