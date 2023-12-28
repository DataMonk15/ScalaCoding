package OOPs.Generics

// Generics are used to design classes and traits which can work with any type
// Generics are helpful to design reusable components
// types of generics are class generics and method generics

class pair[A,B](val a:A,val b:B)
object Generics {
  def main(args: Array[String]): Unit = {
    val pair1 = new pair(1,2)
    println(pair1.a + " " + pair1.b)

    val pair2 = new pair("scala","java")
    println(pair2.a + " " + pair2.b)

    val pair3 = new pair(1.2,2.3)
    println(pair3.a + " " + pair3.b)

    val pair4 = new pair(1.2,"scala")
    println(pair4.a + " " + pair4.b)

  }
}
