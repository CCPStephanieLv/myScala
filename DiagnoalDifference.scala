object Solution {
    def main(args: Array[String]) {
        var n: Int= scala.io.StdIn.readInt()

        //val rowArray = Array.ofDim[Int](n, n)
        var lineArray = new Array[Int](n)
        var strInput: String=""

        var leftD: Int=0
        var rightD: Int=0
       
        for(ir <- 0 until n) {
            strInput =scala.io.StdIn.readLine()
            lineArray = strInput.split(" ").map(_.toInt).take(n)

            for(ic <- 0 until n) {
                //rowArray(ir)(ic)=lineArray(ic)
                if(ir == ic){
                    leftD = leftD + lineArray(ic)
                }

                if(ir + ic == n-1){
                    rightD = rightD + lineArray(ic)
                }
            }
            
        }
        println(Math.abs(leftD - rightD))
    }
}