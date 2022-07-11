package tasks

import org.inooni.leetcode.tasks.Task0219
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Task0219Test {

    @Test
    fun containsNearbyDuplicate() {
        val instance = Task0219()
        assertTrue(instance.containsNearbyDuplicate(arrayOf(1, 2, 3, 1).toIntArray(), 3))
        assertTrue(instance.containsNearbyDuplicate(arrayOf(1, 0, 1, 1).toIntArray(), 1))
        assertFalse(instance.containsNearbyDuplicate(arrayOf(1,2,3,1,2,3).toIntArray(), 2))
    }
}