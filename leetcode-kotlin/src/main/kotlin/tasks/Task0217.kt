package org.inooni.leetcode.tasks
// Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
//
// Constraints:
//   1 <= nums.length <= 10^5
//  -10^9 <= nums[i] <= 10^9
//
// Results:
//   Runtime: 421 ms, faster than 94.65% of Kotlin online submissions for Contains Duplicate.
//   Memory Usage: 52.2 MB, less than 85.76% of Kotlin online submissions for Contains Duplicate.
class Task0217 {
    fun containsDuplicate(nums: IntArray): Boolean {
        val known = HashSet<Int>()
        nums.forEach {
            if (known.contains(it)) {
                return true
            } else {
                known.add(it)
            }
        }
        return false
    }
}