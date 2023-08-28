package Ex_Digimon;

public class Digimon {
    protected String name; // 디지몬 이름
    protected int hp; // 체력
    protected int atk; // 공격력
    protected int def; // 방어력
   
    // 디지몬 생성자
    public Digimon(String name, String string, int hp, int atk, int def) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public int attack() {
        return atk;
    }    
   
    public void evolution() {
        System.out.println("디지몬 진화!!!");
    }
}
