package gnirts;

public class Shifter implements CharSequence{
  String oneStringField;
  int shifter;

  public Shifter(String oneStringField, int shifter) {
    this.oneStringField = "";
    this.shifter = shifter;
    for (int i = 0; i < oneStringField.length(); i++) {
      this.oneStringField += oneStringField.charAt((i+shifter)%(oneStringField.length()));
    }
  }

  @Override
  public int length() {
    return oneStringField.length();
  }

  public char charAt(int i) {
   return oneStringField.charAt(i);
  }

  @Override
  public CharSequence subSequence(int i, int i1) {
    return oneStringField.subSequence(i, i1);
  }
}