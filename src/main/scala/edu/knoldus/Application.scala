package edu.knoldus

import org.apache.log4j.Logger

object Application extends App {
  val log = Logger.getLogger(this.getClass)
  val operation = new Operation
  val number = 97
  val series = operation.innerCall(List(), number)
  log.info(series)
}
