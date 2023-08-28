package Ex_Pokemon;
import Ex_Digimon.Digimon;

public class PokemonBag {

    public static void main(String[] args) {
        Pokemon 피카츄 = new Pokemon("피카츄", "Electric", 35, 55, 40);
        Pokemon 파이리 = new Pokemon("파이리", "Fire", 39, 52, 43);
        Pokemon 꼬부기 = new Pokemon("꼬부기", "Water", 44, 48, 65);
        Pokemon 라이츄 = new Pokemon("라이츄", "Electric", 60, 90, 55);
        Pokemon 망나뇽 = new Pokemon("망나뇽", "Water/Flying", 95, 125, 79);
        
        // Adding legendary Pokemon
        Pokemon 디아루가 = new Pokemon("디아루가", "Steel/Dragon", 100, 120, 120);
        Pokemon 펄기아 = new Pokemon("펄기아", "Water/Dragon", 90, 90, 106);
        Pokemon 뮤츠 = new Pokemon("뮤츠", "Psychic", 106, 110, 90);
    
        
        Digimon 레나몬 = new Digimon("레나몬", 50, 60, 50);
        Digimon 아구몬 = new Digimon("아구몬",  50, 60, 50);
        Digimon 가브몬 = new Digimon("가브몬",  50, 55, 45);
        Digimon 파닥몬 = new Digimon("파닥몬",  40, 40, 40);
        Digimon 가트몬 = new Digimon("가트몬", 60, 70, 60);
        Object[] mons = {피카츄,파이리,꼬부기,라이츄,라이츄,망나뇽,디아루가,펄기아,뮤츠,아구몬,가브몬,가트몬,파닥몬, 레나몬};

        for(int i = 0; i < mons.length; i++){
            if(mons[i] instanceof Pokemon){
                Pokemon p = (Pokemon)mons[i];
                System.out.println(p.attack());
                System.out.println(p.sAttack());
            } else {
                Digimon d = (Digimon)mons[i];
                d.attack();
                d.evolution();
            }
        }

        }
    }
}