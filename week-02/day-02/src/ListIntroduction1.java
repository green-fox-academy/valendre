import java.util.ArrayList;
import java.util.Iterator;

public class ListIntroduction1 {
  public static void main(String[] args) {
    /*List introduction 1
    We are going to play with lists. Feel free to use the built-in methods where possible.

        Create an empty list which will contain names (strings)
    Print out the number of elements in the list
    Add William to the list
    Print out whether the list is empty or not
    Add John to the list
    Add Amanda to the list
    Print out the number of elements in the list
    Print out the 3rd element
    Iterate through the list and print out each name
        William
    John
        Amanda
    Iterate through the list and print
    1. William
    2. John
    3. Amanda
    Remove the 2nd element
    Iterate through the list in a reversed order and print out each name
        Amanda
    William
    Remove all elements*/
    ArrayList<String> name = new ArrayList<>();
    System.out.println(name.size());
    name.add("William");
    System.out.println(name.isEmpty());
    name.add("John");
    name.add("Amanda");
    System.out.println(name.size());
    System.out.println(name.get(2));
    Iterator<String> nameIterator = name.iterator();
    while (nameIterator.hasNext()) {
      System.out.println(nameIterator.next());
    }
    for (int i = 0; i < name.size(); i++) {
      System.out.println((i+1) + ". " + name.get(i));
    }
    name.remove(1);
    for (int i = name.size()-1; i >=0 ; i--) {
      System.out.println(name.get(i));
    }
    name.clear();
  }
}
