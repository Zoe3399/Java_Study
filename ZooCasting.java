
import javax.swing.text.AbstractDocument.Content;

import 객체지향.Hippo;
import 객체지향.Movie;
import 객체지향.Panda;
import 객체지향.Penguin;
import 객체지향.Rabbit;
import 객체지향.extence.Animal;

public class ZooCasting {
    public static void main(String[] args) {
        // Up-Casting & Down-Casting

        // pubao
        // Up-casting
        // 자식 -> 부모 타입으로 변환
        Animal pubao = new Panda();

        pubao.eat();
        pubao.cry();

        // Down-Cating
        // 부모 -> 자식 타입으로 변환
        ((Panda)pubao).cute();

        
        Animal zudy = new Rabbit();
        Animal moomin = new Hippo();
        Animal pengsoo = new Penguin();

        // String name1 = "나예호";
        // String name2 = "임승환";
        // String[] names = {name1, name2};

        Animal ruabao = new Panda();

        Animal[] zoo = {pubao,zudy,moomin,pengsoo,ruabao};

        for(int i = 0; i < zoo.length; i++){
            zoo[i].eat();
            // if(zoo[i] 가 판다 타입이면)
            // 인스턴스 변수가 어떤 클래스로부터 만들어졌는지를
            if(zoo[i] instanceof Panda ){
                ((Panda)zoo[i]).cute();
            }
        }

        Object 오펜하이머 = new Movie("오펜하이머", 180, 8.5);
        Object 박승주 = new Contect("박승주", 21, "ESTJ");
        Object bubble = new MusicVO("Bubble","STACY","경로1");
        
        Object[] objects = {오펜하이머, 박승주, bubble};

        for(int i = 0; i < objects.length; i++){

            if(objects[i] instanceof Movie){
                ((Movie)objects[i]).showInfo();
            }else if(objects[i] instanceof Contact){
                ((Contact)objects[i]).showInfo();
            }else{
                ((MusicVO)objects[i]).showInfo();
            }
           }
        }


    }
}
