package com.knoldus.scala99

import scala.annotation.tailrec

object P15 extends App {

  private def duplicateN(fixedSize: Int, list: List[Char]): List[Char] = {

    @tailrec
    def helper(size: Int, list: List[Char], newList: List[Char]): List[Char] = {

      list match {
        case ::(head, tail) =>
          if (size != 0) {
            helper(size - 1, list, newList :+ head)
          }
          else {
            helper(fixedSize, tail, newList)
          }
        case Nil => newList
      }
    }
    helper(fixedSize, list, List())
  }

  println(duplicateN(3, List('a', 'b', 'c', 'c', 'd')))

}
