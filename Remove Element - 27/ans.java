class Solution {
    public int removeElement(int[] nums, int val) {
        int c = 0;
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] != val){
                int j = i;
                c++;
                int value = nums[j];
                while (j > 0 && nums[j - 1] == val){
                    nums[j] = nums[j - 1];
                    j--;
                }
                nums[j] = value;
            }
        }
        return c;
    }
}
