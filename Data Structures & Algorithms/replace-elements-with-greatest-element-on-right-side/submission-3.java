class Solution {
    public int[] replaceElements(int[] arr) {
        int[] newArr=new int[arr.length];
        newArr[arr.length-1]=-1;
        for(int i=arr.length-2; i>=0; i--){
            newArr[i]=Math.max(arr[i+1],newArr[i+1]);
        }
        return newArr;
        

        

        
        

        
    
}}