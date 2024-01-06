package FP

object HOF {
  def main(args: Array[String]): Unit = {

    def doubleList(list: List[Int]): List[Int] = {
      list.map(x => x * 2)
    }

    def capilatizeList(list: List[String]): List[String] = {
      list.map(x => x.capitalize)
    }

    println(doubleList(List(1, 2, 3, 4, 5)))
    println(capilatizeList(List("naveen", "sai", "kumar")))


    def filterList(list: List[Int]): List[Int] = {
      list.filter(x => x % 2 == 0)
    }

    def filterLongerWords(list: List[String], n: Int) = {
      list.filter(x => x.length > n)
    }

    println(filterList(List(1,2,3,4,5,6,7,8)))
    println(filterLongerWords(List("naveen","sai","lucky"),4))

    def reduceFunc(list:List[Int]) = {
      list.reduce((x,y) => x + y)
    }

    println(reduceFunc(List(1,2,3,4,5,6)))
  }
}
