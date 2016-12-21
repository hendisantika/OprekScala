package com.hendisantika.oprek.basic

import java.text.DecimalFormat

/**
  * Created by hendisantika on 08/12/16.
  */
object Number {
  def main(args: Array[String]): Unit = {
    val bd: BigDecimal  = 9.78313E+2
    val long: Long  = bd.longValue()
    val formatter: DecimalFormat  = new DecimalFormat("0.0000000000")

    println("Hasilnya --> " + formatter.format(long))


    val value = "9.78313E+2"
    println(BigDecimal(value))


  }
}
