class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s: tokens){
            if (isOperator(s)){
                int b = stack.pop();
                int a = stack.pop();
                if (s.equals("+"))
                    stack.push(a + b);
                else if (s.equals("-"))
                    stack.push(a - b);
                else if (s.equals("*"))
                    stack.push(a * b);
                else
                    stack.push(a / b);
            }else
                stack.push(Integer.parseInt(s));
        }
        return stack.peek();
    }
    public boolean isOperator(String s){
        return
        s.equals("+") ||
        s.equals("-") ||
        s.equals("*") ||
        s.equals("/");
    }
}
