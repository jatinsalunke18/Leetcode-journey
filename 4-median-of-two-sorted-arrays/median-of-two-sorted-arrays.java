class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        int first = (len-1)/2;
        int second = len/2;
        int a = 0;
        int b = 0;
        int left = 0;
        int right = 0;
        int count = 0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]<=nums2[right]){
                if(count==first) a = nums1[left];
                if(count==second) b = nums1[left];
                count++;
                left++;
            }
            else{
                if(count==first) a = nums2[right];
                if(count==second) b = nums2[right];
                count++;
                right++;
            }
        }
        while(left<nums1.length){
            if(count==first) a = nums1[left];
            if(count==second) b = nums1[left];
            left++;
            count++;
        }
        while(right<nums2.length){
            if(count==first) a = nums2[right];
            if(count==second) b = nums2[right];
            right++;
            count++;
        }
        return (a+b)/2.0;
    }
}