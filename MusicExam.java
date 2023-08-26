import javazoom.jl.player.MP3Player;

public class MusicExam {
    public static void main(String[] args) {
        MP3Player mp3 = new MP3Player();
        
        String dir = "C:/Users/gjaischool/Desktop/java/Java_Study/music/";
        String path = dir + "아이브-LoveDive.mp3";
        
        mp3.play(path);
    }
}
