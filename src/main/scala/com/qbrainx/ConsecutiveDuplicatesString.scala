package com.qbrainx

object ConsecutiveDuplicatesString extends App {

  def removeThreeConsecutiveDuplicate(text: String): String = {
    if (text.length() < 2)
    {
       text
    }
    var size: Int = text.length() - 1
    var task: Boolean = false
    var auxiliary: Int = size
    var result: String = ""
    var temp: String = ""
    var counter: Int = 0
    while (size >= 0)
    {
      while (size >= 0 && counter < 3 && text.charAt(auxiliary) == text.charAt(size))
      {
        temp = "" + text.charAt(size) + temp
        counter += 1
        size -= 1
      }
      if (counter != 3)
      {
        result = temp + result
      }
      else
      {
        task = true
      }
      auxiliary = size
      counter = 0
      temp = ""
    }
    if (task == true)
    {
      return removeThreeConsecutiveDuplicate(result)
    }
     result
  }
  def removeAdjacent(text: String): Unit = {
    println(" Given Text : " + text)
    println(" Output     : " + removeThreeConsecutiveDuplicate(text))
  }

  removeAdjacent("zxxxxxzyyyzz")
  removeAdjacent("xxyzzzyyxx")
  removeAdjacent("xxzzzyyyx")
  removeAdjacent("xxzyyx")

}
