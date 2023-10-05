/*
Write a Scala program that creates a class Triangle with properties side1, side2, and side3.
Implement a method isEquilateral to check if the triangle is equilateral.
 */

class Triangle(side1:Double, side2:Double, side3:Double) {
  def isEquilateral():Boolean = {
    side1 == side2 && side2 == side3
  }
}
object TrianleImplementation {
  def main(args: Array[String]) {
    val triangle1 = new Triangle(5.0, 5.0, 5.0)
    val triangle2 = new Triangle(7.0, 6.0, 7.0)

    println(s"Triangle1 is equilateral: ${triangle1.isEquilateral()}")
    println(s"Triangle2 is equilateral: ${triangle2.isEquilateral()}")
  }
}