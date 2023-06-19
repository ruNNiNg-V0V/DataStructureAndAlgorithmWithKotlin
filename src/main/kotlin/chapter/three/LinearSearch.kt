package chapter.three

class LinearSearch {
    // 선형 검색 클래스

    private val list = mutableListOf<Int>()

    fun setList() {
        print("난수를 갖는 배열을 만듭니다, 몇 개의 수를 가집니까? : ")
        var size = readln().toIntOrNull()
        while (size == null || size <= 0) {
            println("잘못된 입력입니다, ")
            print("난수를 갖는 배열을 만듭니다, 몇 개의 수를 가집니까? : ")
            size = readln().toIntOrNull()
        }
        for (i in 0 until size) {
            var randomNumber: Int
            // 난수를 생성, list에 있는 경우 다시 생성
            do {
                randomNumber = (Math.random() * 100).toInt()
            } while (randomNumber in list)
            list.add(randomNumber)
        }
    }


    fun getList(): List<Int> {
        return list
    }

    // Copilot으로 생성된 검색 함수
    fun searchByCopilot(): Int {
        print("검색할 값을 입력하세요 : ")
        val value = readln().toInt()
        for (i in 0 until list.size) {
            if (list[i] == value) {
                return i
            }
        }
        return -1
    }

    fun search(theValue: Int): Int {
        list.find { it == theValue }?.let {
            return list.indexOf(it)
        }
        print("검색된 값이 없습니다, ")
        return -1
    }
}