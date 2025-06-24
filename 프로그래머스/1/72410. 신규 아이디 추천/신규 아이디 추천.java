class Solution {
    public String solution(String new_id) {
        String answer = "";
        StringBuilder prev = new StringBuilder();
        StringBuilder next = new StringBuilder();
        
        for(int i=0;i<new_id.length();i++){
            if(new_id.charAt(i)-'0' < 17 || new_id.charAt(i)-'0' > 42){
                prev.append(new_id.charAt(i));
                continue;
            }
            prev.append((char)(new_id.charAt(i) + 32));
        }
        
        for(int i=0;i<prev.length();i++){
            if(prev.charAt(i) == '-') next.append('-');
            else if(prev.charAt(i) == '.') next.append('.');
            else if(prev.charAt(i) == '_') next.append('_');
            else if(prev.charAt(i) - '0' >= 0 && prev.charAt(i) - '0' <= 9)
                next.append(prev.charAt(i));
            else if((prev.charAt(i)) -'0' >= 49 && prev.charAt(i) -'0' <= 74)
                next.append(prev.charAt(i));
        }
        prev.setLength(0);
        prev.append(next);
        next.setLength(0);
        
        boolean flag = false;
        for(int i=0;i<prev.length();i++){
            if (flag == false && prev.charAt(i) == '.') {
                flag = true;
                next.append('.');
            }
            if(flag == true && prev.charAt(i) == '.') continue;
            if(flag == true && prev.charAt(i) != '.') {
                flag = false;
                next.append(prev.charAt(i));
            } else if(flag == false && prev.charAt(i) != '.') next.append(prev.charAt(i));
        }
        prev.setLength(0);
        prev.append(next);
        next.setLength(0);
        
        if (prev.charAt(0) == '.'){
            for(int i=1;i<prev.length()-1;i++){
                next.append(prev.charAt(i));
            }
        } else {
            for(int i=0;i<prev.length()-1;i++){
                next.append(prev.charAt(i));
            }
        }
        
        if (prev.charAt(prev.length()-1) != '.'){
            next.append(prev.charAt(prev.length()-1));
        }
        prev.setLength(0);
        prev.append(next);
        next.setLength(0);
        
        if(prev.length() == 0){
            next.append('a');
        } else {
            next.append(prev);
        }
        prev.setLength(0);
        prev.append(next);
        next.setLength(0);
        
        if(prev.length() >= 16){
            prev.setLength(15);
            if (prev.charAt(14) == '.') prev.setLength(14);
        }
        next.append(prev);
        
        prev.setLength(0);
        prev.append(next);
        next.setLength(0);
        
        if (prev.length() == 1) {
            next.append(prev).append(prev).append(prev);
        } else if(prev.length() == 2){
            next.append(prev).append(prev.charAt(1));
        } else {
            next.append(prev);
        }
        
        answer = next.toString(); 
        return answer;
    }
}