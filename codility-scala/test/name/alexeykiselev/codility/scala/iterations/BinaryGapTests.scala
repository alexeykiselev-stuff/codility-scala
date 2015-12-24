package name.alexeykiselev.codility.scala.iterations

import org.junit.Assert._
import org.junit.Test

import name.alexeykiselev.codiliti.iterations.BinaryGap

class BinaryGapTests {
  @Test def test() {
    assertEquals(5, BinaryGap.solution(1041));
    assertEquals(2, BinaryGap.solution(9));
    assertEquals(1, BinaryGap.solution(20));
    assertEquals(0, BinaryGap.solution(0));
  }
}