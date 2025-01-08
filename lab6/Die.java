import java.util.Scanner;

public class Die {
  private int numberOfSides;
  private int value;

  public Die() {
      this.numberOfSides = 6;
  }

  public Die(int numberOfSides) {
      if(numberOfSides <= 0){
        throw new IllegalArgumentException(numberOfSides + " is an illegal number of sides for die");
      }
      this.numberOfSides = numberOfSides;
  }

  public int roll() {
    this.value = (int) (Math.random() * numberOfSides) + 1;
    return this.get();
  }

  public int get() {
      return value;
  }
  
  public int numberOfSides(){
      return this.numberOfSides;
  }

  public String toString() {
      return "Die(" + this.value + ")";
  }

  public boolean equals(Die otherDie){
      return (otherDie.numberOfSides == this.numberOfSides);
  }

  public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Number of sides: ");
      int sides = sc.nextInt();
      Die d = new Die(sides);
      System.out.print("Number of sides2: ");
      sides = sc.nextInt();
      Die d2 = new Die(sides);

      System.out.println("Alea iacta est: " + d.roll());
      System.out.println(d);
      System.out.println(d.equals(d2));
  }
}
