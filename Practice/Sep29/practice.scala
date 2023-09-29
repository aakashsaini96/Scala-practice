import io.StdIn._

object Demo {
  def main(args: Array[String]) {
    val a = 5.6        //Working with datatyes and variables
    println(a)

    println(a.toInt)             //Basic methods to convert to a datatype
    println(('a'+1).toChar)
    println("a"+1)

    println(53.toBinaryString)            //Binary number system
    println(20000000000L+20000000000L)      //Long Int datatype

    val para =                     //Multi line string where any character will be allowed
      """This \is a
        |multi-line \n paragraph.
        |""".stripMargin
    println(para)
    println(s"The number should be ${a+1.1}")   //String interpolation

    val str1 = "hi there"       //Working with string methods
    println(str1.indexOf("h"))
    val space = str1.indexOf(" ")
    val (first, last) = str1.splitAt(space)
    println(s"${last.trim}, $first")

    println("Type something: ")
    val inp = readLine()        //Taking input in scala
    println(inp)
  }
}