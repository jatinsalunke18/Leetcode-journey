class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> list:knowledge){
            String key = list.get(0);
            String val = list.get(1);
            map.put(key,val);
        }
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                int j = i+1;
                while(s.charAt(j)!=')'){
                    temp.append(s.charAt(j));
                    j++;
                }
                i=j;
                ans.append(map.getOrDefault(temp.toString(),"?"));
                temp.setLength(0);
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}