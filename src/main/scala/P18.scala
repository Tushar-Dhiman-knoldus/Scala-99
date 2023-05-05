package com.knoldus.scala99

import scala.annotation.tailrec

object P18 extends App {

  private def slice(startIndex: Int, lastIndex: Int, list: List[Char]): List[Char] = {

    @tailrec
    def helper(number: Int, startIndex: Int, lastIndex: Int, list: List[Char], newList: List[Char]): List[Char] = {
      list match {
        case ::(head, tail) =>
          if (number < startIndex) {
            helper(number + 1, startIndex, lastIndex, tail, newList)
          }
          else {
            if (number != lastIndex)
              helper(number + 1, startIndex, lastIndex, tail, newList :+ head)
            else {
              newList
            }
          }
        case Nil => newList
      }
    }
    helper(0, startIndex, lastIndex, list, List())
  }
  println(slice(4, 7, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
}
