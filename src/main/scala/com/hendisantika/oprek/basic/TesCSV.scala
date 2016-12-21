package com.hendisantika.oprek.basic

import java.io.File

import com.github.tototoshi.csv.CSVReader

/**
  * Created by hendisantika on 05/12/16.
  */

object TesCSV {
  def main(args: Array[String]): Unit = {
//    val reader = CSVReader.open(new File("/home/hendisantika/Documents/testing/tes.csv"))
    val reader = CSVReader.open(new File("/home/hendisantika/Documents/mainspring/data_kerja/comments-service/SpamWords.csv"))
    reader.all()
    reader.close()
    reader.foreach { println }

  }
}
