package 객체지향;

import 객체지향.extence.Mammalia;

public class Rabbit extends Mammalia{
    
    // apperance 외형
    // habitat 서식지
    private String habitat;// 서식지
    private String appearance;    // 외형

    public void walk(){
        System.out.println("깡총깡총 뛴다");
    } // Walk() : "깡총"
    
    @Override
    public void eat(){
        System.out.println("당근 먹방");
    }// eat() : "당근 먹방"

    public void cry(){
        System.out.println("으에엥");
    } // cry() : "으에엥"
}
