package edu.hcu.math

import org.scalatest.FunSuite
class ListMaxTest extends FunSuite{
  val m= new ListMax

  test("Max in a list") {
    val result = m.findmax(List(2, 3,5,89,33))
    val expectResult = 89
    assert(result === expectResult)

}}
