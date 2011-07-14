package smackdown.redcorner;
import static org.junit.Assert.*; import org.junit.Test;
import java.util.*;

public class Round07Test {
  // SAM pattern is closest Java gets to first-class functions



  Comparator<String> reverser = new Comparator<String>() {
    public int compare(String left, String right) {
      return right.compareTo(left);
    }
  };

  String[] colors = new String[] { "blue", "cyan", "black" };

  @Test public void sortsReverseLexographically() {
    List<String> l = new ArrayList<String>();
    l.addAll(Arrays.asList(colors));

    Collections.sort(l, reverser);

    assertEquals("cyan", l.get(0));
    assertEquals("blue", l.get(1));
    assertEquals("black", l.get(2));
  }
}
