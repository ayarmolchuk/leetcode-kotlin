package tasks

import org.inooni.leetcode.tasks.Task0232
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Task0232Test {

    @Test
    fun QueueTest() {
        val stack = Task0232()
        assertEquals(true, stack.empty())
        stack.push(1)
        // queue -> [1] ->
        stack.push(2)
        // queue -> [2, 1] ->
        assertEquals(1, stack.peek())
        stack.push(3)
        // queue -> [3, 2, 1] ->
        assertEquals(1, stack.peek())
        assertEquals(1, stack.pop())
        // queue -> [2, 1] ->
        assertEquals(2, stack.peek())
        assertEquals(false, stack.empty())
    }
}