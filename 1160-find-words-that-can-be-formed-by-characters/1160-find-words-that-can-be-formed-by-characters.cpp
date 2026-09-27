class Solution {
public:
    int countCharacters(vector<string>& words, string chars) {
        
        unordered_map<char, int> cp;

        int ans = 0;

        for(int i = 0; i < chars.length(); i++){
            cp[chars[i]]++;
        }

        for(int i = 0; i < words.size(); i++){
            unordered_map<char, int> wp;
            for(int j = 0; j < words[i].length(); j++){
                wp[words[i][j]]++;
            }
            int temp = 0;
            for(auto x : wp){
                if(cp.find(x.first) == cp.end()){
                    break;
                }
                else{
                    if(x.second <= cp[x.first]){
                        temp += x.second;
                    }
                }
            }
            if(temp == words[i].length()){
                ans += temp;
            }
        }
        return ans;
    }
};