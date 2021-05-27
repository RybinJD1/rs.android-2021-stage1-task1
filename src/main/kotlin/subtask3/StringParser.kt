package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val builder = StringBuilder(inputString)
        val brackets = listOf('<', '(', '[', '>', ')', ']')
        val output = ArrayList<String>()
        for (i in builder.length -1 downTo 0) {
            if (builder[i] in brackets.subList(0, 3)) {
                var previous = 0
                for (j in i..builder.length) {
                    if (builder[j] == brackets[brackets.indexOf(inputString[i]) + 3]) {
                        previous = j
                        builder[i] = ' '
                        builder[previous] = ' '
                        break
                    }
                }
                output.add(0, inputString.substring(i + 1, previous))
            }

        }
        return output.toTypedArray()
    }
}
