object Solution {
    def main(args: Array[String]) {
        var n: Int=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(1)(0)
        var strs: Array[Int]=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(n)
        println(strs.groupBy(identity).mapValues(_.size).minBy(_._2)._1)
    }
}