
import scala.annotation.tailrec

object P14 extends App {


  def duplicate[A](list: List[A]): List[A] = {

    @tailrec
    def helper[A](list: List[A], newList: List[A]): List[A] ={

      list match {
        case ::(head, tail) =>
          helper(tail, newList :+ head :+ head)
        case Nil => newList
      }

    }
      helper(list, List())
  }

  println(duplicate(List('a', 'b', 'c', 'c', 'd')))
}
