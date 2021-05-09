import org.scalatest.wordspec._

class MainSpec extends AnyWordSpec {
  "The score of dice that reads 1,1, for the Ones rule" should {
    "equal 2" in {
      // arrange
      val diceRolls = Array(1,1)
      val rules = "ones"
      // act
      var score = Yahtzee.CalculateScore(diceRolls, rules);
      // assert
      assert(score == 2)
    }
  }

  "The score of dice that reads 1,1,2,5,4, for the Ones rule" should {
    "equal 2" in {
      // arrange
      val diceRolls = Array(1,1,2,5,4)
      val rules = "ones"
      // act
      var score = Yahtzee.CalculateScore(diceRolls, rules);
      // assert
      assert(score == 2)
    }
  }
}