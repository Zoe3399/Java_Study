public class Ex09Stars2 {
    public static void main(String[] args) {
        
        for(int j = 1; j <= 5; j++) {
            for(int i= 1; i <= 6-j; i++) {
            System.out.print("*");
        }
        System.out.println();
        }

        for(int j = 1; j <= 5; j++){
            for (int i = 1; i <= 5-j; i++){
                System.out.print(" ");
            }
            for (int i = 1; i <=j; i++){
                System.out.print("*");
            }
            System.out.println();
        }


        
    }
}
