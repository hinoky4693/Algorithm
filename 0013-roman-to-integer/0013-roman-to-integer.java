import java.util.*;

class Solution {
    public int romanToInt(String s) {
        
        char curr = s.charAt(0);

        int sum = 0;
        s += 'a';
        
        for(int i=1; i<s.length(); i++) {
            char next = s.charAt(i);

            if     (curr == 'M') sum += 1000;
            else if(curr == 'D') sum += 500;
            else if(curr == 'C') {
                if(i < s.length() - 1) {
                    if(next == 'M') {
                        sum += 900;
                        i++;
                        curr = s.charAt(i);
                        continue;
                    }

                    if(next == 'D') {
                        sum += 400;
                        i++;
                        curr = s.charAt(i);
                        continue;
                    }
                }

                sum += 100;
            }
            else if(curr == 'L') sum += 50;
            else if(curr == 'X') {
                if(i < s.length() - 1) {
                    if(next == 'C') {
                        sum += 90;
                        i++;
                        curr = s.charAt(i);
                        continue;
                    }

                    if(next == 'L') {
                        sum += 40;
                        i++;
                        curr = s.charAt(i);
                        continue;
                    }
                }

                sum += 10;
            }
            else if(curr == 'V') sum += 5;
            else if(curr == 'I') {
                if(i < s.length() - 1) {
                    if(next == 'X') {
                        sum += 9;
                        i++;
                        curr = s.charAt(i);
                        continue;
                    }

                    if(next == 'V') {
                        sum += 4;
                        i++;
                        curr = s.charAt(i);
                        continue;
                    }
                }
                
                sum += 1;
            }

            curr = next;
        }
        
        return sum;
    }
}