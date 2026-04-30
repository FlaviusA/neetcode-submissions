class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int sum=0;
        int length=s.length();
        vector<int> letter_frequency(26,0);
        for(int i=0; i<s.length(); i++)
        {
            letter_frequency[s[i]-'a']++;
            letter_frequency[t[i]-'a']--;



        }
        for(auto letter: letter_frequency)
        {
            if(letter!=0)
            {
                return false;
            }
        }
        return true;




    }
    

};
