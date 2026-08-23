import java.util.*;

class Solution {
    public boolean sumGame(String num) {
        int firstHalf = 0;
        int secondHalf = 0;
        int firstQcnt = 0;
        int secondQcnt = 0;
        

        for(int i=0; i<num.length() / 2; i++) {
            if(num.charAt(i) != '?') {
                firstHalf  += num.charAt(i) - '0';
            } else {
                firstQcnt++;
            }

            if(num.charAt(num.length() / 2 + i) != '?') {
                secondHalf += num.charAt(num.length() / 2 + i) - '0';
            } else {
                secondQcnt++;
            }
        }

        if(firstHalf == secondHalf && firstQcnt == secondQcnt) return false;
        else if (firstHalf == secondHalf && firstQcnt != secondQcnt) return true;

        if(firstHalf > secondHalf) {
            if(firstQcnt >= secondQcnt) return true;
            else {
                int Qcnt = secondQcnt - firstQcnt;
                int gap = firstHalf - secondHalf;
                if(Qcnt % 2 == 0){
                    if(gap > (Qcnt / 2) * 9 || gap < (Qcnt / 2) * 9) return true;
                    else return false;
                } else {
                    if(gap > (Qcnt / 2 - 1) * 9 || gap < (Qcnt / 2 - 1) * 9) return true;
                    else return false;
                }
            }           
        }
        else if(firstHalf < secondHalf) {
            if(secondQcnt >= firstQcnt) return true;
            else {
                int Qcnt = firstQcnt - secondQcnt;
                int gap = secondHalf - firstHalf;
                if(Qcnt % 2 == 0){
                    if(gap > (Qcnt / 2) * 9 || gap < (Qcnt / 2) * 9) return true;
                    else return false;
                } else {
                    if(gap > (Qcnt / 2 - 1) * 9 || gap < (Qcnt / 2 - 1) * 9) return true;
                    else return false;
                }
            }
        }



        System.out.println(num);
        System.out.println(firstHalf);
        System.out.println(secondHalf);
        System.out.println(firstQcnt);
        System.out.println(secondQcnt);
        


        return true;
    }
}