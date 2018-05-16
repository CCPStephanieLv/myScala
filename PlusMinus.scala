object Solution {

    def plusMinus(arr: Array[Int]) {
        var p: Float=0
        var n: Float=0
        var z: Float=0

        for(i <- 0 until arr.size){
            arr(i) compare 0 match {
                case 0 => z=z+1 // equal
                case 1 => p=p+1 // larger than
                case -1 => n=n+1 // less than
            }
        }
        println(p/arr.size)
        println(n/arr.size)
        println(z/arr.size)
    }

   
    def main(args: Array[String]) {
        var x = scala.io.StdIn.readInt()
        var intSet =scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(x)
        plusMinus(intSet)

    }
}