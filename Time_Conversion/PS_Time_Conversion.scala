package Hackerrank
import scala.io.StdIn._

object PS_Time_Conversion {
  def main(args: Array[String]): Unit = {
    var s = readLine().split(":")
    val time = s(2).takeRight(2) == "PM"
    var hours = s(0).toInt
    if(time && hours != 12) {
      hours += 12
      s(0) = hours.toString
    } else if(!time && hours == 12) s(0) = "00"
    val result = s.mkString(":")
    println(result.substring(0, result.length -2))
  }
}
//%02d".format(h) to format integers for two digits