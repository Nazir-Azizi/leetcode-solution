class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums); one line solution
        for (int i = nums.length - 2; i >= 0; --i){
            int j = i;
            while (j < nums.length - 1 && nums[j] > nums[j + 1]){
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
                j++;
            }
        }
    }
}
