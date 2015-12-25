package name.alexeykiselev.codility.scala.arrays

import org.junit.Test
import org.junit.Assert._

class OddOccurencesInArrayTests {
  @Test def test() {
    assertEquals(2, OddOccurencesInArray.solution(Array(1, 2, 1)));
    assertEquals(4, OddOccurencesInArray.solution(Array(1, 2, 3, 4, 3, 2, 1)));
    assertEquals(7, OddOccurencesInArray.solution(Array(9, 3, 9, 3, 9, 7, 9)));
  }
}