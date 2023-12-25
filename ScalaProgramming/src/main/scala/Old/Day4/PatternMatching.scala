package Old.Day4

import scala.io.StdIn

object PatternMatching {
  def main(args: Array[String]): Unit = {
    val inputMeals = StdIn.readLine().toInt
    val recMeals = 3

    inputMeals  match {
      case x if x > 3 => println(s"Decrease the number of meals by ${inputMeals-recMeals}")
      case x if 0 to 2 contains(inputMeals)=> println(s"Increase the number of meals by ${recMeals-inputMeals}")
      case _ => println(s"You are having the ideal number of meals a day!!")
    }

    val name = StdIn.readLine()

    name(0) match {
      case 'A' | 'B' | 'C' => println(s"Hello $name, Welcome to Scala Programming")
      case x if 'D' to 'H' contains(x) => println(s"Hi $name, Hope you are doing well!!")
      case _ => println("Enjoy your day")
    }

    val inputHour = StdIn.readLine().toInt

    inputHour match {
      case x if 6 to 11 contains(x) => println("Morning")
      case x if 12 to 14 contains(x) => println("Noon")
      case x if 15 to 17 contains(x) => println("Afternoon")
      case x if 18 to 21 contains(x) => println("Evening")
      case x if 22 to 5 contains(x) => println("Night")
      case _ => println("Please provide input between 1-24")
    }

  }
}
