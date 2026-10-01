class Solution {
public:
    int numberOfMatches(int n) {
        int ans = 0;
        while(n != 0){
            if(n%2 == 0) {
                n /= 2;
                ans += n;
            }
            else {
                n /= 2;
                ans = ans + n + 1;
            }
        }
        return ans - 1;
    }
};