/*
Write a function that takes a number of values and returns the average excluding the largest
and smallest values.
 */

import io.StdIn._

def averageExclude(arr: Array[Int]): Double = {
  val len = arr.length
  val large = arr.max
  val small = arr.min
  var sum = 0

  for (num <- arr) {
    if (num != large && num != small) sum += num
  }

  sum.toDouble / (len - 2)
}

def main(args: Array[String]) {
  println("How many nums in array? ")
  val n = readInt()
  println("Enter elements:")
  val arr = Array.fill(n) {
    readInt()
  }

  println(s"The average excluding largest and smallest element is ${averageExclude(arr)}")
}