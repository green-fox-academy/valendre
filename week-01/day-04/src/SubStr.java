import java.util.Scanner;
public class SubStr {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:

        //  should print: `17`

        //  System.out.println(subStr("this is what I'm searching in", "searching"));

        //  should print: `-1`
        //  System.out.println(subStr("this is what I'm searching in", "not"));

        System.out.println("Plese type your text to search in:");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("What are you searching for?");
        String q = s.nextLine();
        System.out.println(subStr(input, q));



    }

    public static int subStr(String input, String q) {

        return input.indexOf(q);
    }
}
