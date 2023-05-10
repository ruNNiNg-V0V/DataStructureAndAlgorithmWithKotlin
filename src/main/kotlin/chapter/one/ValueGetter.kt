package chapter.one

class ValueGetter {
    fun getMax(list: MutableList<Int>): Int {
        return list.maxOrNull() ?: 0
    }

    fun getMin(list: MutableList<Int>): Int {
        return list.minOrNull() ?: 0
    }

    fun getMid(list: MutableList<Int>): Any {
        val size = list.size
        if (size < 1) return listOf(0) // 예외처리
        val mid = if (size % 2 == 0) {
            // list가 짝수일 경우
            list.subList(size / 2 - 1, size / 2 + 1)
        } else {
            // list가 홀수일 경우
            list[size / 2]
        }
        return mid
    }
}