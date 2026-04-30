class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int e:nums){
            if(hm.containsKey(e)){
                return true;
            }
            hm.put(e,1);

        }
        return false;

        
    }}
