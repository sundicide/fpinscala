package ch03

/**
  * f에 부합하는 List의 앞 요소를 제거하는 함수
  */
object exercise03_05 {
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Nil => Nil
    case Cons(x, xs) =>
      if (f(x)) xs
      else dropWhile(xs, f)
  }
  def main(args: Array[String]): Unit =
    println(dropWhile(List(1,2,3,4,5), (x: Int) => x == 4))
}
