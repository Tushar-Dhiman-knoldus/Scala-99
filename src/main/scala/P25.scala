import scala.annotation.tailrec
import scala.util.Random

object P25 extends App {

  val random = new Random

  @tailrec
  private def randomPermute[A](list: List[A], newList: Set[A]): List[A] = {

    if (newList.size != list.size) {
      randomPermute(list, newList + list(random.nextInt(list.length)))
    } else newList.toList
  }

  println(randomPermute(List('a', 'b', 'c', 'd', 'e', 'f'), Set()))
}
