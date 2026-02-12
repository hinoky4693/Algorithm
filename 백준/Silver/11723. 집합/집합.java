import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Set<Integer> set = new HashSet<>();
        Set<Integer> tempSet = new HashSet<>();
        
        for(int i = 1; i<=20; i++){
            tempSet.add(i);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int tc = 0; tc < M; tc++) {
            st = new StringTokenizer(br.readLine());
            
            String command = st.nextToken();
            switch(command) {
                case "add": {
                    set.add(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "remove": {
                    set.remove(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "check": {
                    if(set.contains(Integer.parseInt(st.nextToken()))) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                }
                case "toggle": {
                    int value = Integer.parseInt(st.nextToken());
                    if(set.contains(value)) {
                        set.remove(value);
                    } else {
                        set.add(value);
                    }
                    break;
                }
                case "all": {
                    set.clear();
                    set.addAll(tempSet);
                    break;
                }
                case "empty": {
                    set.clear();
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}