public class Movie_Main {
    public static void main(String[] args) {
        // Movie 5개를 넣을 수 있는 객체 배열 movies생성
        Movie[] movies = new Movie[5];
        movies[0] = new Movie("오펜하이머", 180, 8.5);
        movies[1] = new Movie("달짝지근해:7510", 119,8.0 );
        movies[2] = new Movie("콘크리트", 130, 8.2);
        movies[3] = new Movie("밀수", 129, 8.0);
        movies[4] = new Movie("엘리멘탈", 109, 8.9);

        // 팀 전원의 정보 출력
        for(int i = 0; i < movies.length; i++){
            movies[i].showInfo();
        }
    }
}
