import java.util.Arrays;

public class Ex11Array {
    public static void main(String[] args) {
        // 배열 : 동일힌 자료구조를 imdex를 통해 관리
        // 자료구조 : 대량의 데이터를 효과적으로 다루기 위해 사용
        
        // 변수의 선언
        int num; // 변수의 선언
        num = 5; // 변수의 할당 (최초할당 : 초기화)
        num = 10; //변수의 재할당

        int num2 = 21; // 변수의 선언 및 초기화

        // 금주 로또 번호를 담고 있는 배열 lotto
        int[] lotto; // 배열의 선언 
        // 코드를 읽는 주체가 사람이기 때문에 []을 앞에 써준다
        // int lotto[] 보단 저게 나음
        
        // 레퍼런스 변수 => 생성(new)
        lotto = new int[6];
        // java에서 배열은 반드시 생성 시 크기 결정해줘야함.

        // 배열 index는 0-index  체계
        lotto[0] = 2;
        lotto[1] = 9;
        lotto[2] = 17;
        lotto[3] = 31;
        lotto[4] = 35;
        lotto[5] = 44;
    
        System.out.println(lotto);
        // [I@7637f22
        // 레퍼런스 타입이기 때문에 이렇게 출력됨.
        // 그래서 다음과 같이 출력 해줘야지 나옴
        System.out.print(lotto[0]+" ");
        
        // 반복문으로 배열 전체 출력해보기
        for(int i = 0; i < lotto.length; i++){
            System.out.print(lotto[i]+" ");
        }

        System.out.println();

        // 계속 반복문으로 출력하기 힘드니까
        // 배열 함수 사용해서 출력하기
        // Arrays.toString(1차원 배열);
        System.out.println(Arrays.toString(lotto));
          // 배열 생성과 동시에 초기화!!
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int[] nums2 = {5, 6, 7};
        
    }
}
