import io.StdIn._

object Demo {
  def main(args: Array[String]) {
    println("Enter your age please: ")
    val age = readInt()
    if (age > 21) {                  //Conditional statements if-else
      println("Come In")
    } else {
      println("Get Lost")
    }
    //Conditional Operators
    if (age < 13 || age > 55) println("Your bus ticket is free") else println("Pay Rs. 100")

    println(3+3<4*5 && 5>7)         //Operator Precedance

    for (i <- 1 to 10) {       //Loops
      println(i)
    }
  }
}