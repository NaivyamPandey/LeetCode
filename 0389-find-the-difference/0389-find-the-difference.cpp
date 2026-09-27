class Solution {
public:
    char findTheDifference(string s, string t) {
        int xo = 0;
        for(int i = 0; i < s.length(); i++){
            xo = s[i] ^ xo ^ t[i];
        }
        return (char)(xo ^ t[t.length() - 1]);
    }
};