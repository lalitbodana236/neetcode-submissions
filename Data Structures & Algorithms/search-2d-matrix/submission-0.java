class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int num=-1;
        for(int i=0;i<matrix.length;i++){
           int idx= search(matrix[i],target);
            if(idx>=0 && matrix[i][idx]==target){
                return true;
            }
           
        }

        return false;
    }

    public int search(int[] arr,int target){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(arr[mid]==target){
                return mid;
            }else if(target>arr[mid]){
                left= mid+1;
            }else{
                right=mid-1;
            }
        }

        return -1;
    }
}
