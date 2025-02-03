import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1];
            int len = end - start + 1;
            int[] arr = new int[len];
            for(int k = start; k < end; k++) {
                arr[k - start] = array[k];
            }
            Arrays.sort(arr);
            for(int j = 0; j < arr.length; j++)
                System.out.print(arr[j]);
            System.out.println();
            int index = commands[i][2];
            answer[i] = arr[index];
        }
        
    return answer;
    }
    
}

