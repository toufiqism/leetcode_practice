fun twoSum(nums: IntArray, target: Int): IntArray {

    var temp = 0
    val indices = intArrayOf()
    for (i in nums.indices) {
        temp = nums[i]
        if (nums[i] + temp == target) {
            indices.plus(i)
        } else {
            continue
        }
    }
    return indices
}