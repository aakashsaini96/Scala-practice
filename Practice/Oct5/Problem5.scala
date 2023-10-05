/*
Write a Scala program to create a map and sort it by keys in ascending order
 */

val name_map = Map("Mrinmoi" -> 1, "Aakash" -> 4, "Shreyashi" -> 2, "Rishabh" -> 3)

println("Original map: " + name_map)

val sortedMap = name_map.toSeq.sortBy(_._1).toMap

println("Sorted map by keys: " + sortedMap)