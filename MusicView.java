import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicView {
    public static void main(String[] args) throws InterruptedException {
        MP3Player mp3 = new MP3Player();
        
        String dir = "C:/Users/gjaischool/Desktop/java/Java_Study/music/";
        String path1 = dir + "아이브-LoveDive.mp3";
        String path2 = dir + "뉴진스-HypeBoy.mp3";
        String path3 = dir + "르세라핌-Antifragile.mp3";
        String path4 = dir + "윤하-사건의지평선.mp3";
        String path5 = dir + "카라-WhenIMove.mp3";
        
        // 음악 담자!
        ArrayList<MusicVO> musicList = new ArrayList<>();
        musicList.add(new MusicVO("LoveDive", "아이브", path1));
        musicList.add(new MusicVO("HypeBoy", "뉴진스", path2));
        musicList.add(new MusicVO("Antifragile", "르세라핌", path3));
        musicList.add(new MusicVO("사건의지평선", "윤하", path4)); 
        musicList.add(new MusicVO("WhenIMove", "카라", path5));        
               

        Scanner sc = new Scanner(System.in);

        System.out.println("====== |음악플레이어| ======");
        int index = 0;
        while (true) {
            System.out.println("[1] 재생 | [2] 이전곡 | [3] 다음곡 | [4] 정지");
            int menu = sc.nextInt();
            if(menu == 1){
                System.out.println("재생");
                //금요일에 만나요 노래 정보를 출력!
                // musicList.get(0) << 자체가 musicVO 임
                musicList.get(index).showInfo();
                if(mp3.isPlaying()){
                    mp3.stop(); //노래 멈춰
                }
                // 노래 출력
                mp3.play(musicList.get(index).getPath());

            }else if(menu == 2){
                System.out.println("이전곡");
                // 만약 첫곡의 경우 맨마지막곡으로 넘어감
                if(index == 0){
                    // 마지막 곡 index는 musicList의 사이즈-1 임
                    index = musicList.size()-1;
                }else{
                    // 아닐 경우엔 index = index-1
                    index--;        
                }
                // 출력확인
                musicList.get(index).showInfo();
                // 자체가 불리언이라 이렇게써도댐
                // 이전게 재생이 되고 있다면
                if(mp3.isPlaying()){
                    mp3.stop(); //노래 멈춰
                }
                mp3.play(musicList.get(index).getPath());
            }else if(menu == 3){
                System.out.println("다음곡");
                // 만약 마지막곡의 경우 첫곡으로 넘어감
                if(index == musicList.size()-1){
                    // index를 0으로 바꾸기
                    index = 0;
                }else{
                    // 아닐 경우 index = index + 1
                    index++;
                }
                musicList.get(index).showInfo();
                // 자체가 불리언이라 이렇게써도댐
                if(mp3.isPlaying()){
                    mp3.stop();
                }
                mp3.play(musicList.get(index).getPath());

            }else if(menu == 4){
                System.out.println("정지");
                // 자체가 불리언이라 이렇게써도댐
                if(mp3.isPlaying()){
                    mp3.wait(1000);
                }

            }else{
                System.out.println("잘못입력하셨습니다.");
            }
        }
        
    }
}
