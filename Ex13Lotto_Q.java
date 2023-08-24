import java.util.Arrays;
import java.util.Random;

public class Ex13Lotto_Q {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < 6;i++){
            Random rd = new Random();
            lotto[i] = rd.nextInt(45)+1;
            for(int j = 0; j<i; j++){
                // i와 j값을 비교했을때 같은 값일 경우
                // i를 다른값이 나올때까지 다시 랜덤돌리기
                if(lotto[i] == lotto[j]){
                    i--;
                }
            }
            System.out.println(lotto[i]);
        }
        System.out.println(Arrays.toString(lotto));
    }
}