object Solution {
    def constructArr(nums: Array[Int], frequencies: Array[Int]): Array[Int] = {
        var arr = new Array[Int](0)
        for(i <- 0 until nums.size) {
            for (j <-0 until frequencies(i)) {
                arr = arr :+ nums(i)
            }
        }  
        scala.util.Sorting.quickSort(arr)
         arr  
    }

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
        var nums: Array[Int]=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(n)
        var frequencies: Array[Int]=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(n)

        var arr: Array[Int] = constructArr(nums, frequencies)

        var Q1: Double = getMedian(arr.slice(0, arr.size/2))
        var Q3: Double = 0
   
        if(isEven(arr.size)) {
            Q3 = getMedian(arr.slice(arr.size/2, arr.size)) 
         }
        else {
            Q3 = getMedian(arr.slice(arr.size/2+1, arr.size))
         }
         
        //println(Q1)
        //println(Q3)
        var result: Double = Q3-Q1
         println(f"$result%1.1f")

    }
}