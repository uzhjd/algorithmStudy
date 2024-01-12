import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        
        for(int i = 0; i < skill_trees.length; i++) {
           String setSkill = skill_trees[i].replaceAll("[^" + skill + "]", "");
            
            for(int j = 0; j < skill.length() + 1; j++) {
                String str = skill.substring(0, j);
                
                if(setSkill.equals(str)) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}