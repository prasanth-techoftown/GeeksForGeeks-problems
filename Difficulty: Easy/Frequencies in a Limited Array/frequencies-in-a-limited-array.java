


class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
       
     int[] hash = new int[arr.length];
     
     
     for(int i=0;i<arr.length;i++){
         
     if (arr[i] >= 1 && arr[i] <= arr.length) {
            hash[arr[i] - 1]++;
        }
     }
     List<Integer> list = new ArrayList<>();
     
     for(int i=0;i<hash.length;i++){
         list.add(hash[i]);
     }
     return list;
        
    }
}
