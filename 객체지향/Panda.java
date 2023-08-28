package 객체지향;

import 객체지향.extence.Mammalia;

public class Panda extends Mammalia{

    //1. 설계
    //2. 사용자 정의 객체(Value Object)

    private String habitat;// 서식지
    private String appearance;    // 외형
    
    @Override
    public void eat() {
        System.out.println("대나무를 먹다");
    }
    
    public void cute() {
        System.out.println("귀엽다");
    }

    public void cry(){
        System.out.println("뿌앵");
    }

}