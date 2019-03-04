package ch03

/**
  * Tree[Int] 에서 가장 큰 요소를 돌려주는 함수 maximum을 작성하라.
  * 스칼라에서 두 정수 x와 y의 최댓값은 x.max(y)나 x max y 로 계산할 수 있다.
  */
object exercise03_26 {
  def maximum(l: Tree[Int], z: Int): Int = l match {
    case Leaf(a) => a max z
    case Branch(a: Leaf[Int], b: Leaf[Int]) => maximum(a,z) max maximum(b,z)
    case Branch(a: Branch[Int], b: Branch[Int]) => maximum(a,z) max maximum(b,z)
  }
  def main(args: Array[String]): Unit = {
    println(maximum(Branch(Branch(Leaf(1), Leaf(2)),Branch(Leaf(3), Leaf(5))), 0))
  }
}
