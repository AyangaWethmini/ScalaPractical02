object tutorial extends App {
  var i, j, k = 2
  var m, n = 5
  var f = 12.0f
  var g = 4.0f
  var c = 'X'

  println(s"k + 12 * m = ${k + 12 * m}")
  println(s"m / j = ${m / j}")
  println(s"n % j = ${n % j}")
  println(s"m / j * j = ${m / j * j}")
  println(s"f + 10 * 5 + g = ${f + 10 * 5 + g}")
  //println(s"++i * n = ${i * n}")
  /*
        ++ operator is not available in scala so this line of code generates an error
        instead we can use i += 1
   */

}
