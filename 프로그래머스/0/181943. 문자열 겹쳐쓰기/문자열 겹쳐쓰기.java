// 1. for 문을 돌려서 i를 0부터 my_string길이 까지 돌림.
// 2. 그까지 출력 한거를 answer에 더함.
// 3. for 문을 돌려서 s부터 overwrite_string 길이만큼 돌림.
// 4. answer.charAt(i)를 overwrite.charAt(i-s)로 replace.

class Solution {
    public StringBuilder solution(String my_string, String overwrite_string, int s) {
        StringBuilder a = new StringBuilder();
        a.append(my_string);

        a.replace(s, s+overwrite_string.length(), overwrite_string);
        
        return a;
    }
}