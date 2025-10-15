fun romanToInt(number: String): Int {
    var total = 0
    // STEP 1: The Look-up Table
    val values = mapOf(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000
    )


    for (i in 0..number.length - 2) {
        val currentValue = values.getValue(number[i].toString()).toInt()
        val nextValue = values.getValue(number[i + 1].toString()).toInt()
        if (currentValue < nextValue) {
            // This is the special case, like 'I' before 'V'. Subtract.
            total -= currentValue
        } else {
            // This is the normal case, like 'V' before 'I', or 'X' before 'X'. Add.
            total += currentValue
        }
    }
    total += values.getValue(number.last().toString())
    return total
}