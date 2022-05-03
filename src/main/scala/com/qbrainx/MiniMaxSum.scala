package com.qbrainx

object MiniMaxSum extends App {

  var arr = Array(1 ,2 ,3 ,4 ,5)

  def miniMaxSum(arr: Array[Int]) {

    var max = arr(0)
    var min = arr(0)
    for (i <- 0 to arr.length - 1) {
      if (arr(i) > max) max = arr(i)
    }
    for (i <- 0 to arr.length - 1) {
      if (arr(i) < min) min = arr(i)
    }
    max -= arr.sum
    min -= arr.sum
    println((-max)+" "+(-min))



  }
miniMaxSum(arr)

}
