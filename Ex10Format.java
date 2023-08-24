public class Ex10Format {
    public static void main(String[] args) {
        String name = "박승주";
        int age = 25;
        String mbti = "ESTJ";
        
        // %s : String
        // %d : decimal (정수)
        // %f : float (실수)
        // %n : new(새로운 라인)

        // 2. System.out.printf()
        System.out.printf("이름: %s, 나이 : %d(세), MBTI : %s%n" , name,age,mbti);    
        
        // 1. String.format()
        String info = String.format("이름: %s, 나이 : %d(세), MBTI : %s" , name,age,mbti);
        System.out.println(info);

        // %숫자s : 숫지 자릿수만큼 표현!! (오른쪽 정렬)
        // 왼쪽 정렬 : 숫자 앞에 - 붙여서
        System.out.printf("%10s","*");
    }

}
