import scala.util.Random

object P24 extends App {

  def lotto(totalElements: Int, range: Int, newList: List[Int]): List[Int] = {

    val random = new Random
    if (totalElements > 0) {
      lotto(totalElements - 1, range, newList :+ random.between(1, range + 1))
    } else newList
  }

  println(lotto(6, 49, List()))

}
