package OOPs

/*
  Novel and a Writer

  Writer: first name, surname, year
    - method fullname

  Novel: name, year of release, author
  - authorAge
  - isWrittenBy(author)
  - copy (new year of release) = new instance of Novel
 */

class writer(val name:String,val surname:String,val age:Int){
  def fullname():String = s"$name $surname"
}

class novel(val name:String,val yor:Int,val author:writer){
  def authorAge():Int = yor - author.age
  def isWrittenBy(author:writer):Boolean = author == this.author
  def copy(newYor:Int):novel = new novel(name,newYor,author)

}

object OOExercise {
  def main(args: Array[String]): Unit = {
    val author = new writer("Charles","Dickens",1812)
    val novel = new novel("Great Expectations",1861,author)

    println(s"Author's name is ${author.name}")
    println(s"Author's surname is ${author.surname}")
    println(s"Author's age is ${author.age}")

    println(s"Novel's name is ${novel.name}")
    println(s"Novel's year of release is ${novel.yor}")
    println(s"Novel's author is ${novel.author}")

    println(author.fullname())
    println(novel.authorAge())
    println(novel.isWrittenBy(author))
    println(novel.copy(1862))
  }
}
