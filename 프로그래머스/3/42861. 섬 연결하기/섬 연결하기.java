import java.util.*;

class Solution {
    static int[] parent;

    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];
        
        // Union-Find 구조 초기화
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        // 비용을 기준으로 간선 정렬
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[2], o2[2]);
            }
        });
        
        for (int i = 0; i < costs.length; i++) {
            int a = costs[i][0];
            int b = costs[i][1];
            int cost = costs[i][2];
            
            // 두 노드가 같은 집합에 있지 않은 경우에만 간선 추가
            if (find(a) != find(b)) {
                union(a, b);
                answer += cost;
            }
        }
        
        return answer;
    }

    // Find 연산
    private int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    // Union 연산
    private void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        
        if (rootX != rootY) {
            parent[rootY] = rootX;
        }
    }
}