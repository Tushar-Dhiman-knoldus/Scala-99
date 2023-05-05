package com.knoldus.scala99

import scala.annotation.tailrec

object P22 extends App {

  def range(startIndex: Int, lastIndex: Int): List[Int] = {

    @tailrec
    def helper(startIndex: Int, lastIndex: Int, list: List[Int]): List[Int] = {

      if (startIndex <= lastIndex) {
        helper(startIndex + 1, lastIndex, list :+ startIndex)
      }
      else {
        list
      }
    }

    helper(startIndex, lastIndex, List())
  }

  println(range(4, 9))

}
