class Solution {
    public boolean isValid(String s) {
        if(s.length()<2)return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                char ch = s.charAt(i);
                if(stack.isEmpty()) return false;
                if(ch==')' && stack.pop()!='(') return false;
                if(ch=='}' && stack.pop()!='{') return false;
                if(ch==']' && stack.pop()!='[') return false;
            }
        }
        return stack.isEmpty();
    }
}