public class PiggyBank {
    // member in class 
    // field(멤버 변수, 속성, 특성, 변수)
    // Method (멤버 가능, 행동, 행위, 동작)

    // 접근 제한자 (Access Modifier)
    // 외부에서 접근할 수 있는 범위를 멤버에 설정

    // Java의 접근 제한자
    // 1) public : 모든 범위에서 접근 가능
    // 2) protected : 같은 패키지 + 상속 관계에서 접근 가능
    // 3) (default) : 같은 패키지에서 접근 가능 
    // 4) private : 해당 클래스에서만 접근 가능

    // 생성자 (constructor)
    // 클래스가 생성(new)될때 호출되는 메소드!

    // 클래스 설계 당시 기본 생성자가 없으면
    // 컴파일 시 자동으로 생성!!
    // 1. 리턴 부분!! 없음
    // 2. 이름!! 클래스 이름과 동일
    // 3. 메소드 오버로딩 가능!!
    
    public PiggyBank(){
        this.money = 5000;
    }

    public PiggyBank (int money){
        this.money = money; 
    }
    
    private int money;  // 돈

    public void deposit(int money){
        this.money += money;

    }

    public void withdraw(int money){
        this.money -= money;

    }

    public void showMoney(){
        System.out.println("now moeny : " + money);
    }

}
