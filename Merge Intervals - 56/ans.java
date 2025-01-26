class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1)
            return intervals;
        Arrays.sort(intervals, (r1, r2) -> Integer.compare(r1[0], r2[0]));

        List<int[]> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int row = 1; row < intervals.length; ++row){
            if (end >= intervals[row][1])
                continue;
            else if (intervals[row][0] <= end){
                end = intervals[row][1]; 
            }else{
                list.add(new int[]{start, end});
                start = intervals[row][0];
                end = intervals[row][1];
            }
        }
        list.add(new int[]{start, end});
        int[][] ans = new int[list.size()][];
        for(int i = 0; i < list.size(); ++i){
            ans[i] = new int[2];
            ans[i][0] = list.get(i)[0];
            ans[i][1] = list.get(i)[1];
        }
        return ans;
    }
}
