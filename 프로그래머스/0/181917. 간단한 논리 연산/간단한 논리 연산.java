// 1. 조건 식을 보니까 x1, x2, x3, x4 전부다 true 가 아닌 이상에야 result는 false임.
// 2. 그래서 4개 다 곱해서 1이 아니면 0이 포함되있다는 것이고 그러면 result = false;
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        if ((x1 == true || x2 == true) && (x3 ==true || x4 == true)) return true;
        else return false;
    }
}