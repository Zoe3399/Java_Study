package 객체지향;

public class Zoo {
    public static void main(String[] args) {
        Panda pubao = new Panda();
        // pubao.eat();
        // pubao.cute();
        // pubao.cry();

        Rabbit zudy = new Rabbit();
        // zudy.walk();
        // zudy.eat();
        // zudy.cry();

        Hippo moomin = new Hippo();
        // moomin.eat();
        // moomin.cry();
        // moomin.swim();

        Penguin pengsoo = new Penguin();
        // pengsoo.eat();
        // pengsoo.cry();
        // pengsoo.fly();
        
        // 4마리 동물의 eat() 메소드를 호출!!
        pubao.eat();
        zudy.eat();
        moomin.eat();
        pengsoo.eat();
        
    }

    
}
