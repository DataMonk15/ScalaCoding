package Old.Day2

import scala.io.StdIn

object Operators {
  def main(args: Array[String]): Unit = {
    val a = 76.254
    val b = 3.867

    val result = a + b
    println(s"""result after addition operation is ${result} and datatype is ${result.getClass}""")

    val mulResult = a * b
    println(s"Result after multiply operation is ${mulResult} and datatype is ${mulResult.getClass}")

    val subResult = a - b
    println(s"Result after subtraction operation is ${subResult} and datatype is ${subResult.getClass}")

    val divResult = a / b
    println(s"Result after division operation is ${divResult} and datatype is ${divResult.getClass}")

    val modResult = a % b
    println(s"Result after mod operation is ${modResult} and datatype is ${modResult.getClass}")

    /** Whenever an operation is performed between the two operands
     * the resultant operation is always the datatype having the largest datatype
     * Byte < Short < Int < Long < Float < Double
     */

    val c:Byte = 8
    val d:Short = 15
    println(s"resultant operation value is ${c + d} and datatype is ${(c+d).getClass}")

    val e: Short = 8
    val f: Int = 15
    println(s"resultant operation value is ${e + f} and datatype is ${(e + f).getClass}")

    val g: Int = 8
    val h: Long = 15
    println(s"resultant operation value is ${g + h} and datatype is ${(g + h).getClass}")

    val i: Long = 8
    val j: Float = 15
    println(s"resultant operation value is ${i + j} and datatype is ${(i + j).getClass}")

    val k: Float = 8
    val l: Double = 15d
    println(s"resultant operation value is ${k + l} and datatype is ${(k + l).getClass}")

    //Read from the console the amount the user has in their bank account.
    println("Enter the amount in bank: ")
    val amount = StdIn.readLine().toInt
    val accumlatedAmount = ((amount * 5.5  * 5) / 100) * 100
    println(s"Entered Amount in bank is ${amount} and interest after 5 years is ${accumlatedAmount} and datatype is ${accumlatedAmount.getClass}")

  }
}
