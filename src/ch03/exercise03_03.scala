package ch03

/**
  * List의 맨 앞 요소를 다른 값으로 바꾸는 함수
  */
object exercise03_03 {
  def setHead[A](list: List[A], a: A): List[A] = list match {
    case Nil => Nil
    case Cons(x, xs) => Cons(a, xs)
  }
  def main(args: Array[String]): Unit =
    println(setHead(List(1,2,3,4,5), 10))
}
