import java.util.Scanner;

public class evenOrOdd {
    public void even_or_odd() {

        int num;
        System.out.println("Enter any number");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");


   }
}
