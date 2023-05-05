package com.knoldus.scala99

import scala.annotation.tailrec

object P17 extends App {

  private def split(size: Int, list: List[Char]): (List[Char], List[Char]) = {

    @tailrec
    def helper(size: Int, list: List[Char], firstList: List[Char], secondList: List[Char]): (List[Char], List[Char]) = {

      list match {
        case ::(head, tail) =>
          if (size != 0) {
            helper(size - 1, list.drop(1), firstList :+ head, tail)
          } else {
            (firstList, secondList)
          }
        case Nil => (firstList, secondList)
      }
    }

    helper(size, list, List(), List())
  }

  println(split(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))


}
