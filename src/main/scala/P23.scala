import scala.annotation.tailrec
import scala.util.Random

object P23 extends App {
  @tailrec
  private def randomSelect(number: Int, list: List[Char], newList: Set[Char]): Set[Char] = {

    val random = new Random
    if (number > 0 ) {
      randomSelect(number -1, list, newList + list(random.nextInt(list.length)))
    } else newList
  }

  println(randomSelect(3, List('a', 'b', 'c', 'd', 'f', 'g', 'h'), Set()))
}
