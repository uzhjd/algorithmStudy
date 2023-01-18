import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        String answer = "";
        char c1, c2;

        for(int i=0; i<survey.length; i++){
            c1 = survey[i].charAt(0);
            c2 = survey[i].charAt(1);
            int score;

            if(choices[i] < 4){
                score = 4 - choices[i];
                if(!map.containsKey(c2)){
                    map.put(c2, 0);
                }
                if(map.containsKey(c1)){
                    map.put(c1, map.get(c1) + (score));
                    continue;
                }
                map.put(c1, score);
            }
            else if(choices[i] > 4) {
                score = choices[i] - 4;
                if(!map.containsKey(c1)){
                    map.put(c1, 0);
                }
                if(map.containsKey(c2)){
                    map.put(c2, map.get(c2) + score);
                    continue;
                }
                map.put(c2, score);
            }
            else{
                if(map.containsKey(c1) || map.containsKey(c2)){
                    continue;
                }
                map.put(c1, 0);
                map.put(c2, 0);
            }
        }
       
       if(map.get('R')==null||map.get('R')>=map.get('T')){
           answer+="R";
       }
        else{
            answer+="T";
        }
        
       if(map.get('C')==null||map.get('C')>=map.get('F')){
           answer+="C";
       }
        else{
            answer+="F";
        } 
        
       if(map.get('J')==null||map.get('J')>=map.get('M')){
           answer+="J";
       }
        else{
            answer+="M";
        }
         
       if(map.get('A')==null||map.get('A')>=map.get('N')){
           answer+="A";
       }
        else{
            answer+="N";
        }
        
        return answer;
    }
}
