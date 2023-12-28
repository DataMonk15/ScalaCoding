package OOPs

//A trait is similar to a class but cannot be instantiated on its own.
//It can contain methods, fields, and even concrete (implemented) methods.

//Mixin Composition:
// Traits are often used for mixin composition, allowing you to combine multiple traits into a single class.
// This helps in achieving code reuse without using traditional multiple inheritance.
// Define a trait
trait Greetable {
  def greet(): Unit = println("Hello!")
}

// Use the trait in a class
class TraitPerson(val name: String) extends Greetable {
  def introduce(): Unit = println(s"My name is $name")
}

//Multiple Traits:
//You can mix multiple traits into a single class, allowing it to have the combined behavior of all the traits.
trait Walks {
  def walk(): Unit = println("Walking...")
}
class Walker extends Greetable with Walks

//Abstract Traits:
//Traits can have abstract (unimplemented) methods, leaving it to the class that mixes in the trait to provide the implementation.

trait Eater {
  def eat(food: String): Unit // Abstract method
}
class TraitAnimal extends Eater {
  def eat(food: String): Unit = println(s"The animal is eating $food")
}
// Prints: The animal is eating grass

object traitsExamples {
  def main(args: Array[String]): Unit = {
    val person = new TraitPerson("John")
    person.greet() // Prints: Hello!
    person.introduce() // Prints: My name is John

    val walker = new Walker
    walker.greet() // Prints: Hello!
    walker.walk() // Prints: Walking...

    val animal = new TraitAnimal
    animal.eat("grass") // Prints: The animal is eating grass

  }
}
