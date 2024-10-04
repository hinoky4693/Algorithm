// 1. 일단 기약분수 생각하지 말고 denom1 * denom2를 분모로 만들어서 계산한 결과를 만들어냄.
// 2. 그리고 for문으로 분모 크기만큼 돌려서 분자 % i, 분모 % i 해서 두개 동시에 만족하는, 즉, 분모 분자간의 공약수가 있다면 나눠줌.
// 3. 그렇게 결과로 나온 분수를 answer에 담아서 return.

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = 0;
        int denom = 0;
        
        numer1 = numer1 * denom2;
        numer2 = numer2 * denom1;
        numer = numer1 + numer2;
        denom = denom1 * denom2;
        
        for(int i=1;i<1000;i++){
            if(denom%i ==0 && numer%i == 0){
                
                numer /= i;
                denom /= i;
                i=1;
            }
        }
        
        answer[0] = numer;
        answer[1] = denom;
        
        return answer;
    }
}