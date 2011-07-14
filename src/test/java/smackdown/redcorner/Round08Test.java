package smackdown.redcorner;
import static org.junit.Assert.*; import org.junit.Test;

public class Round08Test {

  public class Calorie {
    private final int value;
    public Calorie(int value) { this.value = value; }
    public int getValue() { return value; }
    public boolean equals(Object other) { // yes, imperfect
      if (!(other instanceof Calorie)) return false;
      return this.value == ((Calorie) other).value;
    }

    public Calorie plus(Calorie right) {
        return new Calorie(this.value + right.value);
    }
  }

  Calorie zero = new Calorie(0);
  Calorie one = new Calorie(1);

  // addition
  @Test public void addition_identity() {
    assertEquals(one, one.plus(zero));
  }

  @Test public void addition_adds() {
      assertEquals(new Calorie(2), one.plus(one));
  }
}
