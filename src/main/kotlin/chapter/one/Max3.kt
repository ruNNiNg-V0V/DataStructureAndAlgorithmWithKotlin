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
        var a = 0
        var b = 0
        var c = 0

        println("세 정수의 최댓값을 구합니다")

        print("a의 값 : ")
        a = setValue()

        print("b의 값 : ")
        b = setValue()

        print("c의 값 : ")
        c = setValue()

        var max = a

        if (b > max) max = b
        if (c > max) max = c

        println("최대값은 ${max}입니다")
    }

    fun setValue(): Int = readln().toInt()
}