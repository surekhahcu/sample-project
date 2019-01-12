package edu.hcu.math

import org.scalatest.FunSuite
class FactRecTest extends FunSuite {
  val fact = new FactRec

  test("Factorial of a number") {
    val result = fact.factorial(4)
    val expectResult = 24
    assert(result === expectResult)
  }
}