class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] arr = new int[100001];
        for(int i:nums){
            if(i>0){
                arr[i]=1;
            }
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]==0)    return i;
        }

        return 0;

    }
}