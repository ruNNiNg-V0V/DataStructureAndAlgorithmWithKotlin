package chapter.one

class Max3 {

    fun getMaxByCopilot() {

        println("Enter three numbers:") // 공통된 행위를 요약

        // 입력하여 초기화
        val a = setValue()
        val b = setValue()
        val c = setValue()

        // 조건식으로 변수 초기화
        val max = if (a > b) {
            if (a > c) a else c
        } else {
            if (b > c) b else c
        }

        println("The maximum number is $max")
    }

    fun getMax() {

        println("세 정수의 최댓값을 구합니다")

        print("a의 값 : ")
        val a = setValue()

        print("b의 값 : ")
        val b = setValue()

        print("c의 값 : ")
        val c = setValue()

        print("d의 값 : ")
        val d = setValue()

        print("e의 값 : ")
        val e = setValue()

        print("f의 값 : ")
        val f = setValue()

        print("g의 값 : ")
        val g = setValue()

        print("h의 값 : ")
        val h = setValue()

        /*
        var max = a

        if (b > max) max = b
        if (c > max) max = c
         */

        // 조건식을 사용하는게 아닌 정렬을 이용하여 최대값 출력
        val list = listOf(a, b, c, d, e, f, g, h).sorted()

        val size = list.size

        val max = list.maxOf { it }

        val mid = if (size % 2 == 0) {
            // list가 짝수일 경우
            list.subList(size / 2 - 1, size / 2 + 1)
        } else {
            // list가 홀수일 경우
            list[size / 2]
        }

        println("최대값은 ${max}입니다, 중앙값은 ${mid}입니다.")
    }

    fun setValue(): Int = readln().toInt()
}