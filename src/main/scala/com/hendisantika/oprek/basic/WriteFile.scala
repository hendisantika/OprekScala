package com.hendisantika.oprek.basic

import java.io.{File, PrintWriter}

/**
  * Created by hendisantika on 09/12/16.
  */
object WriteFile {
  def main(args: Array[String]) {

    val writer = new PrintWriter(new File("output.txt"))
    writer.write("Hello, world!")
    writer.close()

  }
}
