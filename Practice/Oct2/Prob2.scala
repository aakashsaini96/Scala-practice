//Write a function to find greatest of 3 numbers.

import io.StdIn._

def findMax(x: Int, y: Int, z: Int): Int = {
  List(x, y, z).max
}
def main(args: Array[String]) {
  println("Enter 3 numbers: ")
  val x = readInt()
  val y = readInt()
  val z = readInt()
  println(s"The maximum of 3 nums is ${findMax(x, y, z)}")
}