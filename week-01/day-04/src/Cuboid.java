public class Cuboid {
  public static void main(String[] args) {
    double a = 10;
    double b = 10;
    double c = 10;

    double surface = 2 * (a * b + a * c + b * c);
    double volume = a * b * c;

    System.out.println("Surface Area: " + surface);
    System.out.println("Volume: " + volume);
  }
}
