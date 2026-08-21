class Solution {
    public String removeOuterParentheses(String s) {
        int open = 1;
        StringBuilder ans = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
                if(open!=1) ans.append(s.charAt(i));
            }
            else{
                if(open==1) open--;
                else{
                    ans.append(s.charAt(i));
                    open--;
                }
            }
        }
        return ans.toString();
    }
}