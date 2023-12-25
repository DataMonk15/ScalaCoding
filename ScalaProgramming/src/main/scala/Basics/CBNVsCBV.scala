package Basics

object CBNVsCBV {
  def main(args: Array[String]): Unit = {
    // call by value and call by name
    // call by value is when the expression is evaluated before the function is called
    // call by name is when the expression is passed literally and is evaluated every time it is used

    def CBN(x: =>Long) = {
      println(s"by name: $x")
      println(s"by name: $x")
    }

    def CBV(x: Long) = {
      println(s"by value: $x")
      println(s"by value: $x")
    }

    CBN(System.nanoTime())
    CBV(System.nanoTime())

  }
}
