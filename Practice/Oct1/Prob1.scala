//Write a Scala function to calculate the factorial of a given number.

import io.StdIn._

def calFactorial(n: Int): Int = {
  if (n == 0 || n == 1) {
    1
  } else {
    n * calFactorial(n - 1)
  }
}

println("Enter a positive integer: ")
val num = readInt()
val fact = calFactorial(num)
println(s"The factorial is $fact")