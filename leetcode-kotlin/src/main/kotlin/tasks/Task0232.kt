package org.inooni.leetcode.tasks

import java.util.*

// Implement a first in first out (FIFO) queue using only two stacks.
// The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
//
// Implement the MyQueue class:
//   void push(int x) Pushes element x to the back of the queue.
//   int pop() Removes the element from the front of the queue and returns it.
//   int peek() Returns the element at the front of the queue.
//   boolean empty() Returns true if the queue is empty, false otherwise.
// Notes:
// You must use only standard operations of a stack, which means only push to top, peek/pop from top,
// size, and is empty operations are valid.
// Depending on your language, the stack may not be supported natively. You may simulate a stack using
// a list or deque (double-ended queue) as long as you use only a stack's standard operations.
//
// Constraints:
//   1 <= x <= 9
//   At most 100 calls will be made to push, pop, peek, and empty.
//   All the calls to pop and peek are valid.
//
// Results:
//   Runtime: 180 ms, faster than 88.69% of Kotlin online submissions for Implement Queue using Stacks.
//   Memory Usage: 35.5 MB, less than 98.81% of Kotlin online submissions for Implement Queue using Stacks.
class Task0232 {
    private var stack1 = Stack<Int>()
    private var stack2 = Stack<Int>()

    fun push(x: Int) {
        // stack2 = reverse(stack1)
        while (!stack1.empty()) {
            stack2.push(stack1.pop())
        }
        // add item
        stack2.push(x)
        // stack1 = reverse(stack2)
        while (!stack2.empty()) {
            stack1.push(stack2.pop())
        }
    }

    fun pop(): Int {
        return stack1.pop()
    }

    fun peek(): Int {
        return stack1.peek()
    }

    fun empty(): Boolean {
        return stack1.empty()
    }
}