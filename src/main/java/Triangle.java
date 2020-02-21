import java.util.Scanner;

public class Triangle {
    public void Triangle() {
        int n;
        System.out.println("enter number to draw triangle");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j <= i)
                    System.out.print("# ");
            }
            System.out.println("");
        }


    }
}
