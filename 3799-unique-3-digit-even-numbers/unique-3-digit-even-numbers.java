class Solution {
    void func(int ind,int[] nums,int temp,boolean used[],HashSet<Integer> ans){
        if(ind==3){
            if(temp%2==0) ans.add(temp);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (ind == 0 && nums[i] == 0) continue;
            used[i] = true;
            func(ind + 1,nums,temp * 10 + nums[i],used,ans);
            used[i] = false;
        }
    }
    public int totalNumbers(int[] digits) {
        HashSet<Integer> ans = new HashSet<>();
        boolean used[] = new boolean[digits.length];
        func(0,digits,0,used,ans);
        return ans.size();
    }
}