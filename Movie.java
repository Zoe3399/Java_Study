public class Movie {
    // 오펜하이머, 180, 8.5
    private String title;
    private int runningTime;
    private double rate;
    
    public Movie(String title, int runningTime, double rate) {
        this.title = title;
        this.runningTime = runningTime;
        this.rate = rate;
    }

    // 생성 당시 3개의 field 초기화할 수 있도록
   // 생성자!! 만들어주세요
   
   // 3개의 정보를 다음과 같이 출력하는
   // showInfo() 메소드 만들어주세요
   // "오펜하이머 : 180분, 평점 : 8.5"
    public void showInfo(){
        System.out.printf("제목 : %-12s | 상영시간 : %-4d(분) | 평점 : %.1f%n", title, runningTime, rate);
    
    }
    public static String center(String text, int len) {
        if (text.length() >= len) return text;
        int leftPadding = (len - text.length()) / 2;
        int rightPadding = len - text.length() - leftPadding;
    
        StringBuilder padded = new StringBuilder();
        for (int i = 0; i < leftPadding; i++) padded.append(" ");
        padded.append(text);
        for (int i = 0; i < rightPadding; i++) padded.append(" ");
        
        return padded.toString();
    }
}
