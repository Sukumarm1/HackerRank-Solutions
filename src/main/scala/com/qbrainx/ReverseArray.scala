package com.qbrainx

object ReverseArray extends App {

  def display(data: Array[Int],
              size: Int): Unit = {
    var i = 0
    while (i < size)
    {
      print("  " + data(i))
      i += 1
    }
    print("\n")
  }
  def reverseArray(data: Array[Int],
                   front: Int, tail: Int): Unit = {
    if (front < tail)
    {
      var auxiliary: Int = data(front)
      data(front) = data(tail)
      data(tail) = auxiliary
      reverseArray(data, front + 1, tail - 1)
    }
  }
  var data: Array[Int] = Array(1, 2, 7, 3, 4, 5, 8, 9)
  var size: Int = data.length
  println(" Before Reverse ")
  display(data, size)
  reverseArray(data, 0, size - 1)
  println(" After Reverse ")
  display(data, size)

}
