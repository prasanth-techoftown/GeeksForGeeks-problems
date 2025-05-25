class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        
        int k=1;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]!= arr[i-1]){
                arr[k++] = arr[i];
            }
            
        }
        
        return k;
        
    }
}