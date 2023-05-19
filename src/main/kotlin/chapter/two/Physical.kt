package chapter.two

data class Person(
    val name: String, val height: Int, val weight: Int, val vision: Double, val bloodType: String
)

class Physical {

    // 신체 검사 클래스

    val list = mutableListOf<Person>()

    fun setPerson() {
        list.add(Person(setName(), setHeight(), setWeight(), setVision(), setBloodType()))
    }

    fun setName(): String {
        print("이름 : ")
        return readln()
    }

    fun setHeight(): Int {
        print("키 : ")
        return readln().toInt()
    }

    fun setWeight(): Int {
        print("몸무게 : ")
        return readln().toInt()
    }

    fun setVision(): Double {
        print("시력 : ")
        return readln().toDouble()
    }

    fun setBloodType(): String {
        print("혈액형 : ")
        return readln()
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
        val avg = list.map { it.height }.average()
        return String.format("%.2f", avg).toDouble()
    }

    fun getWeightAverage(): Double {
        val avg = list.map { it.weight }.average()
        return String.format("%.2f", avg).toDouble()
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