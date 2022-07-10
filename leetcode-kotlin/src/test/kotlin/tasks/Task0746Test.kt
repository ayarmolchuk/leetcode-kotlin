package tasks

import org.inooni.leetcode.tasks.Task0746
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class Task0746Test {

    @Test
    fun minCostClimbingStairs() {
        val input = arrayOf(10, 15, 20)
        assertEquals(15, Task0746().minCostClimbingStairs(input.toIntArray()))
    }

    @Test
    fun minCostClibingStairs() {
        val input = arrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)
        assertEquals(6, Task0746().minCostClimbingStairs(input.toIntArray()))
    }
}