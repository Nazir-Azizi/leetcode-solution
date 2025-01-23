class Solution {
    public int maxNumberOfBalloons(String text) {
        if (text.length() < 7)
            return 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : text.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int res = Integer.MAX_VALUE;
        if (map.getOrDefault('b', 0) == 0 ||
            map.getOrDefault('a', 0) == 0 ||
            map.getOrDefault('l', 0) == 0 ||
            map.getOrDefault('o', 0) == 0 ||
            map.getOrDefault('n', 0) == 0
        )
            return 0;
        
        res = Math.min(res, map.getOrDefault('b', 0));
        res = Math.min(res, map.getOrDefault('a', 0));
        res = Math.min(res, map.getOrDefault('l', 0) / 2);
        res = Math.min(res, map.getOrDefault('o', 0) / 2);
        res = Math.min(res, map.getOrDefault('n', 0));

        return res;

    }
}
