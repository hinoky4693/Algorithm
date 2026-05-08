class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int minBill = 0;
        int minWallet = 0;
        int maxBill = 0;
        int maxWallet = 0;
        while(true) {
            minBill = Math.min(bill[0], bill[1]);
            minWallet = Math.min(wallet[0], wallet[1]);
            maxBill = Math.max(bill[0], bill[1]);
            maxWallet = Math.max(wallet[0], wallet[1]);
            if(minBill > minWallet || maxBill > maxWallet) {
                if(bill[0] > bill[1]) bill[0] /= 2;
                else bill[1] /= 2;
                answer++;
                continue;
            }
            break;
        }
        
        
        return answer;
    }
}