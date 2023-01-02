package tasks

import org.inooni.leetcode.tasks.Task0520
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Task0520Test {

    @Test
    fun isUgly() {
        val inst = Task0520()
        assertTrue(inst.detectCapitalUse("USA"));
        assertFalse(inst.detectCapitalUse("uSA"));
        assertTrue(inst.detectCapitalUse("Usa"));
        assertTrue(inst.detectCapitalUse("usa"));
        assertFalse(inst.detectCapitalUse("usA"));
        assertFalse(inst.detectCapitalUse("UsA"));
    }
}