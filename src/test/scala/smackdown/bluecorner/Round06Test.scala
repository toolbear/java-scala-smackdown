package smackdown.bluecorner;
import org.scalatest._; import org.scalatest.matchers._

class Round06Test extends Spec with ShouldMatchers {
  describe("Java-like `Calorie` class") {

    class Calorie(v: Int) { // class & constructor
      val value = v

      def getValue(): Int = {
        return value
      }

      override def toString(): String = {
        return "Calorie(" + value + ")"
      }
    }





    val calorie = new Calorie(70)

    it("holds the value") {
      calorie.getValue() should be (70)
    }

    it("stringifies") {
      calorie.toString() should be ("Calorie(70)")
    }
  }  // ↓ page down ↓





  describe("Idiomatic `Calorie` class") {

    class Calorie(val value: Int) {
      override def toString() = "Calorie(" + value + ")";
    }

    // NOTE: `override` keyword
    // NOTE: implicit return
    // NOTE: inference on return type









    val calorie = new Calorie(70)

    it("holds the value") {
      calorie.value should be (70)
    }

    it("stringifies") {
      calorie.toString should be ("Calorie(70)")
    }
  }  // ↓ page down ↓





  describe("""`Calorie` "case class" kills boilerplate""") {

    case class Calorie(val value: Int)
    // compiler generates toString(), equals() & hashCode()














    val calorie = new Calorie(70)

    it("holds the value") {
      calorie.value should be (70)
    }

    it("stringifies") {
      calorie.toString should be ("Calorie(70)")
    }
  }
}
