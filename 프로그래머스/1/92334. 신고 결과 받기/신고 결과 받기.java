import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 중복 제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        // 유저 인덱스 매핑
        Map<String, Integer> idIndex = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idIndex.put(id_list[i], i);
        }

        // 누가 누구를 신고했는지
        Map<String, Set<String>> reportedBy = new HashMap<>();
        // 누가 몇 번 신고당했는지
        Map<String, Integer> reportCount = new HashMap<>();

        for (String rep : reportSet) {
            String[] parts = rep.split(" ");
            String from = parts[0];
            String to = parts[1];

            reportedBy.putIfAbsent(from, new HashSet<>());
            reportedBy.get(from).add(to);

            reportCount.put(to, reportCount.getOrDefault(to, 0) + 1);
        }

        // 정지당한 유저 목록
        Set<String> banned = new HashSet<>();
        for (String user : reportCount.keySet()) {
            if (reportCount.get(user) >= k) {
                banned.add(user);
            }
        }

        // 각 유저가 신고한 유저들 중 정지된 유저 수
        for (int i = 0; i < id_list.length; i++) {
            String reporter = id_list[i];
            Set<String> reported = reportedBy.getOrDefault(reporter, new HashSet<>());
            for (String user : reported) {
                if (banned.contains(user)) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}
