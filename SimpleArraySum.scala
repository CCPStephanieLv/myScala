object Solution {
    def main(args: Array[String]) {
        var n = scala.io.StdIn.readInt()
        var str =scala.io.StdIn.readLine()
        println(str.split(" ").map(_.toInt).take(n).sum)    
    }
}