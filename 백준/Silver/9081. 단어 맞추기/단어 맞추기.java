import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            String str = sc.nextLine();
            char[] arr = new char[str.length()];

            for(int j = 0; j < str.length(); j++) {
                arr[j] = str.charAt(j);
            }

            calc(arr);
        }
    }

    static void calc (char[] arr) {
        int point = -1;
        boolean flag = false;


        for(int i = arr.length - 1; i > 0; i--) {
            if(flag) break;

            if(arr[i] > arr[i - 1]) { // 역방향이 아닌 것 찾기
                point = i;

                for(int j = arr.length - 1; j > point - 1; j--) {
                    if(arr[point - 1] < arr[j]) {
                        char tmp = arr[point - 1];
                        arr[point - 1] = arr[j];
                        arr[j] = tmp;
                        flag = true;

                        break;
                    }
                }

            }
        }

        String str = "";
        for(int i = 0; i < arr.length; i++) {
            str += arr[i];
        }

        if(point != -1)
            str = str.substring(0, point) + new StringBuilder(str.substring(point)).reverse().toString();

        System.out.println(str);
    }
}