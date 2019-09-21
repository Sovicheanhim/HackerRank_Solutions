package Hackerrank
import scala.io.StdIn._

object PS_Birtday_Cake_Candles {
  def main(args: Array[String]): Unit = {
    val arr = readLine().split(" ").map(_.toInt)
    println(arr.count(_ == arr.max))
  }
}
