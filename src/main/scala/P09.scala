
object P09 extends App {

  def encode(list: List[Char]): List[List[Char]] = {

    if (list.isEmpty) List(List())
    else {
      val (newList, tail) = list.span(_ == list.head)
      if (tail == Nil) List(newList)
      else newList :: encode(tail)
    }
  }
  println(encode(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
}
