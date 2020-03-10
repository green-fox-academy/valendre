import java.util.HashMap;

public class TelephoneBook {
  public static void main(String[] args) {
    HashMap<String, String> TelephoneMap = new HashMap<>() {{
      put("William A. Lathan", "405-709-1865");
      put("John K. Miller", "402-247-8568");
      put("Hortensia E. Foster", "606-481-6467");
      put("Amanda D. Newland", "319-243-5613");
      put("Brooke P. Askew", "307-687-2982");
    }};
    /*
    What is John K. Miller's phone number?
    Whose phone number is 307-687-2982?
    Do we know Chris E. Myers' phone number?
     */
    System.out.println("What is John K. Miller's phone number? " + TelephoneMap.get("John K. Miller"));

    String searchedNumber="307-687-2982";
    for (String  keyOf: TelephoneMap.keySet()) {
      if(searchedNumber.equals(TelephoneMap.get(keyOf))) {
        System.out.println("Whose phone number is 307-687-2982? " + keyOf);
      }
    }
    System.out.println("Do we know Chris E. Myers' phone number? " + TelephoneMap.containsKey("Chris E. Myers"));

  }

}
