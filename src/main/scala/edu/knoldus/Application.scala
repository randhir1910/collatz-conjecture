package edu.knoldus

import org.apache.log4j.Logger

object Application extends App {
  val log = Logger.getLogger(this.getClass)
  val operation = new Operation
  var list: List[Int] = List.empty
  for (x <- 2 to 10) {
    val tempList: List[Int] = operation.innerCall(list, x)
    list = tempList
  }
  log.info(list)
}
