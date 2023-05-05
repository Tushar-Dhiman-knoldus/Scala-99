import scala.annotation.tailrec

object ReverseNumber extends App {

  @tailrec
  def numberReverse(number: Int, result: Int): Int = {

    if (number != 0) {
      numberReverse(number / 10, result * 10 + (number % 10))
    } else result
  }

  println(numberReverse(574215487, 0))
}
