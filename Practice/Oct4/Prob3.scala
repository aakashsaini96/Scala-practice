/*
Write a script that reads in a number of integers between 1 and 100 and stores them in a list
and then counts the number of times each number occurs.
 */

import io.StdIn._

println("How many integers(1-100)? ")
val n = readInt()
println("Enter integers:")
val integers = Array.fill(n) {
  readInt()
}

val count = scala.collection.mutable.Map[Int, Int]()

for (num <- integers) {
  if (count.contains(num)) count(num) += 1
  else count += (num -> 1)
}

println(s"The count of integers is $count")