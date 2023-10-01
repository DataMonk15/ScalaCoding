package Day6

import scala.io.StdIn

object Function2 {
  def main(args: Array[String]): Unit = {
   val products:Map[String,Double] = Map("Shoes" -> 10, "Wallet" -> 15.1, "t-shirt" -> 23.1)

    def addTax(name:String) ={
      val price = products.get(name)
      if (price.nonEmpty) {
        price.get.*(0.20) + price.get
      }else{
        0.0
      }
    }

    println(s"calculating the tax for product shoes ${addTax("Shoes")}")
    println(s"calcucating the tax for the product watch ${addTax("watch")}")

    val animalsLifeSpan:Map[String,Int] = Map("cats" -> 15,"dogs" -> 10, "rabbit" -> 12)


    println("Please provide the animal age to know the life span")
    val userAnimal = StdIn.readLine().toString

    def AnimalLifeSpan(userAnimal:String)={
      if (animalsLifeSpan.contains(userAnimal)) animalsLifeSpan(userAnimal) else 20
    }

    println(s"requested lifespan for $userAnimal is ${AnimalLifeSpan(userAnimal)}")

  }
}
