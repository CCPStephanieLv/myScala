trait Comparison {
  def isLarger(x: Any): Boolean
  def isNotLarger(x: Any): Boolean = !isLarger(x)
}

class Rate(scorex: Int) extends Comparison {
  var score: Int = scorex
  def isLarger(obj: Any) =
    obj.isInstanceOf[Rate] &&
    obj.asInstanceOf[Rate].score < score
}

object Solution {
    def convertB(b: Boolean): Int= {
        b match {
            case true => 1
            case false => 0
        }
    }

    def main(args: Array[String]) {
        var la= scala.io.StdIn.readLine().split(" ")
        var lb= scala.io.StdIn.readLine().split(" ")
        
        var ar0 = new Rate(la(0).trim.toInt)
        var ar1 = new Rate(la(1).trim.toInt)
        var ar2 = new Rate(la(2).trim.toInt)

        var br0 = new Rate(lb(0).trim.toInt)
        var br1 = new Rate(lb(1).trim.toInt)
        var br2 = new Rate(lb(2).trim.toInt)   
        
        var a: Int=convertB(ar0.isLarger(br0)) + convertB(ar1.isLarger(br1)) + convertB(ar2.isLarger(br2))
        var b: Int=convertB(br0.isLarger(ar0)) + convertB(br1.isLarger(ar1)) + convertB(br2.isLarger(ar2))
        
        println(a.toString+" "+b.toString)
    }
}