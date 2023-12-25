package Old.Day3

import scala.io.StdIn

object Expressions {
  def main(args: Array[String]): Unit = {
    val guestList = List("naveen","sai","bhavani")

    val guest = StdIn.readLine()
    if(guestList.contains(guest)){
      println("Allowed to the party!!")
    }else{
      println("Not allowed to the party!!")
    }

    val animalsAdopted = List("dog","cat","rats")

    if(animalsAdopted.isEmpty){
      println("Thanks all the animals are adopted")
    }else{
      println("No animals are adopted")
    }

    val personAge = if (StdIn.readLine().toInt <= 0) 1 else  StdIn.readLine().toInt

    if(personAge <= 13){
      println("Child")
    }else if(personAge > 13 && personAge <= 18){
      println("Teenage")
    }else{
      println("Older")
    }

  }
}
