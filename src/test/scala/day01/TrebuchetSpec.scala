package day01

class TrebuchetSpec extends munit.FunSuite {

  test("1abc2 returns 12") {
    val trebuchet = new Trebuchet()
    val result = trebuchet.recoverCalibrationValue("1abc2")
    assertEquals(result, 12)
  }

  test("pqr3stu8vwx returns 38") {
    val trebuchet = new Trebuchet()
    val result = trebuchet.recoverCalibrationValue("pqr3stu8vwx")
    assertEquals(result, 38)
  }

  test("a1b2c3d4e5f returns 15") {
    val trebuchet = new Trebuchet()
    val result = trebuchet.recoverCalibrationValue("a1b2c3d4e5f")
    assertEquals(result, 15)
  }

  test("part 1 test input returns 142") {
    val trebuchet = new Trebuchet()
    val result = trebuchet.run("/day01-part1-test-input.txt")
    assertEquals(result, 142)
  }

  test("two1nine returns 29") {
    val trebuchet = new Trebuchet()
    val result = trebuchet.recoverCalibrationValue("two1nine")
    assertEquals(result, 29)
  }

  test("eightwothree returns 83") {
    val trebuchet = new Trebuchet()
    val result = trebuchet.recoverCalibrationValue("eightwothree")
    assertEquals(result, 83)
  }

  test("abcone2threexyz returns 13") {
    val trebuchet = new Trebuchet()
    val result = trebuchet.recoverCalibrationValue("abcone2threexyz")
    assertEquals(result, 13)
  }

  test("xtwone3four returns 24") {
    val trebuchet = new Trebuchet()
    val result = trebuchet.recoverCalibrationValue("xtwone3four")
    assertEquals(result, 24)
  }

  test("4nineeightseven2 returns 42") {
    val trebuchet = new Trebuchet()
    val result = trebuchet.recoverCalibrationValue("4nineeightseven2")
    assertEquals(result, 42)
  }

  test("zoneight234 returns 14") {
    val trebuchet = new Trebuchet()
    val result = trebuchet.recoverCalibrationValue("zoneight234")
    assertEquals(result, 14)
  }

  test("7pqrstsixteen returns 76") {
    val trebuchet = new Trebuchet()
    val result = trebuchet.recoverCalibrationValue("7pqrstsixteen")
    assertEquals(result, 76)
  }

  test("fzrpfhbfvj6dbxbtfs7twofksfbshrzkdeightwoqg returns 62") {
    val trebuchet = new Trebuchet()
    val result = trebuchet.recoverCalibrationValue("fzrpfhbfvj6dbxbtfs7twofksfbshrzkdeightwoqg")
    assertEquals(result, 62)
  }

  test("part 2 test input returns 281") {
    val trebuchet = new Trebuchet()
    val result = trebuchet.run("/day01-part2-test-input.txt")
    assertEquals(result, 281)
  }
}
