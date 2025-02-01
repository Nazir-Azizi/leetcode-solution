class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0; i < nums.length; ++i){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.getOrDefault(nums[i], 0) > nums.length / 2.0){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}
