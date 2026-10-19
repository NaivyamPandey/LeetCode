class Solution {

    public int genNext(int num){
        int ans = 0;
        while(num > 0){
            int mod = num % 10;
            ans += mod;
            num /= 10;
        }
        return ans;
    }

    public int addDigits(int num) {
        
        while(num > 9){
            num = genNext(num);
        }
        return num;
    }
}