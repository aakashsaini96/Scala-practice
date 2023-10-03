//Write a Scala program that checks if a tuple contains a specific element.

def main(args: Array[String]) {
  val nums = (1, "hi", true, 57)
  val checkEle = 57
  val isPresent = nums.productIterator.contains(checkEle)

  println(s"Is $checkEle present in ${nums}? ${isPresent}")
}