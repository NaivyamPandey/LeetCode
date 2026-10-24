class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long ans = 0;
        while(n != 0){
            long mod = n % 10;
            n /= 10;
            sum += mod;
            if(mod != 0){
                ans = ans*10 + mod;
            }
        }
        long num = ans;
        ans = 0;
        while(num != 0){
            long mod = num % 10;
            num /= 10;
            ans = ans*10 + mod;
        }
        return ans*sum;
    }
}