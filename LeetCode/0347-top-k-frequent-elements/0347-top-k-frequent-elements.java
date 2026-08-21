class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[][] count = new int[20002][2];

        int idx = 0;
        for(int num : nums) {
            count[num + 10000][0] = num;
            count[num + 10000][1]++;
        }

        Arrays.sort(count, (o1, o2) -> o2[1] - o1[1]);

        int[] answer = new int[k];

        for(int i=0; i<k; i++) {
            answer[i] = count[i][0];
        }

        return answer;
    }
}