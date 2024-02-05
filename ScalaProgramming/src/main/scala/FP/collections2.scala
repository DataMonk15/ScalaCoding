package FP

object collections2 {
  def main(args: Array[String]): Unit = {

    // find even numbers from the result
    def findEvenNumbers(num: List[Int]) = {
      num.filter(x => x % 2 == 0)
    }

    println(findEvenNumbers(List(1, 2, 3, 4, 5, 6, 7, 8)))

    // function to return the items present in both set
    def findCommonSetElements(set1: Set[String], set2: Set[String]) = {
      var res = Set.empty[String]
      for (x <- set1) {
        if (set2.contains(x)) {
          res += x
        }
      }
      res
    }

    val setA = Set("apple", "banana", "orange", "kiwi")
    val setB = Set("banana", "kiwi", "grape", "melon")
    println(findCommonSetElements(setA,setB))

    // function to increment the grades of a student by 5
    def incrementGrade(names:Map[String,Int]) ={
      names.map{ case(name,grade) => name ->(grade + 5)}
    }

    println(incrementGrade(Map("naveen" -> 2,"Sai" -> 5)))
  }
}
