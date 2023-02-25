package _0223.팩토리얼

class Solution {
    fun solution(n: Int) = generateSequence(1) { it+1 }
        .first { it.factorial() > n } - 1
}

private fun Int.factorial(): Int {
    return (2..this).fold(1) {acc, i -> acc * i }
}

fun main() {
    arrayOf(
        3628800 to 10,
        7 to 3,
    ).map { Solution().solution(it.first) }
        .forEach(::println)
}
