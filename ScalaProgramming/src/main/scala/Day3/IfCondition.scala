package Day3

import scala.io.StdIn

object IfCondition {
  def main(args: Array[String]): Unit = {
    val hasEggs = StdIn.readLine().toBoolean
    val hasBacon = StdIn.readLine().toBoolean
    var totalSpent = 0
    val eggPrice = 5
    val baconPrice = 20

    if (hasEggs) {
      totalSpent += 12 * eggPrice

      if (hasBacon) {
        totalSpent += 2 * baconPrice
      } else {
        println("No bacon available")
      }
    }
    else {
      println("No Eggs available")
    }
    println(s"Your Total spend is $totalSpent")
  }
}
