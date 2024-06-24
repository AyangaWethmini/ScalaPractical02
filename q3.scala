object question03 extends App {
  def calculateSalary(wHours: Int, otHours: Int): Double = {
    return 250 * wHours + 85 * otHours;
  }

  def calculateTax(amount: Double): Double = {
    return amount * 12 / 100;
  }

  def takeHomeSalary(wHours: Int, otHours: Int): Double = {
    var totalSalary = calculateSalary(wHours, otHours)
    return totalSalary - calculateTax(totalSalary);
  }

  println(s"The take home salary: ${takeHomeSalary(40, 30)}");

}
