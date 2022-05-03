package com.qbrainx

object kangaroo extends App {

  var x1 =0
  var v1 =2
  var x2 =5
  var v2 =3

  def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
    if(v2 == v1) "NO"
    else if (v1 > v2) {
      if ((Math.abs(v2 - v1) != 0) && (x2 - x1) % (Math.abs(v2 - v1)) == 0 )
        "YES"
      else  "NO"
    }
    else if (v1 < v2){
      "NO"
    }
    else  "YES"
  }

println(kangaroo(x1, v1, x2, v2))
}
