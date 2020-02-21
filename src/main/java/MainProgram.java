import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        katas k = new katas();
        k.hello();
        System.out.println("..............................");

        evenOrOdd E = new evenOrOdd();
        E.even_or_odd();
        System.out.println("..............................");

        Square s = new Square();
        s.square();
        System.out.println("..............................");


        Triangle t = new Triangle();
        t.Triangle();
        System.out.println("..............................");

        Isosceles i = new Isosceles();
        i.isosceles();
        System.out.println("..............................");

        LongestString l = new LongestString();
        l.longestString();
        System.out.println("..............................");

        AlternativeElement a = new AlternativeElement();
        a.alternativeElement();
        System.out.println("\n..............................");


        Scanner sca = new Scanner(System.in);
        int size = 0;
        System.out.println("How many words you want to enter?: ");
        size = Integer.parseInt(sca.nextLine());
        String[] inputs = new String[size];
        System.out.println("Now enter " + size + " Words");
        for (int x = 0; x < size; x++) {
            inputs[x] = sca.nextLine();
        }
        System.out.print("*");
        FrameText.frameText(inputs);

    }
}