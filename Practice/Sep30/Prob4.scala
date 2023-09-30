/*
Write a Scala program to check a given integer and return true if it is within 20 of 100 or 300.
 */
import io.StdIn._

val num = readInt()
if (math.abs(100 - num) <= 20 || num == 300) {
  println("True")
} else {
  println("False")
}