package Old.Day6

import scala.io.StdIn

object Functions {
  def main(args: Array[String]): Unit = {
    println("please enter the name:")
    val username = StdIn.readLine()
    println("please enter your age:")
    val age = StdIn.readLine().toInt

    def hello(username: String, age: Int) = println(s"I am $username and i am $age years old.")

    hello(username, age)

    //Functions accept the parameters of any data type as mentioned below.
    def double(a: Int, b: Int = 5, c: Int) = a + b + c

    /* it will error out, if we pass less number of arguments to a function
    function will be invoked in the sequence of the parameters defined.
    if we want to make use of a default parameters then we will have to call using the named agruments
     */

    //error out, expecting the b to use the default value
    //double(1,2)

    // sucessful invokation
    double(a = 1, c = 10)

  }
}
