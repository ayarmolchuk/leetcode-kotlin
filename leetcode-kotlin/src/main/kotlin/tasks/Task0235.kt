package org.inooni.leetcode.tasks

import org.inooni.leetcode.types.TreeNode

// Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
// According to the definition of LCA on Wikipedia:
//   “The lowest common ancestor is defined between two nodes p and q as the lowest node in T
//   that has both p and q as descendants (where we allow a node to be a descendant of itself).”
//
// Constraints:
//   The number of nodes in the tree is in the range [2, 10^5].
//   -10^9 <= Node.val <= 10^9
//   All Node.val are unique.
//   p != q
//   p and q will exist in the BST.
//
// Results:
//   Runtime: 264 ms, faster than 90.12% of Kotlin online submissions for Lowest Common Ancestor of a Binary Search Tree.
//   Memory Usage: 38.8 MB, less than 88.89% of Kotlin online submissions for Lowest Common Ancestor of a Binary Search Tree.
class Task0235 {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null || p == null || q == null) return null
        val x1 = p.`val`
        val x2 = q.`val`
        var currRoot = root
        while (currRoot != null && currRoot.`val` != x1 && currRoot.`val` != x2) {
            currRoot =
                if (x1 < currRoot.`val`) {
                    if (x2 > currRoot.`val`) return currRoot
                    else currRoot.left
                } else {
                    if (x2 < currRoot.`val`) return currRoot
                    else currRoot.right
                }
        }
        return currRoot
    }
}