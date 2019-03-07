package ch03

/**
  * List에 대한 함수 map과 비슷하게 트리의 각 요소를 주어진 함수로 수정하는 함수 map
  */
object exercise03_28 {
  def map[A, B](l: Tree[A])(f: A => B): Tree[B] = l match {
    case Leaf(a) => Leaf(f(a))
    case Branch(a: Tree[A], b: Tree[A]) => Branch(map(a)(f), map(b)(f))
  }
  def main(args: Array[String]): Unit = {
    val fourDepthTree = Branch(Branch(Branch(Leaf(1), Branch(Leaf(9), Leaf(10))), Leaf(2)),Branch(Leaf(3), Leaf(5)))
    val threeDepthTree = Branch(Branch(Branch(Leaf(1), Leaf(9)), Leaf(2)),Branch(Leaf(3), Leaf(5)))
    println("threeDepthTree Result is = " + map(threeDepthTree)((x) => x + 1))
    println("fourDepthTree Result is = " + map(fourDepthTree)((x) => x + 1))
  }
}
