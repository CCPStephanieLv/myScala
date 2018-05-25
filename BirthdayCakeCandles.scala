object Solution {
    def main(args: Array[String]) {
        var n: Int=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(1)(0)
        var nums: Array[BigInt]=scala.io.StdIn.readLine().split(" ").map(_.trim).map(BigInt(_)).take(n)
        var max_num: BigInt=nums.reduceLeft(_ max _)
        println(nums.filter(x => (x == max_num)).size)
    }
}