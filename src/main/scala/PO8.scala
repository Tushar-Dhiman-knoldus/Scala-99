package com.knoldus.scala99

object PO8 extends App {

  private val list8 = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

  println(eliminateConsecutiveDuplicatesOfListElements(list8))

  private def eliminateConsecutiveDuplicatesOfListElements(list8: List[Char]): List[Char] = {

    list8 match {
      case ::(head, tail) => head :: eliminateConsecutiveDuplicatesOfListElements(tail.dropWhile(_ == head))
      case Nil => Nil
    }

  }

}
