package basic

import java.io.{File, PrintWriter}
import java.text.SimpleDateFormat
import java.util.Date

import scala.io.Source

/**
  * Created by hendisantika on 15/12/16.
  */
object ReadFile {
  def main(args: Array[String]): Unit = {
    val dateFormatter = new SimpleDateFormat("yyyyMMdd_HHmmss")
    var tgl1 = new Date()
    var tgl2 = dateFormatter.format(tgl1)

    val spamFile = "/home/hendisantika/Documents/testing/komen/PureComments.csv"
    val writer = new PrintWriter(new File("/home/hendisantika/Documents/testing/komen/ResultNetral_" + tgl2 + ".txt"))

    var i = 0
    val spamList = Source.fromFile(new File(spamFile), "ISO-8859-1").getLines.toList

    val reg = List("JUαL  : \" V1∆GR∆ Pfizer USA \" 100mg \\n\\n  LOGO \" KUDA BOLA API \" ORIGINAL\\n\\n    SPECIAL : TABLET DOBEL FUNGSI\\n\\n    081ZZ5177751    /bm.  5e 69 44 67\\n\\n                KUAT & TAHAN LAM\\n\\n         Menmbah panjang & besar PENY\\n\\n    AKSESORIES  & ALAT BANTU LENGKAP !\\n\\n                 GRATIS ONGKIR",
      "HA♏MER OF THOR\"ObaT H3rbal D3W@S4 DIJAMIN mr.P ANDA \\nJd BESAR&PANJANG SCARA ALAMI WLPN\\nUMUR DIATAS 60th.\\nSedia=\\n\\n-Pen9ent4l sp3rm@\\n-0bat ku4t than l4ma\\n-a1at bantu s3kt0y\\n-p3r@ngs4n9\\n-celana hernia\\n-p3mb3s@r p4yud@r4\\n-Dll\\n\\nPin:D659EDC7\\nNo.W/A:o8.21.3tujuh 01.0078\\n\\nKami membantu SOLUSI KELUARGA ANDA"
    )
//    for (line <- Source.fromFile(spamFile).getLines()) {
      //      println(s""""${line}"""")
      //      val cols = line.split(';').map(_.trim)
//      val cols = line.replaceAll("regex", "")
//      writer.write(s"$cols\n")
      //      println(s"${i + 1} $cols")
//      i += 1
//    }
//    println("Rebezz ...!")
//    writer.close()

    readFile(spamFile)

  }


  def readFile(filename: String): Unit = {
    var i = 0
    val writer = new PrintWriter(new File("/home/hendisantika/Documents/testing/komen/ResultNetral2txt"))
    val spam = List(
      "JUαL  : \" V1∆GR∆ Pfizer USA \" 100mg \\n\\n  LOGO \" KUDA BOLA API \" ORIGINAL\\n\\n    SPECIAL : TABLET DOBEL FUNGSI\\n\\n    081ZZ5177751    /bm.  5e 69 44 67\\n\\n                KUAT & TAHAN LAM\\n\\n         Menmbah panjang & besar PENY\\n\\n    AKSESORIES  & ALAT BANTU LENGKAP !\\n\\n                 GRATIS ONGKIR",
      "HA♏MER OF THOR\"ObaT H3rbal D3W@S4 DIJAMIN mr.P ANDA \\nJd BESAR&PANJANG SCARA ALAMI WLPN\\nUMUR DIATAS 60th.\\nSedia=\\n\\n-Pen9ent4l sp3rm@\\n-0bat ku4t than l4ma\\n-a1at bantu s3kt0y\\n-p3r@ngs4n9\\n-celana hernia\\n-p3mb3s@r p4yud@r4\\n-Dll\\n\\nPin:D659EDC7\\nNo.W/A:o8.21.3tujuh 01.0078\\n\\nKami membantu SOLUSI KELUARGA ANDA",
      "\"Klinik--Harmonis\\nHp. O81 ²² 584 ²² 33  Pin. ².A.6.C.9.9.8.3\\n● AKSESORIES (alat bantu sektoys)\\n● V1.GRA 100.mg FLIZER U.$.A\\nC0SMET1K KECANT1KAN LENGKAP\\nbesar-panjang-vital I-IAMMER 0F TH0R\\nPERMEN PRANGSANG WNITA FRIGIT\\nalat terapi vital : VACUUM BIG L0NG\\nANEKA CONDOM BERDURI SILIKON\\nterlengkap.\""
    )


    for (line <- Source.fromFile(filename).getLines()) {
      val cols = io.Source.fromFile(filename).getLines
        .filter(s => !(s contains spam)).mkString("\n")
      i += 1
    }
    println("Rebezz ...!")
//    writer.close()
  }

}
