import chapter.one.ValueGetter

fun main() {
    println("최대값/중앙값/최소값을 구합니다.")
    print("몇 개의 수를 입력하시나요? : ")
    val size = setValue()  // 입력받은 수의 개수를 의미
    println("수를 입력하세요.")
    val list = mutableListOf<Int>()
    for (i in 0 until size) {
        print("${i + 1}번째 수 : ")
        list.add(setValue())
    }
    val valueGetter = ValueGetter()
    println("최대값 : ${valueGetter.getMax(list)}")
    println("중앙값 : ${valueGetter.getMid(list)}")
    println("최소값 : ${valueGetter.getMin(list)}")
}

fun setValue(): Int {
    return readln().toInt()
}