import chapter.one.ValueGetter
import chapter.two.*

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
            println("실행할 프로그램을 선택하세요")
            print("1. DayOfYear, 2. Physical : ")
            when (setValue()) {
                1 -> {
                    val dayOfYear = DayOfYear()
                    print("날짜의 연도를 입력하세요 : ")
                    val year = setValue()
                    print("날짜의 월을 입력하세요 : ")
                    val month = setValue()
                    print("날짜의 일을 입력하세요 : ")
                    val dayofMonth = setValue()
                    println("입력한 날짜가 그 해의 몇 일 째인가 구합니다, ${dayOfYear.getPassedDays(year, month, dayofMonth)}")
                }

                2 -> {
                    print("몇 명의 신체검사를 진행합니까? : ")
                    val count = setValue()
                    val physical = Physical()
                    for (i in 0 until count) {
                        physical.setPerson()
                    }
                    println("키 평균 : ${physical.getHeightAverage()}")
                    println("몸무게 평균 : ${physical.getWeightAverage()}")
                    println("시력 분포 : ${physical.getVisionDistribution()}")
                    println("혈액형 분포 : ${physical.getBloodTypeDistribution()}")
                }
            }
        }

        else -> println("챕터를 잘못 입력하셨습니다.")
    }
}

fun setValue(): Int {
    return try {
        readln().toInt()
    } catch (e: Exception) {
        println("숫자를 입력해주세요.")
        setValue()
    }
}