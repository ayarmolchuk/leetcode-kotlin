package org.inooni.leetcode.tasks

// Given an integer array nums and an integer k, return true if there are two distinct indices i and j
// in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
// Constraints:
//   1 <= nums.length <= 10^5
//   -10^9 <= nums[i] <= 10^9
//   0 <= k <= 10^5
//
// Results:
//   Runtime: 553 ms, faster than 97.74% of Kotlin online submissions for Contains Duplicate II.
//   Memory Usage: 53.4 MB, less than 86.47% of Kotlin online submissions for Contains Duplicate II.
class Task0219 {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val known = hashSetOf<Int>()
        nums.forEachIndexed { i, num ->
            if (i > k) known.remove(nums[i - k - 1])
            if (!known.add(num)) return true
        }
        return false
    }
}