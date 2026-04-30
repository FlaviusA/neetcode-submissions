class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int,int> hashmap;
        for(int &value:nums)
        {
            hashmap[value]++;

        }
        for(const auto &i: hashmap)
        {
            if(i.second!=1)
            {
                return true;
            }
        }
        return false;

    }
};
