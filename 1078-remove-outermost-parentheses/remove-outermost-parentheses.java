class Solution {
    public String removeOuterParentheses(String s) {
        int cnt = 0;
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c=='('){
                cnt++;
                if(cnt>1){
                    ans.append(c);
                }
            }
            else{
                cnt--;
                if(cnt>=1){
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }
}