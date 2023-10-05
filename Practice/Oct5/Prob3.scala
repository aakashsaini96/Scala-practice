/*
Write a Scala program to count the number of vowels in a given string.
 */

import io.StdIn._

def isVowel(c: Char): Boolean = {
  c.toLower match {
    case 'a' | 'e' | 'i' | 'o' | 'u' => true
    case _ => false
  }
}

def countVowels(str: String): Int = {
  var count = 0

  for (c <- str) {
    if (isVowel(c)) count += 1
  }

  count
}

def main(args: Array[String]) {
  println("Enter any string: ")
  val str = readLine()

  println(s"The number of vowels in '${str}' are ${countVowels(str)}")
}