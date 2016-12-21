import java.io.{BufferedWriter, FileWriter}

import com.github.tototoshi.csv.CSVWriter

/**
  * Created by hendisantika on 05/12/16.
  */
object csvwrite extends App {
  val out = new BufferedWriter(new FileWriter("/home/hendisantika/Documents/testing/employee.csv"));
  val writer = new CSVWriter(out);
  val employeeSchema = Array("name", "age", "dept")

  val employee1 = Array("piyush", "23", "computerscience")

  val employee2 = Array("neel", "24", "computerscience")

  val employee3 = Array("aayush", "27", "computerscience")

  var listOfRecords = List(employeeSchema, employee1, employee2, employee3)

//  writer.writeAll(listOfRecords)
  out.close()
}
