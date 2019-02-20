package ch03

/**
  * List의 맨 앞 요소를 제거하는 함수
  */
object exercise03_02 {
  def tail[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case Cons(x, xs) => xs
  }
  def main(args: Array[String]): Unit =
    println(tail(List(1,2,3,4,5)))
}
