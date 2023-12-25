package Old.Day7

object functions {
  def main(args: Array[String]): Unit = {
   // Program to print the factorial of a number

  //  val n = scala.io.StdIn.readLine().toInt

    def factorial(n: Int): Int = {
      if (n == 1) 1 else n * factorial(n - 1)
    }
    println(factorial(5))

    // Program to print the fibnoacci of a number 0 1 1 2 3 5 8
    def fibnoacci(n:Int):Int = {
      if (n <= 2) 1 else fibnoacci(n-1) + fibnoacci(n-2)
    }
    println(fibnoacci(6))

  }
}
