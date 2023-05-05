package com.knoldus.scala99

import scala.annotation.tailrec

object P21 extends App {

  def insertAt(newElement: Char, position: Int, list: List[Char]): List[Char] = {

    @tailrec
    def helper(newElement: Char, currentPosition: Int, list: List[Char], newList: List[Char]): List[Char] = {

      list match {
        case ::(head, tail) =>
          if (currentPosition == position) {
            helper(newElement, currentPosition + 1, tail, newList :+ newElement)
          }
          else {
            helper(newElement, currentPosition + 1, tail, newList :+ head)
          }
        case Nil => newList
      }

    }

    helper(newElement, 0, list,List())
  }

  println(insertAt('z', 2, List('a', 'b', 'c', 'd')))

}
