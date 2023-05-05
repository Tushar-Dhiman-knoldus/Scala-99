package com.knoldus.scala99

import scala.annotation.tailrec

object P20 extends App {

  private def removeAt(index: Int, list: List[Char]): (List[Char], Char) = {

    @tailrec
    def helper(element: Char, counter: Int, index: Int, list: List[Char], newList: List[Char]): (List[Char], Char) = {

      list match {
        case ::(head, tail) =>
          if (counter < index || counter > index ) {
            helper(element, counter + 1, index, tail, newList :+ head)
          }
          else{
            helper(head, counter + 1, index, tail, newList)
          }
        case Nil => (newList, element)
      }
    }
    helper(' ', 0, index, list, List())
  }
  println(removeAt(2, List('a', 'b', 'c', 'd')))

}
