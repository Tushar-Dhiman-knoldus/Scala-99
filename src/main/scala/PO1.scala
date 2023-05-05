package com.knoldus.scala99
import scala.annotation.tailrec

// Find the last element in the list.

object PO1 extends App {

  private val list1 = List(1,2,3,4,5,6,7,8)
  println(FindLastElementOfTheList(list1))

  private def FindLastElementOfTheList(list1: List[Int]): Int = {

    @tailrec
    def helper(list1: List[Int]): Int = {

      list1 match {
        case ::(head, Nil) => head
        case _ :: tail => helper(tail)
        case Nil => 0
      }
    }
    helper(list1)
  }
}
