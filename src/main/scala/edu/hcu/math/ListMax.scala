package edu.hcu.math

class ListMax {
  def findmax(x: List[Int]): Int ={


    if ( (x.head > x.tail.head) && (x.tail.length >= 1) )
      x.head
    else
    if(x.tail.length == 1)
      x.tail.head
    else
      findmax(x.tail)
  }


}
