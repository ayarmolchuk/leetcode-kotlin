package org.inooni.leetcode.tasks

import org.inooni.leetcode.types.TreeNode
import kotlin.collections.ArrayList

// Given the root of a binary tree, return all root-to-leaf paths in any order.
// A leaf is a node with no children.
//
// Constraints:
//   The number of nodes in the tree is in the range [1, 100].
//   -100 <= Node.val <= 100
//
// Results:
//   Runtime: 238 ms, faster than 80.30% of Kotlin online submissions for Binary Tree Paths.
//   Memory Usage: 36.2 MB, less than 63.64% of Kotlin online submissions for Binary Tree Paths.
class Task0257 {
    private val answer = ArrayList<String>()

    fun binaryTreePaths(root: TreeNode?): List<String> {
        traverse(root, "")
        return answer
    }

    private fun traverse(node: TreeNode?, path: String) {
        if (node == null) return
        if (node.left == null && node.right == null)
            answer.add(path + node.`val`)
        val newPath = path + node.`val` + "->"
        traverse(node.left, newPath)
        traverse(node.right, newPath)
    }
}