/*
The reverse method can be called on a String. Use this to write a script where the user inputs
a word (use readLine) and you tell them whether or not it is a palindrome.
 */
import io.StdIn._

val word = readLine()
val revWord = word.reverse
if (word == revWord) {
  println("The word you entered is a palindrome")
} else {
  println("The word is not a palindrome")
}
