package com.knoldus.scala99

import scala.annotation.tailrec

// find the kth element in the list.

object PO3 extends App {

  private val list3 = List()
  println(findKthElement(list3,5))

  @tailrec
  private def findKthElement[T](list: List[T], index: Int): Any = list match {
    case head :: _ if(index == 1) => head
    case ::(_, tail) => findKthElement(tail, index-1)
    case Nil => throw new Exception()
  }


}
