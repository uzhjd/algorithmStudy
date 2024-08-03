import java.util.*;

public class Solution {

    static class album implements Comparable<album> {
        String genre;
        int play, num;

        album(String genre, int play, int num) {
            this.genre = genre;
            this.play = play;
            this.num = num;
        }

        public int compareTo(album a) {
            if(a.genre.equals(this.genre)) return a.play - this.play;
            return a.genre.compareTo(this.genre);
        }
    }
    
    public static int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        LinkedList<album> albums = new LinkedList<>();
        
        for(int i = 0; i < genres.length; i++) {
            String g = genres[i];
            int p = plays[i];
            
            map.put(g, map.getOrDefault(g, 0) + p);
            albums.add(new album(g, p, i));
        }
        
        String[] gen = new String[map.size()];
        int k = 0;
        
        while(map.size() != 0) {
            int max = 0;
            String g = "";
            
            for(String s : map.keySet()) {
                max = Math.max(max, map.get(s));
                if(map.get(s) == max) {
                    g = s;
                    gen[k] = g;
                }
            }
            k++;
            map.remove(g);
            System.out.println(g);
            System.out.println(max);
        }
        
//             System.out.println();
//             System.out.println();
//             System.out.println();
        LinkedList<Integer> tmp = new LinkedList<>();
        
        Collections.sort(albums);
        // for(album a : albums) {
        //     System.out.print(a.genre + " " + a.play + " " + a.num);
        //     System.out.println();
        // }
        
        for(int i = 0; i < gen.length; i++) {
            int cnt = 0;
            
            for(int j = 0; j < albums.size(); j++) {
                if(!gen[i].equals(albums.get(j).genre)) continue;
                if(cnt >= 2) break;
                
                tmp.add(albums.get(j).num);
                cnt++;
            // System.out.println(gen[i]);
            // System.out.println(albums.get(j).genre);
            // System.out.println(albums.get(j).num);
            }
        }
        
        int[] answer = new int[tmp.size()];
        for(int i = 0; i < tmp.size(); i++)
            answer[i] = tmp.get(i);
        
        return answer;
    }
}