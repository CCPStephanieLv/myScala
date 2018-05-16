object Solution {
    def main(args: Array[String]) {
        var n: Int= scala.io.StdIn.readInt()
        var strs: String=""

        for (x <- 0 until n) {
            strs = ""
            for (y <- 0 until n) {
                ((x+y) -( n-1)) compare 0 match {
                    case 0 => strs = strs + "#" // equal
                    case 1 => strs = strs + "#" // larger than
                    case -1 => strs = strs + " " // less than
                }

            }
            println (strs)
        }
    }
}