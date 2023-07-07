def income(normal: Int, ot: Int): Int = normal * 250 + ot * 85
def tax(income: Int): Double = income * 0.12
def takeHome(normal: Int, ot: Int): Double =
  income(normal, ot) - tax(income(normal, ot))

object Main extends App {
  println(takeHome(40, 30))

}
