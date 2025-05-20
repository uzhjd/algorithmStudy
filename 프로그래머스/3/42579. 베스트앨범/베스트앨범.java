import java.util.*;

public class Solution {
    
    static class Album implements Comparable<Album> {
        int total, plays, idx;
        String genres;
        
        Album(int idx, String genres, int plays, int total) {
            this.idx = idx;
            this. genres = genres;
            this.plays = plays;
            this.total = total;
        }
        
        @Override
        public int compareTo(Album a) {
            if(a.total == this.total) return a.plays - this.plays;
            return a.total - this.total;
        }
    }
    
    public static int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        int len = genres.length;
        List<Album> list = new LinkedList<>();
        
        for(int i = 0; i < len; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        for(int i = 0; i < len; i++) {
            String genre = genres[i];
            int play = plays[i];
            list.add(new Album(i, genre, play, map.get(genre)));
        }
        
        Collections.sort(list);
        
        HashMap<String, Integer> rmap = new HashMap<>();
        List<Integer> rlist = new ArrayList<>();
        for(int i = 0; i < len; i++) {
            Album a = list.get(i);
            
            if(rmap.getOrDefault(a.genres, 0) < 2) {
                rlist.add(a.idx);
                rmap.put(a.genres, rmap.getOrDefault(a.genres, 0) + 1);
            }
        }
        
        int n = rlist.size();
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = rlist.get(i);
        }
        
        return result;
    }
}