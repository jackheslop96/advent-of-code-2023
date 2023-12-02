import day01.Trebuchet
import day02.CubeConundrum

object Main extends App {

  //day 01
  val day01 = new Trebuchet()
  println(s"Day 1: ${day01.run("/day01-input.txt")}")

  //day 02
  val day02 = new CubeConundrum()
  println(s"Day 2 part 1: ${day02.runPart1("/day02-input.txt")}")
  println(s"Day 2 part 2: ${day02.runPart2("/day02-input.txt")}")
}