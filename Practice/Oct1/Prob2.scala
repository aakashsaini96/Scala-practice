//Write a Scala function to check if a given number is prime

import io.StdIn._

def isPrime(n: Int): Unit = {
  var i = 2
  var flag = true
  while (i < n && flag) {
    if (n % i == 0) flag = false
    i = i + 1
  }
  if (flag) println("The number is prime!")
  else println("The number is not prime!!")
}

println("Enter a positive integer: ")
val num = readInt()
isPrime(num)