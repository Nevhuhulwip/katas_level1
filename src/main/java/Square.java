import java.util.Scanner;

public class Square {
    public void square() {
        int p;
        System.out.println("enter number to draw square");
        Scanner in = new Scanner(System.in);
        p = in.nextInt();

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
