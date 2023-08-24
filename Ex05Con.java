import java.util.Scanner;

public class Ex05Con {

	public static void main(String[] args) {

		// 한 줄 삭제 : Ctrl + D
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("나이를 입력하세요 >> ");
			
			int age = sc.nextInt();
			
			if(age >= 40) {
				System.out.println("아저씨 혹은 아줌마입니다");
			} else if(age >= 20) {
				System.out.println("성인입니다");
			} else {
				System.out.println("미성년자입니다");
			}
		}
		
		// 한 줄 옮기는 단축키 : Alt + 위/아래 화살표
		// 한 줄을 복사하는 단축키 : Alt + Ctrl + 위/아래 화살표
		// 한 줄 삭제 단축키 : Ctrl + D

		
		
		

	}

}
