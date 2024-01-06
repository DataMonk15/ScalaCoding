package FP

case class person(name:String,age:Int)
object currying {
  def main(args: Array[String]): Unit = {
    // function currying

    def curry(a: Int)(b: Int)(c: Int) = {
      a + b + c
    }

    println(curry(10)(20)(30))
  }

  val personList = List(person("Naveen",32),person("Sai",18))

  def filterPerson(x:List[person]) ={
    x.filter(_.age > 30)
  }

  println(filterPerson(personList))

}
