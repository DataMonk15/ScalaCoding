package OOPs

// abstract classes are classes which cannot be instantiated
// they are used to define the base class and can be extended by other classes
// abstract classes can have both abstract and non-abstract methods
abstract class AbstractAnimal{
 val creatureType:String = "wild"
  def eat():Unit = println(s"Animal  is eating")
  def sleep():Unit = println(s"Animal  is sleeping")
}

// multiple class inheritance is not allowed in scala
class AbstractDog(name:String) extends AbstractAnimal{
  override val creatureType: String = "domestic"
  override def eat(): Unit = println(s"Dog $name is eating")
  override def sleep(): Unit = println(s"Dog $name is sleeping")
}

//trait is a behavior that classes can mixin and can be inherited
// mixin
trait Carnivore{
  def eat(animal:AbstractDog):Unit
}

class Crocodile extends AbstractDog("GoldenRetreiver") with Carnivore{
  override val creatureType: String = "croc"
  override def eat: Unit = println("nomnomnom")
  def eat(animal: AbstractDog): Unit = {
    println(s"I'm a croc and I'm eating ${animal.creatureType}")
    animal.eat()
  }
}

object AbstractDataTypes {
  def main(args: Array[String]): Unit = {
    val dog = new AbstractDog("tommy")
    dog.eat()
    dog.sleep()
    println(dog.creatureType)

    val croc = new Crocodile
    croc.eat(dog)

  }
}
