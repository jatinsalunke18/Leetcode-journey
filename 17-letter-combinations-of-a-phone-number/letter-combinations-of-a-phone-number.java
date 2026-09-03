class Solution {
    void func(int ind,String digits,String temp,List<String> ans){
        String[] combo = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(ind==digits.length()){
            ans.add(temp);
            return;
        }
        String s = combo[digits.charAt(ind)-'0'];
        for(int i=0;i<s.length();i++){
            func(ind+1,digits,temp+s.charAt(i),ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0) return ans;
        func(0,digits,"",ans);
        return ans;
    }
}