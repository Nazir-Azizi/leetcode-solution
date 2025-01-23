class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int start = 0, end = nums.length - 1;
        int index = end;
        while (start <= end){
            if (Math.abs(nums[start]) > Math.abs(nums[end])){
                res[index--] = nums[start] * nums[start];
                start++;
            }else{
                res[index--] = nums[end] * nums[end];
                end--;
            }
        }
        return res;
    }
}
