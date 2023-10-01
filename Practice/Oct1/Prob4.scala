//Write a Scala function to calculate the power of a number.

def calculatePower(base: Double, exponent: Int): Double = {
  var result = 1.0
  var i = 0

  while (i < exponent) {
    result *= base
    i += 1
  }
  result
}

def main(args: Array[String]): Unit = {
  val base = 3.0
  val exponent = 4
  val result = calculatePower(base, exponent)
  println(s"The result of $base raised to the power of $exponent is: $result")
}