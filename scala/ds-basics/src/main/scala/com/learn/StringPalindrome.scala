package com.learn

object Palindrome extends App {

  val str = "OPPOY"
  var revStr = ""

  for ( i <- (0 to str.length-1).reverse)
  {
    revStr = revStr + str.charAt(i)
  }

  if (str == revStr) {
    println("String is palindrome.")
  }
  else
  {
    println("String is not palindrome.")
  }

}
