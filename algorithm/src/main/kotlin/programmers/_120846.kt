package programmers

class _120846 {
    fun div(n: Int): Int {
        var count = 0
        for (i in 1 .. n) {
            if (n % i == 0) count++
        }

        return count
    }

    fun solution(n: Int): Int {
        var answer = 0
        for (i in 1 .. n) {
            if (div(i) != 2 && div(i) != 1) {
                answer++
            }
        }
        return answer
    }

    fun solution_2(n: Int) = (1..n).filter { i -> (1..i).filter { i % it == 0 }.size > 2 }.size
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120846?language=kotlin