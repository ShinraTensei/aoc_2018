package day1

import scala.collection.mutable.ArrayBuffer

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
        var pFreqs = ArrayBuffer[Int]()
        var cnt = 0
        var dupe = false

        while(!dupe) {
            if(cnt == i_lines.length) {
                cnt = 0
            }

            cFreq += i_lines(cnt)
            dupe = pFreqs.contains(cFreq)
            pFreqs.append(cFreq)

            cnt += 1
        }
        println("Part2: " + cFreq.toString)
    }
}