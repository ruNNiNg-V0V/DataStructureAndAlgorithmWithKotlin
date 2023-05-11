package chapter.two

import java.time.Year.isLeap

class DayOfYear {
    // 한 해의 지난 날 수를 구합니다
    fun getDayOfYear(year: Int, month: Int, day: Int): Int {
        var days = day // 일 수

        // 1월~(month-1)월의 일 수를 더합니다.
        for (i in 1 until month) {
            days += getMonthDays(year, i)
        }
        return days
    }

    private fun getMonthDays(year: Int, i: Int): Int {
        return when (i) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            4, 6, 9, 11 -> 30
            2 -> if (isLeap(year.toLong())) 29 else 28
            else -> 0
        }
    }
}