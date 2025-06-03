class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean unique = true;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j){
                    unique = false;
                    break;
                }
            }
            if(unique)return nums[i];
        }
        return -1;
    }
}