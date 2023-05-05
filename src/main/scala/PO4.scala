package com.knoldus.scala99
import scala.annotation.tailrec

// Find the number of elements of the list.
object PO4 extends App {

  private val list4 = List(1,2,3,4,5,6,7,8)
  println(lengthOfTheList(list4,0))

  @tailrec
  private def lengthOfTheList(list: List[Int], accumulator: Int): Int = {

    list match {
      case ::(_, tail) => lengthOfTheList(tail,accumulator + 1)
      case _ :: Nil => accumulator + 1
      case Nil => accumulator
    }
  }
}
