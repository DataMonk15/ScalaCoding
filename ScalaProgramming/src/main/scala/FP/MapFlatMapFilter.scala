package FP

case class ClassPerson(name:String,age:Int,address:Option[String])
object MapFlatMapFilter {
 def sumofSomeValues(list:List[Option[Int]]):Option[Int] = {
  list.flatten.reduceOption(_ + _)
 }

 println(sumofSomeValues(List(Some(1),Some(2),Some(3),None)))

 def main(args: Array[String]): Unit = {
   val list = List(1,2,3)

    // it will print the list
    println(list)
    println(list.map(x => x+1))

    //to print only the even numbers
    // filter helps to filter out the values from a collection
    println(list.filter(x => x%2 ==0))

    val topair = (x:Int) => List(x,x+1)
    println(list.flatMap(topair))

    // print all combinations between two lists
    val numbers = List(1,2,3,4)
    val chars = List('a','b','c','d')

   val combinations = numbers.flatMap(x => chars.map(b => b + x.toString))
   println(combinations)

   val colors = List("black","White")
   val combinations2 = numbers.flatMap(a => chars.flatMap(b => colors.map(c => b + a.toString + "-" + c)))
   println(combinations2)

   // compiler will rewrite the code in the below format
   val combinations3 =for {
    n <- numbers
    c <- chars
    color <- colors
   } yield (c + n.toString + "-" + color)

   println(combinations3)

   val res1 = List(Some(1),Some(2),Some(3),None)
   println(res1.flatten.reduceOption(_ + _))

   val personsList: List[ClassPerson] = List(
    ClassPerson("Alice", 25, Some("123 Main St")),
    ClassPerson("Bob", 30, None),
    ClassPerson("Charlie", 22, Some("456 Oak St"))
   )

   val resPerson = for {
    x <- personsList if x.address.isDefined
   } yield x.age

   println(resPerson)

  }
}
