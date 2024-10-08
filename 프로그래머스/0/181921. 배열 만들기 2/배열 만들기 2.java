// 1. for(int i = l; i<=r;i++){
// 2. 저 범위 안에서 i를 toString해서 만약 1,2,3,4,6,7,8,9 를 contain하고 않다면 안담고 else면 담음. 

import java.util.*;

class Solution {
    public ArrayList solution(int l, int r) {
        ArrayList answer = new ArrayList();
        for(int i=l;i<=r;i++){
            if (!(i+"").contains("1") &&
                !(i+"").contains("2") &&
                !(i+"").contains("3") &&
                !(i+"").contains("4") &&
                !(i+"").contains("6") &&
                !(i+"").contains("7") &&
                !(i+"").contains("8") &&
                !(i+"").contains("9")               ) answer.add(i);
        }
        if (answer.size() == 0) {
            answer.add(-1);
        }
        return answer;
    }
}