//Write a Scala program to check whether a list contains a sublist

def checkSublist(list1: List[Int], list2: List[Int]): Boolean = {
  list2.forall(list1.contains)
}

def main(args: Array[String]) {
  val lst1 = List(1, 2, 3, 4, 5)
  val lst2 = List(1, 2, 3)
  val lst3 = List(5, 6)
  println(s"Is $lst2 a sublist of $lst1 ? ${checkSublist(lst1, lst2)}")
  println(s"Is $lst3 a sublist of $lst1 ? ${checkSublist(lst1, lst3)}")
}