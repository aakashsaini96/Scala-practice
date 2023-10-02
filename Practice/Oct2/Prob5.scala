/*
Write a set of functions to do the following operations on a 2-tuples of Int as if they were
the numerator and denominator of rational numbers. (a) Addition (b) Subtraction (c)
Multiplication (d) Division For example, the function for addition might start off as
def add(n1:(Int, Int), n2:(Int, Int)):(Int, Int).
 */

import io.StdIn._

def rationalOperations(a: (Int, Int), b: (Int, Int), op: Char): (Int, Int) = {
  if (op == '+') (a._1 * b._2 + b._1 * a._2, a._2 * b._2)
  else if (op == '-') (a._1 * b._2 - b._1 * a._2, a._2 * b._2)
  else if (op == '*') (a._1 * b._1, a._2 * b._2)
  else (a._1 * b._2, a._2 * b._1)
}

def main(args: Array[String]) {
  println("Enter numerator and denominator for first number: ")
  val anum = readInt()
  val aden = readInt()
  println("Enter numerator and denominator for second number: ")
  val bnum = readInt()
  val bden = readInt()
  println("Enter the operator (+,-,*,/): ")
  val op = readChar()
  val res = rationalOperations((anum, aden), (bnum, bden), op)
  println(s"The result of ${anum}/${aden} ${op} ${bnum}/${bden} is ${res._1}/${res._2}")
}