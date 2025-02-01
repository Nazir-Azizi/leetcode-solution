class Solution {
    public int calPoints(String[] operations) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < operations.length; ++i){
            if (operations[i].equals("C"))
                stack.pop();
            else if (operations[i].equals("D"))
                stack.push(stack.peek() * 2);
            else if (operations[i].equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a);
                stack.push(b);
                stack.push(a + b);
            }else
                stack.push(Integer.parseInt(operations[i]));
        }
        while(!stack.isEmpty())
            ans += stack.pop();
        return ans;
    }
}
