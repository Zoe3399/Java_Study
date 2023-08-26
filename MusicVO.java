public class MusicVO {
    // 노래 제목, 가수, 노래 경로
    private String title, singer, path;

    //1. 생성자
    // 소스작업 >> Generate Constructors


    public void showInfo(){
        // 아이유 - 금요일에 만나요
        System.out.printf("%s - %s %n", singer, title);
    }



    // 클래스 내의 field를 리턴해주는 메소드
    // getter method
        public MusicVO(String title, String singer, String path) {
        this.title = title;
        this.singer = singer;
        this.path = path;
    }    

    // 외부에서
    // 타입 = String
    // 되돌려줘야하니 = get
    // 이것도 자동완성 가능
    // 소스작업 >> Generate Getters
    public String getPath() {
        return path;
    }

    // field를 수정하는 메서드 : setter method

    
    
}
