class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; ++i)
            sum += nums[i];
        
        int j = 0;
        int res = sum;
        // System.out.println("first k: " + nums[k - 1]);
        for(int i = k; i < nums.length; ++i){
            // System.out.println("sum: " + sum);
            // System.out.println("res: " + res);
            if (nums[j] > 0)
                sum -= nums[j];
            else
                sum += Math.abs(nums[j]);
            sum += nums[i];
            if (res < sum)
                res = sum;
            j++;
        }
        return res / (double)k;
    }
}
