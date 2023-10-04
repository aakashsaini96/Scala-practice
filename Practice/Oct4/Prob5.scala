/*
Write a script that reads in a series of numbers from the user and stores them in a list.
Then pass this list to a function that will remove all of the duplicates in the list. Print out
the list to make sure that all duplicates were removed.
 */

import io.StdIn._

def removeDuplicates(origList: List[Int]): List[Int] = {
  origList.toSet.toList
}

def main(args: Array[String]) {
  println("Enter a series of space separated integers:")
  val nums = readLine.split(" ").map(_.toInt).toList
  val newNums = removeDuplicates(nums)
  println(s"The series after removing duplicates: $newNums")
}