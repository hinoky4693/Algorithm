import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        int left = 0;
        int right = 1;
        int sum = sequence[0] + sequence[1];
        int min = Integer.MAX_VALUE;
        
        if(sequence[0] == k) return new int[] {0, 0};
        
        outer:
        while(left <= right) {
            
            if(right == sequence.length - 1) {
                while(left <= right) {
                    if(sum < k) break outer;
                    else if(sum > k) {
                        sum -= sequence[left];
                        left++;
                    } else if(sum == k) {
                        if(right - left < min) {
                            min = Math.min(right - left, min);

                            answer[0] = left;
                            answer[1] = right;
                        }
                        sum -= sequence[left];
                        left++;
                    }
                }
                break outer;
            }
            
            
            if(sum == k) {
                if(right - left < min) {
                    min = Math.min(right - left, min);

                    answer[0] = left;
                    answer[1] = right;
                }
                
                right++;
                sum += sequence[right];
            }
            
            else if(sum > k) {
                sum -= sequence[left];
                left++;
            }
            
            else if(sum < k) {
                right++;
                sum += sequence[right];
            }
        }
        
        
        
        return answer;
    }
}