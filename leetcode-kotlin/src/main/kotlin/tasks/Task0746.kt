package org.inooni.leetcode.tasks
// You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
// Once you pay the cost, you can either climb one or two steps.
// You can either start from the step with index 0, or the step with index 1.
// Return the minimum cost to reach the top of the floor.
//
// Constraints:
//   2 <= cost.length <= 1000
//   0 <= cost[i] <= 999
//
// Results:
//   Runtime: 180 ms, faster than 98.72% of Kotlin online submissions for Min Cost Climbing Stairs.
//   Memory Usage: 36.1 MB, less than 97.45% of Kotlin online submissions for Min Cost Climbing Stairs.
class Task0746 {
    fun minCostClimbingStairs(cost: IntArray): Int {
        var x1 = 0
        var x2 = 0
        var temp: Int
        cost.forEach { x ->
            if (x1 > x2) {
                x1 = x2
                x2 += x
            } else {
                temp = x1
                x1 = x2
                x2 = temp + x
            }
        }
        return if (x1 < x2) x1 else x2
    }
}
