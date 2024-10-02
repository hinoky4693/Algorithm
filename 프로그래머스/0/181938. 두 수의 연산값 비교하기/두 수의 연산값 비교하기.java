class Solution {
    public int solution(int a, int b) {
        int ans1 = 0;
        int ans2 = 0;
        
        ans1 = Integer.parseInt(a+""+b+"");
        ans2 = 2*a*b;
        
        if (ans1 >= ans2){
            return ans1;
        } else{
            return ans2;
        }

    }
}