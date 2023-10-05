/*
Write a Scala program to convert the last 4 characters of a given string in upper case. If the
length of the string has less than 4 then uppercase all the characters.
 */

import io.StdIn._

println("Enter any string: ")
val str = readLine()
val strnew = {
  if (str.length <= 4) str.toUpperCase
  else str.take(str.length - 4) + str.takeRight(4).toUpperCase()
}

println(s"The result will be $strnew")