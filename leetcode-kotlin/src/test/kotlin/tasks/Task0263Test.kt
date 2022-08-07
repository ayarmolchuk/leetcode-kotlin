package tasks

import org.inooni.leetcode.tasks.Task0263
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Task0263Test {

    @Test
    fun isUgly() {
        val inst = Task0263()
        assertTrue(inst.isUgly(6))
        assertTrue(inst.isUgly(1))
        assertTrue(inst.isUgly(8))
        assertFalse(inst.isUgly(14))
    }
}