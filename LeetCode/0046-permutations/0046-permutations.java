class Solution {
    
    int[] sel;
    int[] nums;
    boolean[] visited;
    List<List<Integer>> list = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {

        this.nums = nums;
        sel = new int[nums.length];
        visited = new boolean[sel.length];

        perm(0);

        return list;
    }

    void perm(int idx) {
        if(idx == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for(int i=0; i<sel.length; i++) {
                temp.add(sel[i]);
            }
            list.add(temp);
        }
        
        for(int i=0; i<nums.length; i++) {
            
            if(!visited[i]) {
                visited[i] = true;
                sel[idx] = nums[i];
                perm(idx + 1);
                visited[i] = false;
            }
            
        }
    }
}