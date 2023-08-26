public class Contect_Main {
    public static void main(String[] args) {
        // 핵심역량PJ Team 정보 저장
        Contect team1 = new Contect("박승주", 24, "ESTJ");
        Contect team2 = new Contect("강병화", 25, "ISFJ");
        Contect team3 = new Contect("김성준", 26, "ENFP");
        Contect team4 = new Contect("기찬", 36, "ISFJ");

        team1.showInfo();
        team2.showInfo();
        team3.showInfo();
        team4.showInfo();
        System.out.println();


        //VO (Value Object) : 사용자 정의 객체
        
        Contect[] teams = {team1,team2,team3, team4};

        // 팀 전원의 정보 출력
        for(int i = 0; i < teams.length; i++){
            teams[i].showInfo();
        }
    }
}
