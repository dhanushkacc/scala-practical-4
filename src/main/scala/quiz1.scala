def stringReverse(text: String): String = {
  if (text.length == 1) {
    text
  } else {
    stringReverse(text.tail) + text.head
  }
}

@main def Main(): Unit = {
  val word = "Test"
  val reversedString = stringReverse(word)
  println(reversedString)

}
