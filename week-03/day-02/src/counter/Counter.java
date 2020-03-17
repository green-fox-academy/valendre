package counter;

public class Counter {
  Integer value;
  Integer initialValue;

  public Counter() {
    this(0);
  }

  public Counter(Integer value) {
    this.value = value;
    initialValue = value;
  }

  public void add() {
    value++;
  }

  public void add(Integer number) {
    value += number;
  }

  public Integer get() {
    return value;
  }

  public void reset() {
    value=initialValue;
  }
}
