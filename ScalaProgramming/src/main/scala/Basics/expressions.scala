package Basics
object expressions {
  def main(args: Array[String]): Unit = {
    //expressions are evaluated to a value and can be used in other expressions
    //instructions are executed (think of them as commands to the computer)
    //example of instructions: println(), while, reassigning

    //if in scala is an expression
    val x = 2 + 2
    val aCondition = if(x > 3) 10 else 20
    println(aCondition)

    //loops are discouraged in scala reason being they are imperative
    //what is imperative programming? it is when you tell the computer what to do and how to do it
    //what is declarative programming? it is when you tell the computer what to do and what you want to be done
    //example of imperative programming: while, reassigning
    //example of declarative programming: map, flatMap, filter


  }
}
