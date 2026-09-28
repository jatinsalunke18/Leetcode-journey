/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findPeak(MountainArray mtArr){
        int low = 0;
        int high = mtArr.length()-1;  
        while(low<high){
            int mid = (low+high)/2;
            if(mtArr.get(mid)<=mtArr.get(mid+1)) low = mid+1;
            else high = mid;
        }
        return low;
    }
    public int bsL(int low,int high,int target,MountainArray mtArr){
        while(low<=high){
            int mid = (low+high)/2;
            if(mtArr.get(mid)==target) return mid;
            else if(mtArr.get(mid)<=target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public int bsR(int low,int high,int target,MountainArray mtArr){
        while(low<=high){
            int mid = (low+high)/2;
            if(mtArr.get(mid)==target) return mid;
            else if(mtArr.get(mid)>=target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mtArr) {
        int peak = findPeak(mtArr);
        if(bsL(0,peak,target,mtArr)!=-1) return bsL(0,peak,target,mtArr);
        else return  bsR(peak+1,mtArr.length()-1,target,mtArr);
    }
}