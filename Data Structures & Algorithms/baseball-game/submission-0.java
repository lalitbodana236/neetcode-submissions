class Solution {
    public int calPoints(String[] operations) {
         Stack<Integer> stack = new Stack<>();

        for (String action : operations) {
            if (!action.equals("C") && !action.equals("D") && !action.equals("+")) {
                stack.push(Integer.parseInt(action));
            } else if (action.equals("C")) {
                stack.pop();
            } else if (action.equals("D")) {
                stack.push(2 * stack.peek());
            } else { 
                int val1 = stack.pop();
                int val2 = stack.pop();
                int sum = val1 + val2;

                stack.push(val2);
                stack.push(val1);
                stack.push(sum);
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}