package Day2

import scala.io.StdIn

object DataTypes {
  def main(args: Array[String]): Unit = {
    /** If datatypes are not defined during the initialization, then
     * scala will infer the datatype based on the value
     */
    val num = 10
    println(num.getClass)

    val str = "naveen"
    println(str.getClass)

    // Read the input from a CLI and convert it into different datatypes
    print("Please provide the input: ")
    val input = StdIn.readLine()

    // Each datatype has range, if values fit within the range then
    // variable is converted into desired datatype
    println(s"DataType before conversion: ${input.getClass}")
    println(s"DataType after converting into int: ${input.toInt.getClass}")
    println(s"DataType before converting into Byte: ${input.toByte.getClass}")
    println(s"DataType before conversion into Short: ${input.toShort.getClass}")
    println(s"DataType before conversion into Long: ${input.toLong.getClass}")
    println(s"DataType before conversion into Float: ${input.toFloat.getClass}")
    println(s"DataType before conversion into Double: ${input.toDouble.getClass}")

    //Take a input from user and multiple it by pi
    // check the dataype of it

    print("provide the input to multiple with pi: ")
    val userInput = StdIn.readLine()
    val pi = 3.14159
    println(s"Value after conversion is ${userInput.toDouble * pi}")
    println(s"Dataype of after operation is: ${(userInput.toDouble * pi).getClass}")

  }
}
