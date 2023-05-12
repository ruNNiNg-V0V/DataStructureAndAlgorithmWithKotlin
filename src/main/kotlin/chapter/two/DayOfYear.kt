package chapter.two

import java.time.LocalDate

// 한 해의 지난 날 수를 구합니다
class DayOfYear {
    // 오늘이 올해의 몇 일 째인가 구합니다
    fun getPassedDays(year: Int, month: Int, dayOfMonth: Int): Int {
        val theDay = LocalDate.of(year, month, dayOfMonth)
        return theDay.dayOfYear
    }

    /*
    Copilot으로 작성된 위의 코드
    날짜를 입력 받고 그 해의 지난 날 수를 구합니다
    */
    fun getPassedDaysByCopilot(): Int {
        print("오늘의 연도를 입력하세요 : ")
        val year = readln().toInt()
        print("오늘의 월을 입력하세요 : ")
        val month = readln().toInt()
        print("오늘의 일을 입력하세요 : ")
        val dayOfMonth = readln().toInt()
        return getPassedDays(year, month, dayOfMonth)
    }
}