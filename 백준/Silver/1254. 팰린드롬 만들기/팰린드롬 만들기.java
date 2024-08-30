import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int answer = 0;
        int len = s.length();
        for(int i = 0; i < len; i++) {
            if(cor(s.substring(i))) {
                answer = i + len;
                break;
            }
        }

        System.out.println(answer);

        return;
    }

    private static boolean cor(String str) {
        int l = 0;
        int r = str.length() - 1;

        while(l <= r) {
            if(str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }
}