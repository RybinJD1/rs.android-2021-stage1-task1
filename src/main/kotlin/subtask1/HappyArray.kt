package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {

        if (sadArray.isEmpty() || sadArray.size <= 2) {
            return sadArray
        }

        val happyArray = sadArray.toMutableList()
        var i = 1
        while (i <= happyArray.size - 2) {
            if ((happyArray[i - 1] + happyArray[i + 1]) < happyArray[i]) {
                happyArray.removeAt(i)
                i = 1
            }
            i++
        }
        return happyArray.toIntArray()
    }
}
