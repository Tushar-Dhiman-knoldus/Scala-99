package com.knoldus.scala99

import scala.annotation.tailrec

// Find the second last element in the list.
object PO2 extends App {

  private val list2 = List(1,2,3,4,5,6,7,8)
  println(secondLastElement(list2))

  private def secondLastElement[T](list2:List[T]): Any = {

    @tailrec
    def helper(list2: List[T]): Any ={

      list2 match {
        case secondToLast :: _ :: Nil => secondToLast
        case _ :: _ :: tail => helper(tail)
        case Nil => "List is empty"
      }

    }
    helper(list2)
  }
}
