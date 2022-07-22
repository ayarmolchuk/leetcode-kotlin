package org.inooni.leetcode.types

class ListNode {
    var `val`: Int = 0
    var next: ListNode? = null

    companion object Factory {
        fun fromArray(arr: Array<Int>): ListNode? {
            if (arr.isEmpty()) {
                return null
            }
            var root: ListNode? = null
            var curr: ListNode? = null
            arr.forEach {
                if (root == null) {
                    root = ListNode()
                    root!!.`val` = it
                    curr = root
                } else {
                    curr!!.next = ListNode()
                    curr = curr!!.next
                    curr!!.`val` = it
                }
            }
            return root
        }

        fun toArray(root: ListNode?): Array<Int> {
            if (root == null) return arrayOf<Int>()
            val result = ArrayList<Int>()
            var curr = root
            while (curr != null) {
                result.add(curr.`val`)
                curr = curr.next
            }
            return result.toTypedArray()
        }
    }
}