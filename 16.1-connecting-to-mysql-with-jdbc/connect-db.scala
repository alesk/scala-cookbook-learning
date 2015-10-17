package tests

import java.sql.{Connection, DriverManager}

object ConnectDb extends App {
  
  val url = "jdbc:postgresql://localhost/paglia"
  val driver = "org.postgresql.Driver"
  
  var connection:Connection = _

  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url)
    val statement = connection.createStatement
    val rs = statement.executeQuery("SELECT city, country_id from city ")

    while(rs.next) {
      val city = rs.getString("city")
      val country_id = rs.getInt("country_id")
      println(s"Task id = $city from $country_id.")
    }
  } catch {
    case e: Exception => e.printStackTrace
  }

  connection.close
}
