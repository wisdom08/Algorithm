package leetcode

class _1920 {
    fun buildArray(nums: IntArray): IntArray {
        return nums.mapIndexed{ index, _ -> nums[nums[index]] }.toIntArray()
    }

    fun buildArray_2(nums: IntArray) : IntArray = IntArray(nums.size) { nums[nums[it]] }

    fun buildArray_3(nums: IntArray): IntArray {
        val intArray = IntArray(nums.size)
        for (index in intArray.indices) {
            intArray[index] = nums[nums[index]]
        }
        return intArray
    }
}

// https://leetcode.com/problems/build-array-from-permutation/