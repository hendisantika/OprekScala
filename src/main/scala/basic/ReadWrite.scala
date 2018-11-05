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
      //      writer.write(s""""${i + 1}"""" + "," + line+"\n")
      //      writer.write(s"${i + 1}, $line\n")
      val cols = line.split(',').map(_.trim)
      writer.write(s"${i + 1},${cols(0)},${cols(1)},${cols(2)},${cols(3)},${cols(4)},${cols(5)},${cols(6)},${cols(7)},${cols(8)}," +
        s"${cols(9)},${cols(10)},${cols(11)},${cols(12)},${cols(13)},${cols(14)},${cols(15)},${cols(16)},${cols(17)}${cols(18)}," +
        s"${cols(19)},${cols(20)},${cols(21)},${cols(22)},${cols(23)},${cols(24)},${cols(25)},0,${cols(27)}\n")

      println(s"${i + 1}, ${cols(0)},${cols(1)},${cols(2)},${cols(3)},${cols(4)},${cols(5)},${cols(6)},${cols(7)},${cols(8)}," +
        s"${cols(9)},${cols(10)},${cols(11)},${cols(12)},${cols(13)},${cols(14)},${cols(15)},${cols(16)},${cols(17)}${cols(18)}," +
        s"${cols(19)},${cols(20)},${cols(21)},${cols(22)},${cols(23)},${cols(24)},${cols(25)},0,${cols(27)}\n")
      i += 1
    }
    writer.close()
    println("Bereszzzs ....!")

  }


}
