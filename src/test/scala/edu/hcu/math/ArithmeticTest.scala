package edu.hcu.math

import org.scalatest.FunSuite

class ArithmeticTest extends FunSuite {


  val arth = new Arithmetic

  test("Sum two integers ") {
    val result = arth.sum(2, 3)
    val expectResult = 5
    assert(result === expectResult)
  }


  test("Factorial of a number") {
    val result = arth.factorial(4)
    val expectResult = 24
    assert(result === expectResult)
  }

  //1st
  test("Max in a list") {
    val result = arth.findMax(List(2, 3, 5, 89, 33))
    val expectResult = 89
    assert(result === expectResult)
  }

  //2nd
  test("Max in a list using foldLeft") {
    val result = arth.max(List(2, 3, 5, 89, 33, 100))
    val expectResult = 100
    assert(result === expectResult)
  }

  //3rd
  test("Reverse of a list") {
    val result = arth.reverse(List(1, 2, 2, 3, 3, 4, 4, 4))
    val expectResult = List(4, 4, 4, 3, 3, 2, 2, 1)
    assert(result === expectResult)
  }


  //4th
  test("Distinct list") {
    val result = arth.dedupe(List(1, 2, 2, 3, 3, 4, 4, 4))
    val expectResult = List(1, 2, 3, 4)
    assert(result === expectResult)
  }

  //5th
  test("Max in a list using Pattern Matching") {
    val result = arth.max2(List(2, 3, 5, 89, 330, 10, 200))
    val expectResult = 330
    assert(result === expectResult)
  }
  //6th
  test("Sum of a list using Pattern Matching") {
    val result = arth.sumL(List(2, 3, 5, 89, 330, 10, 200))
    val expectResult = 639
    assert(result === expectResult)
  }
  //7th
  test("Sum of two Options") {
    val result = arth.sumOP(Some(2), None)
    val expectResult = Some(2)
    assert(result === expectResult)
  }


  test("Merging two Maps") {
    val result = arth.mergeMap(Map("a" -> 1, "b" -> 3), Map("a" -> 2))
    val expectResult = Map("a" -> 3, "b" -> 3)
    assert(result === expectResult)
  }

  test("Merging two Lists") {
    val result = arth.merge(List(1, 2, 3, 3, 4, 4), List(1, 2, 3, 4, 5))
    val expectResult = List(1, 2, 3, 3, 4, 4, 1, 2, 3, 4, 5)
    assert(result === expectResult)
  }
}