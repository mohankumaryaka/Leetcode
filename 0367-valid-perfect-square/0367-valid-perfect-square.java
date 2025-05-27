class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int left=1, right=num;
        while(left<=right){
            int mid = (left+right)/2;
            long mids = (long)mid*mid;
            if(mids==num)return true;
            else if(mids>num)right=mid-1;
            else left = mid+1;
        }
        return false;
    }
}