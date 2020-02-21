
public class FrameText {
    public static void frameText(String[] StringName) {

        //for length of string
        int maxsize = 0;
        for (String numberOfString : StringName) {
            if (numberOfString.length() > maxsize) {
                maxsize = numberOfString.length();
            }
        }
        for (int i = 0; i <= maxsize + 1; i++) {
            System.out.print("*");              //Print upper star
        }
        System.out.print("*");
        System.out.println();
        for (int j = 0; j < StringName.length; j++) {
            System.out.print("* " + StringName[j]);
            for (int i = StringName[j].length(); i <= maxsize; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.print("*");
        for (int i = 0; i <= maxsize + 1; i++) {
            System.out.print("*");
        }
        System.out.print("*");
        System.out.println();


      }
}


