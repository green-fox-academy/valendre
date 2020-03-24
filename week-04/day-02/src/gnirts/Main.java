package gnirts;

public class Main {

  public static void main(String[] args) {
    Gnirts myGnirts = new Gnirts("example");
    System.out.println(myGnirts.charAt(2));

    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));

    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
// should print out: a
  }


}
