// Write a function to solve the quadratic equation for real values. Your solution should
// return a (Double, Double) of the two roots.

import io.StdIn._

def calcRoots(a: Double, b: Double, c: Double): (Double, Double) = {
  val rootTerm = math.sqrt((b * b) - (4 * a * c))
  val root1 = (-b + rootTerm) / (2 * a)
  val root2 = (-b - rootTerm) / (2 * a)
  (root1, root2)
}

def main(args: Array[String]) {
  println("Enter the coefficients of quadratic equation in order: ")
  val a = readDouble()
  val b = readDouble()
  val c = readDouble()
  println(s"The roots of the equation are ${calcRoots(a, b, c)}")
}