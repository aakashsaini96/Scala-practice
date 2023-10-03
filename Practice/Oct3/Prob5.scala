//Write a Scala program to create a set and find the second largest element in the set.

def main(args: Array[String]) {
  val mySet = Set(23, 7, 0, -56, 45, 28, 69, 72)
  val largest = mySet.max
  var secondLargest = -2147483648

  for (num <- mySet) {
    if ((num > secondLargest) && (num != largest)) secondLargest = num
  }

  println(s"Second largest number is $mySet is $secondLargest")
}