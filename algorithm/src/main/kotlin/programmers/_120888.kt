package programmers

class _120888 {
    fun solution(my_string: String): String  = my_string.toList().distinct().joinToString("")

    fun solution_2(my_string: String): String {
        val uniqueChars = mutableSetOf<Char>()
        return my_string.filter { uniqueChars.add(it) }
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120888