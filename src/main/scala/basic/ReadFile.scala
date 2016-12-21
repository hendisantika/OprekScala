package basic

import java.io.File

import scala.io.Source

/**
  * Created by hendisantika on 15/12/16.
  */
object ReadFile {
  def main(args: Array[String]): Unit = {
    val spamFile = "/home/hendisantika/Documents/testing/bayessianList_updated.txt"
    var i = 0
    val spamList = Source.fromFile(new File(spamFile), "ISO-8859-1").getLines.toList

    for (line <- Source.fromFile(spamFile).getLines())
      println(s""""${line}"""")
  }
}
