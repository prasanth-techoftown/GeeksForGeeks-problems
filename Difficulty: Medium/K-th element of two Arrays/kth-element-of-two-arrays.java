// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
    
    
        ArrayList<Integer> list = new ArrayList<>();
        
        
        for(int i=0;i<a.length;i++){
            list.add(a[i]);
        }
        
        for(int i=0;i<b.length;i++){
            list.add(b[i]);
        }
        
        
        int[] arr = new int[list.size()];
        
        int g=0;
        for(int as:list){
            arr[g++]=as;
        }
        
        Arrays.sort(arr);
        
        return arr[k-1];
        
        
    }
}