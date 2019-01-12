package edu.hcu.math

import org.scalatest.FunSuite

class ArithmeticTest extends FunSuite {


  val arth = new Arithmetic

  test("Sum two integers ") {
    val result = arth.sum(2, 1)
    val expectResult = 5
    assert(result === expectResult)
  }

}
