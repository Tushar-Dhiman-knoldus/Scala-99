package com.knoldus.scala99

// Find out whether a list is a palindrome.
object PO6 extends App {

  private val list6 = List(1, 2, 3, 3, 3)
  private val reversedList = reverseList(list6)
  private val originalList = List(1, 2, 3, 2, 1)

  private def reverseList(list6: List[Int]): List[Int] = {

    list6 match {
      case ::(head, tail) => reverseList(tail) ::: List(head)
      case Nil => list6
    }
  }
  println("originalList:- " + originalList)
  println("Reversed list:- " + reversedList)
  println(originalList == reversedList)


}
