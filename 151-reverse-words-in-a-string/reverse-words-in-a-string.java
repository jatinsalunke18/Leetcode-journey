class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(i==0){
                temp.append(s.charAt(i));
                ans.append(temp.reverse());
                temp.setLength(0);
            }
            else if(s.charAt(i-1)==' ' && s.charAt(i)==' ') continue;
            else if(s.charAt(i)==' '){
                ans.append(temp.reverse()+" ");
                temp.setLength(0); 
            }
            else temp.append(s.charAt(i)); 
        }
        return ans.toString();
    }
}