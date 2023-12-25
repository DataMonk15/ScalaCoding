package Old.Day7

import scala.annotation.tailrec

object tailrecursion2 {
  def main(args: Array[String]): Unit = {
    // program to calculate the power of n
    @tailrec
    def exppower(input: Int, n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else exppower(input, n - 1, input * acc)
    }

    println(exppower(2, 4, 1))


    //Program to reverse a list
    @tailrec
    def reverseList(original: List[Int],reversed:List[Int]):List[Int] = {
      original match {
        case Nil => reversed
        case head ::tail => reverseList(tail,head::reversed)
      }
    }

    reverseList(List(1,2,3,4,5,6),Nil)
  }
}
