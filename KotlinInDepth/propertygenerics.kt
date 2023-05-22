
fun <T> TreeNode<T>.addChildren(vararg  data: T) {
    data.forEach { addChild(it) }
}

fun <T> TreeNode<T>.walkDepthFirst(action: (T) -> Unit) {
    children.forEach { it.walkDepthFirst(action)  }
}
val <T> TreeNode<T>.depth: Int
    get() = (children.asSequence().map { it.depth }.maxOrNull() ?: 0) + 1

fun main() {
    val root = TreeNode("Hello").apply {
        addChildren("World", "!!!")
    }
    println(root.depth) // 2
}