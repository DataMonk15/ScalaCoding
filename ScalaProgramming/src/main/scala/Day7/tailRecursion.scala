package Day7

import scala.annotation.tailrec

object tailRecursion {
  def main(args: Array[String]): Unit = {

    // program to concat the string n times

    def stringConcat(aString:String, n:Int,accumulator:String):String = {
      if (n<=0) accumulator
      else stringConcat(aString,n-1,aString + accumulator)
    }
    println(stringConcat("hello",3,""))

    //program to find the factorial of a number using tail recursion
    @tailrec
    def factorial(n: Int, accumulator: Int): Int = {
      if (n <= 1) accumulator
      else factorial(n - 1, accumulator * n)
    }
    println(factorial(5, 1))

    //program to find the fibnoacci of a number using tail recursion
    def fibnoacci(n:Int):Int = {
      def fib(n:Int,prev:Int,acc:Int):Int ={
        if(n == 0) acc else {
          println("acc " + acc)
          println("prev "+ prev)
          fib(n-1,acc,acc+ prev)
        }
      }
     fib(10,1,0)
    }
    println(fibnoacci(5))
  }
}
