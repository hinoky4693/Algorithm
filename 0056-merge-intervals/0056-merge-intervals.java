class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (o1, o2) -> {
            if(o1[0] == o2[0]) return o1[1] - o2[1];
            return o1[0] - o2[0];
        });

        System.out.println(Arrays.deepToString(intervals));
        int idx = 0;

        ArrayList<int[]> list = new ArrayList<>();
        
        while(idx < intervals.length - 1) {
            int[] curr = intervals[idx];
            int[] next = intervals[idx + 1];
            int currStart = curr[0];
            int currEnd = curr[1];
            int nextStart = next[0];
            int nextEnd = next[1];

            if(currEnd < nextStart) list.add(curr);
            else if(currEnd >= nextEnd) {
                if(currEnd > nextEnd) {
                    next[1] = curr[1];
                }
                if(currStart < nextStart){
                    next[0] = curr[0];
                }
                else {
                    idx++;
                    continue;
                }
            }
            else next[0] = curr[0];

            idx++;
        }
        
        list.add(intervals[intervals.length - 1]);

        int[][] answer = new int[list.size()][2];

        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}