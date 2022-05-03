package com.qbrainx

object PlusMinus extends App {

  var arr = Array(-4, 3, -9, 0, 4, 1)

  def plusMinus(arr: Array[Int]) {
    var plus = 0
    var minus = 0
    var zero = 0
    for (i <- arr) {
      if (i > 0) plus += 1
      else if (i < 0) minus += 1
      else zero += 1
    }
    var size: Double = arr.size
    println(plus / size)
    println(minus / size)
    println(zero / size)
  }
  plusMinus(arr)
}
