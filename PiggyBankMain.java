public class PiggyBankMain {
    public static void main(String[] args) {
        // PiggyBank 클래스
        // 레퍼런스 데이터 타입
        PiggyBank bank1 = new PiggyBank();
//        bank1.money = 0;

        // 500원 입금
        bank1.deposit(500);
        bank1.showMoney();

        // 100원 출금 후 현재잔액 출력
        bank1.withdraw(100);
        bank1.showMoney();

        // 두번째 저금통 만들기
        PiggyBank bank2 = new PiggyBank();
//        bank2.money = 0;

        // 만원 입금
        bank2.deposit(10000);
        // bank1, bank2의 showMoney를 각각 호출
        bank1.showMoney();
        bank2.showMoney();

    }
}
