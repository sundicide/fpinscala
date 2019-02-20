package ch03

/**
  * tail을 일반화하여 처음 n개의 요소를 제거하는 함수 구현
  */
object exercise03_04 {
  def drop[A](l: List[A], n: Int): List[A] =
    if (n > 0)
      drop(exercise03_02.tail(l), n - 1)
  else
      l
  def main(args: Array[String]): Unit =
    println(drop(List(1,2,3,4,5), 2))
}
