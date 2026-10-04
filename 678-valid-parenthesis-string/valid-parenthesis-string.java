class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> paren = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '(') paren.push(i);

            else if(ch=='*') star.push(i);

            else{
                if(!paren.isEmpty()) paren.pop();
                else if(!star.isEmpty()) star.pop();
                else return false;
            }
        }
        while(!paren.isEmpty() && !star.isEmpty()){
            if(paren.pop() > star.pop()) return false;
        }
        return paren.isEmpty();
    }
}