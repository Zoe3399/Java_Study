import java.util.Arrays;

public class Ex18Sort {

	public static void main(String[] args) {
		// 탐색하기 위해 자료를 규칙적으로 열거
		
		// 1. Bubble Sort
		int[] array = {42, 7, 12, 82, 25};
		int temp = 0;
		
		for(int j=4; j>0; j--) {
			for(int i=0; i<j; i++) {
				if(array[i] > array[i+1]) {
					// 치환
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
		
		// 오름차순 정렬 후 : 7 12 25 42 82
		
//		
//		// cycle 1
//		for(int i=0; i<4; i++) {
//			if(array[i] > array[i+1]) {
//				// 치환
//				temp = array[i];
//				array[i] = array[i+1];
//				array[i+1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(array));
//		
//		// cycle 2
//		for(int i=0; i<3; i++) {
//			if(array[i] > array[i+1]) {
//				// 치환
//				temp = array[i];
//				array[i] = array[i+1];
//				array[i+1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(array));
//		
////		// cycle 1
////		if(array[0] > array[1]) {
////			// 치환
////			temp = array[0];
////			array[0] = array[1];
////			array[1] = temp;
////		}
////		
////		if(array[1] > array[2]) {
////			// 치환
////			temp = array[1];
////			array[1] = array[2];
////			array[2] = temp;
////		}
////			
	}

}
