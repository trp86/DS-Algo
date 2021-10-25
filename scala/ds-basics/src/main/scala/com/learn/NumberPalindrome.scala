package com.learn

object NumberPalindrome extends App {

  /*var r,sum=0
  var temp=0
  var n=454 //It is the number variable to be checked for palindrome

  temp=n;
  while(n>0){
    r=n%10;  //getting remainder
    sum=(sum*10)+r;
    n=n/10;
  }
  if(temp==sum)
    println("palindrome number ");
  else
    println("not palindrome");


  */

  val num = 1001
  var revNum = 0
  var temp = num

  while (temp > 0)
    {
      val div = temp/10
      val rem = temp%10
      revNum = (revNum*10) + rem
      temp=div
    }

  if(num==revNum)
    println("palindrome number ");
  else
    println("not palindrome");

  println(revNum)




}
