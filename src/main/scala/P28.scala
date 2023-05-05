import scala.annotation.tailrec

object P28 extends App {

  @tailrec
  def lSort[A](list: List[List[A]], newList: List[List[A]]): List[List[A]] = {

    if(list.isEmpty) newList
    else{
      val shortestList = list.minBy(_.length)
      lSort(list.filter(_ != shortestList), newList :+ shortestList)
    }
  }
  println(lSort(List(List('a', 'b', 'c'), List('d', 'e'), List('f', 'g', 'h'), List('d', 'e'), List('i', 'j', 'k', 'l'), List('m', 'n'), List('o')), List()))
}
