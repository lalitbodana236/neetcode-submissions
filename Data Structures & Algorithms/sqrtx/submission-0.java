class Solution {
    public int mySqrt(int x) {
        long left=1;
        long right=x;

        while(left<=right){
            long mid = left + (right - left)/2;
            
            if(mid*mid==(long)x){
                return (int)mid;
            }else if(mid*mid > (long)x){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return (int)right;
    }
}