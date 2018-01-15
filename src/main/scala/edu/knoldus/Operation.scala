package edu.knoldus

class Operation {
  def innerCall(list: List[Int], result: Int): List[Int] = {

    def contain(list: List[Int], res: Int): Boolean = {
      list match {
        case Nil => false
        case head :: tail if head == res => true
        case head :: tail => contain(tail, res)
      }
    }

    list match {
      case _ if result == 1 => list
      case _ if result % 2 == 0 && contain(list, result / 2) == false => innerCall((result / 2) :: list, result / 2)
      case _ if result % 2 == 1 && contain(list, (3 * result + 1)) == false => innerCall(((3 * result + 1)) :: list, (3 * result + 1))
      case _ => list
    }
  }
}
