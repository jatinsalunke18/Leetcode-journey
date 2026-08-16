class Solution {
    int max(int[][] mat,int mid,int n){
        int maxInd = 0;
        for(int i=0;i<n;i++){
            if(mat[maxInd][mid]<mat[i][mid]) maxInd = i;
        }
        return maxInd;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int row = max(mat,mid,n);
            int left = (mid>0)?mat[row][mid-1]:-1;
            int right = (mid+1<m)?mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]>right) return new int[]{row,mid};
            if(mat[row][mid]<left) high = mid-1;
            else low = mid+1;
        }
        return new int[]{-1,-1};
    }
}