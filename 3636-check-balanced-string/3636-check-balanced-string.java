class Solution {
    public boolean isBalanced(String num) {
        char str[] = num.toCharArray();
        int even = 0;
        int odd = 0;
        for(int i=0;i<str.length;i++){
            int digit = str[i]-'0';
            if(i%2==0) even += digit;
            else odd += digit;
        }
        return even == odd;
    }
}