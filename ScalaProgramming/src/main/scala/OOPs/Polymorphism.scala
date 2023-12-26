package OOPs

class PolyPerson(name:String,designation:String,age:Int){
  def this(name:String,age:Int) = this(name,"Software Developer",age)
  def workmode(name:String,age:Int) = println(s"hello $name and your age is $age and working as $designation")
}

class anotherPolyPerson(name:String,designation:String,age:Int) extends PolyPerson(name,age){
  def anotherworkmode(name:String,age:Int) = println(s"hello $name and your age is $age and working as $designation. Calling from another class")
}

object Polymorphism {
  def main(args: Array[String]): Unit = {
    val person = new PolyPerson("Romeo",25)
    person.workmode("Romeo",25)

    val anotherPerson = new anotherPolyPerson("Romeo","data engineer",25)
    anotherPerson.anotherworkmode("Romeo",25)

    // polymorphism is the ability of an object to take many forms
    // in the above example, the class PolyPerson has two constructors
    // one with two parameters and another with three parameters
    // so the object person is taking two forms
    // one with two parameters and another with three parameters
    // this is called polymorphism
    // implement the above example with inheritance
    val person1:PolyPerson = new anotherPolyPerson("Romeo","data engineer",25)
    person1.workmode("Romeo",25)
    //person1.anotherworkmode("Romeo",25) // this will error out

  }
}
