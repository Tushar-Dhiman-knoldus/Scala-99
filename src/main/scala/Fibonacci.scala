import scala.annotation.tailrec

object Fibonacci extends App {

  @tailrec
  private def findFibonacci(range: Int, number1: Int = 0, number2: Int = 1, list: List[Int] = List()): List[Int] = {

    if (range != 0) {
      findFibonacci(range - 1, number2, number1 + number2, list :+ number1 + number2)
    }
    else {
      list
    }
  }
  println(findFibonacci(10))
}
