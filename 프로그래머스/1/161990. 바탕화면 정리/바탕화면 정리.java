import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        
        int u=-1;
        int l=50;
        int d=-1;
        int r=-1;
        
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[i].length();j++){
                if (wallpaper[i].charAt(j) == '#'){
                    System.out.println(i+", "+j);
                    if (u == -1) u = i;
                    if (l > j) l = j;
                    if (d <= i) d = i+1;
                    if (r <= j) r = j+1;   
                    System.out.println(u+", "+l+", "+d+", "+r);
                }
            }
        }       
        int[] answer = new int[] {u,l,d,r};
        
        
        return answer;
    }
}