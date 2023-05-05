import scala.annotation.tailrec

object P12 extends App {

  private def decode(list: List[(Int, Char)], newList: List[Char]): List[Char] = {

    list.flatMap {
      element =>

        @tailrec
        def helper(counter: Int, newList: List[Char]): List[Char] = {

          if (counter > 0) {
            helper(counter - 1, newList :+ element._2)
          } else newList
        }

        helper(element._1, newList)
    }

  }

  println(decode(List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e')), List()))

}
