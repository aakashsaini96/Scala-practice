/*
Write a Scala program to find contiguous subarray within a given array of integers which has
the largest sum.
 */

import io.StdIn._

def largestSum(arr: Array[Int]): Int = {
  var ans = 0
  var max_last = 0

  for (n <- arr) {
    max_last += n
    max_last = Integer.max(0, max_last)
    ans = Integer.max(ans, max_last)
  }
  ans
}

def main(args: Array[String]) {
  println("Enter a series of space separated integers:")
  val nums = readLine.split(" ").map(_.toInt).toArray
  println(s"Largest contiguous subarray sum in the array is ${largestSum(nums)}")
}