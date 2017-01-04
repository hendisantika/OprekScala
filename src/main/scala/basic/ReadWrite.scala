package basic

import java.io.{File, PrintWriter}
import java.text.{DecimalFormat, SimpleDateFormat}
import java.util.Date

import scala.io.Source

/**
  * Created by hendisantika on 08/12/16.
  */
object ReadWrite {
  def main(args: Array[String]): Unit = {
    val dateFormatter = new SimpleDateFormat("yyyyMMdd_HHmmss")
    val tgl1 = new Date()
    val tgl = dateFormatter.format(tgl1)
    val filename = "/home/hendisantika/Documents/mainspring/data_kerja/crawler/sql/mobil123_records.txt"

    val writer = new PrintWriter(new File("/home/hendisantika/Documents/mainspring/data_kerja/crawler/sql/mobil123_output_" + tgl + ".csv"))
    var i = 36050
    for (line <- Source.fromFile(new File(filename), "ISO-8859-1").getLines()) {
      writer.write(s""""${i + 1}"""" + "," + line+"\n")
      println(s""""${i + 1}"""" + "," + line)
      i += 1
    }
    writer.close()

  }

  def write2File(data: String) {

    val writer = new PrintWriter(new File("/home/hendisantika/Documents/testing/ThresholdOutput.txt"))

    writer.write(data)

    writer.close()

  }

  def readFile(filename: String): Unit = {
    var i = 0
    for (line <- Source.fromFile(new File(filename), "ISO-8859-1").getLines()) {
      println(s""""$i ${line}"""" + ", ")
      i += 1
    }
  }
}
