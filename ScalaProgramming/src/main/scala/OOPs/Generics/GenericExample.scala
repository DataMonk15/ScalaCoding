package OOPs.Generics

trait MyPredicate[T]{
  def test(element:T):Boolean
}

trait MyTransformer[A,B]{
  def transform(element:A):B
}

//class MyList[A] extends MyPredicate[A], MyTransformer{
//   def test(element: A): Boolean = ???
//   def transform(element: A): B = ???
//}


object GenericExample {
  def main(args: Array[String]): Unit = {

  }

}
