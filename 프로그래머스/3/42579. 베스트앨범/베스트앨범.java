import java.util.*;

public class Solution {
    static HashMap<String, Integer> map;
    
    static class albums implements Comparable<albums> {
        String genre;
        int play, idx;
        
        albums(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
        
        @Override
        public int compareTo(albums a) {
            int o1 = map.get(a.genre);
            int o2 = map.get(this.genre);
            
            if(o1 == o2) {
                if(a.play == this.play) return this.idx - a.idx;
                else return a.play - this.play;
            }
            return o1 - o2;
        }
    }
    
    public static int[] solution(String[] genres, int[] plays) {
        int n = genres.length;
        albums[] album = new albums[n];
        map = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
            album[i] = new albums(genres[i], plays[i], i);
        }
        
        Arrays.sort(album);
        LinkedList<Integer> list = new LinkedList<>();
        HashMap<String, Integer> rMap = new HashMap<>();
        for(albums a : album) {
            String g = a.genre;
            if(rMap.getOrDefault(g, 0) < 2){
                list.add(a.idx);
                rMap.put(g, rMap.getOrDefault(g, 0) + 1);
            }
        
        }
        
        System.out.println(list.size());
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}