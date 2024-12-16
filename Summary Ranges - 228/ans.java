class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length < 1)
            return new ArrayList<String>();
        if (nums.length == 1){
            List<String> list = new ArrayList<>();
            list.add(nums[0] + "");
            return list;    
        }
        long start = nums[0];
        long end = nums[0];
        List<String> list = new ArrayList<>();
        boolean lastIsIn = false;
        long p = nums[0];
        for (int i = 1; i < nums.length; ++i){
            if (++p == nums[i]){
                end = nums[i];
            }else{
                if (start == end)
                    list.add(start + "");
                else
                    list.add(start + "->" + end);
                
                start = nums[i];
                end = start;
                if (i == nums.length - 1){
                    list.add(nums[i] + "");
                    lastIsIn = true;
                    break;
                }
                p = end;
            }
        }
        if (p == end)
            list.add(start + "->" + p);
        return list;
    }
}
