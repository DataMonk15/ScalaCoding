package Old.Day3

import scala.io.StdIn

object RangeFunctions {
  def main(args: Array[String]): Unit = {
    // This is a Range, it will be inclusive of the Lower and Upper elements defined below
    val a = 1 to 10
    println(a.toList)

    // Until will not include the Upper limit element defined below
    val b = 1 until 10
    println(b.toList)

    // Step will skip the (n-1) integers in the range
    val c = 1 to 10 by 3
    println(c.toList)

    // Step function will return the step value while defining a range
    println(s"Step: ${c.step}")

    // end will return the upper limit in the range
    println(s"end: ${c.end}")
    
    //last will return the last element in the range
    println(s"last: ${c.last}")
    
    //start will return the start element in the range
    println(s"start: ${c.start}")
    
    // head will return the first element in the range
    println(s"head: ${c.head}")
    
    // tail will return the range of elements except head element
    println(s"tail: ${c.tail}")

    // print all numbers divisible by 17 between 1 to 1000
    println(s"numbers divisible by 17 between 1 and 1000 are ${(1 to 1000).filter(_ % 17 == 0).toList}")

    // Cats exercise
    val fewCats = 1 to 3
    val severalCats = 4 to 6

    println("please provide the number of cats you have: ")
    val inputCats = StdIn.readLine().toInt

    if(fewCats.contains(inputCats)){
      println("Few Cats")
    }else if(severalCats.contains(inputCats)){
      println("Several Cats")
    }else{
      println("Many Cats")
    }

    // Plant Water
    println("Please enter the month for which you would like to see the water Days !!")
    var inputMonth = StdIn.readLine().toInt
    val waterFreq = 3


    if(inputMonth < 1 || inputMonth > 12)
      inputMonth = 1

    val days = if(inputMonth == 2)
      28
    else if(inputMonth == 4 || inputMonth == 6 || inputMonth == 8)
      30
    else
      31

    println(s"here are the days on which you have to water plants ${(1 to days by waterFreq).toList}")

  }
}
