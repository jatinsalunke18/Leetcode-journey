class Solution {
    public String reverseParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(ans.toString());
                ans.setLength(0);
            }
            else if(s.charAt(i)==')'){
                ans.reverse();
                ans.insert(0,stack.pop());
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}