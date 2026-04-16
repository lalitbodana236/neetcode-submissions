class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();

        for(String op : operations){
            if(op.equals("D")){
                Integer val = stack.peek();
                stack.push(val * 2);
            }else if(op.equals("C")){
                stack.pop();
            }else if(op.equals("+")){
                Integer val2 = stack.pop();
                Integer val1 = stack.pop();
                stack.push(val1);
                stack.push(val2);
                stack.push(val1+val2); 
            }else{
                stack.push(Integer.parseInt(op));
            }
        }

        Integer result=0;
        for(Integer i : stack){
            result+=i;
        }

        return result;
    }
}