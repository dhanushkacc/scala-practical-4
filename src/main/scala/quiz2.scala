def filter(list: List[String]): List[String] = {
  list.filter(_.length > 5)
}
@main def Main(): Unit = {

  val animals = List("dog", "", "elephant", "butterfly", "cat")
  println(filter(animals))
}
