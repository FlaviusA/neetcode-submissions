class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLength= s.length();
        int firstPointer=0;
        if (s.length()==0) return true;
        for(int i=0; i<t.length();i++){
            if(s.charAt(firstPointer)==t.charAt(i)){
                firstPointer++;
            }
            if(firstPointer==s.length()) return true;
        }
        if(firstPointer!=s.length()) return false;
        return true;
        
    }
}