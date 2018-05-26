object Solution {
    def timeConversion(time_input: String): String= {

        //07:05:45PM
        var xm=time_input.substring(8, 10)
        var time=time_input.substring(0, 8)
     
        time_input match {
            //case a if time_input contains "12:00:00AM" => "00:00:00"
            //case b if time_input contains "12:00:00PM" => "12:00:00"
            //case c if time_input contains "AM" => time_input.substring(0, 8)
            //case c if time_input.substring(8, 10) == "AM" => time_input.substring(0, 8)
            //case d if time_input contains "PM" => (time_input.substring(0, 2).toInt + 12).toString + time_input.substring(2,8)

            case a if (xm=="AM" && time.substring(0,2)=="12") => "0"+(time.substring(0, 2).toInt - 12).toString + time.substring(2,8)
            case b if (xm=="PM" && time.substring(0,2)=="12") => time
            case c if xm == "AM" => time //time_input.substring(0, 8)
            case d if xm=="PM" => (time.substring(0, 2).toInt + 12).toString + time.substring(2,8)
        }
    }

    def main(args: Array[String]) {
        var time_input: String=scala.io.StdIn.readLine()
        var result: String=timeConversion(time_input)
        println(result)
    }
}
