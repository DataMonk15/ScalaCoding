package Basics

object Functions{
  def main(args: Array[String]): Unit = {

    def aFunction(a:String,b:String) ={
      a + " " + b
    }
    println(aFunction("Hello","World"))

    def aRepeatedFunction(aString: String, n: Int): String = {
      if (n == 1) aString
      else aString + aRepeatedFunction(aString, n - 1)
    }
    println(aRepeatedFunction("Hello",3))
    // loops are discouraged, When you want to loop use recursion

    def aFunctionWithSideEffects(aString: String): Unit = println(aString)

    // a function with side effects is a function that does not return anything but does something
    // example of side effects are println(), while, reassigning

    // pure functions are functions that return something and does not have side effects
    // example of pure functions are map, flatMap, filter

    // return type is mandate for recursive functions but not for normal functions
    def mapFunction(aString: String) = aString.map(x => x + " ")
    println(mapFunction("Hello"))

    // impure function are functions that have side effects
    // example of impure functions are println(), while, reassigning
    // functions that return Unit are impure functions and are also called as procedures

    def impureFunctions(aString: String): Unit = println(aString)
    println(impureFunctions("Hello"))


    def awhile(aString:String,n:Int) = {
      var count = n
      while (count > 0) {
        println(aString)
        count -=1
      }
    }
    println(awhile("Hello",3))



    /*
  Exercises:
  1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
  2.  Factorial function 1 * 2 * 3 * .. * n
  3.  A Fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n - 1) + f(n - 2)
  4.  Tests if a number is prime.
 */

    def greeting(name:String,age:Int) = {
      s"Hi, my name is $name and I am $age years old."
    }

    println(greeting("John",20))


    def fact(n: Int): Int = {
      if (n == 1) 1 else n * fact(n - 1)
    }
    println(fact(10))


    def fibnoacci(n:Int):Int = {
      if (n == 0) 0
      else if (n == 1) 1
      else fibnoacci(n-1) + fibnoacci(n-2)
    }
    println(fibnoacci(6))

    def isPrime(n:Int) ={
      def isPrimeUntil(t:Int):Boolean = {
        if (t <= 1) true
        else n % t != 0 && isPrimeUntil(t-1)
      }
      isPrimeUntil(n/2)
    }
    println(isPrime(37))

  }
}
