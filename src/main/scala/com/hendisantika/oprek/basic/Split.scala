package com.hendisantika.oprek.basic

/**
  * Created by hendisantika on 06/12/16.
  */
object Split {
  def main(args: Array[String]): Unit = {
    val word = "x-spam:7"
    val result = word.split("x-spam:")

    // Array length.
    println("Hasilnya : " + result.length)

    // Print all elements in array.
//    for (v <- result) { println(v) }

    val result2 = result(1)
    println("Hasil split  kedua : " + result2)
  }
}
