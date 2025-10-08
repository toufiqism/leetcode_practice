fun twoSum(nums: IntArray, target: Int): IntArray {

    var indices = intArrayOf()
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                indices = indices.plus(i)
                indices = indices.plus(j)
            }
        }
    }
    return indices
}