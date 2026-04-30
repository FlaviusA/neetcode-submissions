class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        Map<Character,Integer> freq1=new HashMap<>();
        for(char ch: s.toCharArray()){
            freq1.merge(ch,1,Integer::sum);
        }
        for(char ch: t.toCharArray()){
            freq1.merge(ch,-1,Integer::sum);
            if (freq1.get(ch) == 0) freq1.remove(ch);
        }
        return freq1.isEmpty();

    
        }

        
        

    }

