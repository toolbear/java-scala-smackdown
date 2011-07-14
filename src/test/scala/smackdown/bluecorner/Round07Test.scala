package smackdown.bluecorner;
import org.scalatest._; import org.scalatest.matchers._


class Round07Test extends Spec with ShouldMatchers {
  describe("Java-like Comparator") {
    import java.util._
    import collection.JavaConversions._

    val reverser = new Comparator[String]() {
      override def compare(left: String, right: String) = {
        right compareTo left
      }
    }

    val colors = Array("blue", "cyan", "black")

    it("sorts in reverse lexographical order") {
      val l = new ArrayList[String]()
      l.addAll(colors.toList)

      Collections.sort(l, reverser)

      l.get(0) should equal ("cyan")
      l.get(1) should equal ("blue")
      l.get(2) should equal ("black")
    }
  }



  // ↓ page down ↓






  describe("Scala Ordering trait instead of Comparator") {
    // Scala collections imported by default


    val reversed = new Ordering[String]() {
      override def compare(left: String, right: String) = {
        right compareTo left
      }
    }

    val colors = List("blue", "cyan", "black")

    it("sorts in reverse lexographical order") {
      val l = colors.sorted(reversed)

      l should equal (List("cyan", "blue", "black"))
    }
  }








  // ↓ page down ↓






  describe("sort using a first-class function") {



    def reverse(left: String, right: String): Boolean = {
      right < left
    }



    val colors = List("blue", "cyan", "black")

    it("sorts in reverse lexographical order") {
      val sorted = colors sortWith reverse

      sorted should equal (List("cyan", "blue", "black"))
    }
  }








  // ↓ page down ↓






  describe("anonymous sort function (e.g. a lambda)") {









    val colors = List("blue", "cyan", "black")

    it("sorts in reverse lexographical order") {
      val sorted = colors.sortWith(
        (left, right) => right < left
      )

      sorted should equal (List("cyan", "blue", "black"))
    }
  }






  // ↓ page down ↓






  describe("idiomatic sorting lambda") {









    val colors = List("blue", "cyan", "black")

    it("sorts in reverse lexographical order") {
      val sorted = colors sortWith (_ >= _)
             // OR colors.sortWith(_ >= _)

      sorted should equal (List("cyan", "blue", "black"))
    }
  }
}
