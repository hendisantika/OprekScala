package com.hendisantika.oprek.basic

import java.text.SimpleDateFormat
import java.util.{Calendar, Date}

/**
  * Created by hendisantika on 05/12/16.
  */
object Tes1 {
  def main(args: Array[String]): Unit = {
    val words = List("alat vital", "alat bantu pasutri", "arabian capsule", "bbm:", "bbm :", "bugil", "cobra oil",
      "c0bra", "c0br4", "cobr4", "cobr@", " c0br@", "big long", "desahan", "ejakulasi", "ereksi", "impotensi", "jual", "k.l.g", "klg",
      "K-L-G", "lemah syahwat", "lemah syahwat", "lintah oil", "l1ntah", "lint4h", "lint@h", "l1nt4h", "l1nt@h", "l!nt@h",
      "l!ntah", "l!nt4h", "mr.P", "ob@t", "Ob4t", "0b@t", "0b∆t", "ob∆t", "obat kuat", "obat pasutri", "obat perangsang",
      "0bat kuat", "ob@t ku@t", "0b@t ku@t", "ongkos kirim", "payudara", "pills", "pill5", "pill$", "p1lls", "p1ll$",
      "p1ll5", "p!lls", "p!ll5", "p!ll$", "pin bbm", "pinbbm", "Pfizer", "bbm pin", "bbmpin", "shop", "toko", "vmax",
      "www", "Line", "bugil", "vc", "vcs", "cs", "open bo", "pap", "HAMMER", "klinik", "extender", "pembesar", "harmonis",
      "keras", "tahan lama", "viagra", "Via9ra", "vi49ra", "vi4gra", "V1MEX", "kosmetik", "wa", "phoneseks", "phonesex",
      "herbal", "membeli", "usa", "made in", "m4de in", "m4d3 in", "dildo", "vibrator", "boneka seks", "sex", "$ek$",
      "$ex", "kontol", "kont#l", "k0nt0l", "m3m3k", "memek", "m#mek", "lendir", "pascol", "bispak", "b1spak", "b1sp4k",
      "bisp4k", "perek", "p3rek", "p3r3k", "bokep", "b0kep", "b0k3p", "coli", "montok", "semok", "s3mok", "xxx",
      "Hand Job", "BJ", "blow job", "sepong", "oral", "Anal", "Job", "toket", "t0k3t", "t0ket", "tocil", "toge",
      "palkon", "meki", "m3kim3ki", "salmek", "salome", "s4lome", "s4l0me", "s4l0m3", "bulu", "jembut", "poker",
      "p0ker", "p0k3r", "judi", "jud1", "minyak", "miny4k", "m1ny4k", "bit.ly", "vimax", "izon", "capsul", "canada",
      "kapsul", "botol", "jual", "ju4l", "efek", "m3k1", "bola online", "instagram", "whatsapp", "jutaan rupiah", "YM",
      "yahoo messenger", "http", "jasa", "follower", "like", "l1ke", "l1k3", "koleksi", "k0leksi", "k0L3ksi", "yuk",
      "guys", "khusus dewasa", "perbotol", "free ongkir", "yuks", "suami", "add", "adult only", "4dult only", "bercinta",
      "b3rcinta", "b3rc1nt4", "minilove", "janda", "j4nda", "peninggi", "p3ninggi", "p3ningg1", "sange", "s4ange", "s4ng3",
      "sperma", "sp3rma", "sperm4", "kental", "k3ntal", "k3nt4l", "stamina", "impoten", "imp0t3n", "impot3n", "mr.p",
      "olshop", "olsh0p", "0lshop", "vitalitas", "vitalit4s", "v1talita$", "vit4l1t4$", "melayani", "m3layani", "mel4yani",
      "m3l4y4n1", "pemesanan", "p3mesanan", "p3m3s4n4n", "p3mes4n4n", "farma", "f4rma", "f4rm4", "ahongshoop", "web",
      "klg", "vacum", "big long", "proextender", "klg", "opiumspray", "blue wizard", "janam", "permen cinta", "stok",
      "stock", "ready", "r3ady", "r34dy", "naked", "bedak", "pussy", "pu$$y", "testimoni", "t3stimony", "t3$timoni",
      "t3$t1m0ni", "gairah", "g41r4h", "orgasme", "0rg4sme", "0rg4$m3", "sensasi", "s3nsasi", "s3ns4s1", "libido",
      "l1bido", "l1b1d0", "l1b1do", "hydromax", "permanen", "p3rmanen", "p3rm4n3n", "paket", "JNE", "Tiki", "Pos",
      "p0s", "p$", "toko", "t0k0", "kwalitas", "kontak", "invite", "invit3", "1nv1t3", "berurat", "s4ng3", "s4n6e",
      "crot", "bertarif", "croot", "crooot", "croooot", "dm", "nikmat", "kenikmatan", "fantasi", "terjamin", "real",
      "domisili", "pap", "privacy", "kesepian", "igo", "kimcil", "pemuas", "p3mu4as", "p3mu4a$", "pokerdomino",
      "domino", "d0m1n0", "domin0", "poker online", "qiu qiu", "fair play", "capsa", "c4psa", "c4ps4", "blackjack",
      "c4p$a", "c4p$4", "ceme", "c3m3", "manapoker", "member", "memb3r", "promo", "pr0m0", "jackpot", "j4ckp0t",
      "jackp0t", "jackp#t", "taruhan", "flush", "userid", "JAQKXXX", "diva", "divapoker", "agen", "bandar", "b4ndar",
      "b4nd4r", "referral", "menangkan", "JABONXXX", "rgopoker", "q-kick", "texas", "hotbet", "player", "bandar", "b4ndar",
      "b4nd4r", "pl4y3r", "anjing", "4nj1ng", "tai", "bangsat", "kancut", "persetan", "tolol", "goblog", "idiot", "kafir",
      "cina", "china", "fuck", "ngepet", "ngentot", "ngewe", "busuk", "bajingan", "bitch", "jancuk", "idiot", "antek",
      "yahudi", "iblis", "batak", "jawa", "sipit", "kolor", "sempak", "jancuk", "jancok", "jancook", "pantat",
      "dajal", "dadjal", "buta", "arab", "gantung", "onta", "unta", "fustun", "bodat", "bakar", "bunuh", "comberan",
      "kampret", "usir", "berengsek", "brengsek", "tembak", "biji", "peler", "asu", "mampus", "mapuss", "kampungan",
      "katro", "anak haram", "tukang kawin", "comberan", "busuk", "sampah", "potong", "bacot", "keledai", "modar",
      "usir", "binatang", "telaso", "sundala", "kongkong", "suntil", "grepe", "otak", "keparat", "pribumi",
      "menggulingkan", "monyet", "gila", "sarap", "saraf", "ahli neraka", "murtad", "bidah", "bid'ah", "halal darah",
      "gorok", "edan", "kerangkeng", "cincang", "jembut", "tokay", "tokai", "bau", "big promo", "togel", "cashback",
      "dating", "meki", "meqi", "selangkangan", "bedebah", "bazingan", "no tipu", "omdo", "serius only", "sabung",
      "biig", "asu", "cialis", "ewe", "buaya", "anjeng", "anjeeng", "cemek", "cebok", "bool", "pantat", "congek",
      "upil", "ingus", "congor", "pecun", "cangkem", "titit", "titid", "v.i.a.g.r.a", "coli", "gorilla", "gorila",
      "lutung", "udang", "curut", "got", "setan", "syetan", "tokai", "tokay", "007 f!lm", "x.x.x", "p0rn", "n3gara",
      "d3ngan", "g4mbar", "UNSENS0RED", "P3NYIMPANAN", "!nfo", "p3mesanan", "P3MESANAN", "H4RI", "IN1", "AD4", "PROMO00",
      "KHUSUSuy", "muncrat", "komunis", "getar", "penyubur", "buka dong say", "amoy", "doggy", "jablay", "jablai",
      "pelacur", "lucah", "blue film", "bluefilm", "divid", "dividi", "bagi yang mendaftar")

//    words.foreach { println }
//    for(line <- Source.fromFile("/home/hendisantika/Documents/mainspring/data_kerja/comments-service/SpamWords.csv").getLines())
//      print(s""""${line}"""" + ", ")

    val now = Calendar.getInstance().getTime
//    val currentMinute = now.get(Calendar.MINUTE)
    val waktu = System.currentTimeMillis()

    val sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    var tgl1 = new Date(System.currentTimeMillis())
    var tgl2 = sdf.format(tgl1)


//    println("Now : " + now)
//    println("currentMinute : " + java.time.LocalDate.now)
//    println("System.currentTimeMillis() : " + System.currentTimeMillis())
//    print("SADD x-spams ")
    for (i <- 0 until words.length) {
      println(s"${i+1};${words(i)}")
//      println(s"$i --> ${words(i)} ${waktu}")
//      println(s"${i + 1 }, ${words(i)}, ${tgl2}")
//      println(s""""${words(i)}"""")
//      print(s""""SADD x-spam "$words"""")
//      print(s""""${words(i)}"""" + " ") // Udah OK yg ini nich
//      print(s"SADD x-spams " + s""""${words(i)}"""" + " ") // But SADD ke Redis

    }
//    println("Jumlah Spam Words : " + words.length)


  }

}
