public class Reverse {
  public static void main(String... args){
    String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    System.out.println(reverse(toBeReversed));
    System.out.println(reverseAnythingElse(toBeReversed));
  }
  public static String reverse(String toBereversed) {
    String reversed ="";
    for (int i = toBereversed.length()-1; i >=0; i--) {
      reversed+=toBereversed.charAt(i);
    }
    return reversed;
  }
  public static String reverseAnythingElse(String toBeReversed) {
    StringBuilder reversed = new StringBuilder();
    reversed.append(toBeReversed);
    reversed.reverse();
    return reversed.toString();
  }
}