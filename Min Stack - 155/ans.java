class MinStack {
    private ArrayList<int[]> list;

    public MinStack() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        int preSmall = list.isEmpty()? val : list.get(list.size() - 1)[1];
        int smallest = val;
        if (preSmall < smallest)
            smallest = preSmall;
        list.add(new int[] {val, smallest});
    }

    public void pop() {
        list.removeLast();
    }
    
    public int top() {
        return list.getLast()[0];
    }
    public int getMin() {
       return list.getLast()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
