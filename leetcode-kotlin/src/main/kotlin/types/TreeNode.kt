package org.inooni.leetcode.types

import java.util.LinkedList
import java.util.Queue

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    override fun toString(): String {
        return `val`.toString()
    }

    companion object Factory {

        fun fromArray(arr: Array<Int?>): TreeNode? {
            if (arr.isEmpty() || arr[0] == null) return null

            val root = arr[0]?.let { TreeNode(it) }
            val queue: Queue<TreeNode> = LinkedList<TreeNode>()
            queue.add(root)
            var i = 1
            while (i < arr.size) {
                val node = queue.poll()
                if (node != null && arr[i] != null) {
                    node.left = arr[i]?.let { TreeNode(it) }
                }
                queue.add(node?.left)
                i++
                if (node != null && i < arr.size && arr[i] != null) {
                    node.right = arr[i]?.let { TreeNode(it) }
                }
                queue.add(node?.right)
                i++
            }

            return root
        }

        fun toArray(root: TreeNode?): Array<Int?> {
            val result = ArrayList<Int?>()
            if (root == null) return result.toTypedArray()

            var countExisting = 1
            val queue: Queue<TreeNode?> = LinkedList(listOf(root))
            result.add(root.`val`)
            while (!queue.isEmpty()) {
                val node = queue.poll()
                if (node != null) countExisting--

                val left = if (node?.left != null) node.left else null
                if (left != null) countExisting++
                queue.add(left)

                val right = if (node?.right != null) node.right else null
                if (right != null) countExisting++
                queue.add(right)

                // Stop if queue doesn't have values
                if (countExisting == 0) break

                result.add(left?.`val`)
                result.add(right?.`val`)
            }

            // Remove trailing nulls and return
            val size = result.size
            var i = size - 1
            while (i >= 0) if (result[i] != null) break else i--
            return result.subList(0, i + 1).toTypedArray()
        }

//        fun print(root: TreeNode?) {
//            if (root == null) {
//                println("<empty tree>")
//                return
//            }
//            val results = ArrayList<String>()
//            val arr = toArray(root)
//            results.add("[${arr[0]?.toString()}]")
//            results.add("")
//            var currLevelMax = 2
//            var i = 1
//            while (i < arr.size) {
//                results[results.size-1] = results[results.size-1] + "[${arr[i]}]"
//                i++
//                if (i == currLevelMax) {
//                    results.add("")
//                    currLevelMax *= 2
//                }
//            }
//            results.forEach {
//                println(it)
//            }
//        }
    }
}