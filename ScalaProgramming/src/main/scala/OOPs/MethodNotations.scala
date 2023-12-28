package OOPs

/*
    1.  Overload the + operator
        mary + "the rockstar" => new person "Mary (the rockstar)"

    2.  Add an age to the Person class
        Add a unary + operator => new person with the age + 1
        +mary => mary with the age incrementer

    3.  Add a "learns" method in the Person class => "Mary learns Scala"
        Add a learnsScala method, calls learns method with "Scala".
        Use it in postfix notation.

    4.  Overload the apply method
        mary.apply(2) => "Mary watched Inception 2 times"
   */


class Person(val name:String,val favMovie:String, val age:Int = 0) {
  def likes(movie: String) = movie == favMovie
  def dislikes(movie: String) = println("I hate " + movie)
  // here this will be the current object name and person will be the parameter
  def hangoutWith(person: Person) = println(s"${this.name} is hanging out with ${person.name}")
  def unary_! : String = s"$name, what the heck?!"
  def unary_+ : Person = new Person(name,favMovie,age + 1)
  def unary_+(name:String) :Person = new Person(this.name + s"($name)",favMovie,age)
  def learns(subject:String) = s"$name learns $subject"
  def learnsScala() = this learns "Scala"
  def apply() = s"$name watched $favMovie times"
  def apply(n:Int)= s"$name watched $favMovie $n times"
}

object MethodNotations {
  def main(args: Array[String]): Unit = {
     val mary = new Person("Mary","Inception")
    //infix notation are only available for methods with single parameter
    //infix notation is also called operator notation
    //infix notation are also called syntactic sugar

      println(mary.likes("Inception"))
      println(mary likes "Inception") // equivalent to above
      println(mary dislikes "inception")
      println(mary hangoutWith new Person("John","Avengers"))

    //unary operators are only available for +,-,!,~
    //unary operators are also called syntactic sugar
    //unary operators are also called prefix notation
    //unary operators are also available for methods with no parameters and single parameter
    //unary operators are useful for defining the methods that are used to test the properties of a class

    // ! and unary_! are same because of syntactic sugar and unary operators
    println(!mary)
    println(mary.unary_!)
    println(mary.unary_+.age)
    // calling the overloard unary_+ method
    println(mary.unary_+("the rockstar").name)

    println(mary learns "Scala")

    println(mary.learnsScala())

    println(mary.apply()) // equivalent to println(mary())
    println(mary.apply(2)) // equivalent to println(mary(2))
    println(mary())
    println(mary(2))
  }
}
