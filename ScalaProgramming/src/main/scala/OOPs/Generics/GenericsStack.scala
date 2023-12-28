package Generics

class StackClass[B]{
  private var elements:List[B] = List()
  def push(x:B):Unit = {
    elements = x :: elements
    println(s"Pushed $x and current stack is $elements")
  }
  def isEmpty():Boolean = elements.isEmpty
  def take(x:Int):List[B] = elements.take(x)
  def pop():Option[B] = {
    if(elements.nonEmpty) {
      val currentTop = elements.head
      elements = elements.tail
      println(s"popped $currentTop and current stack is $elements")
      Some(currentTop)
    }else{
      None
    }
  }
  def peek:B = elements.head

  def printElements():Unit = {
    println(elements)
  }
}


object GenericsStack {
  def main(args: Array[String]): Unit = {
    val stack = new StackClass[Int]
    stack.push(1)
    stack.push(2)
    stack.push(3)
  //  println(stack.peek)
    // println(stack.pop())
    println(stack.pop())
    println(stack.take(1))
    stack.printElements()
  }
}
