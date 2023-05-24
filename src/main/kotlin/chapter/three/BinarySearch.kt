package chapter.three

class BinarySearch {

    // 이진 검색 클래스

    private val list = mutableListOf<Int>()

    fun getList(): List<Int> {
        return list
    }

    fun setList(size: Int) {
        for (i in 0 until size) {
            print("${i + 1}번째 수 : ")
            list.add(readln().toInt())
        }
        sort()
    }

    fun getSortedList(): List<Int> {
        // list를 정렬하여 반환합니다, 전역 변수 list는 정렬되지 않습니다
        return list.sorted()
    }

    fun sort() {
        // 전역 변수 list를 정렬합니다
        list.sort()
    }

    // 이진검색 함수, Copilot으로 생성된 함수입니다
    fun searchByCopilot(): Int {
        print("검색할 값을 입력하세요 : ")
        val value = readln().toInt()
        var low = 0
        var high = list.size - 1
        while (low <= high) {
            val mid = (low + high) / 2
            if (list[mid] == value) {
                return mid
            } else if (list[mid] < value) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        print("검색된 값이 없습니다, ")
        return -1
    }

    fun binarySearch(theValue: Int): Int {
        return try {
            list.binarySearch(theValue)
        } catch (e: Exception) {
            print("검색된 값이 없습니다, ")
            -1
        }
    }


}