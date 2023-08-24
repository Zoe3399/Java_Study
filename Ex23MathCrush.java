public class Ex23MathCrush {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        boolean divisor = isDivisor(num1, num2);
        
        System.out.println(divisor);
        int num = 10;
        int result = getSumOfDivisors(num);
        System.out.println(num + "의 약수의 합 : "+result);
        getDivisor(10);

        boolean perfect = isPerfectNumber(num);
        System.out.println(perfect);

        int startValue = 2;
        int endValue = 10000;
        for(int i = startValue; i<= endValue; i++){
            if(isPerfectNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int num){
        // 만약, num이 완전수 라면 true 리턴
        // 아니라면, Flase return

        //완전수
        // 자기 자신을 제외한 약수의 합이 자기 자신과 같은 수
        // 10의 약수 : 1 2 5 10
        // 자기 자신을 제외한 10의 약수의 합 : 8 != 10
        return getSumOfDivisors(num) == num * 2;
        
    }
    public static int getSumOfDivisors(int num) {
        int a = 1;
        int total = 0;

        while (a <= num){
            if(num % a == 0){
                total += a;
            } 
       }
        return total; 
    }

    public static boolean isDivisor(int num1, int num2) {
        /*if(num1 % num2 == 0){
            return true;
        }
        return false;
        */
        return num1 % num2 == 0;
        // type boolean
    }

    public static void getDivisor(int num) {
        String result = "";
        result += "의 약수 : ";
        int a = 1;
        
        while (a <= num) {
            if (num % a == 0) {
                    result += a + " ";  // 약수를 찾았을 때 result에 추가
            }
            a++;
        }
        System.out.println(result);
        }
}
