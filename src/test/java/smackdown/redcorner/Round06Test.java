package smackdown.redcorner;
import static org.junit.Assert.*; import org.junit.Test;

public class Round06Test {
  // A `Calorie` bean/DAO/value-object class

  public class Calorie {
    private final int value;

    public Calorie(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }

    @Override public String toString() {
      return "Calorie(" + value + ")";
    }
  }

  private Calorie calorie = new Calorie(70);

  @Test public void holdsTheValue() {
    assertEquals(70, calorie.getValue());
  }

  @Test public void stringifies() {
    assertEquals("Calorie(70)", calorie.toString());
  }
}
