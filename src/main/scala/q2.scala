var a: Int = 2
var b: Int = 3
var c: Int = 4
var d: Int = 5
var k: Float = 4.3f

object Main extends App {

  b -= 1
  println(b * a + c * d) // a) println( - -b * a + c *d - -);

  println(a); // b) println(a++);

  var tempc = c
  tempc += 1
  println(tempc) // d) println (c=c++);

  c += 1
  println(c * a); // e) println (c=++c*a++);

}
