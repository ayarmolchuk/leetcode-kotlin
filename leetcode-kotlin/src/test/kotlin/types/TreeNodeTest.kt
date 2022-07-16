package types

import org.inooni.leetcode.types.TreeNode
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TreeNodeTest {

    @Test
    fun fromArray() {
        val root = TreeNode.fromArray(arrayOf(1, 2, 3))
        assertNotNull(root)
        assertEquals(1, root?.`val`)
        assertNotNull(root?.left)
        assertNotNull(root?.right)
        assertEquals(2, root?.left?.`val`)
        assertEquals(3, root?.right?.`val`)
    }

    @Test
    fun fromArray2() {
        val root = TreeNode.fromArray(arrayOf(1, null, 3, null, null, null, 7))
        assertNull(root?.left)
        assertNull(root?.right?.left)
        assertEquals(7, root?.right?.right?.`val`)
    }

    @Test
    fun fromArray3() {
        assertNull(TreeNode.fromArray(arrayOf()))
        assertNull(TreeNode.fromArray(arrayOf(null)))
    }

    @Test
    fun fromArray4() {
        val root = TreeNode.fromArray(arrayOf(1, 2, null, null, 5))
        assertEquals(1, root?.`val`)
        assertEquals(2, root?.left?.`val`)
        assertEquals(null, root?.left?.left?.`val`)
        assertEquals(5, root?.left?.right?.`val`)
        assertEquals(null, root?.right?.`val`)
    }

    @Test
    fun toArray() {
        assertArrayEquals(arrayOf<Int>(), TreeNode.toArray(null))
    }

    @Test
    fun toArray2() {
        assertArrayEquals(
            arrayOf(1), TreeNode.toArray(TreeNode(1))
        )
    }

    @Test
    fun toArray3() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        assertArrayEquals(
            arrayOf(1, 2, 3), TreeNode.toArray(root)
        )
    }

    @Test
    fun toArray4() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.left?.right = TreeNode(5)
        assertArrayEquals(
            arrayOf(1, 2, null, null, 5), TreeNode.toArray(root)
        )
    }
}