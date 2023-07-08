package Day1
object VarAndStr {
  def main(args: Array[String]): Unit = {
    /* Different types of string comments
    /t = adds a tab space to the string
    /b = deletes the previous character
    /n = adds a new line
    \ = to escape the next character from interpretation
     */
    print("this is an exmaple of adding a new line\n")
    print("This is\tstring comment\n")
    print("This is example of backslash charac\bter\n")
    print("This is a example of \"escape\" character\\")

    /**Strings
     * immutable strings - val - variables defined with val keyword are not changeable
     * mutatble strings - var - variables defined with var keyword are changeable
     */

    val sayHello = "hello Naveen!!"
    // sayHello = "Bye naveen !!" // reassignment to val is not allowed
    print(sayHello)

    var helloAgain = "hello Naveen!!"
    helloAgain = "hello Coder!!" // reassignment to var is allowed
    print(helloAgain)

  }
}
