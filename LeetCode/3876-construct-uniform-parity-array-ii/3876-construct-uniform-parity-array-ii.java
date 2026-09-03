class Solution {
    public boolean uniformArray(int[] nums1) {
        
        Arrays.sort(nums1);
        

        boolean odd = false;
        boolean even = false;
        if(nums1[0] % 2 == 0) even = true;
        else odd = true; 

        for(int i=0; i<nums1.length; i++) {
            if(even && nums1[i] % 2 == 1) return false;
        }
        return true;
    }
}