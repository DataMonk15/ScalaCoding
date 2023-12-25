package Basics
object Variables {
  def main(args: Array[String]): Unit = {
    println("Hello World, Welcome to 100 days scala coding challenge!!")
  }

  // val is immutable and var is mutable
  val astring:String = "Hello world"
  val anInt:Int = 5
  val aBoolean:Boolean = false

  // char is defined in single quotes and it can be only one character
  val aChar:Char = 'a'
  val aShort:Short = 4613

  // while defining long type we need to add L at the end to specify it is long
  val aLong:Long = 5273985273895237L

  // while defining float type we need to add f at the end to specify it is float
  val aFloat:Float = 2.0f
  val aDouble:Double = 3.14


  //once the type is defined, it cannot be changed
  var anotherString = "Welcome to Scala"

  // it errors out if you try to change the type
  //anotherString = 10

  anotherString = "Welcome to 100 days scala coding challenge!!"
  println(anotherString)

  println(astring)
  println(anInt)
  println(aBoolean)
  println(aChar)
  println(aShort)
  println(aLong)
  println(aFloat)
  println(aDouble)
}
