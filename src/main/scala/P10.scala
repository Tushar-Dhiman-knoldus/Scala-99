import P09.encode

object P10 extends App{

  def lengthEncode(list: List[Char]): List[(Int, Char)] ={

    val listOfListChar = encode(list)
    listOfListChar.map{ element => (element.length, element.head)}
  }

  println(lengthEncode(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))

}
