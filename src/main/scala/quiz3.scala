def calculateMean(num1: Int, num2: Int): Double = {
  val mean = (num1 + num2) / 2
  math.round(mean * 100) / 100.0
}

@main def Main(): Unit = {

  val num1 = 14
  val num2 = 8
  val average = calculateMean(num1, num2)
  println(average)
}
