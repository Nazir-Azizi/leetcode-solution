class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1 || num == 4)
            return true;
        if (num < 9)
            return false;
        System.out.println(Math.sqrt(num));
        int low = 1, high = 50000;
        while (low <= high){
            int mid = low + (high - low) / 2;
            int res = mid * mid;
            if (res < 0)
                high = mid - 1;
            else if (res == num)
                return true;
            else if (res > num)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
}
