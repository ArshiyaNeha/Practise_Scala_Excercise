package ScalaExamplePractise

object StringtoUpercase extends App
{
  // Create a Scala program to reverse,
  // and then format to upper case, the given String: "http://allaboutscala.com/scala-exercises

  val strToFormat = "\"http://allaboutscala.com/scala-exercises"
  val reverseAndTouppercase = strToFormat.reverse.toUpperCase
  println(s"$strToFormat Reversed the string and converting to uppercaes $reverseAndTouppercase")

}
