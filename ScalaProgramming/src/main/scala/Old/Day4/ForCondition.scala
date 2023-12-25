package Old.Day4

import scala.io.StdIn

object ForCondition {
  def main(args: Array[String]): Unit = {
    val inputyear = StdIn.readLine().toInt

    for (x <- 1 to 12) {
      x match {
        case 4 | 6 | 9 | 11 => println(s"$x month of $inputyear has 30 days!!")
        case 1 | 3 | 5 | 6 | 7 | 8 | 10 | 12 => println(s"$x month of $inputyear has 31 days!!")
        case 2 => if (inputyear % 4 == 0) println(s"$x month of $inputyear has 28 days!!") else println(s"$x month of $inputyear has 29 days")
      }
    }

    val inputNumber = StdIn.readLine().toInt
    for(x <- inputNumber to 1 by -1 if x %7 == 0){
      print(s"$x\t")
    }
    println()

    val maxValue = StdIn.readLine().toInt
    val smiley = "\uD83D\uDE00"
    for(x <- 1 to maxValue){
      for (y <- 1 to maxValue){
        if((x + y) % 3 ==0){
          print(s"$smiley\t")
        }
      }
      println()
    }
    println("--------------")

    val smiley2 = "\uD83E\uDD28"
    for (x <- 1 to maxValue) {
      for (y <- 1 to maxValue) {
        if ((x + y) % 3 == 1) {
          print(s"$smiley2\t")
        }
      }
      println()
    }

    println("---------------")
    val smiley3 = "\uD83E\uDD28"
    for (x <- 1 to maxValue) {
      for (y <- 1 to maxValue) {
        if ((x + y) % 3 == 2) {
          print(s"$smiley3\t")
        }
      }
      println()
    }
  }
}
