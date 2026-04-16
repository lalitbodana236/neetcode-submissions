class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

      
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    public int binarySearch(int[] nums,int target,int left,int right){
       while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;

    }

    public int findPivot(int[] nums){
        int left=0;
        int right=nums.length-1;

        while(left<right){
            int mid=left + (right - left) / 2;
            if (mid < right && nums[mid] > nums[mid + 1]) return mid;
            if (mid > left && nums[mid - 1] > nums[mid]) return mid - 1;

            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
