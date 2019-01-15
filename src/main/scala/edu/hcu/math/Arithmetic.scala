package edu.hcu.math

class Arithmetic {
  //sum of two numbers
  def sum(a: Int, b: Int): Int = {
    a + b
  }


  //factorial of a number
  def factorial(n: Int): Int = {
    if (n == 0)
      1
    else
      n * factorial(n - 1)
  }


  // 1.Max element in a list
  def findMax(x: List[Int]): Int = {
    def findMax(x: List[Int], max: Int): Int = {
      if (x.nonEmpty) {
        if (x.head > max) findMax(x.tail, x.head) else findMax(x.tail, max)
      }
      else
        max
    }

    findMax(x.tail, x.head)
  }

  //2.find max element using foldLeft
  def max(list: List[Int]): Int = {
    list.tail.foldLeft(0) { (max, ele) => if (max > ele) max else ele }
  }

  //3.Reverse of a list
  def reverse(list: List[Int]): List[Int] = {
    list.foldLeft(List[Int]()) { (temp, ele) => if (list.nonEmpty) ele :: temp else temp }
  }


  //* 4.distinct element of a list
  def dedupe(list: List[Int]): List[Int] = {
    list.foldLeft(List[Int]()) { (temp, ele) => if (!temp.contains(ele)) temp :+ ele else temp }

  }

  // 5.Max In a List Using Match Pattern
  def max2(list: List[Int]): Int = {
    list match {
      case Nil => 0
      case List(x: Int) => x
      case x :: tail => if (x > max2(tail)) x else max2(tail)

    }
  }

  //6. Sum of a List Using Pattern Matching
  def sumL(list: List[Int]): Int = {
    list match {
      case Nil => 0
      case List(x: Int) => x
      case x :: tail => x + sumL(tail)
    }
  }

  /*merging two map*/
  def mergeMap(map1: Map[String, Int], map2: Map[String, Int]): Map[String, Int] = {
    val merge = (map1.keySet ++ map2.keySet).toList.map { key => (key, (map1.getOrElse(key, 0) + map2.getOrElse(key, 0))) }.toMap

    merge
  }

  /*Merging two Lists*/
  def merge(list1: List[Int], list2: List[Int]): List[Int] = {
    val mutableList = collection.mutable.ListBuffer[Int]()
    list1.foreach(n => mutableList.append(n))
    list2.foreach(n => mutableList.append(n))
    mutableList.toList
  }


}