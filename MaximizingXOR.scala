object Solution {
        
    def maximizingXor(l: Int, r: Int): Int= {
        var result: Int=0

        for(a <- l until r+1) {
            for(b <- a until r+1) {
    
                if (result< (a ^ b)){
                    result=(a ^ b)
                }
            }
        }

        result
    }

    def main(args: Array[String]) {
        var l: Int=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(1)(0)
        var r: Int=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(1)(0)

        var result: Int=maximizingXor(l,r)
        println(result)
    }
}


