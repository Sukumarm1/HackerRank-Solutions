package com.qbrainx

object Staircase  extends App {

  var n = 6

  def staircase(n: Int) {

    for(i <- Range(0,n))
    {
      var result1 = ""
      var result2 = ""

      result1 = " "*((n-1) - i)
      result2 = "#"*(i+1)

      println(result1 + result2)
    }
  }

  staircase(n)
}
