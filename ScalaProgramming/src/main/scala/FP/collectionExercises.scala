package FP

object collectionExercises {
  def main(args: Array[String]): Unit = {

    def stringPairs(strings: List[String]) = strings.flatMap(a => strings.filter(b => a != b && a < b).map(c => (a,c)))

    val stringsList: List[String] = List("apple", "banana", "orange", "pear")

    println(stringPairs(stringsList))

    def cumulativeSum(numbers: List[Int]):List[Int] = numbers.scanLeft(0)((x,y) => x + y)

    println(cumulativeSum(List(1,2,3)).tail)

    def findAnagrams(list:List[String],word:String) = {
      list.filter(x => x.sorted == word.sorted && x != word)
    }

    val wordsList: List[String] = List("listen", "silent", "enlist", "apple", "banana")
    val referenceWord: String = "silent"

    println(findAnagrams(wordsList,referenceWord))
  }
}
