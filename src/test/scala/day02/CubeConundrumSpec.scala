package day02

class CubeConundrumSpec extends munit.FunSuite {

  test("score returns 1 for game 1") {
    val cubeConundrum = new CubeConundrum()
    val result = cubeConundrum.score("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green")
    assertEquals(result, 1)
  }

  test("score returns 2 for game 2") {
    val cubeConundrum = new CubeConundrum()
    val result = cubeConundrum.score("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue")
    assertEquals(result, 2)
  }

  test("score returns 0 for game 3") {
    val cubeConundrum = new CubeConundrum()
    val result = cubeConundrum.score("Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red")
    assertEquals(result, 0)
  }

  test("score returns 0 for game 4") {
    val cubeConundrum = new CubeConundrum()
    val result = cubeConundrum.score("Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red")
    assertEquals(result, 0)
  }

  test("score returns 5 for game 5") {
    val cubeConundrum = new CubeConundrum()
    val result = cubeConundrum.score("Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green")
    assertEquals(result, 5)
  }

  test("power returns 36 for game 5") {
    val cubeConundrum = new CubeConundrum()
    val result = cubeConundrum.power("Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green")
    assertEquals(result, 36)
  }

  test("run part 1 test input returns 8") {
    val cubeConundrum = new CubeConundrum()
    val result = cubeConundrum.runPart1("/day02-test-input.txt")
    assertEquals(result, 8)
  }

  test("run part 2 test input returns 2286") {
    val cubeConundrum = new CubeConundrum()
    val result = cubeConundrum.runPart2("/day02-test-input.txt")
    assertEquals(result, 2286)
  }
}