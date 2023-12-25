package Old.Day2

import java.time.Year
import scala.io.StdIn
import scala.util.Random

object UserInput {
  def main(args: Array[String]): Unit = {
    /** stdIn function in scala allows you to take input from the terminal
     * readline will be string input and cast it based on the needs
     */
    print("Enter your input: ")
    val str = StdIn.readLine()
    println(str)

    /** Random numbers will generate the integer value within
     * its limit.
     * if we want to generate the random numbers based within
     * certain limit, then pass the max value as argument in nextInt
     * function.
     */
    val num = Random.nextInt()
    println(num)
    val numWithInLimits = Random.nextInt(10)
    println(numWithInLimits)

    //Take birthyear as input and generate the age.

    println("Enter your BirthYear: ")
    val birthYear = StdIn.readLine().toInt
    val currentYear = Year.now().getValue
    println(s"Current age is:${currentYear - birthYear}")

  }
}
