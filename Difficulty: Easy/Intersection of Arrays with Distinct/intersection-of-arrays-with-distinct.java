class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        // Your code here
        
        Map<Integer,Integer> map = new HashMap<>();
     
     
       for(int ans: a){
           map.put(ans,map.getOrDefault(ans,0)+1);
       }
     int count=0;
     for(int i=0;i<b.length;i++){
         
         if(map.containsKey(b[i])){
             count++;
         }
     }
     
     
     
        
        return count;
    }
}