package basic

import scala.util.Random

/**
  * Created by hendisantika on 07/12/16.
  */
object JSONLike {
  case class Data(word: String, created: Long)

  def main(args: Array[String]): Unit = {
    val lstAwal = 1 to 10 map (i => Data("Word 1", Random.nextLong))

    println("List Awal")
    lstAwal.map(println)

    val lstAkhir = lstAwal.zipWithIndex.map {
      case (data, index) => {
        val w = data.word.split(" ").headOption.getOrElse("")
        Data(s"$w ${index+1}", data.created)
      }
    }

    println("--------------")

    println("List Akhir")
    lstAkhir.map(println)


    println("--------------")
    println("Convert List to Map Example")
    val lst = List("a", "b", "c")
    val m = lst.map(l => s"$l-key" -> l).toMap

    println(m)
  }


}
