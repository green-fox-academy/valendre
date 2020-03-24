package gnirts;

public class Gnirts implements CharSequence {
  String oneStringField;

  public Gnirts(String oneStringField) {
    this.oneStringField = oneStringField;
  }

  @Override
  public int length() {
    return oneStringField.length();
  }

  @Override
  public char charAt(int i) {
    return oneStringField.charAt(this.length()-1-i);
  }

  @Override
  public CharSequence subSequence(int i, int i1) {
    String toReturn = "";
    for (int j = i1; j >= i; j--) {
      toReturn += oneStringField.charAt(j);
    }
    return toReturn;
  }
}
