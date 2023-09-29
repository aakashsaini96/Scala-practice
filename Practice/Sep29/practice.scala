import io.StdIn._

object Demo {
  def main(args: Array[String]) {
    val a = 5.6
    println(a)

    println(a.toInt)
    println(('a'+1).toChar)
    println("a"+1)

    println(53.toBinaryString)
    println(20000000000L+20000000000L)

    val para =
      """This \is a
        |multi-line \n paragraph.
        |""".stripMargin
    println(para)
    println(s"The number should be ${a+1.1}")

    val str1 = "hi there"
    println(str1.indexOf("h"))
    val space = str1.indexOf(" ")
    val (first, last) = str1.splitAt(space)
    println(s"${last.trim}, $first")

    println("Type something: ")
    val inp = readLine()
    println(inp)
  }
}