object Solution {

    def getWeigthMean(nums: Array[Int], weigths: Array[Int]): Double = {
        var total_num: Int=0
        var total_weight: Int=0

        for(i <- 0 until nums.size) {
            total_weight = total_weight + weigths(i)
            total_num = total_num + nums(i) * weigths(i)
        }
        total_num.toDouble/total_weight
    }

    def main(args: Array[String]) {
        var n: Int=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(1)(0)
        var nums: Array[Int]=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(n)
        var weigths: Array[Int]=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(n)

        var result: Double = getWeigthMean(nums, weigths)
        println(f"$result%.1f")

        
    }
}
