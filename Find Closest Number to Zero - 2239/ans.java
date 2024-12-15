class Solution {
    public int findClosestNumber(int[] nums) {
        int ansIndex = 0;
        for (int i = 1; i < nums.length; ++i){
            if (Math.abs(nums[i]) < Math.abs(nums[ansIndex]))
                ansIndex = i;
            else if (Math.abs(nums[i]) == Math.abs(nums[ansIndex]))
                if (nums[i] > nums[ansIndex])
                    ansIndex = i;

        }
        return nums[ansIndex];
    }
}
