import scala.collection.immutable.ListMap
object Solution {
    def getMean(arr: Array[Int]): Double={
        arr.sum.toDouble/arr.size
    }

    def getMode(arr: Array[Int]): Int={
        var map=arr.groupBy(identity).mapValues(_.size)
        ListMap(map.toSeq.sortWith(_._1 < _._1):_*).maxBy(_._2)._1
    }

    def getMedian(arr: Array[Int]): Double={
        var n: Int = arr.size
        if(n.toDouble/2 == n/2){
            (arr(n/2-1) + arr(n/2))/2.toDouble
        }
        else {
            arr(n/2).toDouble
        }
    }

    def main(args: Array[String]) {
        var n: Int=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(1)(0)
        var arr: Array[Int]=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(n)
        scala.util.Sorting.quickSort(arr)

        var mean: Double=getMean(arr)
        println(f"$mean%1.1f")

        var mediam: Double=getMedian(arr)
        println(f"$mediam%1.1f")

        var mode: Int =getMode(arr)
        println(mode)
    }
}

