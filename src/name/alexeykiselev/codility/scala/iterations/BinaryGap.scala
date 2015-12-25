package name.alexeykiselev.codility.scala.iterations

import scala.math._;

object BinaryGap {
  def solution(N: Int): Int = {
    var maxGapLength = 0
    var gapLength = 0;
    var value = N;
    var increment = 0
    
    while (value > 0) {
      if (value % 2 != 0) {
        increment = 1;
        maxGapLength = max(maxGapLength, gapLength);
        gapLength = 0;
      } else gapLength += increment
      value = value / 2;
    }
    
    return maxGapLength;
  }
}