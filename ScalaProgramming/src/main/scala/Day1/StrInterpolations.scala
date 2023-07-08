package Day1
object StrInterpolations {
  def main(args: Array[String]): Unit = {
    /** different string interpolations
     * s - s string interpolation
     * raw - raw string interpolation
     */

    val name = "Naveen"
    println(s"Welcome $name, To the 100 days scala coding !!")
    println(s"Welcome $name, to the 100 days \"scala\" coding !!")
    println(raw"Welcome $name to the 100 days 'scala' coding !!")

    val multilineString = "This is a \nmultiline\n comment"
    println(multilineString)

    //without stripmargin additional spaces from next line are included in the output
    val tripleQuotesStr = """This is
        triple
        quote string"""
    println(tripleQuotesStr)

    //Stripmargin reads the string after | delimiter
    val stripStr =
      """This is a
        |string built
        |using stripmargin""".stripMargin

    println(stripStr)

  }
}
