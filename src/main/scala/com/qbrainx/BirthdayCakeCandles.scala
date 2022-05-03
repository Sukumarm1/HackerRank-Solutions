package com.qbrainx

object BirthdayCakeCandles extends App {

  var candles = Array(3 ,2 ,1, 3)

  def birthdayCakeCandles(candles: Array[Int]): Int = {
    var value = candles(0)
    var count = 0
    for (i <- 0 to candles.length - 1) {
      if (candles(i) > value)
        value = candles(i)
    }
    for (i <- 0 to candles.length - 1) {
      if (candles(i) == value)
        count += 1
    }
    count

  }
  println(birthdayCakeCandles(candles))
}
