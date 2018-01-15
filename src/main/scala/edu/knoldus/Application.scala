package edu.knoldus

import org.apache.log4j.Logger

object Application extends App {
  val log = Logger.getLogger(this.getClass)
  val operation = new Operation
  val number = 64
  val series = operation.innerCall(List(1,4,8,9,12,16), number)
  log.info(series)
}
