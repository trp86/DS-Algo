package com.learn

object SwapNumbers extends App {

  var a =2
  var b =3

  // Not using third variable
  a = a+b // a=5,b=3
  b = a-b // b=2,a=5
  a = a-b // a=3,b=2

  println(a)
  println(b)

  var c = 5
  var d = 4
  // using third variable
  // var e = c+d //e=9,c=5,d=4
 // c = e-c //c=4,d=4,e=9
  // d = e-d //d=4,c=5,e=9

  var e = c // e=5,c=5,d=4
   c = d // e=5,d=4,c=4
   d = e // e=5,d=5,c=4




  println(c)
  println(d)


}
