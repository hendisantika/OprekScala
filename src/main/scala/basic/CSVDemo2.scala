package basic

import java.io.File

import scala.io.Source

/**
  * Created by hendisantika on 08/12/16.
  */
object CSVDemo2 {
  def main(args: Array[String]): Unit = {
        val filename = "/home/hendisantika/Documents/testing/commentData2.txt"
//    val filename = "/home/hendisantika/Documents/testing/HasilBayes.csv"
    readFile3(filename)
  }

  def readFile3(filename: String): Unit ={
    var i = 0
    for (line <- Source.fromFile(new File(filename), "ISO-8859-1").getLines()) {
//      println(line)
      println(s""""$i ${line}"""" + ", ")
    i +=1
    }
  }

  def readFile(filename: String): Unit ={
    for (line <- Source.fromFile(filename).getLines) {
      println(line)
    }
  }

  def  readFile2(filename: String): Unit ={
    for (line <- Source.fromFile(filename).getLines())
    //          println(s""""${line}"""" + ", ")
      println(line)
    //          {
    //            val a = line.replaceAll(""", "")
    //            println(a)
    //          }
  }


  def readCSV(): Array[Array[Double]] = {
    io.Source.fromFile("/home/hendisantika/Documents/mainspring/data_kerja/comments-service/SpamWords.csv")
      .getLines()
      .map(_.split("").map(_.trim.toDouble))
      .toArray
  }
}
