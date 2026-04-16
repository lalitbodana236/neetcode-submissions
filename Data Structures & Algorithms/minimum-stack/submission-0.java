class MinStack {

    Stack<Integer> stack;
    Integer min = Integer.MAX_VALUE;
    public MinStack() {
        stack = new Stack();
       min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
       min = Math.min(min,val); 
         stack.push(val);
    }
    
    public void pop() {
        stack.pop();
        min = Integer.MAX_VALUE;
        for(Integer i : stack){
            min  = Math.min(min,i); 
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
