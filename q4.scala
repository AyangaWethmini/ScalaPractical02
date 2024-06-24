object question04 extends App {
  def calculateAttendance(ticketPrice: Int): Int = {
    val n = ticketPrice match {
      case price if price < 15 => (15 - price) / 5 * 20 + 120
      case price if price > 15 => (15 - price) / 5 * 20 + 120
      case _                   => 120
    }
    return n
  }

  def calculateCost(n: Int): Double = {
    return 500 + n * 3;
  }

  def calculateprofit(tPrice: Int): Double = {
    var n = calculateAttendance(tPrice);
    var cost = calculateCost(n)

    return n * tPrice - cost;
  }

  println(s"Profit made : ${calculateprofit(15)}")
  println(s"Profit made : ${calculateprofit(20)}")
  println(s"Profit made : ${calculateprofit(10)}")
}
