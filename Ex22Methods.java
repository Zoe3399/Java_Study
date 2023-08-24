public class Ex22Methods {
    public static void main(String[] args) {
        sumPrint(5, 10);
    }

    // 매개변수 O , return type O
    public static int sum(int a, int b){
        return a + b;
    }

    // 매개변수 O , return type X
    public static void sumPrint(int a, int b){
        System.out.println(a+b);
    }
    
    // 매개변수 X , return type O
    public static String getName(){
        return "박승주";
    }

    // 매개변수 X , return type X
    public static void todayWeather(){
        System.out.println("오늘 비 엄청 옴");
    }
    
}
