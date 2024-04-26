class Solution {
    int sign = 0;
    int cost = 0;
    
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];
        int[] dis = new int[emoticons.length];
        
        
        discount(dis, 0, users, emoticons);
        
        answer[0] = sign;
        answer[1] = cost;
        
        return answer;
    }
    
    public void discount(int[] dis, int idx, int[][] users, int[] emoticons) {
        if(idx == dis.length) {
            calc(dis, users, emoticons);
            return;
        }
        
        
        for(int i = 10; i <= 40; i+=10) {
            dis[idx] = i;
            discount(dis, idx + 1, users, emoticons);
        }
        
        return;
    }
    
    public void calc(int[] dis, int[][]users, int[] emoticons) {
        int t_cost = 0;
        int t_sign = 0;
        
        for(int[] user : users) {
            int sum = 0;
            
            for(int i = 0; i < dis.length; i++) {
                if(dis[i] >= user[0]) {
                    sum += emoticons[i] * (100 - dis[i]) / 100;
                }
            }
            if(sum >= user[1]) {
                t_sign++;
            } else {
                t_cost += sum;
            }
        }
        if(t_sign > sign) {
            sign = t_sign;
            cost = t_cost;
        } else if (t_sign == sign) {
            if(t_cost > cost) {
                sign = t_sign;
                cost = t_cost;
            }
        }
    }
}