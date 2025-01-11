package week03;


abstract class GameCharacter {
    public abstract void attack();
    public abstract void defend();
}

class Warrior extends GameCharacter {
    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword!");
    }

    @Override
    public void defend() {
        System.out.println("Warrior defends with a shield!");
    }
}

class Archer extends GameCharacter {
    @Override
    public void attack() {
        System.out.println("Archer attacks with a bow and arrow!");
    }

    @Override
    public void defend() {
        System.out.println("Archer dodges the attack!");
    }
}
public class qn04 {
	public static void main(String[] args) {
        GameCharacter warrior = new Warrior();
        warrior.attack();
        warrior.defend();

        GameCharacter archer = new Archer();
        archer.attack();
        archer.defend();
    }
}
