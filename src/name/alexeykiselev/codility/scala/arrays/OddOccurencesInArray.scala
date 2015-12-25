package name.alexeykiselev.codility.scala.arrays

object OddOccurencesInArray {
  def solution(A: Array[Int]): Int = {
    var m = Set[Int]()
    for (n <- A) {
      if (m.contains(n))
        m -= n;
      else
        m += n;
    }

    return m.head;
  }
}