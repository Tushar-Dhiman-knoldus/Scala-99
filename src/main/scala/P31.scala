package com.knoldus.scala99

import org.slf4j.{Logger, LoggerFactory}

import scala.annotation.tailrec


object P31 extends App {

  private val logger: Logger = LoggerFactory.getLogger(getClass)

  private def isPrime(number: Int): Boolean = {

    @tailrec
    def helper(number: Int, counter: Int, flag: Int): Boolean = {

      if (counter != 1) {
        if (number % counter == 0) {
          logger.info(s"$flag")
          helper(number, counter - 1, flag + 1)
        } else {
          helper(number, counter - 1, flag)
        }
      } else {
        if (flag <= 1) true else false
      }
    }

    helper(number, number, 0)
  }

  println(isPrime(13))
}
