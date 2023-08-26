import java.util.Arrays;

public class Ex19Sort2 {

	public static void main(String[] args) {
		
		// 2. Selection Sort
		
		int[] array = {98, 7, 70, 13, 24};
		int maxIndex = 0;
		int temp = 0;
		
		System.out.println(Arrays.toString(array));		
		
		
		for(int j=5; j>1; j--) {
			maxIndex = 0;
			
			// 0번째 인덱스와 0번째 인덱스를 비교할 필요는 없다
			for(int i=1; i<j; i++) {
				if(array[i] > array[maxIndex]) {
					maxIndex = i;
				}
			}
			temp = array[j-1];
			array[j-1] = array[maxIndex];
			array[maxIndex] = temp;
			
			System.out.println(Arrays.toString(array));	
		}
//		// Cycle 1
//		maxIndex = 0;
//		
//		for(int i=0; i<5; i++) {
//			if(array[i] > array[maxIndex]) {
//				maxIndex = i;
//			}
//		}
//		temp = array[4];
//		array[4] = array[maxIndex];
//		array[maxIndex] = temp;
		
//		if(array[0] > array[maxIndex]) {
//			maxIndex = 0;
//		}
//		if(array[1] > array[maxIndex]) {
//			maxIndex = 1;
//		}
		
	}

}
