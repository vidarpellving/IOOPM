import java.util.Scanner;

public class PairOfDice {
    private Die die1;
    private Die die2;
    private int value;

    public PairOfDice() {
        this.die1 = new Die();
        this.die2 = new Die();
    }

    public PairOfDice(int numberOfSides){
        this.die1 = new Die(numberOfSides);
        this.die2 = new Die(numberOfSides);
    }

    public int roll() {
        this.value = this.die1.roll() + this.die2.roll();
        return this.value;
    }

    public int getDie1() {
        return this.die1.get();
    }

    public int getDie2() {
        return this.die2.get();
    }

    public String toString() {
        return "PairOfDice(" + this.value + ")";
    }

    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Number of sides: ");
       int sides = sc.nextInt();
       PairOfDice pd = new PairOfDice(sides);
       System.out.println("Alea iacta est: " + pd.roll());
       System.out.println(pd);
    }

}
