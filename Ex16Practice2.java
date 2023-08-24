package exam;

import java.util.Arrays;

public class Ex16Practice2 {

	public static void main(String[] args) {

		// 5 * 5 정방형 int형 Matrix
		int[][] array = new int[5][5];
		
		// 입력부
		int cnt = 1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				array[i][j] = cnt;
//				System.out.print(array[i][j] + " ");
				System.out.printf("%d	", array[i][j]);
				cnt++;	
			}
			System.out.println();
	
		}
		
		
		// 출력부
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%-3d", array[j][i]);
			}
			System.out.println();
		}
		
		
	}

}