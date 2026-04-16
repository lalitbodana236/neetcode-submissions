class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(String val : tokens){
            if(val.equals("+")){
                int val1= stack.pop();
                int val2= stack.pop();
                stack.push(val1+val2);
            }else if(val.equals("*")){
                int val1= stack.pop();
                int val2= stack.pop();
                stack.push(val1*val2);
            }else if(val.equals("-")){
                int val1= stack.pop();
                int val2= stack.pop();
                stack.push(val2-val1);
            }else if(val.equals("/")){
                int val1= stack.pop();
                int val2= stack.pop();
                stack.push(val2/val1);
            }else{
                stack.push(Integer.parseInt(val));
            }
        }

        return stack.pop();
    }
}
