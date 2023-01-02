package org.inooni.leetcode.tasks

// We define the usage of capitals in a word to be right when one of the following cases holds:
//
// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.
//
// Results:
//   Runtime 161 ms, Beats 93.75%, Memory 34.1 MB, Beats s68.75%
class Task0520 {
    fun detectCapitalUse(word: String): Boolean {
        var i = 0;
        var countCapital = 0;
        var firstCapital = false;
        for (i in word.indices) {
            val isCapital = word[i].isUpperCase();
            if (i == 0) {
                firstCapital = isCapital;
            } else {
                if (isCapital) {
                    if (!firstCapital) {
                        return false;
                    }
                    countCapital++;
                }
            }
            if (countCapital in 1 until i) {
                return false;
            }
        }
        return true;
    }
}