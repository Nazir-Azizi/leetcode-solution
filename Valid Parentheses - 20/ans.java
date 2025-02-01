class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if (isOpen(c)){
                stack.push(c);
            }else{
                if (stack.isEmpty())
                    return false;
                if (areSameType(stack.peek(), c))
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public boolean isOpen(char c){
        return c == '(' || c == '[' || c == '{';
    }
    public boolean areSameType(char open, char close){
        return 
        (open == '(' && close == ')') ||
        (open == '[' && close == ']') ||
        (open == '{' && close == '}');
    }
}
