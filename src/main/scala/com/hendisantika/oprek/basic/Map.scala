/**
  * Created by hendisantika on 09/12/16.
  */
object Map {
  def main(args: Array[String]): Unit = {
    val komenList = Seq(
      "3;Ujung Ujungnya Duit...;0.125",
      "7;Produk No.1 di DUNIA RASAKAN KHASIATNYA MAKSIMAL HANYA DALAM 15 HARI!!!;4,88E+03",
      "37;Harus berimbang beritanya Be jgn itu lagi itu lagi bosan;9,77E+02"
    )

    val a = komenList map { komen =>
      val splitted = komen.split(";")

      (splitted(0), splitted(1), splitted(2).replace(",", "."))
    }

    a foreach {
      case (no, text, amt) => println(s"${no} | ${text} | ${amt}")
    }
  }
}
