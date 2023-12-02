import utils.FileReader

class Trebuchet() {

  def recoverCalibrationValue(input: String): Int = {

    def rec(chars: List[Char], acc: Seq[String]): Seq[String] = {
      lazy val tail = chars.tail
      chars match {
        case Nil => acc
        case 'o' :: 'n' :: 'e' :: _               => rec(tail, acc :+ "1")
        case 't' :: 'w' :: 'o' :: _               => rec(tail, acc :+ "2")
        case 't' :: 'h' :: 'r' :: 'e' :: 'e' :: _ => rec(tail, acc :+ "3")
        case 'f' :: 'o' :: 'u' :: 'r' :: _        => rec(tail, acc :+ "4")
        case 'f' :: 'i' :: 'v' :: 'e' :: _        => rec(tail, acc :+ "5")
        case 's' :: 'i' :: 'x' :: _               => rec(tail, acc :+ "6")
        case 's' :: 'e' :: 'v' :: 'e' :: 'n' :: _ => rec(tail, acc :+ "7")
        case 'e' :: 'i' :: 'g' :: 'h' :: 't' :: _ => rec(tail, acc :+ "8")
        case 'n' :: 'i' :: 'n' :: 'e' :: _        => rec(tail, acc :+ "9")
        case head :: _ if head.isDigit            => rec(tail, acc :+ head.toString)
        case _                                    => rec(tail, acc)
      }
    }

    val digits: Seq[String] = rec(input.toList, Nil)
    Seq(digits.head, digits.last).mkString.toInt
  }

  def run(file: String): Int = {
    val lines: Seq[String] = FileReader.fileReader(file)
    lines.map(recoverCalibrationValue).sum
  }
}
