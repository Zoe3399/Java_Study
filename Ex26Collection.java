import java.util.ArrayList;

public class Ex26Collection {
    public static void main(String[] args) {
        // ArrayList : 가변 배열
        // 1. 크기(길이)가 변할 수 있다.
        // ArrayList<DataType> 변수명 = new ArrayList<DataType>();
        ArrayList<String> movies = new ArrayList<String>();

        // 생성 part의 데이터 타입은 생략가능(Java 1.8 이상부터)
        // 값을 추가하는 메소드 : add(elemeny)
        movies.add("오펜하이머");
        movies.add("엘리멘탈");
        movies.add("포레스트검프");
        movies.add("다크나이트");
        
        // 값을 추가하는 메소드 : add(index, element)
        movies.add(1, "인터스텔라");

        // 값을 삭제하는 메소드 : remove(index)
        movies.remove(2);

        // 값을 삭제하는 메소드 : remove(element)
        movies.remove("인터스텔라");

        // 값을 전부! 삭제해주는 메소드 : clear()
        movies.clear(); 

        // 값을 가져오는 메소드 : get(index)
        for(int i=0; i < movies.size(); i++){
            System.out.println(movies.get(i));
        }
    }
}
