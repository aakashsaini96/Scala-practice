/*
Write a Scala program to find maximum difference between two elements in a given array of
integers such that smaller element appears before larger element
 */

def maxDifference(arr: Array[Int]): Int = {
  var ans = -2147483648
  for (i <- 0 until arr.length) {
    for (j <- i + 1 until arr.length) {
      if (arr(j) - arr(i) > ans) ans = arr(j) - arr(i)
    }
  }
  ans
}

def main(args: Array[String]) {
  val nums = Array(2, 3, 1, 7, 9, 5, 11, 3, 5)
  println(s"The maximum difference in numbers is ${maxDifference(nums)}")
}