public class Ex14TwoDArray {
    public static void main(String[] args) {
        String[] snacks = {"초코송이","빼빼로","포카칩"};
        String[] drinks = {"아침햇살","포카리스웨트","봉봉"};
        String[] coffee = {"아아","디카페인","라떼"};

        // 배열 생성시 반드시 "길이, 크기"가 정의
        // 다차원 배열 선언시 데이터 타입은 하위 차원의 자료형을 따른다
        String[][] Store = new String[3][];
        Store[0] = snacks;
        Store[1] = drinks;
        Store[2] = coffee;

        System.out.println(drinks[1]);
        System.out.println(Store[1][1]);

        String[] [] Store2 = {snacks, drinks, coffee};
        
    }
}
