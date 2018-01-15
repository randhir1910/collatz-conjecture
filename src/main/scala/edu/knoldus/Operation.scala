package edu.knoldus

class Operation {
  def innerCall(list: List[Int], result: Int): List[Int] = {
    list match {
      case _ if result == 1 => list
      case _ if result % 2 == 0 => innerCall((result / 2) :: list, result / 2)
      case _ if result % 2 == 1 => innerCall(((3 * result + 1) / 2) :: list, (3 * result + 1) / 2)
    }
  }
}
