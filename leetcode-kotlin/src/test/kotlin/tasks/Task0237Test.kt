package tasks

import org.inooni.leetcode.tasks.Task0237
import org.inooni.leetcode.types.ListNode
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Task0237Test {

    @Test
    fun deleteNode() {
        val task = Task0237()
        val linkedList = ListNode.fromArray(arrayOf(4,5,1,9))
        task.deleteNode(linkedList!!.next)
        assertArrayEquals(arrayOf(4,1,9), ListNode.toArray(linkedList))
    }
}