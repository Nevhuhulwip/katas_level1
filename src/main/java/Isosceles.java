import java.util.Scanner;

public class Isosceles {
    public void isosceles() {
        int g;
        System.out.println("enter number to draw isosceles");
        Scanner in = new Scanner(System.in);
        g = in.nextInt();

        for (int i = 1; i <= g; i++)
        {
            for (int j = g - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int w = 1; w <= (2 * i - 1); w++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
