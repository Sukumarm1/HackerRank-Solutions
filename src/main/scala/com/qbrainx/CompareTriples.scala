package com.qbrainx

object CompareTriples extends App {

  var a = Array(5 ,6 ,7)
  var b = Array(3 ,6 ,10)

  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {

    var i =0
    var j = 0

    if(a(0)>b(0)) i +=1 else if (a(0)<b(0)) j +=1 else i ==j
    if(a(1)>b(1)) i +=1 else if (a(1)<b(1)) j +=1 else i == j
    if(a(2)>b(2)) i +=1 else if (a(2)<b(2)) j +=1 else i==j

    Array(i.toInt, j.toInt)

  }

  println(compareTriplets(a,b))

}
