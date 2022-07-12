package tasks

import org.inooni.leetcode.tasks.Task0225
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Task0225Test {
    @Test
    fun testStack() {
        val stack = Task0225()
        assertTrue(stack.empty())
        stack.push(1)
        assertFalse(stack.empty())
        stack.push(2)
        assertFalse(stack.empty())
        assertEquals(2, stack.top())
        stack.push(3)
        assertFalse(stack.empty())
        assertEquals(3, stack.top())
        assertEquals(3, stack.pop())
        assertEquals(2, stack.top())
        assertEquals(2, stack.pop())
        assertEquals(1, stack.pop())
        assertTrue(stack.empty())
    }
}