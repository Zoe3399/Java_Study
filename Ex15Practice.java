public class Ex15Practice {

   public static void main(String[] args) {
      
      // 5 X 5 정방형 int형 Matrix
      int[][] array = new int[5][5];
      
      int cnt = 1;
      
      // 입력부
      for(int i = 0; i < 5; i++) {
         for(int j = 0; j < 5; j++) {
            array[i][j] = cnt;
            cnt++;
         }
      }
      
      // 출력부
        for (int i = 0; i < array.length; i++) { // 행(row) 반복
            for (int j = 0; j < array[i].length; j++) { // 열(column) 반복
                System.out.print(array[i][j] + "   ");//    "    "대신에 "\t"사용
                //System.out.printf("%3d", array[i][j]); //이렇게 하면 사이가 좀 줄고 출력됨 
            }
            System.out.println(); // 다음 행으로 넘어갈 때 개행
        }
      
   }

}