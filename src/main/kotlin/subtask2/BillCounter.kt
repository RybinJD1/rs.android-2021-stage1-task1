package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val arr = bill.toMutableList()
        arr.removeAt(k)
        val sum = arr.sum()
        return if (sum/2 == b) {
            "Bon Appetit"
        } else {
            val refund = b- sum/2
            refund.toString()
        }
    }
}
