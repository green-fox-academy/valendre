import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {
        System.out.println("Type a number!");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int d=1;
        if (a%2==0) {
            a = a/2;
            d = 0;
        } else {
            a = a/2+1;
        }
        for (int i = 1; i <= a; i++) {
            String b = "";
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
        }
        for (int i = a-d; i >= 1; i--) {
            String b = "";
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
        }
    }
}