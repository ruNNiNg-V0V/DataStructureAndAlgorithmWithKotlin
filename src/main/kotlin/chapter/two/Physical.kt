package chapter.two

data class Person(
    val name: String, val height: Double, val weight: Double, val vision: Double, val bloodType: String
)

class Physical {

    // 신체 검사 클래스

    val list = mutableListOf<Person>()

    fun setPerson() {
        val name = setName()
        val height = setHeight()
        val weight = setWeight()
        val vision = setVision()
        val bloodType = setBloodType()
        list.add(Person(name, height, weight, vision, bloodType))
    }

    fun setName(): String {
        print("이름 : ")
        var name = readln().trim()
        while (name.isEmpty()) {
            /**
             * 재귀 함수 스택오버플로우 예외처리
             * while 반복문을 사용하여 처리할 것
             */
            println("잘못된 입력입니다.")
            print("이름 : ")
            name = readln().trim()
        }
        return name
    }

    fun setHeight(): Double {
        print("키(cm) : ")
        var height = readln().toDoubleOrNull()
        while (height == null) {
            println("잘못된 입력입니다.")
            print("키(cm) : ")
            height = readln().toDoubleOrNull()
        }
        return height
    }

    fun setWeight(): Double {
        print("몸무게(kg) : ")
        var weight = readln().toDoubleOrNull()
        while (weight == null) {
            println("잘못된 입력입니다.")
            print("몸무게(kg) : ")
            weight = readln().toDoubleOrNull()
        }
        return weight
    }

    fun setVision(): Double {
        print("시력 : ")
        var vision = readln().toDoubleOrNull()
        while (vision == null) {
            println("잘못된 입력입니다.")
            print("시력 : ")
            vision = readln().toDoubleOrNull()
        }
        return vision
    }

    fun setBloodType(): String {
        print("혈액형을 선택해주세요 : 1.A, 2.B, 3.O, 4.AB ")
        var bloodType = readln().toIntOrNull()
        while (bloodType == null || bloodType !in 1..4) {
            println("잘못된 입력입니다.")
            print("혈액형을 선택해주세요 : 1.A, 2.B, 3.O, 4.AB ")
            bloodType = readln().toIntOrNull()
        }
        return when (bloodType) {
            1 -> "A"
            2 -> "B"
            3 -> "O"
            4 -> "AB"
            else -> "O"
        }
    }

    // 키의 평균갑 구하기
    // Copilot으로 작성된
    fun getHeightAverageByCoPilot(): Double {
        var sum = 0.0
        for (i in list) {
            sum += i.height
        }
        return sum / list.size
    }

    fun getHeightAverage(): Double {
        return list.map { it.height }.average()
    }

    fun getWeightAverage(): Double {
        return list.map { it.weight }.average()
    }

    // vision의 분포 구하기
    // Copilot으로 작성된
    fun getVisionDistributionByCoPilot(): Map<Double, Int> {
        val map = mutableMapOf<Double, Int>()
        for (i in list) {
            if (map.containsKey(i.vision)) {
                map[i.vision] = map[i.vision]!! + 1
            } else {
                map[i.vision] = 1
            }
        }
        return map
    }

    fun getVisionDistribution(): Map<Double, Int> {
        return list.groupingBy { it.vision }.eachCount()
    }

    fun getBloodTypeDistribution(): Map<String, Int> {
        return list.groupingBy { it.bloodType }.eachCount()
    }

}