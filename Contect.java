public class Contect {
    // 우리반 이름을 저장할 수 있는 자료구조!!
    // 이름, 나이, MBTI
    //String, int, String

    private String name;
    private int age;
    private String mbti;

    // 자동완성
    // 소스작업
    public Contect(String name, int age, String mbti) {
        this.name = name;
        this.age = age;
        this.mbti = mbti;
    }

    public void showInfo(){
        System.out.printf("이름 : %s, 나이 : %d(세), MBTI : %s%n", name, age, mbti);
        
    }

        
}
