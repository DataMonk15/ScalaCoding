package OOPs.Generics

class SetGenerics[A] {
  private var elements:List[A] = List()
  def head():A = elements.head
  def tail():List[A] = elements.tail
  def isEmpty():Boolean = elements.isEmpty

  def add(x:A):Unit = {
    if (elements.contains(x)){
      println(s"$x is already present in the set")
  }else{
      elements = x :: elements
      println(s"Added $x and current set is $elements")
    }
  }
  def remove(x:A):Unit = {
    if (elements.contains(x)){
      elements = elements.filter(_ != x)
      println(s"Removed $x and current set is $elements")
    }else{
      println(s"$x is not present in the set")
    }
  }


  // implicit ordering is used to compare the elements of the list
  // if the list is empty then it will return None
  // how it works:
  // 1. headOption will return the first element of the list
  // 2. map will apply the function to the head element
  // 3. foldLeft will apply the function to the head element and the tail elements
  // 4. ordering.min will compare the head element and the current element and return the min element

  def minElement()(implicit ordering: Ordering[A]):Option[A] = elements.headOption.map { head =>
    elements.tail.foldLeft(head)((min, current) => ordering.min(min, current))
  }

}

object SetClass {
  def main(args: Array[String]): Unit = {
    val newSet = new SetGenerics[Int]
    newSet.add(1)
    newSet.add(2)
    newSet.add(3)
    newSet.add(3)
    newSet.head()
    newSet.tail()
    newSet.remove(3)
    newSet.remove(4)

    println(newSet.minElement().getOrElse())

    val newSet2 = new SetGenerics[Int]
    println(newSet2.minElement().getOrElse(null))

    val newSet3 = new SetGenerics[String]
    newSet3.add("naveen")
    newSet3.add("sai")
    newSet3.add("bhavani")
    newSet3.add("bhavani")
    newSet3.head()
    newSet3.tail()
    newSet3.remove("bhavani")
    newSet3.remove("bhavani")

    println(newSet3.minElement().getOrElse(null))

  }

}
