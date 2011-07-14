package smackdown.bluecorner;
import org.scalatest._; import org.scalatest.matchers._

class Round08Test extends Spec with ShouldMatchers {

  describe("Calorie with `plus` method") {
    case class Calorie(val value: Int) {
      def plus(right: Calorie): Calorie = {
        Calorie(this.value + right.value)
      }
    }








    val zero = Calorie(0)
    val one = Calorie(1)

    describe("addition") {
      it("is itself when added to zero") {
        one.plus(zero) should be (one)
      }

      it("adds value") {
        one.plus(one) should be (Calorie(2))
      }
    }
    // ↓ page down ↓























    describe("addition with infix operator syntax") {
      it("is itself when added to zero") {
        one plus zero should be (one)
      }

      it("adds value") {
        one plus one should be (Calorie(2))
      }
    }
  }  // ↓ page down ↓






  describe("Calorie with `+` method") {
    case class Calorie(val value: Int) {
      def +(right: Calorie): Calorie = {
        Calorie(this.value + right.value)
      }
    }








    val zero = Calorie(0)
    val one = Calorie(1)

    describe("addition") {
      it("is itself when added to zero") {
        one + zero should be (one)
      }

      it("adds value") {
        one + one should be (Calorie(2))
      }
    }
  }
}
