import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DnDCharacter {
    private int strentgh;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    public int getStrentgh() {
        return strentgh;
    }

    public void setStrentgh(int strentgh) {
        this.strentgh = strentgh;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }


    public int[] dicethrow(){
        Random diceRoll = new Random();
        int[] allDicesRolls = new int[4];
        int firstDice = diceRoll.ints(1,(6+1)).findFirst().getAsInt();
        int secondDice = diceRoll.ints(1,(6+1)).findFirst().getAsInt();
        int thirdDice = diceRoll.ints(1,(6+1)).findFirst().getAsInt();
        int fourthDice = diceRoll.ints(1,(6+1)).findFirst().getAsInt();
        allDicesRolls[0] = firstDice;
        allDicesRolls[1] = secondDice;
        allDicesRolls[2] = thirdDice;
        allDicesRolls[3] = fourthDice;
        return allDicesRolls;
    }

    public int discardAndSum(int[] allDices){
        Arrays.sort(allDices);
        int resultForAttr = 0;
        for (int i = 0; i < allDices.length; i++) {
            resultForAttr = allDices[1]+allDices[2]+allDices[3];
        }
        return resultForAttr;
    }


    public DnDCharacter() {
        this.strentgh = discardAndSum(dicethrow());
        this.dexterity = discardAndSum(dicethrow());
        this.constitution = discardAndSum(dicethrow());
        this.intelligence = discardAndSum(dicethrow());
        this.wisdom = discardAndSum(dicethrow());
        this.charisma = discardAndSum(dicethrow());
    }

    public int modifier(int modif ) {
        int constModif =  (modif - 10)/2;
        if (modif == 3 || modif == 5 || modif == 7 || modif == 9 ){
            constModif -= 1;
        }
        return constModif;
    }

    public int getHitpoints() {
        hitpoints = 10 + this.modifier(this.constitution);
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int ability() {
        return discardAndSum(dicethrow());
    }
}
