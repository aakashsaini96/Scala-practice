//Create a lambda function in scala to get square of a number

import io.StdIn._

def main(args: Array[String]): Unit = {
  val number = readInt()
  val square:Double => Double = x => x*x
  println(s"The square of $number is: ${square(number)}")
}