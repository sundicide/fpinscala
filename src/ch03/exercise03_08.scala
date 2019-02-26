package ch03

/**
  * List의 마지막 요소를 제외한 모든 요소로 이루어진 List를 돌려주는 함수
  */
object exercise03_08 {
  def init[A](l: List[A]): List[A] = l match {
    case Nil => l
    case Cons(x, Nil) => Nil
    case Cons(x, xs) => Cons(x, init(xs))
  }
  def main(args: Array[String]): Unit =
    println(init(List(1,2,3,4,5)))
}
