package basic

/**
  * Created by hendisantika on 08/12/16.
  */
object CSVDemo {
  def main(args: Array[String]): Unit = {
//    val bufferedSource = io.Source.fromFile("/home/hendisantika/Documents/mainspring/data_kerja/comments-service/SpamWords.csv")
//    var filename =
    val bufferedSource = io.Source.fromFile("/home/hendisantika/Documents/testing/HasilBayes.csv")
    for (line <- bufferedSource.getLines) {
      val cols = line.split('|').map(_.trim)
      // do whatever you want with the columns here
//      print(s""""""${cols(0)}""""""")
//      println(s"${cols(0)}|${cols(1)}|${cols(2)}")
      println(s"${cols(0)}|${cols(1)}|${cols(2)}")
    }
    bufferedSource.close

  }
}
