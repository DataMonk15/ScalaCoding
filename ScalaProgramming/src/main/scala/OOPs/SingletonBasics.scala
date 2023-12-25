package OOPs
object SingletonBasics {
  // singleton object is an object that is declared by using the keyword object instead of class
  // singleton object is used to hold the methods and variables that are common to all the instances of a class
  // singleton object is used to define the entry point of the program
  // singleton object is used to define the utility methods
  // singleton object is used to define the constants
  // singleton object is used to define the main method
  // singleton object is used to define the factory methods
  // factory methods are the methods that are used to create the instances of a class
  //examples for factory methods are apply, unapply, fromString, getInstance, newInstance, valueOf, etc

  def main(args: Array[String]): Unit = {
    val age = 25
    def greet(name:String):Unit = println(s"hello $name and your age is $age")
    greet("sai")
  }
}
