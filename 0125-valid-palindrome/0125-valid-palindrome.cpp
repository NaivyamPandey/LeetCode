class Solution {
public:
    bool isPalindrome(string s) {
        
        int i = 0;
        int j = s.length() - 1; 

        while(i < j){

            if(!((s[i] >= 'A' && s[i] <= 'Z') || (s[i] >= 'a' && s[i] <= 'z') || isdigit(s[i]))){
                i++;
                continue;
            }
            if(!((s[j] >= 'A' && s[j] <= 'Z') || (s[j] >= 'a' && s[j] <= 'z') || isdigit(s[j]))){
                j--;
                continue;
            }
            s[i] = tolower(s[i]);
            s[j] = tolower(s[j]);
            if(s[i] == s[j]){
                i++;
                j--;
            }
            else{
                return false;
            }

        }

        return true;

    }
};