import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        System.out.println("Type a number!");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String b ="";

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=a ; j++) {

                if (i+j>a) {
                    b+="#";
                } else {
                    b+=" ";
                }

            }
            for (int j = 1; j < a; j++) {
                if (i+(a-j)>a) {
                    b+="#";
                } else {
                    b+=" ";
                }
            }

            System.out.println(b);
            b = "";

        }

        for (int i = a-1; i >= 1; i--) {
            for (int j = 1; j <=a ; j++) {

                if (i+j>a) {
                    b+="#";
                } else {
                    b+=" ";
                }

            }
            for (int j = 1; j < a; j++) {
                if (i+(a-j)>a) {
                    b+="#";
                } else {
                    b+=" ";
                }
            }

            System.out.println(b);
            b = "";

        }
    }
}
