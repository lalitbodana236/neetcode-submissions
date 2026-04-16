class Solution {
    public boolean isValid(String s) {
      Stack<Character>stack = new Stack();

      for  (char ch : s.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                stack.push(ch);
            }else{
                if(stack.isEmpty() || !isCheck(stack.pop(),ch))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public boolean isCheck(char o,char c){
        return (('{'==o && '}'==c) || ('('==o && ')'==c) || ('['==o && ']'==c));
    }
}
