/*
Write a function that takes a sequence (List or Array) of grades and returns the average with
the lowest two grades dropped. Make sure this function behaves reasonably even for smaller
input sets.
 */

import io.StdIn._

def averageExclude(arr: Array[Int]): Double = {
  val len = arr.length
  if (len <= 2) 0.0
  else {
    val small = arr.min
    var secondSmall = 2147483647
    for (num <- arr) {
      if (secondSmall > num && num != small) secondSmall = num
    }

    var sum = 0

    for (num <- arr) {
      if (num != small && num != secondSmall) sum += num
    }

    sum.toDouble / (len - 2)
  }
}

def main(args: Array[String]) {
  println("How many grades in array? ")
  val n = readInt()
  println("Enter grades:")
  val grades = Array.fill(n) {
    readInt()
  }

  println(s"The average excluding lowest 2 grades is ${averageExclude(grades)}")
}