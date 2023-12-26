package OOPs

class Animal {
  val N_EYES = 2
  def eat(): Unit = println("Animal is eating")
  def bark() = println("Animal is barking")
  // if we do not want variable or method to be inherited by the child class then we can use the keyword final
  final def sleep() = println("Animal is sleeping")
}

class Dog extends Animal {
  // if the parent class has the implementation of the method or variables
  // then it is called as overriding and it can be acheived by using the keyword override

  override val N_EYES = 3
  override def bark(): Unit = println("Dog is barking")

  // super keyword is used to call the method or variable from the parent class
  override def eat(): Unit = {
    super.eat()
    println("Dog is eating")
  }

  // below method cannot be overridden because it is declared as final in the parent class
  // override def sleep() = println("Dog is sleeping")
}

object InheritanceBasics {
  def main(args: Array[String]): Unit = {
    // Inheritance is the process of creating a new class from an existing class.
    val dog = new Dog()
    // after the instantiation of the class,it will check if the method or variables is available in the child class
    // if it is not available then it will check in the parent class
    // if it is available in the parent class then it will use the method or variable from the parent class
    dog.eat()
    // bark is available in the child class so it will use the method from the child class
    dog.bark()
    //it will be called from the parent class because it is not available in the child class
    dog.sleep()
    // it will be called from the child class because it is overridden in the child class
    print(dog.N_EYES)

  }
}
