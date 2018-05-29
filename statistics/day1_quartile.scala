object Solution {

    def isEven(number: Int) = number % 2 == 0
    def isOdd(number: Int) = !isEven(number)

    def getMedian(arr: Array[Int]): Int={
        var n: Int = arr.size
         if(isEven(n)) {
            (arr(n/2-1) + arr(n/2))/2 //.toDouble
         }
         else {
            arr(n/2) //.toDouble
         }
    }

    def main(args: Array[String]) {
        var n: Int=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(1)(0)
        var arr: Array[Int]=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(n)
        scala.util.Sorting.quickSort(arr)
        
        println(getMedian(arr.slice(0, n/2)))

        println(getMedian(arr))

        if(isEven(n)) {
            println(getMedian(arr.slice(n/2, n)))
         }
        else {
            println(getMedian(arr.slice(n/2+1, n)))
         }
    }
}