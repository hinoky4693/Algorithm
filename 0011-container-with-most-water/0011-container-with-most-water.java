class Solution {
    public int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length - 1;

        int leftHeight, rightHeight, ver, hor, area, answer = 0;
        while(leftIndex < rightIndex) {

            leftHeight = height[leftIndex];
            rightHeight = height[rightIndex];

            hor = Math.min(leftHeight, rightHeight);
            ver = rightIndex - leftIndex;
            area = ver * hor;

            answer = Math.max(area, answer);

            if(leftHeight < rightHeight) {
                leftIndex++;
            } else if(leftHeight > rightHeight) {
                rightIndex--;
            } else {
                while(leftIndex < rightIndex && leftHeight == rightHeight) {
                    if(leftIndex + 1 >= height.length || rightIndex - 1 < 0) break;

                    if(height[leftIndex + 1] < height[rightIndex - 1]) {
                        rightIndex--;
                        break;
                    } else if(height[leftIndex + 1] > height[rightIndex - 1]){
                        leftIndex++;
                        break;
                    } else {
                        leftIndex++;
                        rightIndex--;
                        area = (rightIndex - leftIndex) * height[leftIndex];
                        answer = Math.max(area, answer);
                    }
                }
            }
        }



        return answer;
    }
}