class Solution {
    boolean iselement(int[] arr,int x,int ind){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x && i!=ind) return true;
        }
        return false;
    }
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(iselement(arr,arr[i]*2,i)) return true;
        }
        return false;
    }
}