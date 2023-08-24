// OOP (Object Oriented Programming)

public class Ex25OOP {
    public static void main(String[] args) {
        // 1. 기본 데이터 타입
        // 2. 레퍼런스 데이터 타입
        // -1) 배열에 대한 레퍼런스
        // -2) 클래스에 대한 레퍼런스
        // -3) 인터페이스에 대한 레퍼런스     
        
        int num = 5;
        Home JUJU_House = new Home();
        JUJU_House.price = 200000000;
        JUJU_House.area = 20;
        JUJU_House.isApart = true;

        System.out.println(JUJU_House.price);

        Home parent_House = new Home();
        parent_House.price = 150000000;
        parent_House.area = 20;
        parent_House.isApart = false;

        System.out.println(parent_House.price);
    }
}
