package ch03

/**
  * Leaf와 Branch의 개수를 세는 함수 size를 작성하라
  */
object exercise03_25 {
  def size[A](l: Tree[A], z: (Int, Int)): (Int, Int) = l match {
    case Leaf(_) => (z._1, z._2 + 1)
    case Branch(_: Leaf[A], _: Leaf[A]) => (z._1 + 1, z._2 + 2)
    case Branch(x: Branch[A], _: Leaf[A]) => size(x, (z._1 + 1, z._2 + 1))
    case Branch(_: Leaf[A], xs: Branch[A]) => size(xs, (z._1 + 1, z._2 + 1))
    case Branch(x: Branch[A], xs: Branch[A]) => (size(x, (z._1 + 1, z._2))._1 + size(xs, (z._1, z._2))._1 , size(x, (z._1 + 1, z._2))._2 + size(xs, (z._1, z._2))._2)
  }
  def main(args: Array[String]): Unit = {
    println(size(Branch(Branch(Leaf("a"), Leaf("b")),Branch(Leaf("c"), Leaf("d"))), (0,0)))
  }
}
