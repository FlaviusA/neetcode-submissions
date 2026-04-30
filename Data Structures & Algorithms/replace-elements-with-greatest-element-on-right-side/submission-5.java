class Solution {
    public int[] replaceElements(int[] arr) {
        int[] newArr=new int[arr.length];
        newArr[arr.length-1]=-1;
        int runningMax=-1;
        for(int i=arr.length-1; i>=0; i--){
            newArr[i]=runningMax;
            runningMax=Math.max(runningMax,arr[i]);
        }
        return newArr;
        

        

        
        

        
    
}}