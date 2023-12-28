package OOPs
// companion class and companion object are the classes and objects that are declared with the same name in the same scope
// companion class and companion object are used to access each other's private members
// companion class and companion object are used to create factory methods

class companion(val name:String, age:Int){
  val x = 10
  private val y = 20
  def multiplier(a:Int,b:Int):Int = a*b
}

object companion {
  def main(args: Array[String]): Unit = {
    // new keyword is required to create an instance of a class
    val obj = new companion("John",25)
    println(obj.x)
    println(obj.y)

    // name is not directly accessible because it is parameter of the class
    // to access name we need to provide the variable name with val or var keyword
    // companion(name:String, val age:Int) is a constructor
    // above definition would allow us to access the name directly as it will act as a class variable
    println(obj.name)

    println(obj.multiplier(2,3))
  }
}
