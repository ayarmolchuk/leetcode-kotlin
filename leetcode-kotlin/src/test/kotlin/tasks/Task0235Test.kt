package tasks

import org.inooni.leetcode.tasks.Task0235
import org.inooni.leetcode.types.TreeNode
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Task0235Test {

    @Test
    fun lowestCommonAncestor() {
        val tree = TreeNode.fromArray(arrayOf(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5))
        val task = Task0235()
        val p = findNode(tree, 2)
        val q = findNode(tree, 4)
        assertEquals(
            2, task.lowestCommonAncestor(tree, p, q)!!.`val`
        )
    }

    @Test
    fun lowestCommonAncestor2() {
        val tree = TreeNode.fromArray(arrayOf(2, 1))
        val task = Task0235()
        val p = findNode(tree, 2)
        val q = findNode(tree, 1)
        assertEquals(
            2, task.lowestCommonAncestor(tree, p, q)!!.`val`
        )
    }

    private fun findNode(root: TreeNode?, value: Int): TreeNode? {
        var curr: TreeNode? = root
        while (curr != null && curr.`val` != value) {
            curr = if (curr.`val` < value) curr.right else curr.left
        }
        return curr
    }
}