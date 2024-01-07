package FP

object Options {
  def main(args: Array[String]): Unit = {

    val a: Option[Int] = Option(1)
    println(a)

    val b: Option[String] = Option("a")
    println(b)

    val c: Option[String] = Option(null)
    println(c.getOrElse("default"))

    def f(d: Option[String]): Option[String] = d.map(x => x.toLowerCase())

    println(f(Option("Naveen")))
    println(f(Option(null)))

    def flatmap(a: Option[String], b: Option[String]) = a.flatMap(a => b.map(x => (a, x)))

    println(flatmap(Option("Naveen"), Option("Kumar")).getOrElse())

    def chainOptions(option1: Option[String], option2: String => Option[String]): Option[String] =
      option1.flatMap(value1 => option2(value1))

    // Example usage
    val result: Option[String] = chainOptions(Option("Hello"), value => Option(value + " World"))
    println(result)

    val resultOption = a match {
      case Some(x) => "has Value"
      case None => "Missing value"
    }

    println(resultOption)

    val doubleOption: Option[String] = Option("c") match {
      case Some(x) => Option(x + x)
      case None => None
    }

    println(doubleOption)

    val resultDouble: (Option[Int], Option[Int]) => Option[Int] = (a, b) => (a, b) match {
      case (Some(x), Some(y)) => Option(x + y)
      case _ => None
    }

    println(resultDouble(Option(null.asInstanceOf[Int]), Option(null.asInstanceOf[Int])))

    def sumOptions(a: Option[Int], b: Option[Int]): Option[Int] =
      for {
        x <- a
        y <- b
      } yield x + y

    // Example usage
    val result1 = sumOptions(Option(5), Option(null.asInstanceOf[Int]))
    println(result1.getOrElse("At least one value is missing"))

  }
}
