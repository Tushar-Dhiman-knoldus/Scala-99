
//Flatten a nested list structure.
object PO7 extends App {

  private val list7 = List(List(1, 1), 2, List(3, List(5, 8)))
  println(flatTheList(list7))

  private def flatTheList(list7: List[_]): List[_] = {
    list7.flatMap {
      case list: List[_] => flatTheList(list)
      case element => List(element)
    }
  }
}
