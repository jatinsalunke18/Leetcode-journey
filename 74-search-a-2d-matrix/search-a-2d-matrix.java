class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length-1;
        int row = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid][0]<=target){
                row = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        low = 0;
        high = matrix[0].length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[row][mid]==target) return true;
            if(matrix[row][mid]<target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}