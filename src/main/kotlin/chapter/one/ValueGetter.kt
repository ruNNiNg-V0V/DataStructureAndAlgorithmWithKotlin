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
        val mid = if (isEven(size)) {
            // list가 짝수일 경우
            list.subList(size / 2 - 1, size / 2 + 1)
        } else {
            // list가 홀수일 경우
            list[size / 2]
        }
        return mid
    }

    val theList = listOf(1, 2, 3, 4, 5, 6)

    // get the middle element if the list is odd get the two middle elements if the list is even
    val middle = theList.subList(theList.size / 2 - 1, theList.size / 2 + 1) // Copilot으로 작성된 중앙값 구하기

    // return boolean value, if even is true, if odd is false
    fun isEven(i: Int): Boolean {
        return i % 2 == 0 // Copilot으로 작성된 짝수/홀수 판별
    }
}