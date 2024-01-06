package OOPs.Generics

class MapGenerics[K,V](entries: Map[K,V]){
  private var elements:Map[K,V] = entries
  def keyExists(key:K):Boolean = elements.contains(key)
  def isEmpty():Boolean = elements.isEmpty

  // explain below code
  // 1. elements ++ newElements will add the new elements to the existing elements
  // 2. this will return the current object
  def addElements(newElements:Map[K,V]):MapGenerics[K,V] = {
   elements = elements ++ newElements
    this
  }
  override def toString() = elements.toString()
}

object MapGenerics {

  def main(args: Array[String]): Unit = {
    val newMap = new MapGenerics[Int,String](Map(1 -> "naveen", 2 -> "sai"))
    println(newMap.keyExists(1))
    println(newMap.keyExists(3))
    println(newMap.isEmpty())
    println(newMap.addElements(Map(3 -> "kumar")))
    println(newMap)
    println(newMap.toString())
  }

}
