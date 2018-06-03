object Solution {
    def getMean(nums: Array[Int]): Double = {
        nums.sum.toDouble/nums.size
    }
    def getMinus(num: Int, mean: Double): Double = {
        (num-mean) * (num-mean) 
    }

    def getStandardDeviation(nums: Array[Int]): Double = {
        var mean: Double=getMean(nums)
        math.sqrt(nums.map(getMinus(_, mean)).sum/nums.size)
    }

    def main(args: Array[String]) {
        var n: Int=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(1)(0)
        var nums: Array[Int]=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(n)

        var result: Double = getStandardDeviation(nums)
        println(f"$result%.1f")
        

    }
    
}