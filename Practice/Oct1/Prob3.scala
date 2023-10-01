//Write a Scala function to calculate the sum of digits in a given number.

import io.StdIn._

def sumOfDigits(n: Int): Int = {
  var num = n
  var sum = 0

  while (num != 0) {
    val digit = num % 10
    sum += digit
    num /= 10
  }
  sum
}

def main(args: Array[String]): Unit = {
  val number = readInt()
  val sum = sumOfDigits(number)
  println(s"The sum of digits in $number is: $sum")
}