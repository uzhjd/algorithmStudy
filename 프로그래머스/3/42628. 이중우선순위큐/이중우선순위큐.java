import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        LinkedList<Integer> list = new LinkedList<>(); // 정렬된 리스트 사용

        for (String s : operations) {
            if (s.charAt(0) == 'I') { // 삽입 연산
                int n = Integer.parseInt(s.substring(2));
                list.add(n);
                Collections.sort(list); // 항상 정렬 유지
            } else if (!list.isEmpty()) { // 삭제 연산
                if (s.charAt(2) == '1') { // 최댓값 삭제
                    list.removeLast();
                } else { // 최솟값 삭제
                    list.removeFirst();
                }
            }
        }

        if (list.isEmpty()) return new int[]{0, 0};
        return new int[]{list.getLast(), list.getFirst()};
    }
}