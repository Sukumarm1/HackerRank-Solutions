package com.qbrainx

class SecondLargestElement(var first: Int,
                           var second: Int) {

  def this() {
    this(0, 0)
  }
 def second_largest(arr: Array[Int], location: Int): Unit = {
    if (location < 0) {
    }
    else {
      if (this.first < arr(location)) {
        if (this.second < this.first) {
          this.second = this.first
        }
        this.first = arr(location)
      }
      else if (this.second < arr(location)) {
        this.second = arr(location)
      }
      second_largest(arr, location - 1)
    }
  }

  def find_largest(arr: Array[Int], size: Int): Unit = {
    if (size <= 0) {

    }
    this.first = arr(0)
    this.second = Int.MinValue
    second_largest(arr, size - 1)
    print("Second largest : " + second + "\n")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val obj = new SecondLargestElement()
    val arr: Array[Int] = Array(10, 3, 23, 86, 8, 31, 9, 48, 5, 7)
    val size: Int = arr.length
    obj.find_largest(arr, size)
  }
}
