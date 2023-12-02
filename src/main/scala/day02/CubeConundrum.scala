package day02

import utils.FileReader

class CubeConundrum {

  private val ballPattern = "(\\d+) (.+)".r
  private val gamePattern = "Game (\\d+): (.+)".r

  private def getAll(handfuls: String): Array[String] =
    handfuls
      .split("; ")
      .flatMap(_.split(", "))

  def score(game: String): Int = game match {
    case gamePattern(id, handfuls) =>
      val isPossible = getAll(handfuls)
        .forall {
          case ballPattern(numberOfBalls, "blue")  => numberOfBalls.toInt <= 14
          case ballPattern(numberOfBalls, "green") => numberOfBalls.toInt <= 13
          case ballPattern(numberOfBalls, "red")   => numberOfBalls.toInt <= 12
          case _ => false
        }

      if (isPossible) id.toInt else 0
  }

  def power(game: String): Int = game match {
    case gamePattern(_, handfuls) =>
      getAll(handfuls)
        .map {
          case ballPattern(numberOfBalls, colour) => colour -> numberOfBalls.toInt
        }
        .groupBy(_._1)
        .map {
          case (colour, tuples) => colour -> tuples.map(_._2).max
        }
        .values
        .product
  }

  def runPart1(file: String): Int = {
    val lines: Seq[String] = FileReader.fileReader(file)
    lines.map(score).sum
  }

  def runPart2(file: String): Int = {
    val lines: Seq[String] = FileReader.fileReader(file)
    lines.map(power).sum
  }
}