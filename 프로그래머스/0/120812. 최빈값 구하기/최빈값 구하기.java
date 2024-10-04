

// 1. arr에 들어있는 원소들의 빈도 수를 담을 int[] count를 선언.
// 2. count 크기는 arr 안에 들어 있는 원소 중 가장 큰 수와 같아야한다. 크기 구하기 위해서 int max 선언.
// 3. 근데 원소에 0 포함이니까 count 크기는 max + 1  -> int[] count = new int[max+1];
// 4. array를 for문 돌리면서 count[i]++ 해줘서 count에 빈도수를 올려줌.
// 5. 완성된 count sort해서 가장 마지막 값 = 최빈값 answer에 담음. 그런데 만약에 마지막값과 그 앞에 값이 똑같다면 최빈값이 여러개라는 뜻이니까 answer에 -1 담음.
import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int max = array[array.length-1];
        int[] count = new int[max+1];
        
        for(int i=0; i<array.length; i++){
            count[array[i]]++;
        }
        int max1 = 0;
        int max2 = 0;
        for(int i=0;i<count.length;i++){
            if (count[i]>max1) {
                max1 = count[i];
                answer = i;
            } else if(count[i] == max1){
                max2 = count[i];
            }
        }
        
        
        return max1 == max2 ? -1 : answer ;
    }
}