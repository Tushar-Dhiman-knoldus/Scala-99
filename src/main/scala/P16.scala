package com.knoldus.scala99

import scala.annotation.tailrec

object P16 extends App {

  private def dropElement(fixedSize: Int, list: List[Char]): List[Char] = {

    @tailrec
    def helper(size: Int, list: List[Char], newList: List[Char]): List[Char] = {

      list match {
        case ::(head, tail) =>
          if (size != 1)
            helper(size - 1, tail, newList :+ head)
          else {
            helper(fixedSize, tail, newList)
          }
        case Nil => newList
      }
    }

    helper(3, list, List())
  }

  println(dropElement(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))

}
