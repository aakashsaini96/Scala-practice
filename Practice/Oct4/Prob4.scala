/*
Write a function that produces a sequence of prime numbers. The function should take an argument
for how many prime numbers need to be in the list.
 */

import io.StdIn._
import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks._

def isPrime(n: Int): Boolean = {
  if (n == 2) true
  else {
    var answ = true
    breakable {
      for (i <- 2 to n - 1) {
        if (n % i == 0) {
          answ = false
          break
        }
      }
    }
    answ
  }
}
def getPrime(n: Int): List[Int] = {
  val ans = ArrayBuffer[Int]()
  var i = 2

  while (ans.length < n) {
    if (isPrime(i)) {
      ans += i
    }
    i += 1
  }
  ans.toList
}

def main(args: Array[String]) {
  println("How many prime numbers? ")
  val n = readInt()

  println(s"The first $n prime numbers are ${getPrime(n)}")
}