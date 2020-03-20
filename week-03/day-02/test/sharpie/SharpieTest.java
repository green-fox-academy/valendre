package sharpie;

import static org.junit.Assert.*;

import org.junit.Test;

public class SharpieTest {

  @Test
  public void use() {
    Sharpie sharpie = new Sharpie("Yellow", 5);
    int randomTimesUse = (int) Math.random() * 100;
    for (int i = 0; i < randomTimesUse; i++) {
      sharpie.use();
    }
    assertEquals((double) 100 - randomTimesUse, (double) sharpie.inkAmount, 0);
  }

  @Test
  public void useFloatTimes() {
    Sharpie sharpie = new Sharpie("Yellow", 5);
    sharpie.use((float) 5.5);
    assertEquals((double) 94.5, (double) sharpie.inkAmount, 0);
  }

  @Test
  public void useToEmpty() {
    Sharpie sharpie = new Sharpie("Yellow", 5);
    sharpie.use((float) 1000);
    assertEquals((double) 0, (double) sharpie.inkAmount, 0);
  }

  @Test
  public void getInkAmountUsedRandomTimes() {
    Sharpie usedSharpie = new Sharpie("Yellow", 5);
    int randomInkAmount = (int) Math.random() * 100;
    usedSharpie.inkAmount = (float) randomInkAmount;
    assertEquals((double) randomInkAmount, (double) usedSharpie.getInkAmount(), 0);
  }

  @Test
  public void getInkAmountUsedRandomTimes() {
    Sharpie usedSharpie = new Sharpie("Yellow", 5);
    int randomInkAmount = (int) Math.random() * 100;
    usedSharpie.inkAmount = (float) randomInkAmount;
    assertEquals((double) randomInkAmount, (double) usedSharpie.getInkAmount(), 0);
  }
}