class Solution {
    public int solution(String word) {
        String vowels = "AEIOU";
        int[] change = {781, 156, 31, 6, 1};
        int answer = word.length();
        
        for(int i = 0; i < word.length(); i++) {
            answer += change[i] * vowels.indexOf(word.charAt(i));
        }
        
        return answer;
    }
}