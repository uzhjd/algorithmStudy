class Solution {
    public int gcd(int a, int b) {
        if(a%b ==0) return b;
        return gcd(b, a%b);
    }
    
    public boolean divisionArr(int[] arr, int a) {
        for(int n : arr) {
            if(n % a == 0) return true;
        }
        return false;
    }
    
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int maxA = arrayA[0];
        int maxB = arrayB[0];
        
        for(int i = 1; i < arrayA.length; i++) {
            maxA = gcd(maxA, arrayA[i]);
            maxB = gcd(maxB, arrayB[i]);
        }
        
        if(!divisionArr(arrayA, maxB)) {
            if(answer < maxB) answer = maxB;
        }
        if(!divisionArr(arrayB, maxA)) {
            if(answer < maxA) answer = maxA;
        }
        
        return answer;
    }
}