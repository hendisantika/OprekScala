package com.hendisantika.oprek.basic

/**
  * Created by hendisantika on 06/12/16.
  */
object StringMultiline {
  def main(args: Array[String]): Unit = {
    val body =
          """
              {
                 "words": "Angka",
                 "created": 1481020791
              }
          """

    val rawJson = """{"words": "Angka", "created": 1481020791}"""
    val angka = List(1,2,3,4,5)

    for (i <- 0 until angka.length) {
      println(s"$i --> ${angka(i)}")
    }

    println(rawJson)
  }
}
