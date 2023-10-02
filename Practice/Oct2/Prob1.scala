//Write a function to find the if an entered string is a palindrome or not.

import io.StdIn._

def isPalindrome(str: String): Boolean = {
  val revstr = str.reverse
  revstr == str
}
def main(args: Array[String]) {
  println("Enter any string: ")
  val str = readLine()
  println(s"Is $str a palindrome? ${isPalindrome(str)}")
}