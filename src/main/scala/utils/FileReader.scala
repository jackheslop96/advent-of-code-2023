package utils

import scala.io.Source

object FileReader {

  def fileReader(file: String): Seq[String] = {
    val inputStream = getClass.getResourceAsStream(file)
    Source.fromInputStream(inputStream).getLines().toSeq
  }

}