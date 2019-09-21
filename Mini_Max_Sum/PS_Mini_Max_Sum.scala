package Hackerrank

object PS_Mini_Max_Sum {
  def main(args: Array[String]): Unit = {
    val arr = scala.io.StdIn.readLine().split(" ").map(_.trim.toLong)
    println(s"${arr.sum - arr.max} ${arr.sum - arr.min}")
  }
}
