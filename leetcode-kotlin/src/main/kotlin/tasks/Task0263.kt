package org.inooni.leetcode.tasks

// An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
// Given an integer n, return true if n is an ugly number.
//
// Constraints:
//   -2^31 <= n <= 2^31 - 1
//
// Results:
//   Runtime: 154 ms, faster than 91.67% of Kotlin online submissions for Ugly Number.
//   Memory Usage: 33.4 MB, less than 97.22% of Kotlin online submissions for Ugly Number.
class Task0263 {
    fun isUgly(n: Int): Boolean {
        if (n == 0) return false
        var x = n
        while (true) {
            @Suppress("LiftReturnOrAssignment")
            if (x % 5 == 0) x /= 5
            else if (x % 3 == 0) x /= 3
            else if (x % 2 == 0) x /= 2
            else return x == 1
        }
        return false
    }
}