package OOPs

// If we do not want the class to be inherited then we need to use the keyword final
final class superPerson(name: String, age: Int) {
  def greet(): Unit = println(s"This is a super person class and hello $name and your age is $age")
}

//Below statement is not allowed bcoz the class is final
//class AnotherSuperPerson(name:String) extends superPerson(name,0)

// ############################################################################################################
class PersonClass(name: String, age: Int) {
  def greet(): Unit = println(s"hello $name and your age is $age")
}

//while ineriting the class we need to pass the parameters of the parent class
class Adult(name: String, age: Int, idCard: String) extends PersonClass(name, age)

// ############################################################################################################
class anotherPerson(name: String, age: Int) {
  def this(name:String) = this(name, 0)
  def greet(): Unit = println(s"hello $name and your age is $age. Calling from another class")
}

// Here while inhertiing the class, we have passed only one parameter
// bcoz we have defined the primary constructor in the parent class with one parameter
class anotherAdult(name: String, age: Int, idCard: String) extends anotherPerson(name)

// ############################################################################################################

// sealed class is used to restrict the class to be inherited in the same file
// sealed class will not allow the class to be inherited in the other files
sealed class sealedPerson(name:String,desination:String){
  def work():Unit = println(s"hello $name and your designation is $desination")
}

class anotherSealedPerson(name:String,desination:String) extends sealedPerson(name,desination)

// ##############################################################################################################

object InheritanceAdvanced {
  def main(args: Array[String]): Unit = {
    val Person = new Adult("sai", 25, "1234")
    Person.greet()

    val anotherPerson = new anotherAdult("sai", 25, "1234")
    anotherPerson.greet()
  }
}
