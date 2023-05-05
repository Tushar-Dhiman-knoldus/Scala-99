package com.knoldus.scala99

import scala.annotation.tailrec


// Reverse The list

object PO5 extends App{

  private val list5 = List(1,2,3,4,5,6,7,8)
  println(reverseTheList(list5))

  private def reverseTheList(list: List[Int]): List[Int]={

    list match {
      case ::(head, tail) => reverseTheList(tail) ::: List(head)
      case _ :: Nil => list
      case Nil => list
    }
  }
}
