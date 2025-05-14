class Solution {
    public int searchInsert(int[] nums, int target) {
        int str = 0;
        int end = nums.length-1;
        while(str<=end){
            int mid = (str+end)/2;
            if(target>nums[mid]){
                str = mid+1;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else return mid;
        }
        return str;
    }
}