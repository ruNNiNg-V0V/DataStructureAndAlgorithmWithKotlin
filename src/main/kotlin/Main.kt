import chapter.one.ValueGetter
import chapter.two.DayOfYear

fun main() {
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

    val dayOfYear = DayOfYear()
    println("그 해 경과 일 수를 구합니다, ${dayOfYear.getDayOfYear(2021, 3, 4)}")
}

fun setValue(): Int {
    return readln().toInt()
}