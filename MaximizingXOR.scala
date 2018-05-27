object Solution {
    /*
    def elementXor(t:(Int, Int)): Int= {
        t match {
                    case a if (t._1 == t._2) => 0
                    case b if (t._1 != t._2) => 1
                } 
    }

    def pairXor(a: Array[Int], b: Array[Int]): Int={
        var arr: Array[(Int, Int)]=a zip b
        var result: String=""

        for (e <- arr) {
            result = result + elementXor(e).toString
        }
        
        Integer.parseInt(result, 2)
    }

    def formatBinaryString(i: Int): Array[Int] = {
        var fString: String="0000000000" + i.toBinaryString
        fString.substring(fString.length-10, fString.length).split("").map(_.toInt)
    }

    def maximizingXor(l: Int, r: Int): Int=
     {
        var n: Int=((r-l+1)*(r-l+1)+(r-l+1))/2
        var results = new Array[Int](n)

        for(a <- l until r+1) {
            for(b <- l until r+1) {
                results = results :+ pairXor(formatBinaryString(a), formatBinaryString(b))
            }
        }

        results.reduceLeft(_ max _)
    }
    */

        
    def maximizingXor(l: Int, r: Int): Int= {
        var n: Int=((r-l+1)*(r-l+1)+(r-l+1))/2
        var results = new Array[Int](n)
        var result: Int=0

        for(a <- l until r+1) {
            for(b <- a until r+1) {
                if(a != b) {
                    result = (a ^ b)
                    if (!results.contains(result)) {
                        results = results :+ result
                    }
                    
                    //println(a.toString + ";  "+ b.toString + "; total:;  " + (a+b).toString+"; result:; " + (a ^ b).toString)
                }
            }
        }

        results.reduceLeft(_ max _)
    }

    def main(args: Array[String]) {
        var l: Int=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(1)(0)
        var r: Int=scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(1)(0)

        var result: Int=maximizingXor(l,r)
        println(result)
    }
}


