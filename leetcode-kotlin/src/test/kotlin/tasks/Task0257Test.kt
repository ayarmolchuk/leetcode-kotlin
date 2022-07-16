package tasks

import org.inooni.leetcode.tasks.Task0257
import org.inooni.leetcode.types.TreeNode
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Task0257Test {

    @Test
    fun binaryTreePaths() {
        val solution = Task0257()
        val tree = TreeNode.fromArray(arrayOf(1, 2, 3, null, 5))
        assertArrayEquals(
            listOf("1->2->5", "1->3").toTypedArray(),
            solution.binaryTreePaths(tree).toTypedArray()
        )
    }

    @Test
    fun binaryTreePaths2() {
        val solution = Task0257()
        val tree = TreeNode.fromArray(arrayOf(1))
        assertArrayEquals(
            listOf("1").toTypedArray(),
            solution.binaryTreePaths(tree).toTypedArray()
        )
    }

}