package day2

class Day2 {
    def solve(): Unit = {
        val lines = scala.io.Source.fromFile("res/day2.txt").mkString.split("\n")
        
        //Part 1
        var chars = Array(0, 0)
        for(a <- 0 until lines.length) {
            val arr = count_dup(lines(a))
            chars(0) += arr(0)
            chars(1) += arr(1)
            println("Part1: " + chars(0).toString + " " + chars(1).toString)
        }
        val sum = chars(0) * chars(1)
        println("Part1: " + sum.toString)
    }

    def count_dup(str: String): Array[Int] = {
        var tmparr = Array(0, 0)
        for(a <- 0 until str.length) {
            if((str.count(_ == str(a))) == 3) {
                tmparr(0) = 1
            }
            else if((str.count(_ == str(a))) == 2) {
                tmparr(1) = 1
            }
        }
        tmparr
    }
}   