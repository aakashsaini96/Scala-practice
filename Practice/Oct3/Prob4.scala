//Write a Scala program to create a map and find the keys with the maximum value.

def main(args: Array[String]) {
  val name_map = Map("Aakash" -> 50000,
    "Mrinmoi" -> 20000,
    "Shreyashi" -> 80000,
    "Mayur" -> 60000,
    "Rishabh" -> 80000)

  val maxval = name_map.values.max
  var indices = ArrayBuffer[String]()

  name_map.keys.foreach {
    key =>
      if (name_map(key) == maxval) {
        indices += key
      }
  }

  indices.foreach(println)
}