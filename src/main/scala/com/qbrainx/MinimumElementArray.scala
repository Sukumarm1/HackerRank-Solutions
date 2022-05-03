package com.qbrainx

object MinimumElementArray extends App {

  def min_element(collection: Array[Int], low: Int, high: Int): Int = {
    if (low == high)
    {
      return collection(high);
    }
    val mid: Int = (low + high) >> 1
    var a: Int = min_element(collection, low, mid);
    var b: Int = min_element(collection, mid + 1, high);
    if (a < b)
    {
       a
    }
    else
       b

  }
  def display_element(collection: Array[Int], size: Int): Unit = {
    var i: Int = 0;
    while (i < size)
    {
      print(" " + collection(i))
      i += 1
    }
    print("\n")
  }

  var arr: Array[Int] = Array(7, 3, 8, 23, 3, 2, 9, 35, 13, 42, 1, 3)
  var size: Int = arr.length
  print("Element : ")
  display_element(arr, size)
  var result: Int = min_element(arr, 0, size - 1)
  print("Minimum Element : " + result + " \n")

}
