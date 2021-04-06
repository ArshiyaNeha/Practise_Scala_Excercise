package ScalaExamplePractise

object DisplayNameAge extends App
{
  val name = readLine("Enter your Name..")
  println("Enter your Age..")
  val age = readInt()
  println(Console.BOLD)
  print("Name: ")
  println(Console.UNDERLINED)
  print(name)
  println(Console.BOLD)
  print("Age: ")
  println(Console.RESET)
  print(age)


}
