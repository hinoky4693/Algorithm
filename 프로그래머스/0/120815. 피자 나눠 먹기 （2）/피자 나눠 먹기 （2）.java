// 1. n * 6을 answer에 담는다.
// 2. for(int i=0;i<answer;i++){
//    if (n % i == 0 && 6 % i == 0){
//        answer /= i를 해준다.
//       }
//    }을 해준다.

class Solution {
    public int solution(int n) {
//         int answer = n*6;
//         for(int i=1;i<=n;i++){
//             if (6 % i == 0 && n % i == 0){
//                  answer /= i;
//             }
//         }
        
//         if (answer > 6 && answer % 6 == 0){
//             answer /= 6;
//         }
        int count = 1;
        while((6*count)/n<1||(6*count)%n!=0)
        {
            count++;
        }
        
        return count;
    }
}