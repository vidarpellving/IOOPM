import java.util.Scanner;
public class MyDieTest {
        public static void main(String [] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("number of sides: ");
                int sides = sc.nextInt();
                Die d = new Die(sides);
                for(int i = 0; i < 10; i++){
                        int value = (int) (Math.random() * sides) + 1;
                        System.out.println("Alea iacta est: " + value);
                }
        }
}
