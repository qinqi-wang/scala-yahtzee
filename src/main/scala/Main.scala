class Item(var name: String, var price: Double) {}

object Yahtzee {
  def CalculateScore (diceRolls: Array[Int], rules: String): Int = {
    var total = 0;
    if(rules == "ones") {
      total = CalculateOnesScore(diceRolls);
    }
    return total
  }

  def CalculateOnesScore(diceRolls: Array[Int]): Int = {
    val filteredDice: Array[Int] = diceRolls.filter(_ == 1)
    val total = filteredDice.sum
    return total
  }
}

object Player {
  def rollDice(): Array[Int] = {
    // randomly generate numbers between 1-6 5 times and return them as an array
    val output = Array(1,1)
    return output
  }
  
}

object GameMaster {
  def RunGame () {
    print("Welcome to Yahtzee, here's your initial dice roll:")
    Player.rollDice()
    // display dice results, then ask player for a re-roll (input which dice they want re-rolled)
  
    // After finishing re-roll, ask the player what scoring system they want to use
    // display the score after a scoring system is chosen
  }

  // function that handles re-rolling
  
  // function that handles determining the scoring system
}