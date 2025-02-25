fun missingNumber(nums: IntArray): Int {
    val n = nums.size
    val sortedNums = nums.sorted()

    for (i in 0..<n) {
        if (i != sortedNums[i]) {
            return i
        }
    }

    return n // Return `n` if all previous numbers are present
}