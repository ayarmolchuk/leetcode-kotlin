package org.inooni.leetcode.tasks

import java.util.*

// Implement a last-in-first-out (LIFO) stack using only two queues.
// The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
//
// Implement the MyStack class:
//   void push(int x) Pushes element x to the top of the stack.
//   int pop() Removes the element on the top of the stack and returns it.
//   int top() Returns the element on the top of the stack.
//   boolean empty() Returns true if the stack is empty, false otherwise.
//
// Notes:
// You must use only standard operations of a queue, which means that only push to back, peek/pop from front,
// size and is empty operations are valid.
// Depending on your language, the queue may not be supported natively. You may simulate a queue using a
// list or deque (double-ended queue) as long as you use only a queue's standard operations.
//
// Constraints:
//   1 <= x <= 9
//   At most 100 calls will be made to push, pop, top, and empty.
//   All the calls to pop and top are valid.
//
// Results:
//   Runtime: 170 ms, faster than 90.48% of Kotlin online submissions for Implement Stack using Queues.
//   Memory Usage: 35.7 MB, less than 89.29% of Kotlin online submissions for Implement Stack using Queues.
class Task0225 {
    private var queue1: Queue<Int> = LinkedList<Int>()
    private var queue2: Queue<Int> = LinkedList<Int>()

    fun push(x: Int) {
        queue2.add(x)
        while (!queue1.isEmpty())
            queue2.add(queue1.remove())
        val temp = queue1
        queue1 = queue2
        queue2 = temp
    }

    fun pop(): Int {
        return queue1.remove()
    }

    fun top(): Int {
        return queue1.peek()
    }

    fun empty(): Boolean {
        return queue1.isEmpty()
    }
}