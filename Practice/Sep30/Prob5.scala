/*
Write a Scala program to print the Fibonacci series up to a given number using a while loop.
 */
import io.StdIn._

println("Enter limit for fibonacci series:(>1) ")
val limit = readInt()

var num1 = 0
var num2 = 1

println(s"Fibonacci Series upto $limit:")
print(s"$num1 $num2")

var sum = num1 + num2
while (sum <= limit) {
  print(" " + sum)
  num1 = num2
  num2 = sum
  sum = num1 + num2
}