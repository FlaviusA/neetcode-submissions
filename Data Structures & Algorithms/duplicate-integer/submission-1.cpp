class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        
        unordered_set<int> hashset;
        for(auto &value: nums)
        {
            if(hashset.find(value)!=hashset.end())
            {
                return true;
            }
            hashset.insert(value);



        }
        return false;
       
    }
};
