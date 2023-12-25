package Old.Day5

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

object WhileLoops {
  def main(args: Array[String]): Unit = {

    val usernames = ArrayBuffer("Naveen", "Kumar", "bhavani")
    var continueFlag = true

    while (continueFlag) {
      println("Please enter the username")
      val uname = StdIn.readLine()
      if (!usernames.contains(uname)) {
        continueFlag = false
        usernames.addOne(uname)
      }else{
        println("user name already exists")
      }
      println(s"usernames are $usernames")
    }
  }
}
