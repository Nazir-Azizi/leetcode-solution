class Solution {
    class Pair{
        int value;
        int index;
        Pair(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> stack = new Stack<>();
        int[] arr = new int[temperatures.length];
        arr[temperatures.length - 1] = 0;
        stack.push(new Pair(temperatures[temperatures.length - 1], temperatures.length - 1));

        for(int i = temperatures.length - 2; i >= 0; i--){
            while (!stack.isEmpty() && stack.peek().value <= temperatures[i])
                stack.pop();
            
            if (stack.isEmpty())
                arr[i] = 0;
            else
                arr[i] = stack.peek().index - i;
            stack.push(new Pair(temperatures[i], i));
        }
        return arr;
    }
}
