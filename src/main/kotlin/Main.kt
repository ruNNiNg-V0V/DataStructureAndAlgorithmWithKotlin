import chapter.one.ValueGetter
import chapter.two.DayOfYear

fun main() {
    print("실행할 챕터를 입력하세요 : ")
    when (setValue()) {

        1 -> {
            // 챕텁 1
            println("최대값/중앙값/최소값을 구합니다.")
            print("몇 개의 수를 입력하시나요? : ")
            val size = setValue()  // 입력받은 수의 개수를 의미
            println("수를 입력하세요.")
            val list = mutableListOf<Int>()
            // Copilot으로 작성된 for문
            for (i in 0 until size) {
                print("${i + 1}번째 수 : ")
                list.add(setValue())
            }
            list.sort()
            val valueGetter = ValueGetter()
            println("최대값 : ${valueGetter.getMax(list)}")
            println("중앙값 : ${valueGetter.getMid(list)}")
            println("최소값 : ${valueGetter.getMin(list)}")
        }

        2 -> {
            // 챕터 2
            val dayOfYear = DayOfYear()
            print("날짜의 연도를 입력하세요 : ")
            val year = setValue()
            print("날짜의 월을 입력하세요 : ")
            val month = setValue()
            print("날짜의 일을 입력하세요 : ")
            val dayofMonth = setValue()
            println("입력한 날짜가 그 해의 몇 일 째인가 구합니다, ${dayOfYear.getPassedDays(year, month, dayofMonth)}")
        }

        else -> println("챕터를 잘못 입력하셨습니다.")
    }
}

fun setValue(): Int {
    return readln().toInt()
}