package tasks

import org.inooni.leetcode.tasks.Task0217
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Task0217Test {

    @Test
    fun containsDuplicate() {
        val instance = Task0217()
        assertFalse(instance.containsDuplicate(arrayOf(1).toIntArray()))
        assertTrue(instance.containsDuplicate(arrayOf(1, 2, 3, 1).toIntArray()))
        assertFalse(instance.containsDuplicate(arrayOf(1, 2, 3, 4).toIntArray()))
        assertTrue(instance.containsDuplicate(arrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2).toIntArray()))
    }
}