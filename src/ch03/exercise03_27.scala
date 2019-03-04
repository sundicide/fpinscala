package ch03

/**
  * 트리의 뿌리(root)에서 임의의 잎으로의 가장 긴 경로의 길이를 돌려주는 함수 depth를 작성하라
  */
object exercise03_27 {
  def depth[A](l: Tree[A], z: Int): Int = l match {
    case Leaf(_) => z
    case Branch(a: Tree[A], b: Tree[A]) => depth(a, z + 1) max depth(b, z + 1)
  }
  def main(args: Array[String]): Unit = {
    val fourDepthTree = Branch(Branch(Branch(Leaf(1), Branch(Leaf(9), Leaf(10))), Leaf(2)),Branch(Leaf(3), Leaf(5)))
    val threeDepthTree = Branch(Branch(Branch(Leaf(1), Leaf(9)), Leaf(2)),Branch(Leaf(3), Leaf(5)))
    println("threeDepthTree Result is = " + depth(threeDepthTree, 0))
    println("fourDepthTree Result is = " + depth(fourDepthTree, 0))
  }
}
