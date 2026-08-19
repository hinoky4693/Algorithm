class Solution {
    public int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length - 1;

        int leftHeight, rightHeight, ver, hor, area, answer = 0;
        while(leftIndex < rightIndex) {

            leftHeight = height[leftIndex];
            rightHeight = height[rightIndex];

            ver = Math.min(leftHeight, rightHeight);
            hor = rightIndex - leftIndex;
            area = hor * ver;

            answer = Math.max(area, answer);

            if(leftHeight < rightHeight) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }



        return answer;
    }
}