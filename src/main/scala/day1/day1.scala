package day1

class Day1 {
    def solve(): Unit = {
        val lines = scala.io.Source.fromFile("res/day1.txt").mkString.split("\n")
        val i_lines = lines.map(_.toInt)
        var freq: Int = 0

        //Part 1
        for(a <- 0 until i_lines.length) {
            freq += i_lines(a)
        }
        println("Part1: " + freq.toString)
    
        //Part 2
        var cFreq = 0
        var pFreqs = Array(0)
        var cnt = 0
        var dupe = false

        while(!dupe) {
            if(cnt == i_lines.length) {
                cnt = 0
            }

            cFreq += i_lines(cnt)
            dupe = has(pFreqs, cFreq)
            pFreqs :+ cFreq

            cnt += 1
        }
        println("Part2:")
    }

    def has(arr: Array[Int], x: Int): Boolean = {
        for(a <- 0 until arr.length) {
            if(arr(a) == x) {
            true
            }
        }
        false
    }
}