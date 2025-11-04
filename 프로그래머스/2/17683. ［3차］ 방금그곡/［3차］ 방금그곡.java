import java.util.*;

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        String[][] realMusicInfos = new String[musicinfos.length][4];
        
        int idx = 0;
        for(String musicinfo : musicinfos){
            realMusicInfos[idx++] = musicinfo.split(",");
        }
        
        m = m.replace("C#", "c").replace("D#", "d").replace("F#", "f").replace("G#", "g").replace("A#", "a").replace("B#", "b");
                
        int shortest = 0;
        String title = "";
        
        int tempRunTime = 0;
        
        for(String[] realMusicInfo : realMusicInfos){
            StringBuilder melodyExtend = new StringBuilder();
            
            realMusicInfo[3] = realMusicInfo[3].replace("C#", "c").replace("D#", "d").replace("F#", "f").replace("G#", "g").replace("A#", "a").replace("B#", "b");
            
            tempRunTime = ((realMusicInfo[1].charAt(0) - '0') * 600 + (realMusicInfo[1].charAt(1) - '0') * 60 + (realMusicInfo[1].charAt(3) - '0') * 10 + (realMusicInfo[1].charAt(4) - '0')) - ((realMusicInfo[0].charAt(0) - '0') * 600 + (realMusicInfo[0].charAt(1) - '0') * 60 + (realMusicInfo[0].charAt(3) - '0') * 10 + (realMusicInfo[0].charAt(4) - '0'));
            
            for(int i=0; i<tempRunTime; i++){
                melodyExtend.append(realMusicInfo[3].charAt(i%realMusicInfo[3].length()));
            }
            
            if (melodyExtend.toString().contains(m))
            {
                
                if (tempRunTime > shortest) {
                    shortest = tempRunTime;
                    title = realMusicInfo[2];
                }
            }
        }
        if (shortest == 0) return "(None)";
        else return title;
    }
}