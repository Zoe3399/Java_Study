package 객체지향;

import 객체지향.extence.Mammalia;

// extends 부모클래스
public class Hippo extends Mammalia{
    // 하마 클래스 설계
    // 포유류 클래스 상속

    public void swim(){
        System.out.println("헤엄치다");
    }

    // 중복정의 오버로딩
    // 재정의 오버라이딩

    // Method Overriding(메소드 오버라이딩)
    // 부모 클래스의 메소드를 재정의

    // 부모클래스와 이름, 타입, 매개변수 다 동일해야함
    // 개발자의 에러, 실수를 방지하기위해 @Override 해줌

    @Override // 부모클래스와 다른 경우 에러 일으켜줌
    public void eat(){
        System.out.println("아무거나 으적으적");
    }
}
